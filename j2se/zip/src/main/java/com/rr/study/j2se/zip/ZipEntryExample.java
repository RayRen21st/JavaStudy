/*
 * $HeadURL:  $
 *
 * Copyright (c) 2007 Drutt Corporation, all rights reserved.
 *
 */
package com.rr.study.j2se.zip;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author elihuwu
 * @version $Revision: $
 */
public class ZipEntryExample {

    /** Class revision */
    public static final String _REV_ID_ = "$Revision: $";

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        ZipInputStream zis = new ZipInputStream(ZipEntryExample.class.getResourceAsStream("zipByWin7.zip"));
        ZipEntry ze;
        while((ze = zis.getNextEntry()) != null){
            System.out.println(ze.getName());
        }
    }

}
