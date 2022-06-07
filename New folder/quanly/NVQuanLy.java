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

public class NVQuanLy extends NhanVienCLCao{
    private double phuCap;

    @Override
    @SuppressWarnings("empty-statement")
    protected void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao phu cap : ");
        while(!this.setPhuCap(sc.nextDouble()));
    }
    @Override
    protected void outPut() {
        super.outPut();
        System.out.println("Phu cap : "+phuCap);
    }
    public double getPhuCap() {
        return phuCap;
    }

    public boolean setPhuCap(double phuCap) {
        if(phuCap >= 0) {
            this.phuCap = phuCap;
            return true;
        }
        else
        {
            System.err.println("Phụ cấp phải dương hoặc bằng 0 !");
            return false;
        }
    }
}
