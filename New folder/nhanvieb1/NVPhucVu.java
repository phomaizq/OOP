/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvieb1;

/**
 *
 * @author hp
 */
public class NVPhucVu extends NhanVien {

	// constructor
	public NVPhucVu() {
		super();
	}

	public NVPhucVu(int maNV, String tenNV, int namSinh, String trinhDo, double luongCB) {
		super(maNV, tenNV, namSinh, trinhDo, luongCB);
	}

	// method
        @Override
	public void input() {
		super.input();
	}

	public String output() {
		return super.output();
	}

	public double tinhLuong() {
		return this.luongCB;
	}

}
