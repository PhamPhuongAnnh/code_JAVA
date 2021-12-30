package Them.B10;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import Them.B10.HangHoa;

/**
 *
 * @author phuon
 */
public class DienMay extends HangHoa implements Serializable{
     List<DienMay> dienmay = new ArrayList<>();
    

    private int thoiGianBH;
    private int congSuat;

    public DienMay() {
        super();
    }

    public DienMay(int thoiGianBH, int congSuat) {
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

//    @Override
//    public void nhap() {
//        super.nhap();
//        System.out.println("Thời gian bảo hành: ");
//        thoiGianBH = sc.nextInt();
//        while (checkBaoHanh() == false) {
//            System.out.println("Thời gian bảo hàng phải lớn hơn 0");
//            thoiGianBH = sc.nextInt();
//        }
//
//        System.out.println("Công suất: ");
//        congSuat = sc.nextInt();
//        while (checkCongSuat() == false) {
//            System.out.println("Công suất phải lớn hơn 0");
//            thoiGianBH = sc.nextInt();
//        }
//
//    }
        

    public boolean checkBaoHanh() {
        if (this.thoiGianBH < 0) {
            return false;
        }
        return true;
    }
    public void sapXepMa() {
        Collections.sort(dienmay, new Comparator<DienMay>() {
            public int compare(DienMay o1, DienMay o2) {
                return o1.getMaHang().compareTo(o2.getMaHang());
            }
        });
    }

    public boolean checkCongSuat() {
        if (this.thoiGianBH < 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", thoiGianBH=" + thoiGianBH + ", congSuat=" + congSuat +" " + danhGia()+ '}';
    }


    public String danhGia() {
        if(this.getSoLuongTon()<3){
            return "";
        }
        return "";
    }

   

}