/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofrecom.analyser.application;

/**
 *
 * @author z.benrhouma
 */
public class SecurityPattern {

    public String SEC_PATTERN;
    public String PATTERN_ID;
    public String METHOD;
    public String MATCHER_TYPE;
    public Long   FN_ID;
    public boolean ALLOWED;

    public boolean base = false;
    public boolean route = false;

    public String packageName;
    public String className;
    public String methodName;

    public static String[] getSchema() {
        return new String[]{
            "PATTERN_ID",
            "SEC_PATTERN",
            "METHOD",
            "MATCHER_TYPE",
            "FN_ID",
            "ALLOWED"};
    }

    @Override
    public String toString() {
        return "SecurityPattern{" + "SEC_PATTERN=" + SEC_PATTERN + ", PATTERN_ID=" + PATTERN_ID + ", METHOD=" + METHOD + ", MATCHER_TYPE=" + MATCHER_TYPE + ", FN_ID=" + FN_ID + ", ALLOWED=" + ALLOWED + '}';
    }

}
