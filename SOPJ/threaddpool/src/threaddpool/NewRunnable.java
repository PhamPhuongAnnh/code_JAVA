/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddpool;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class NewRunnable implements Runnable{
String name;

    public NewRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " bat dau thuc thi.....");
    try {
        Thread.sleep(20000);
    } catch (InterruptedException ex) {
        Logger.getLogger(NewRunnable.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        System.out.println(name + " ket thuc");
    }
    
}
