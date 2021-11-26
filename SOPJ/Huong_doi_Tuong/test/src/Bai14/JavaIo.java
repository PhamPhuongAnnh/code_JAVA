/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class JavaIo {
    public static void main(String[] args) {
        File dri = new File("D:\\Code\\java\\JavaCore\\JavaIo","data.txt");
        try {
            boolean check = dri.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(JavaIo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}