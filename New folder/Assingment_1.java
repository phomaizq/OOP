/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Assingment_1 {

   public static  ArrayList<Employee> list;

    private static String display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Assingment_1() {
     
    }

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Menu : Them nhan vien:\n"
                + "1.	Them nhan vien\n"
                + "2.	Hien thi danh sach va luong\n"
                + "3.	Tong lương\n"
                + "4.	Thoat\n"
                + "Chon tu (1-4):");
        c = sc.nextInt();
        return c;
    }

    public static int ThemNV() {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon them nhan vien loai nao:\n"
                + "1.	Them quan ly\n"
                + "2.	Them nha khoa hoc\n"
                + "3.	Them nhan vien phong thi nghiem.\n"
                + "Moi chon  1->3:");
        chon = sc.nextInt();
        return chon;
    }

    /*public void SapXep() {
        Assingment_1 b1 = new Assingment_1();
        for (int i = 0; i < b1.list.size() - 1; i++) {
            for (int j = i + 1; j < b1.list.size(); j++) {
                Employee temp;
                if (b1.list.get(i).totalPay > b1.list.get(j).totalPay) {
                    temp = b1.list.get(i);
                    b1.list.set(i, b1.list.get(j));
                    b1.list.set(j, temp);
                }

            }
        }
        
    }*/

    public static void main(String[] args) {
        Assingment_1 b1 = new Assingment_1();
        b1.list = new ArrayList<Employee>();
        Employee nv = null;
        int chon;
        do {
            chon = Menu();
            switch (chon) {
                case 1:
                    int addNV = ThemNV();
                    switch (addNV) {
                        case 1:
                            nv = new Manager();
                            nv.Nhap();
                            b1.list.add(nv);
                            
                            System.out.println("Đã thêm đối tượng thành công");
                            chon = 8;
                            break;
                        case 2:
                            nv = new Scientist();
                            nv.Nhap();
                            b1.list.add(nv);
                            System.out.println("Đã thêm đối tượng thành công");
                            chon = 8;
                            break;
                        case 3:
                            nv = new Laborer();
                            nv.Nhap();
                            b1.list.add(nv);
                            System.out.println("Đã thêm đối tượng thành công");
                            chon = 8;
                            break;
                        default:
                            System.out.println("Bạn chọn sai lựa chọn . Bạn sẽ được đưa về menu chính");
                    };
                    break;
                case 2:
                          System.out.println("--------------------------------------");
                    System.out.println("Danh sach nhan vien va tong luong");
                   System.out.println("--------------------------------------");
                    for (int i = 0; i < b1.list.size(); i++) {
                        b1.list.get(i).display();
                    }

                    chon = 8;
                    break;
                case 3:
                         System.out.println("Danh sach nhan vien "+  b1.list );
                    chon = 8;
                    break;

                case 4:
                    System.out.println("Bạn Đã thoát chương trình hẹn gặp lại bạn sau ");
                    chon = 7;
                    break;

            }
        } while (chon == 8);

    }
}
