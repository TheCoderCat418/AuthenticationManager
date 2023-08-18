/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thecodercat418.authenticatorapp;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;

/**
 *
 * @author herman7593
 */
public class TOTPInfo {
    private String name;
    private Date createdTime;
    private SecureRandom sr;
    private int keySize = 6;
    private long counter;
    public TOTPInfo(String name){
        this.name = name;
        String oh = "JBSWY3DPEHPK3PXP";
        this.sr = new SecureRandom(oh.getBytes());
        createdTime = Date.from(Instant.now());
    }
    public Key getKey(){
        try {
            var kg = KeyGenerator.getInstance("HmacSHA1");
            System.out.println(sr.nextInt());
            kg.init(keySize, sr);
            return kg.generateKey();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TOTPInfo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public long getCounter(){
        return counter;
    }
//    public void SetSecret(String secret, long counter){
//        this.secret = secret;
//        if(counter < 0){
//            this.counter = 0;
//        }else{
//          this.counter = counter;
//        }
//    }
}