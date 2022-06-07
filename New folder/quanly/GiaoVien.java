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

public class GiaoVien extends NhanVienCLCao{
    private Double thuLao;

    @Override
    protected void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao thu lao giao vien : ");
        while(!this.setThuLao(sc.nextDouble()));
    }

    @Override
    protected void outPut() {
        super.outPut();
        System.out.println("Thu lao : "+this.getThuLao());
    }

    public Double getThuLao() {
        return thuLao;
    }

    public boolean setThuLao(Double thuLao) {
        if(thuLao > 0) {
            this.thuLao = thuLao;
            return true;
        }
        else
        {
            System.err.println("Thù lao phải dương !");
            return false;
        }
    }
}
