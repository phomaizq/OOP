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

public class Student {
    private String id, name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" id: ");
        id = sc.next();
        System.out.print(" name: ");
        name = sc.next();
        System.out.print(" age: ");
        age = sc.nextInt();
    }

    @Override
    public String toString() {
            return "ID \t" + this.id + "\t" +"ten \t" +  this.name  +"\t"  + "Luong \t"+"" +this.age;
    }
}