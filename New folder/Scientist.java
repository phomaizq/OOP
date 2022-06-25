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
public class Scientist extends Employee {

    int publication = 0;

    public Scientist() {
    }

    public double calculatepay() {
      

        if (publication >= 5000) {
            totalPay = salary + salary ;
        } else {
            totalPay = salary + salary ;
        }
        return totalPay;
    }

      public  void Nhap(){
           Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten nha khoa hoc: ");
        name = sc.nextLine();
        System.out.println("Nhap so bai viet: ");
        publication = sc.nextInt();
        System.out.println("Nhap luong: ");
        salary = sc.nextInt();
      }
              
    public void display() {

       
        System.out.println("Luong cua nha khoa hoc " + name + " la: " + calculatepay());
    }
;
}

