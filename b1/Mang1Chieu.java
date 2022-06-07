/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mang1chieu;

/**
 *
 * @author hp
 */
import java.util.Random;
import java.util.Scanner;

public class Mang1Chieu {
	static int M[];
	public static void menu() {
		System.out.println("1.Nhap mang");
		System.out.println("2.Xuat mang");
		System.out.println("3.Tinh tong mnag");
		System.out.println("4.Lon nhat");
		System.out.println("5.Sep tang");
		System.out.println("0.Thoat");
		System.out.println("ban chon di?:");
		int chon=new Scanner(System.in).nextInt();
		switch (chon) {
			case 1:
				NhapMang();
				break;
			case 2:
				XuatMang();
				break;
			case 3:
				TinhTong();
				break;	
                        case 4:
				TimMax();
				break;
			case 5:
				SapTang();
				break;
			case 0:
				System.out.println("da thoay !!!");
				System.exit(0);
			default:
				System.err.println("Nhap sai roi!");
				break;
			}
	}

	private static void SapTang() {
		for(int i=0;i<M.length-1;i++)  {
			for(int j=i+1; j<M.length;j++) {
				if(M[i]>M[j]) {
					int temp=M[i];
					M[i]=M[j];
					M[j]=temp;
				}
			}
		}
	}


	private static void TimMax() {
		int max=M[0];
		for(int i=0;i<M.length;i++) {
			if(M[i]>max) {
				max=M[i];
			}
		}
		System.out.println("so lon nhat="+max);
	}

	private static void TinhTong() {
		int sum=0;
		for(int x : M) {
			sum+=x;
		}
		System.out.println("Tong mang="+sum);
	}
	private static void XuatMang() {
		System.out.println("mang sau khi nhap:");
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	private static void NhapMang() {
		System.out.println("Nhap  n:");
		int n=new Scanner(System.in).nextInt();
		M=new int[n];
		Random rd=new Random();
		for(int i=0;i<n;i++) {
			M[i]=rd.nextInt(100);
		}
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}

