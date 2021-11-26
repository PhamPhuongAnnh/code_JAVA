
package test.Bai9_lap1;


public class Solution {
    public static void main(String[] args) {
        IHinhHoc hcn = new hinhChuNhat(5, 4);
        IHinhHoc ht = new hinhTron(5);
        hcn.xuatThongTin();
        ht.xuatThongTin();
    }
}
