/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sonyericsson.homescreen;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
/**
 * @author wiktorek140
 */
public class HomescreenMIDlet extends MIDlet{ 
    
    Homescreen homescreen; 
    
    public Homescreen getHomescreen(){
    return homescreen;
    }

    protected void startApp() throws MIDletStateChangeException {
    }

    protected void pauseApp() {
    }

    protected void destroyApp(boolean bln) throws MIDletStateChangeException {
    }
}
