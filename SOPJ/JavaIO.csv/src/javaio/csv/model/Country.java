/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.csv.model;

import com.opencsv.bean.CsvBindByPosition;

/**
 *
 * @author phuon
 */
public class Country {
    @CsvBindByPosition(position =0)
    private String country;
    @CsvBindByPosition(position =1)
    private double longitude;//Kinh độ
    
    @CsvBindByPosition(position =2)
    private double latitude; // vĩ độ
    
    @CsvBindByPosition(position =3)
    private String name;

    public Country() {
    }

    public Country(String country, double longitude, double latitude, String name) {
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Country{" + "country=" + country + ", longitude=" + longitude + ", latitude=" + latitude + ", name=" + name + '}';
    }
    
    
}
