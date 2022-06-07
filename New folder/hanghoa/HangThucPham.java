/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hanghoa;

/**
 *
 * @author hp
 */


import java.util.Scanner;

public class HangThucPham extends HangHoa{
    private int ngaySanXuat;
    private int ngayHetHan;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, double gia, int ngaySanXuat, int ngayHetHan) {
        super(maHang, tenHang, gia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    void inPut() {
        super.inPut();
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap vao ngay san xuat : ");
        while(!setNgaySanXuat(sc.nextInt()));
        System.out.print("Nhap vao ngay het han : ");
        while(!setNgayHetHan(sc.nextInt()));
    }

    @Override
    void outPut() {
        super.outPut();
        System.out.println("Ngay san xuat : "+ngaySanXuat);
        System.out.println("Ngay het han: "+ngayHetHan);
    }

    public int getNgaySanXuat() {
        return ngaySanXuat;
    }

    public boolean setNgaySanXuat(int ngaySanXuat) {
        if(ngaySanXuat > 0 && ngaySanXuat <= 31) {
            this.ngaySanXuat = ngaySanXuat;
            return true;
        }
        else{
            System.err.println("Phai co ngay san xuat nam trong 1 thang : ");
            return false;
        }
    }

    public int getNgayHetHan() {
        return ngayHetHan;
    }

    public boolean setNgayHetHan(int ngayHetHan) {
        if(ngayHetHan > 0 && ngayHetHan <= 31) {
            this.ngayHetHan = ngayHetHan;
            return true;
        }
        else{
            System.err.println("Phai co ngay san xuat nam trong 1 thang : ");
            return false;
        }
    }
}
/*class Main{
    public static void main(String[] args) {
        HangThucPham hangThucPham = new HangThucPham();
        hangThucPham.inPut();
        hangThucPham.outPut();
    }
}*/