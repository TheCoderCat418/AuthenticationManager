/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thecodercat418.authenticatorapp;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;

/**
 *
 * @author ellio
 */
public class TOTPGen {
    static TOTPKey generateKey(TOTPInfo info){
        try {
            var hmacthing = Mac.getInstance("HmacSHA1");
            hmacthing.init(info.getKey());
            System.out.println(new String(hmacthing.doFinal(Long.toString(info.getCounter()).getBytes())));
        } catch (NoSuchAlgorithmException | InvalidKeyException ex) {
            Logger.getLogger(TOTPGen.class.getName()).log(Level.SEVERE, "No thing idk", ex);
        }
        return null;
    }
    
    
}
