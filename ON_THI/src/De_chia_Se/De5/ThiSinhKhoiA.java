
package De_chia_Se.De5;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh{
    private Float Toan;
    private Float Ly;
    private Float Hoa;

    public Float getToan() {
        return Toan;
    }

    public void setToan(Float Toan) {
        this.Toan = Toan;
    }

    public Float getLy() {
        return Ly;
    }

    public void setLy(Float Ly) {
        this.Ly = Ly;
    }

    public Float getHoa() {
        return Hoa;
    }

    public void setHoa(Float Hoa) {
        this.Hoa = Hoa;
    }

    public ThiSinhKhoiA() {
        super();
    }

    public ThiSinhKhoiA(String HoTen, String NgaySinh, String DiaChi, Float Toan, Float Ly, Float Hoa) {
        super(HoTen, NgaySinh, DiaChi);
        this.setToan(Toan);
        this.setLy(Ly);
        this.setHoa(Hoa);
    }

    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Diem Toan = ");
        this.setToan(Float.parseFloat(sc.nextLine()));
        System.out.print("Nhap Diem Ly = ");
        this.setLy(Float.parseFloat(sc.nextLine()));
        System.out.print("Nhap Diem Hoa = ");
        this.setHoa(Float.parseFloat(sc.nextLine()));
    }

    public void HienThi() {
        super.HienThi();
        System.out.println("Diem Toan: " + this.getToan());
        System.out.println("Diem Ly: " + this.getLy());
        System.out.println("Diem Hoa: " + this.getHoa());
    }

    @Override
    public void Check() {
        if (this.getToan() + this.getLy() + this.getHoa() >= 20) {
            this.HienThi();
        }
    }
    
    
    
}
