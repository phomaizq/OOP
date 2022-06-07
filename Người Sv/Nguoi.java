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
public class Nguoi {

    String SoCMND;
    private String Hoten,NgaySinh,Diachi;

    public String getSoCMND() {
        return SoCMND;
    }
    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }
  
  
    public String getHoten() {
        return Hoten;
    }    
    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiachi() {
        return Diachi;
    }
    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
    
    
    public Nguoi (String SoCMND,String Hoten,String Ngaysinh,String Diachi){
        this.SoCMND=SoCMND;
        this.Hoten=Hoten;
        this.NgaySinh=Ngaysinh;
        this.Diachi=Diachi;
    }
    public Nguoi()
    {
        SoCMND="";
        Hoten="";
        NgaySinh="";
        Diachi="";
    }
    public void in(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten SV: ");
        Hoten=sc.nextLine();
        System.out.println("Nhap So CMND");
        SoCMND=sc.nextLine();
        System.out.println("NHap dia chi:");
        Diachi=sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        NgaySinh=sc.nextLine();
    }
    public void out()
    {
     System.out.println("Hoten:"+Hoten+"\nSoCMND:"+SoCMND+"\nDiaChi:"+Diachi+"\nNgay Sinh:"+NgaySinh);
    }
    
    
    
    
}
