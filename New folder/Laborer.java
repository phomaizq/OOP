/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Laborer extends Employee {

    int hrsworked;

    public Laborer() {
    }

    @Override
    public double calculatepay() {
      

        if (hrsworked >= 50) {
            totalPay = salary + salary ;
        } else {
            totalPay = salary + salary ;
        }
        return totalPay;

    }

    @Override
      public void Nhap(){
              Scanner sc = new Scanner(System.in);
        System.out.println("Nhap then nhan vien phong thi nghiem: ");
        name = sc.nextLine();
         System.out.println("Nhap nam sinh: ");
         namsinh = sc.nextLine();
         System.out.println("Nhap bang cap: ");
          bangcap= sc.nextLine();
        System.out.println("Nhap luong : ");
        salary = sc.nextDouble();
        
      };


    
      
    @Override
   public void display() {

       
        System.out.println("Lương của phòng thí  nghiệm " + name + " là: " + calculatepay());
    }

   


 

}