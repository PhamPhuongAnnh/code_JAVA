
package De_chia_Se.De5;
import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh{
    private Float Van;
    private Float Su;
    private Float Dia;

    public Float getVan() {
        return Van;
    }

    public void setVan(Float Van) {
        this.Van = Van;
    }

    public Float getSu() {
        return Su;
    }

    public void setSu(Float Su) {
        this.Su = Su;
    }

    public Float getDia() {
        return Dia;
    }

    public void setDia(Float Dia) {
        this.Dia = Dia;
    }

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(String HoTen, String NgaySinh, String DiaChi, Float Van, Float Su, Float Dia) {
        super(HoTen, NgaySinh, DiaChi);
        this.setVan(Van);
        this.setSu(Su);
        this.setDia(Dia);
    }

    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Diem Van = ");
        this.setVan(Float.parseFloat(sc.nextLine()));
        System.out.print("Nhap Diem Su = ");
        this.setSu(Float.parseFloat(sc.nextLine()));
        System.out.print("Nhap Diem Dia = ");
        this.setDia(Float.parseFloat(sc.nextLine()));
    }

    public void HienThi() {
        super.HienThi();
        System.out.println("Diem Van: " + this.getVan());
        System.out.println("Diem Su: " + this.getSu());
        System.out.println("Diem Dia: " + this.getDia());
    }

    @Override
    public void Check() {
        if (this.getVan() + this.getSu() + this.getDia() >= 20) {
            this.HienThi();
        }
    }
    
    
    
    
}
