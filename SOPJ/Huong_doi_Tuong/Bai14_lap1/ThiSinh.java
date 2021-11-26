package javacore.basic.lesson14.lab1;

import com.opencsv.bean.CsvBindByPosition;

public class ThiSinh {

    @CsvBindByPosition(position = 0)
    private int SBD;

    @CsvBindByPosition(position = 1)
    private String HoTen;

    @CsvBindByPosition(position = 2)
    private String GioiTinh;

    @CsvBindByPosition(position = 3)
    private String Tinh;

    @CsvBindByPosition(position = 4)
    private double TongDiem;

    public ThiSinh() {
    }

    public ThiSinh(int SBD, String HoTen, String GioiTinh, String Tinh, double TongDiem) {
        this.SBD = SBD;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.Tinh = Tinh;
        this.TongDiem = TongDiem;
    }

    public int getSBD() {
        return SBD;
    }

    public void setSBD(int SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getTinh() {
        return Tinh;
    }

    public void setTinh(String Tinh) {
        this.Tinh = Tinh;
    }

    public double getTongDiem() {
        return TongDiem;
    }

    public void setTongDiem(double TongDiem) {
        this.TongDiem = TongDiem;
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "SBD=" + SBD + ", HoTen=" + HoTen + ", GioiTinh=" + GioiTinh + ", Tinh=" + Tinh + ", TongDiem=" + TongDiem + '}';
    }
}
