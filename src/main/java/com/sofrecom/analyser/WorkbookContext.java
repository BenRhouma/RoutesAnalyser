/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofrecom.analyser;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author z.benrhouma
 */
public class WorkbookContext {

    public XSSFWorkbook wb = new XSSFWorkbook();
    
    public int CURRENT_ROW_INDEX=1;

    public WorkbookContext() {
        CURRENT_ROW_INDEX = 1;
    }
    public Row nextRow(Sheet sheet){
        return sheet.createRow(++CURRENT_ROW_INDEX);
    }
}
