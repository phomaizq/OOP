/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author hp
 */
public abstract class Employee {

  
    String name;
    double salary;
    public double totalPay;
     String bangcap;
     String chucvu;
    String Sobaibao;
    String Songaycong;
    String namsinh ;

   
    
   
    public Employee() {
    }

    public Employee(String name, double salary, String bangcap, String chucvu, String Sobaibao, String Songaycong ,String namsinh ) {
        this.name = name;
        this.salary = salary;
        this.Sobaibao = Sobaibao;
        this.Songaycong = Songaycong;
        this.chucvu = chucvu;
        this.bangcap = bangcap;
        this.namsinh = namsinh;
        
    }
    
    
    public abstract double calculatepay();
    public abstract void display();
    public abstract void Nhap();
}


