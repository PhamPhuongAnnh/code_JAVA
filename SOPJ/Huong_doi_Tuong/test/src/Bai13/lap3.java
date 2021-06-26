/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import java.util.ArrayList;

/**
 *
 * @author phuon
 */
public class lap3 {
    static void show(ArrayList list)
    {
        list.stream().forEach(
                item -> System.out.println(item)
        );
        
    }
    public static void main(String[] args) {
        ArrayList info = new ArrayList();
        info.add("Pham Phuong Anh");
        info.add("21/12/2001");
        info.add("CT4D");
        info.add("Thai Binh");
        
        show(info);
        info.set(3, "THAI BINH");
        info.remove(1);
        show(info);
    }
}
