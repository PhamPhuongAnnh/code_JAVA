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
public class CountDown implements Runnable{

   String name;
   int sec;

    public CountDown(String name, int sec) {
        this.name = name;
        this.sec = sec;
    }
   

    @Override
    public void run() {
  for(int i=1; i<=sec; i++){
      try {
          System.out.println(name+"So giay con lai "+i);
          Thread.sleep(1000);
      } catch (InterruptedException ex) {
          Logger.getLogger(CountDown.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
    }
    
}
