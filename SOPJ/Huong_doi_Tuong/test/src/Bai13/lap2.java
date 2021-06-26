/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author phuon
 */
public class lap2 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Bui Tien Dung");
        list.add("Duy Manh");
        list.add("Cong Phuong");
        list.add("Van Toan");
        list.add("Quang Hai");

//        for(int i=0; i<list.size(); i++){
//            String name = list.get(i).toString();
//            System.out.println("Name: "+name);
//        }
//        for(Object x:list){
//            String name = x.toString();
//            System.out.println("Name: "+name);
//        }
//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            String name = it.next().toString();
//            System.out.println("Name: " + name);
//
//        }
        list.stream().forEach(
                name -> System.out.println(name));
    }
}
