/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class JavaIOCsv {

    private static final String currentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_CSV_FILE = currentDir + separator + "data" + separator + "countries.csv";

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH_CSV_FILE));
            String line = null;
            String[] cols = new String[4];
            while ((line = br.readLine()) != null)  {
                cols = line.split(",");
//                System.out.println(cols[0]+","+ cols[1]+","+ cols[2]+","+cols[3]);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaIOCsv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaIOCsv.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
