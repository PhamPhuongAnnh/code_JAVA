/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wirte;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class csv {

    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV = curentDir + separator + "data" + separator + "countries.csv";

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
        FileReader fr = null;
        try {
            fr = new FileReader(PATH_FILE_CSV);
            CSVReader csvReader= new CSVReader(fr);
            String[] line;
            
            while((line = csvReader.readNext()) != null){
               if(line[0].charAt(0) == 'A'){
                   System.out.println(line[0] +","+ line[1] +","+ line[2] +","+ line[3]);
               }
            }
        } catch (IOException ex) {
            Logger.getLogger(csv.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(csv.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }
}
