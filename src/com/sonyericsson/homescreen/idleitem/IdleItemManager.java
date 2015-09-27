/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sonyericsson.homescreen.idleitem;



/**
 *
 * @author wiktorek140
 */
public class IdleItemManager {
    
    private static IdleItemManager instance;
    
    public static IdleItemManager getInstance() {
        return instance;
    }

    public void addIdleItemListener(IdleItemListener aThis) {
    
    }
    
}
