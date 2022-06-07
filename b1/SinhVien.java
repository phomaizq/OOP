/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sinhvien;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class SinhVien {
	String MaHV;
	String TenHV;
	String Lop;
	int diemJava;
	int diemOracle;
	int diemProject;

	public String getMaHV() {
		return MaHV;
	}

	public void setMaHV(String maHV) {
		MaHV = maHV;
	}

	public String getTenHV() {
		return TenHV;
	}

	public void setTenHV(String tenHV) {
		TenHV = tenHV;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public int getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(int diemJava) {
		this.diemJava = diemJava;
	}

	public int getDiemOracle() {
		return diemOracle;
	}

	public void setDiemOracle(int diemOracle) {
		this.diemOracle = diemOracle;
	}

	public int getDiemProject() {
		return diemProject;
	}

	public void setDiemProject(int diemProject) {
		this.diemProject = diemProject;
	}

	public SinhVien(String maHV, String tenHV, String lop, int diemJava, int diemOracle, int diemProject) {
		super();
		MaHV = maHV;
		TenHV = tenHV;
		Lop = lop;
		this.diemJava = diemJava;
		this.diemOracle = diemOracle;
		this.diemProject = diemProject;
	}

	public SinhVien() {
		super();
	}

	public static Scanner sc = new Scanner(System.in);

	public SinhVien inputData() {
		System.out.print("nhap ma SV: ");
		this.MaHV = sc.nextLine();
		System.out.print("nhap ten Sv: ");
		this.TenHV = sc.nextLine();
		System.out.print("Nhap Lop: ");
		this.Lop = sc.nextLine();
		System.out.print("Nhap diem Java: ");
		this.diemJava = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap diem Oracle: ");
		this.diemOracle = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap diem Project: ");
		this.diemProject = Integer.parseInt(sc.nextLine());
		SinhVien hv = new SinhVien(this.MaHV, this.TenHV, this.Lop, this.diemJava, this.diemOracle, this.diemProject);
		return hv;
	}

	public String toString() { 
		return "\nMSSV: " + MaHV + "\nTen: " + TenHV + "\nlop: " + Lop + "\ndiem Java: " + diemJava
				+ "\ndiem Oracle: " + diemOracle + "\nĐiem Project: " + diemProject;
	}

	public float tinhDTB() {
		float dTB = (float) (diemJava + diemOracle + diemProject) / 3;
		float diemTB = (float) Math.round(dTB * 100) / 100;
		return diemTB;
	}

	

	public static void line() {
		System.out.println("--------------------------------------------");
	}

	public static void main(String[] args) {
		SinhVien hv = new SinhVien();
		System.out.println("nhap tjomg tin Sv 1: ");
		SinhVien hv1 = hv.inputData();
		line();
		System.out.println("nhap tjomg tin Sv 2: ");
		SinhVien hv2 = hv.inputData();
		line();
		System.out.println("Thong tin sv 1: " + hv1.toString());
		line();
		System.out.println("Thong tin sv  2: " + hv2.toString());
		line();
		System.out.println("DTB cua Sv 1 : " + hv1.tinhDTB());
		System.out.println("DTB cua Sv 1 : " + hv2.tinhDTB());
		
		line();
		
	}

}

