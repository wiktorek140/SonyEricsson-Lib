/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sonyericsson.lcdui;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.ItemCommandListener;

/**
 *
 * @author wiktorek140
 */
public class IdleItem {

    public IdleItem(String name){
    
    }
    
    public static void setOnDisplay(Display display, IdleItem widget) {
    }

    public void invalidate() {
    }

    protected void showNotify() {
    }

    protected void hideNotify() {
    }
    
    protected void repaint() {
    }

    protected void paint(Graphics graphic, int int_1, int int_2){
    }
    
    protected void keyPressed(int keyCode) {
    }

    protected int getMinContentHeight()
    {
        return 60;
    }
    
    protected int getMinContentWidth()
    {
        return 210;
    }
    
    protected int getPrefContentHeight(int height)
    {
        return height;
    }
    
    protected int getPrefContentWidth(int width)
    {
        return width;
    }
    
    protected boolean traverse(int int_1, int int_2, int int_3, int[] ints_1){
        return true;
    }
    
    protected void traverseOut(){
    }

    protected void sizeChanged(int width, int height){
    }

    protected void addCommand(Command viewCmd) {
    }
    
    protected void removeCommand(Command viewCmd){
    }
    
    public void setItemCommandListener(ItemCommandListener listener){
    }

    protected void keyReleased(int key) {
    }
    
    
}
