/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaio.csv.model.Country;

/**
 *
 * @author phuon
 */
public class ConverCsvToJavaOpject {

    private static final String currentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_CSV_FILE = currentDir + separator + "data" + separator + "countries.csv";
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader(PATH_CSV_FILE);
            CsvToBean<Country> csvToBin = new CsvToBeanBuilder<Country>(fr).withType(Country.class).withSkipLines(1).withIgnoreLeadingWhiteSpace(true).build();
            List<Country> list = csvToBin.parse();
            for (Country item : list) {
                System.out.println(item.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConverCsvToJavaOpject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
