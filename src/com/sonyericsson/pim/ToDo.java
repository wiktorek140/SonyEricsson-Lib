/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sonyericsson.pim;

/**
 *
 * @author wiktorek140
 */
public class ToDo {
    public static int ALERT_TIME;
    public static int COMPLETION_DATE;
    public static int NOTE;
    public static int SUMMARY;
    public static int UID;
    public static int COMPLETED;

    public String getString(int uid, int val) {
        return "";    
    }
    public void commit() {}
    
    public void addString(int type, int attrib, String note) {}

    public void addDate(int alarm, int attrib, long time) {}

    public void addBoolean(int state, int attrib, boolean completed) {}

    public void setBoolean(int state, int i, int attrib, boolean completed) {}
    
    public void setDate(int endDate, int i, int attrib, long time) {}
    
    public void setString(int type, int i, int attrib, String note) {}
    
    public int countValues(int endDate) {
        return 1;
    }

    

    
    
}
