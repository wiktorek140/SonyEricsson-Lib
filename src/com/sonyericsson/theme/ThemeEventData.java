/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sonyericsson.theme;

import javax.microedition.lcdui.Image;

/**
 *
 * @author wiktorek140
 */
public class ThemeEventData {

    private Image image;

    
    public int getType() {
        return 1;
    }
    
    public Image getResource(int res){
    return image;
    }
    
}
