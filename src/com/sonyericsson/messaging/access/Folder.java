/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sonyericsson.messaging.access;



/**
 *
 * @author wiktorek140
 */
public class Folder {

    private ItemList itemList;
    
    public void addFolderListener(FolderListener aThis) {
    }

    public ItemList getMessages(MessageCriteria criteria) {
        return itemList;
    }
    
}
