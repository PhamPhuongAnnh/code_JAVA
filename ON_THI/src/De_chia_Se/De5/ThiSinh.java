
package De_chia_Se.De5;
import java.util.Scanner;


public abstract class ThiSinh {

    protected String HoTen;
    protected String NgaySinh;
    protected String DiaChi;

    public ThiSinh() {
    }

    public ThiSinh(String HoTen, String NgaySinh, String DiaChi) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho ten: ");
        this.HoTen = sc.nextLine();
        System.out.print("Nhap Ngay sinh: ");
        this.NgaySinh = sc.nextLine();
        System.out.print("Nhap Dia chi: ");
        this.DiaChi = sc.nextLine();
    }

    public void HienThi() {
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Dia chi: " + this.DiaChi);
    }
    
    public abstract void Check();
}
  

