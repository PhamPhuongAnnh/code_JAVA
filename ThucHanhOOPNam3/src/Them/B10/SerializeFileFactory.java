package Them.B10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SerializeFileFactory implements Serializable{

    public void wirteObject(String path, Object ob) {

        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(ob);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerializeFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object ob = ois.readObject();
            ois.close();
            return ob;
        } catch (FileNotFoundException ex) { 
            Logger.getLogger(SerializeFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerializeFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerializeFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
}
