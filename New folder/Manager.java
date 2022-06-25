/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author hp
 */
import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public class Manager extends Employee {


        int business_amount = 0;
    public Manager() {

    }

     public double calculatepay() {
      

        if (business_amount >= 50) {
            totalPay = salary + salary ;
        } else {
            totalPay = salary + salary ;
        }
        return totalPay;

    }

      public  void Nhap(){
                  Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap then quan ly :");
        name = sc.nextLine();
        System.out.println("Nhập nam sinh  :");
        namsinh = sc.nextLine();
        System.out.println("Nhập bang cap  :");
        bangcap = sc.nextLine();
        System.out.println("Nhập chuc vu  :");
        chucvu = sc.nextLine();
        System.out.println("nhap so ngay cong :");
        Songaycong = sc.nextLine();
        
        System.out.println("Nhap luong co ban: ");
        salary = sc.nextDouble();
        
        
      };

      public void display() {

       
        System.out.println("Luong nha quan ly " + name + " la: " + calculatepay());
    }

}
