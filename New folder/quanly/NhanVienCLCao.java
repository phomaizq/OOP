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

public class NhanVienCLCao extends NhanVien{
    private String trinhDo,nganh,noiDaoTao;

    public NhanVienCLCao() {

    }

    public NhanVienCLCao(String hoTen, int namSinh, double luong, int ngayNhanViec, PhongBanKhoa vanPhongKhoa, String trinhDo, String nganh, String noiDaoTao) {
        super(hoTen, namSinh, luong, ngayNhanViec, vanPhongKhoa);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    protected void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhap vao trinh do : ");
        this.setTrinhDo(sc.nextLine());
        System.out.print("Nhap nganh : ");
        this.setNganh(sc.nextLine());
        System.out.print("Nhap noi dao tao : ");
        this.setNoiDaoTao(sc.nextLine());
    }


    @Override
    protected void outPut() {
        super.outPut();
        System.out.println("Trinh do : "+this.getTrinhDo());
        System.out.println("Nganhh : "+this.getNganh());
        System.out.println("Noi dao tao : "+this.getNoiDaoTao());
    }
    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }
}
