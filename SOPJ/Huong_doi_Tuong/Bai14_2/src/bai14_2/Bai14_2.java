/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14_2;

import bai14_2.Model.JsonResult;
import bai14_2.Model.List;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Collation;

/**
 *
 * @author phuon
 */
public class Bai14_2 {

    /**
     * @param args the command line arguments
     */
    private static final String curendir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_JSON_FILE = curendir + separator + "data" + separator + "weather_16days.json";

    public static void main(String[] args) {
        // TODO code application logic here
        FileReader fr = null;
        try {
            fr = new FileReader(PATH_JSON_FILE);
            Gson json = new Gson();
            JsonResult result = json.fromJson(fr, JsonResult.class);
//            System.out.println(result.getList().get(0).getDtTxt());
            System.out.println("Hien thi thong tin thoi tiet");
//            for(List item: result.getList()){
//                System.out.println("===============================");
//                System.out.println("Date: "+ item.getDtTxt());
//                System.out.println("Weather: "+item.getWeather().get(0).getMain()+ " - " + item.getWeather().get(0).getDescription());
//                System.out.println("Temperature: "+ item.getMain().getTemp());
//                System.out.println("Pressure: " + item.getMain().getPressure());
//                System.out.println("Humidity: "+ item.getMain().getHumidity());
//                System.out.println("Wind speed: "+ item.getWind().getSpeed());
//                System.out.println("Cloudiness: "+item.getClouds().getAll() + "%");
//            }

            System.out.println("Hiển thị thông tin thoi tiet ngay co nhiet do cao nhat");
            Collections.sort(result.getList(), new tempCoparator().thenComparing(new HumCoparator().thenComparing(new DateComparator())));
            double maxTemp = result.getList().get(0).getMain().getTemp();
            for (List item : result.getList()) {
//                if(item.getMain().getTemp() == maxTemp){
                    System.out.println("===============================");
                    System.out.println("Date: " + item.getDtTxt());
                    System.out.println("Weather: " + item.getWeather().get(0).getMain() + " - " + item.getWeather().get(0).getDescription());
                    System.out.println("Temperature: " + item.getMain().getTemp());
                    System.out.println("Pressure: " + item.getMain().getPressure());
                    System.out.println("Humidity: " + item.getMain().getHumidity());
                    System.out.println("Wind speed: " + item.getWind().getSpeed());
                    System.out.println("Cloudiness: " + item.getClouds().getAll() + "%");
//                }
            }
//System.out.println("Ngày có cấp độ gió cao nhất");
//            Collections.sort(result.getList(), new WindCoparator().thenComparing(new DateComparator()));
//
//            System.out.println("===============================");
//            System.out.println("Date: " + result.getList().get(0).getDtTxt());
//            System.out.println("Weather: " + result.getList().get(0).getWeather().get(0).getMain() + " - " + result.getList().get(0).getWeather().get(0).getDescription());
//            System.out.println("Temperature: " + result.getList().get(0).getMain().getTemp());
//            System.out.println("Pressure: " + result.getList().get(0).getMain().getPressure());
//            System.out.println("Humidity: " + result.getList().get(0).getMain().getHumidity());
//            System.out.println("Wind speed: " + result.getList().get(0).getWind().getSpeed());
//            System.out.println("Cloudiness: " + result.getList().get(0).getClouds().getAll() + "%");

//            System.out.println("Danh sach cac ngay mua");
//            for(List item: result.getList()){
//                if(item.getWeather().get(0).getMain().equals("Rain")){
//                    System.out.println("===============================");
//                    System.out.println("Date: " + item.getDtTxt());
//                    System.out.println("Weather: " + item.getWeather().get(0).getMain() + " - " + item.getWeather().get(0).getDescription());
//                    System.out.println("Temperature: " + item.getMain().getTemp());
//                    System.out.println("Pressure: " + item.getMain().getPressure());
//                    System.out.println("Humidity: " + item.getMain().getHumidity());
//                    System.out.println("Wind speed: " + item.getWind().getSpeed());
//                    System.out.println("Cloudiness: " + item.getClouds().getAll() + "%");
//                }
//            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai14_2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
