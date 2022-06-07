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

public class  NhanVien extends Person {
private double luong;
private int ngayNhanViec;

PhongBanKhoa vanPhongKhoa = new PhongBanKhoa();
    public NhanVien(){

        }

    public NhanVien(String hoTen, int namSinh, double luong, int ngayNhanViec, PhongBanKhoa vanPhongKhoa) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.vanPhongKhoa = vanPhongKhoa;
        }

protected void inPut(){
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhap luong co ban: ");
        this.setLuong(sc.nextDouble());
        sc.nextLine();
        System.out.print("Nhậap ngay lam viec : ");
        this.setNgayNhanViec(sc.nextInt());
        sc.nextLine();
        vanPhongKhoa.Nhap();
        }
protected void outPut() {
        super.outPut();
        System.out.println("Luong co ban : "+this.getLuong());
        System.out.println("Ngay vao lam : "+this.getNgayNhanViec());
        vanPhongKhoa.Xuat();
        }

public double getLuong() {
        return luong;
        }

public void setLuong(double luong) {
        this.luong = luong;
    }

public int getNgayNhanViec() {
        return ngayNhanViec;
        }

public void setNgayNhanViec(int ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
        }
        }
