/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvieb1;

/**
 *
 * @author hp
 */
class Demo2 {

	public static void main(String[] args) {
		
		NVQuanLy nvql = new NVQuanLy();
		nvql.input();
		System.out.println(nvql.output());
		System.out.println("Tong luong nv: " + nvql.tinhLuong());
			
		NVNghienCuu nvnc = new NVNghienCuu();
		nvnc.input();
		System.out.println(nvnc.output());
		System.out.println("Tong luong nv: " + nvnc.tinhLuong());
			
		NVPhucVu nvpv = new NVPhucVu();
		nvpv.input();
		System.out.println(nvpv.output());
		System.out.println("Tong luong nv: " + nvpv.tinhLuong());

	}

}