/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hanghoa;

/**
 *
 * @author hp
 */


import java.util.Scanner;

 class HangDienMay extends HangHoa{
    private int thoiGianBH;
    private float dienAp;
    private float congSuat;

    public HangDienMay() {
    }

    public HangDienMay(String maHang, String tenHang, double gia, int thoiGianBH, float dienAp, float congSuat) {
        super(maHang, tenHang, gia);
        this.thoiGianBH = thoiGianBH;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhap thoi gian bao hanh : ");
        thoiGianBH=sc.nextInt();
        System.out.print("Nhap dien ap : ");
        while (!setDienAp(sc.nextFloat()));
        System.out.print("Nhap cong xuat : ");
        while (!setCongSuat(sc.nextFloat()));
    }

    @Override
    void outPut() {
        super.outPut();
        System.out.println("Thoi gian bao hanh: "+thoiGianBH +" thang");
        System.out.println("dien ap : "+dienAp + "W");
        System.out.println("cong xuat : "+congSuat + "V");
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public float getDienAp() {
        return dienAp;
    }

    public boolean setDienAp(float dienAp) {
        if(dienAp >= 0){
            this.dienAp = dienAp;
            return true;
        }
        else
        {
            System.out.println("Điện áp phải dương !");
            return false;
        }
    }

    public float getCongSuat() {
        return congSuat;
    }

    public boolean setCongSuat(float congSuat) {
        if(congSuat >=0) {
            this.congSuat = congSuat;
            return true;
        }
        else
        {
            System.out.println("Công suất phải lớn hơn 0 !");
            return false;
        }
    }
}

