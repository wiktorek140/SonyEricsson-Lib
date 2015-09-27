/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sonyericsson.pim;

import java.util.Enumeration;
import javax.microedition.pim.PIMException;
import javax.microedition.pim.PIMItem;
import javax.microedition.pim.PIMList;

/**
 *
 * @author wiktorek140
 */
public abstract class NoteList  implements PIMList{

    private  Enumeration enumeration;
    
    
    
    public static int NOTE_LIST=0;
    
    private String name;
    
    
    public Enumeration items() {
        return enumeration;
    }

    public void close() throws PIMException {
    }

    public String getName() {
        return name;
    }

    public void removeNote(Note note) {
    }

    public Note createNote() {
        return new Note();
    }

   
}
