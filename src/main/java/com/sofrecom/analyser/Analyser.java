/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofrecom.analyser;

import com.sofrecom.Context;
import com.sofrecom.Logger;
import static com.sofrecom.analyser.ParserProcessor.test;
import com.sofrecom.analyser.application.SecurityPattern;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

/**
 *
 * @author z.benrhouma
 */
public class Analyser {

    public static void main(String... args) {

        List<Tuple3<String, String, String>> fileRoutes = loadFileRoutes("E:\\sofrecom\\remot\\remot-be\\conf\\routes");
        Map<String, SecurityPattern> dbRoutes = loadDbRoutes();

        final List<SecurityPattern> listOfRoutesToDelete = extractListOfRoutesToDelete(dbRoutes);
        final List<SecurityPattern> listOfRoutesToInsert = extractListOfRoutesToInsert(dbRoutes, fileRoutes);

        try {
            printXlsx(listOfRoutesToDelete, listOfRoutesToInsert);
        } catch (IOException ex) {
            Logger.error(ex.getMessage(), ex);
        }

    }

    static List<SecurityPattern> extractListOfRoutesToDelete(Map<String, SecurityPattern> dbRoutes) {
        List<SecurityPattern> listToDelete = new ArrayList<>();
        for (SecurityPattern pattern : dbRoutes.values()) {
            if (!pattern.route) {
                Logger.info(pattern.SEC_PATTERN + " not found in the routes");
                listToDelete.add(pattern);
            }
        }
        return listToDelete;
    }

    static List<SecurityPattern> extractListOfRoutesToInsert(Map<String, SecurityPattern> dbRoutes, List<Tuple3<String, String, String>> fileRoutes) {
        List<SecurityPattern> listToAddToDataBase = new ArrayList<>();

        for (Tuple3<String, String, String> fileRoute : fileRoutes) {
            final SecurityPattern get = dbRoutes.get(fileRoute.route);
            if (get != null) {
                get.route = true;
            } else {
                Logger.info(fileRoute.route + " ,not found in the database");
                SecurityPattern p = new SecurityPattern();
                p.SEC_PATTERN = fileRoute.route;
                p.METHOD = fileRoute.method;
                p.MATCHER_TYPE = "0";
                p.ALLOWED = false;
                listToAddToDataBase.add(p);
            }
        }
        return listToAddToDataBase;
    }

    static Map<String, SecurityPattern> loadDbRoutes() {
        Map<String, SecurityPattern> dbRoutes = new HashMap<>();
        final Sql2o sql2o = (Sql2o) Context.context.getBean("sql2o");
        try (Connection connection = sql2o.open()) {
            Query query = connection.createQuery("select * from SECURITY_PATTERNS");
            List<SecurityPattern> executeAndFetch = query.executeAndFetch(SecurityPattern.class);
            for (SecurityPattern pattern : executeAndFetch) {
                pattern.base = true;
                dbRoutes.put(pattern.SEC_PATTERN, pattern);

            }
            connection.close();
        }
        Logger.info("Done load pattern from DB");
        return dbRoutes;
    }

    static List<Tuple3<String, String, String>> loadFileRoutes(String filePath) {

        final List<Tuple3<String, String, String>> routes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
            String line;
            while ((line = br.readLine()) != null) {
                Tuple3<String, String, String> test = test(line);
                if (test != null) {
                    Logger.info(test(line).toString());
                    routes.add(test);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.info(ex.getMessage(), ex);
        } catch (IOException ex) {
            Logger.info(ex.getMessage(), ex);
        }
        return routes;

    }

    private static void printXlsx(List<SecurityPattern> listOfRoutesToDelete, List<SecurityPattern> listOfRoutesToInsert) throws IOException {
        Runtime.getRuntime().exec("taskkill /f /t /IM excel.exe");

        try (final FileOutputStream fileOut = new FileOutputStream("BI_MODULE.xlsx")) {
            final WorkbookContext wbContext = new WorkbookContext();
            final Sheet insertSheet = wbContext.wb.createSheet("Insert list");
            insertSheet.setDisplayGridlines(false);

            Row r = insertSheet.createRow(0);
            insertSheet.setColumnWidth(0, 3000);
            insertSheet.setColumnWidth(1, 14250);
            insertSheet.setColumnWidth(2, 3000);
            insertSheet.setColumnWidth(3, 4050);
            insertSheet.setColumnWidth(4, 3000);
            for (int i = 0; i < SecurityPattern.getSchema().length; i++) {
                r.createCell(i).setCellValue(SecurityPattern.getSchema()[i]);
            }

            for (SecurityPattern insertRoute : listOfRoutesToInsert) {
                Row row = wbContext.nextRow(insertSheet);
                row.createCell(0).setCellValue(insertRoute.PATTERN_ID);
                row.createCell(1).setCellValue(insertRoute.SEC_PATTERN);
                row.createCell(2).setCellValue(insertRoute.METHOD);
                row.createCell(3).setCellValue("0");
                row.createCell(4).setCellValue("");
                row.createCell(5).setCellValue("false");
            }

            final Sheet delteteSheet = wbContext.wb.createSheet("delete list");
            wbContext.CURRENT_ROW_INDEX=1;
            delteteSheet.setDisplayGridlines(false);
            
            r = delteteSheet.createRow(0);
            delteteSheet.setColumnWidth(0, 3000);
            delteteSheet.setColumnWidth(1, 14250);
            delteteSheet.setColumnWidth(2, 3000);
            delteteSheet.setColumnWidth(3, 4050);
            delteteSheet.setColumnWidth(4, 3000);
            for (int i = 0; i < SecurityPattern.getSchema().length; i++) {
                r.createCell(i).setCellValue(SecurityPattern.getSchema()[i]);
            }

            for (SecurityPattern insertRoute : listOfRoutesToDelete) {
                Row row = wbContext.nextRow(delteteSheet);
                row.createCell(0).setCellValue(insertRoute.PATTERN_ID);
                row.createCell(1).setCellValue(insertRoute.SEC_PATTERN);
                row.createCell(2).setCellValue(insertRoute.METHOD);
                row.createCell(3).setCellValue(insertRoute.MATCHER_TYPE);
                if(insertRoute.FN_ID!=null)
                    row.createCell(4).setCellValue(insertRoute.FN_ID);
                else
                    row.createCell(4).setCellValue("Null");
                row.createCell(5).setCellValue(String.valueOf(insertRoute.ALLOWED));
            }
            

            wbContext.wb.write(fileOut);
            fileOut.close();
        }
        Desktop.getDesktop().open(new File("BI_MODULE.xlsx"));
    }

}
