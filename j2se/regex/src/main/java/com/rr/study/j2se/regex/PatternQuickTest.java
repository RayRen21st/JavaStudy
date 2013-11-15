/*
 * $HeadURL:  $
 *
 * Copyright (c) 2007 Drutt Corporation, all rights reserved.
 *
 */
package com.rr.study.j2se.regex;

import java.util.regex.Pattern;

/**
 * @author elihuwu
 * @version $Revision: $
 */
public class PatternQuickTest {

    /** Class revision */
    public static final String _REV_ID_ = "$Revision: $";

    /**
     * @param args
     */
    public static void main(String[] args) {
        
//        System.out.println(Byte.decode("[\\x21\\x23-\\\x5B\\x5D-\\x7E]+"));
        
        String[] hexCodes = {
                "0x21",
                "0x23",
                "0x2b",
                "0x2d",
                "0x5B",
                "0x5D",
                "0x7E"
        };
        
        for(String hexCode : hexCodes) {
            System.out.println(new String(new byte[]{Byte.decode(hexCode).byteValue()}));
        }
        
        
        Pattern SCOPE_KEY_PATTERN = Pattern.compile("[\\x21\\x23-\\x5B\\x5D-\\x7E]+"); 
        System.out.println(SCOPE_KEY_PATTERN.matcher(",").matches());

    }

}
