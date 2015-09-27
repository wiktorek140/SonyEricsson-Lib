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
public class PIMChangeEvent {

    private int items;
    
    public int countItems() {
        return items;
    }

    public int getChangeType(int type) {
        return type;
    }

    public String getListType() {
        return "";
    }

    public String getUID(int uid) {
        return "";
    }
    
    public Call getItem(int id){
        return null;
    }
    
}
