/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author phuon
 */
public class TxtFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isFile()) {
            if (pathname.getAbsolutePath().endsWith(".pptx")) {
                return true;
            }else{
                return false;
            }
        }
        else{
            return false;
        }
       
    }

}
