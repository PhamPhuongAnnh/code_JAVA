/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_chia_Se.De6;

/**
 *
 * @author phuon
 */
public class Category {
    private String id; 
    private String type; 

    public Category() {
    }

    public Category(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", type=" + type + '}';
    }
    
}
