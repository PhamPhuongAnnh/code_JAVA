
package bai_12;

import java.util.Calendar;


public class lap3 {

    static void show(Calendar c) {
        System.out.println("Ngay: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Thang: "+(c.get(Calendar.MONTH)+1));
        System.out.println("Nam: "+c.get(Calendar.YEAR));
        System.out.println("Gio: "+c.get(Calendar.HOUR));
        System.out.println("Phut: "+c.get(Calendar.MINUTE));
        System.out.println("Giay: "+c.get(Calendar.SECOND));
    }

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        show(c);
//        c.roll(Calendar.MONTH, true);
        c.add(Calendar.DAY_OF_MONTH,20);
        show(c);
    }
}
