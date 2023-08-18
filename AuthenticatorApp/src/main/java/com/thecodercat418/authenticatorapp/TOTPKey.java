/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thecodercat418.authenticatorapp;

import java.util.Date;



/**
 *
 * @author herman7593
 */
public class TOTPKey{
    private String key;
    private TOTPInfo info;
    private int expireLength = 6;
    private int expiresIn;

    public TOTPKey(String key, TOTPInfo info, int expiresIn) {
        this.key = key;
        this.info = info;
        this.expiresIn = expiresIn;
    }

    
    
    
    
}
