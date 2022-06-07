/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanly;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class PhongBanKhoa {
    private String MaPBK,TenPBK;

    public PhongBanKhoa() {

    }

    public PhongBanKhoa(String maPBK, String tenPBK) {
        MaPBK = maPBK;
        TenPBK = tenPBK;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma phong ban khoa : ");
        this.setMaPBK(sc.nextLine());
        System.out.print("Nhap vao ten phong ban khoa : ");
        this.setTenPBK(sc.nextLine());
    }
    public void Xuat()
    {
        System.out.println("Ma phong ban khoa : "+this.getMaPBK());
        System.out.println("Ten phong ban khoa : "+this.getTenPBK());
    }

    public String getMaPBK() {
        return MaPBK;
    }

    public void setMaPBK(String maPBK) {
        MaPBK = maPBK;
    }

    public String getTenPBK() {
        return TenPBK;
    }

    public void setTenPBK(String tenPBK) {
        TenPBK = tenPBK;
    }


}

