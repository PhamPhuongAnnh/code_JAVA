/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class QuanLyNhanVien {

    private List<NhanVien> listNV = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public List<NhanVien> nhapDanhSachNhanVien() {

        while (true) {
            System.out.println("\t1. Nhân viên hành chính");
            System.out.println("\t2. Nhân viên tiếp thị");
            System.out.println("\t3. Trưởng phòng");
            System.out.println("\t0. Không nhập nữa");
            int check = sc.nextInt();
            if (check == 0) {
                break;
            }
            switch (check) {
                case 1:
                    NhanVien nv = new NhanVienHanhChinh();
                    nv.nhapTT();
                    listNV.add(nv);
                    break;
                case 2:
                    NhanVien nv1 = new NhanVienTiepThi();
                    nv1.nhapTT();
                    listNV.add(nv1);
                    break;
                case 3:
                    NhanVien nv2 = new TruongPhong();
                    nv2.nhapTT();
                    listNV.add(nv2);
                    break;
            }
        }
        return listNV;
    }

    public void xuatThongTin() {
        if (listNV.size() == 0) {
            System.out.println("Danh sách trống");
            return;
        }
        for (NhanVien item : listNV) {
            if (item instanceof NhanVienHanhChinh) {
                NhanVienHanhChinh nv = (NhanVienHanhChinh) item;
                nv.xuatTT();
                System.out.println("Thu nhập: " + item.getThuNhap());
            }
            if (item instanceof NhanVienTiepThi) {
                NhanVienTiepThi nv1 = (NhanVienTiepThi) item;
                nv1.xuatTT();

                System.out.println("Thu nhập: " + item.getThuNhap());
            }
            if (item instanceof TruongPhong) {
                TruongPhong nv2 = (TruongPhong) item;
                nv2.xuatTT();

                System.out.println("Thu nhập: " + item.getThuNhap());
            }
        }
    }

    public void timKiemMa(String ma) {
        int flag = 0;
        for (NhanVien item : listNV) {
            if (item.getMaNV().equals(ma)) {
                if (item instanceof NhanVienHanhChinh) {
                    NhanVienHanhChinh nv = (NhanVienHanhChinh) item;
                    nv.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
                if (item instanceof NhanVienTiepThi) {
                    NhanVienTiepThi nv1 = (NhanVienTiepThi) item;
                    nv1.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
                if (item instanceof TruongPhong) {
                    TruongPhong nv2 = (TruongPhong) item;
                    nv2.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Không tìm thầy thông tin cần tìm");
        }
    }

    public void timKiemLuong(double luong) {
        int flag = 0;
        for (NhanVien item : listNV) {
            if (item.getLuong() == luong) {
                if (item instanceof NhanVienHanhChinh) {
                    NhanVienHanhChinh nv = (NhanVienHanhChinh) item;
                    nv.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
                if (item instanceof NhanVienTiepThi) {
                    NhanVienTiepThi nv1 = (NhanVienTiepThi) item;
                    nv1.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
                if (item instanceof TruongPhong) {
                    TruongPhong nv2 = (TruongPhong) item;
                    nv2.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
            }
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("Không tìm thầy thông tin cần tìm");
        }
    }

    public void xoaNhanVienMa(String ma) {
        for (int i = listNV.size() - 1; i >= 0; i--) {
            if (listNV.get(i).getMaNV().equals(ma)) {
                listNV.remove(listNV.get(i));
            }
        }
    }

    public void menuSuaTT() {
        System.out.println("\tBạn muốn sửa thông tin gì?");
        System.out.println("\t0.Sửa tất cả thông tin");
        System.out.println("\t1. Họ tên");
        System.out.println("\t2. Lương");
    }

    public void suaThongTin(String ma) {
        for (NhanVien item : listNV) {
            if (item.getMaNV().equals(ma)) {
                if (item instanceof NhanVienHanhChinh) {

                    menuSuaTT();
                    int check1 = sc.nextInt();
                    switch (check1) {
                        case 1:
                            sc.nextLine();
                            System.out.println("Họ tên: ");
                            item.setHoTen(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("Lương: ");
                            item.setLuong(sc.nextDouble());
                            break;
                        case 0:
                            sc.nextLine();
                            System.out.println("Họ tên: ");
                            item.setHoTen(sc.nextLine());
                            System.out.println("Lương: ");
                            item.setLuong(sc.nextDouble());
                            break;
                        default:
                            break;
                    }

                }
                if (item instanceof NhanVienTiepThi) {

                    NhanVienTiepThi nv2 = (NhanVienTiepThi) item;

                    menuSuaTT();
                    System.out.println("\t3. Doanh số bán hàng");
                    System.out.println("\t4. Tỉ số hoa hồng");
                    int check1 = sc.nextInt();
                    switch (check1) {
                        case 1:
                            sc.nextLine();
                            item.setHoTen(sc.nextLine());
                            break;
                        case 2:
                            item.setLuong(sc.nextDouble());
                            break;
                        case 0:
                            sc.nextLine();
                            System.out.println("Họ tên: ");
                            item.setHoTen(sc.nextLine());
                            System.out.println("Lương: ");
                            item.setLuong(sc.nextDouble());
                            System.out.println("Doanh số bán hàng: ");
                            nv2.setDoanhSo(sc.nextInt());
                            System.out.println("Tỉ số hoa hồng: ");
                            nv2.setTiLeHH(sc.nextDouble());
                            break;
                        case 3:
                            nv2.setDoanhSo(sc.nextInt());
                            break;
                        case 4:
                            nv2.setTiLeHH(sc.nextDouble());
                            break;
                        default:
                            break;
                    }

                }
                if (item instanceof TruongPhong) {
                    TruongPhong nv3 = (TruongPhong) item;

                    menuSuaTT();
                    System.out.println("\t3. Lương trách nhiệm");
                    int check1 = sc.nextInt();
                    switch (check1) {
                        case 1:
                            sc.nextLine();
                            item.setHoTen(sc.nextLine());
                            break;
                        case 2:
                            item.setLuong(sc.nextDouble());
                            break;
                        case 0:
                            sc.nextLine();
                            System.out.println("Họ tên: ");
                            item.setHoTen(sc.nextLine());
                            System.out.println("Lương: ");
                            item.setLuong(sc.nextDouble());
                            System.out.println("Lương trách nhiệm: ");
                            nv3.setLuongTN(sc.nextDouble());
                            break;
                        case 3:
                            nv3.setLuongTN(sc.nextDouble());
                            break;
                        default:
                            break;
                    }

                }
            }
        }
    }

    public void sapXepHoTen() {
        Collections.sort(listNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    public void ThuNhap() {
        double thu = 0;
        for (NhanVien item : listNV) {
            if (item instanceof NhanVienHanhChinh) {
                thu = item.getLuong();
                if (thu <= 15 && thu > 9) {
                    thu = thu - thu * 0.1;
                }
                if (thu > 15) {
                    thu = thu - thu * 0.12;
                }
                item.setThuNhap(thu);
                System.out.println("a");
            }
            if (item instanceof NhanVienTiepThi) {
                NhanVienTiepThi nv1 = (NhanVienTiepThi) item;
                thu = nv1.getLuong() + nv1.getDoanhSo() * nv1.getTiLeHH();
                if (thu <= 15 && thu > 9) {
                    thu = thu - thu * 0.1;
                }
                if (thu > 15) {
                    thu = thu - thu * 0.12;
                }
                nv1.setThuNhap(thu);
            }
            if (item instanceof TruongPhong) {
                TruongPhong nv2 = (TruongPhong) item;
                thu = nv2.getLuong() + nv2.getLuongTN();
                if (thu <= 15 && thu > 9) {
                    thu = thu - thu * 0.1;
                }
                if (thu > 15) {
                    thu = thu - thu * 0.12;
                }
                nv2.setThuNhap(thu);
            }
        }
    }

    public void sapXepThuNhap() {
        Collections.sort(listNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    public void sapXepLuong() {
        Collections.sort(listNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getThuNhap() > o2.getThuNhap()) {
                    return -1;
                } else if (o1.getThuNhap() == o2.getThuNhap()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
    }

    public void Y9() {
        int i = 0;
        while (i < 5) {
            for (NhanVien item : listNV) {
                if (item instanceof NhanVienHanhChinh) {
                    NhanVienHanhChinh nv = (NhanVienHanhChinh) item;
                    nv.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
                if (item instanceof NhanVienTiepThi) {
                    NhanVienTiepThi nv1 = (NhanVienTiepThi) item;
                    nv1.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
                if (item instanceof TruongPhong) {
                    TruongPhong nv2 = (TruongPhong) item;
                    nv2.xuatTT();

                    System.out.println("Thu nhập: " + item.getThuNhap());
                }
            }
            i++;
        }

    }
}
