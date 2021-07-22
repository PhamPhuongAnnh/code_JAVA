/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaio.csv.model.Country;
import javaio.csv.model.LongitudeComparator;
import javaio.csv.model.NameComparator;

/**
 *
 * @author phuon
 */
public class csv {

    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV = curentDir + separator + "data" + separator + "countries3.csv";

    public static void main(String[] args) throws CsvValidationException {

        //        FileWriter fw = null;
//        try {
//            fw = new FileWriter(PATH_FILE_CSV);
//            List<Country> list = new ArrayList<>();
//            list.add(new Country("aa", 123.11, 11.11, "Aaaaaa"));
//            list.add(new Country("bb", 123.11, 11.11, "bbbbbbbbbb"));
//            list.add(new Country("bbb", 1124.11, 33412.11, "bbbbb"));
//            list.add(new Country("bccc", 4444.11, 2223.11, "ccccc"));
//            list.add(new Country("ssss", 44422.11, 666.11, "eeee"));
//            String header = "Contry,latitude,Longitude,name";
//            fw.append(header);
//            fw.append("\n");
//            for (Country item : list) {
//                fw.append(item.getCountry());
//                fw.append(",");
//                fw.append(String.valueOf(item.getLatitude()));
//                fw.append(",");
//                fw.append(String.valueOf(item.getLongitude()));
//                fw.append(",");
//                fw.append(item.getName());
//                fw.append("\n");
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(csv.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if (fw != null) {
//                try {
//                    fw.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(csv.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        Dùng OpenCSV
//        FileReader fr = null;
//        try {
//            fr = new FileReader(PATH_FILE_CSV);
//            CSVReader csvReader = new CSVReader(fr);
//            String[] line;
//            List<Country> list = new ArrayList<>();
//            line = csvReader.readNext();
//            while ((line = csvReader.readNext()) != null) {
////               if(line[0].charAt(0) == 'A'){
////                   System.out.println(line[0] +","+ line[1] +","+ line[2] +","+ line[3]);
////               }
//                Country country = new Country(line[0], Double.parseDouble(line[1]), Double.parseDouble(line[2]), line[3]);
//                list.add(country);
//            }
////            Collections.sort(list, new LongitudeComparator());
//            Collections.sort(list, new NameComparator());
//            for (Country item : list) {
//                System.out.println(item.toString());
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(csv.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                fr.close();
//            } catch (IOException ex) {
//                Logger.getLogger(csv.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//}\
//ghi 
        FileWriter fw = null;
        try {
            fw = new FileWriter(PATH_FILE_CSV);
            CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
            String[] header = {"country", "latitude", "Longitude", "Name"};
            csvWrite.writeNext(header);

//            csvWrite.writeNext(new String[]{"aa", "-111", "111", "AAAAA"});
            List<Country> list = new ArrayList<>();
            list.add(new Country("aa", 123.11, 11.11, "Aaaaaa"));
            list.add(new Country("bb", 123.11, 11.11, "bbbbbbbbbb"));
            list.add(new Country("bbb", 1124.11, 33412.11, "bbbbb"));
            list.add(new Country("bccc", 4444.11, 2223.11, "ccccc"));
            list.add(new Country("ssss", 44422.11, 666.11, "eeee"));

            for (Country item : list) {
                csvWrite.writeNext(new String[]{item.getCountry(), String.valueOf(item.getLatitude()), String.valueOf(item.getLongitude()), item.getName()});
            }

        } catch (IOException ex) {
            Logger.getLogger(csv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(csv.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
