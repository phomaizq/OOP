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

public class HocVien extends Person{
    private Float diem1,diem2,diem3;

    public HocVien(){

    }

    public HocVien(String hoTen, int namSinh, Float diem1, Float diem2, Float diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhap vao diem thu 1 : ");
        this.setDiem1(sc.nextFloat());
        System.out.print("Nhap vao diem thu 2 : ");
        this.setDiem2(sc.nextFloat());
        System.out.print("Nhap vao diem thu 2 : ");
        this.setDiem3(sc.nextFloat());
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("diem thu 1 : "+this.getDiem1());
        System.out.println("diem thu 2 : "+this.getDiem2());
        System.out.println("diem thu 3 : "+this.getDiem3());
    }

    public Float getDiem1() {
        return diem1;
    }

    public void setDiem1(Float diem1) {
        if(diem1 >= 0)
            this.diem1 = diem1;
        else
            this.diem1 = Float.valueOf(0);
    }

    public Float getDiem2() {
        return diem2;
    }

    public void setDiem2(Float diem2) {
        if(diem2 >= 0)
            this.diem2 = diem2;
        else
            this.diem2 = Float.valueOf(0);
    }

    public Float getDiem3() {
        return diem3;
    }

    public void setDiem3(Float diem3) {
        if(diem3 >=0)
            this.diem3 = diem3;
        else
            this.diem3 = Float.valueOf(0);
    }
}
