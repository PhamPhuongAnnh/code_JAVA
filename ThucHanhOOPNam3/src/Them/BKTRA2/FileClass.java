/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Them.BKTRA2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngoth
 */
public class FileClass {
    public  void wirteObject(String path, Object ob) {

        ObjectOutputStream oos;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(ob);
            oos.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FileClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public  Object readObject(String path) {

        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream(path));
            Object ob = ois.readObject();
            ois.close();
            return ob;
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FileClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return null;
    }
}
