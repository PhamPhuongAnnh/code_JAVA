/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_chia_Se.De4;

/**
 *
 * @author phuon
 */
public class Word {
    private String id; 
    private String en; 
    private String vn; 

    public Word() {
    }

    public Word(String id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return "Word{" + "id=" + id + ", en=" + en + ", vn=" + vn + '}';
    }
    
}
