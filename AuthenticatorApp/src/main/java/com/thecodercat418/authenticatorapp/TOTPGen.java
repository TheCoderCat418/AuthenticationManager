/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thecodercat418.authenticatorapp;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
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
            var lolol = info.getKey();
            hmacthing.init(lolol);
            var sirlong = Long.toString(info.getCounter());
            var sirshort = sirlong.getBytes();
            byte[] yes = hmacthing.doFinal(sirshort);
            int last = yes[19] & 0xf;
            int done = (yes[last]  & 0x7f) << 24
           | (yes[last+1] & 0xff) << 16
           | (yes[last+2] & 0xff) <<  8
           | (yes[last+3] & 0xff);
            System.out.println(done);
        } catch (NoSuchAlgorithmException | InvalidKeyException ex) {
            Logger.getLogger(TOTPGen.class.getName()).log(Level.SEVERE, "No thing idk", ex);
        }
        return null;
    }
    
    
}
