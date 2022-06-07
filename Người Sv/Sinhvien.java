/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Sinhvien extends Nguoi{
    private String MSSV;
    private Double DiemLT,DiemTH;

    Sinhvien() {
        super();
        MSSV="";
        DiemLT=DiemTH= 0.0;
    }


    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public Double getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(Double DiemLT) {
        this.DiemLT = DiemLT;
    }

    public Double getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(Double DiemTH) {
        this.DiemTH = DiemTH;
    }
    
    private double diemtb()
    {
        return (DiemLT+DiemTH)/2;
    }
    
    public Sinhvien(String SoCMND,String Hoten,String Diachi,String Ngaysinh,String masv,double DiemLT,double DiemTH){
        super(SoCMND,Hoten,Diachi,Ngaysinh);
        this.MSSV=masv;
        this.DiemTH=DiemTH;   
        this.DiemLT=DiemLT; 
    }
   public void xuatsv()
    {
        super.out();
        System.out.println("MSSV:"+MSSV+"\nDiemLT:"+DiemLT+"\nDiemTH:"+DiemTH+"\nDiemtb:"+diemtb()); 
    }
    
    public void nhap1SV()
    {
        super.in();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma SV: ");
        MSSV = sc.nextLine();
        System.out.println("Nhap Diem LT:");
        DiemLT=sc.nextDouble();
        System.out.println("Nhap Diem TH:");
        DiemTH=sc.nextDouble();
        
    }

   

    
}
