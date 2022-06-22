/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class PersonalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonalModel<Student> stu = new PersonalModel<Student>();
        PersonalModel<Employee> emp = new PersonalModel<Employee>();

        byte choose;
        do {
            System.out.println("1. Them sinh vien");
            System.out.println("2. Them nhan vien");
            System.out.println("3. xuat sinh vien");
            System.out.println("4. xuat nhan vien");
            System.out.println("0. Exit");
            System.out.print(" moi ban chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    Student s = new Student();
                    s.input();
                    stu.add(s);
                    break;
                case 2:
                    Employee e = new Employee();
                    e.input();
                    emp.add(e);
                    break;
                case 3:
                    stu.display();
                    break;
                case 4:
                    emp.display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("-----------------");
            }
            sc.nextLine();
        } while (choose != 0);
    }
}