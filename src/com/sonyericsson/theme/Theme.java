/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sonyericsson.theme;

/**
 *
 * @author wiktorek140
 */
public class Theme {

    private static Theme theme;
    
    public static Theme getCurrentTheme() {
        return theme;
    }
    
    public void setThemeListener(ThemeListener listener){}
}
