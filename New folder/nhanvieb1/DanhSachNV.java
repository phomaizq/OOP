/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvieb1;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNV {

	private ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

	public void inputList() {
		NhanVien x = null;
		Scanner sc = new Scanner(System.in);
                
		int chose;
		do {
                        
			System.out.println(" 1 - Nhan vien quan ly");
                        System.out.println(" 2 - Nhan vien nghien cuu");
                        System.out.println(" 3 - Nhan vien phuc vu");
                      /*System.out.println(" 4 xuat quan ly ");
                        System.out.println(" 5 xuat vien nghien cuu ");*/
                        System.out.println(" 0 - xuat all");
                       
			chose = sc.nextInt();

			switch (chose) {
			case 0 -> {
                        }
			case 1 -> {
                            x = new NVQuanLy();
                            x.input();
                            dsNhanVien.add(x);
                            
                        }
			case 2 -> {
                            x = new NVNghienCuu();
                            x.input();
                            dsNhanVien.add(x);
                        }
			case 3 -> {
                            x = new NVPhucVu();
                            x.input();
                            dsNhanVien.add(x);
                        }
			default -> System.out.println("So da nhap khong hop le");
			}
		} while (chose != 0);
	}

	public void outputList() {
		for (NhanVien x : dsNhanVien) {
			System.out.println(x.output());
		}
	}
	public void inLuong() {
		for (NhanVien x: dsNhanVien) {
			System.out.println(x.getTenNV() + "co luong: " + x.tinhLuong());
		}
	}
	
	public double tinhTongLuong() {
		double tongLuong = 0;
		for (NhanVien x: dsNhanVien) {
			tongLuong += x.tinhLuong();
		}
		return tongLuong;
	}
	
	public void soLuongNV() {
		int slNVQuanLy = 0;
		int slNVNghienCuu = 0;
		int slNVPhucVu = 0;
		
		for (NhanVien x: dsNhanVien) {
			if (x instanceof NVQuanLy) {
				slNVQuanLy++;
			} else if (x instanceof NVNghienCuu) {
				slNVNghienCuu++;
			} else {
				slNVPhucVu++;
			}
		}
		System.out.println("NV quan ly: " + slNVQuanLy +"\nNV nghien cuu: " + slNVNghienCuu +"\nNV phuc vu: " + slNVPhucVu);
	}

    private String NVNghienCuu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

