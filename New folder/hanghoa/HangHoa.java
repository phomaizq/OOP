/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hanghoa;



import java.util.Scanner;

public abstract class  HangHoa {
    protected String maHang;
    protected String tenHang;
    protected double gia;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    void inPut()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma hang : ");
        while(!setMaHang(sc.nextLine()));
        System.out.print("Nhap ten hang : ");
        this.setTenHang(sc.nextLine());
        System.out.print("Nhap gia tien : ");
        while(!setGia(sc.nextDouble()));
    }
    void outPut()
    {
        System.out.println("Ma hang : "+maHang);
        System.out.println("Ten hang: "+tenHang);
        System.out.println("Gia tien : "+gia+"VND");
    }
    public String getMaHang() {
        return maHang;
    }

    public boolean setMaHang(String maHang) {
        if(!maHang.equals(" ")) {
            this.maHang = maHang;
            return true;
        }
        else
        {
            System.err.println("Mã hàng không được bỏ trống !");
            return false;
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getGia() {
        return gia;
    }

    public boolean setGia(double gia) {
        if ( gia >= 0) {
            this.gia = gia;
            return true;
        }
        else{
            System.err.println("Giá phải lớn hơn 0 !");
            return false;
        }
    }
}
