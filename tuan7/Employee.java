/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Employee {
    private String id, name;
    private long salary;

    public Employee() {
    }

    public Employee(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        id = sc.next();
        System.out.print(" name: ");
        name = sc.next();
        System.out.print(" luong: ");
        salary = sc.nextLong();
    }

    @Override
  public String toString() {
        return "ID \t" + this.id + "\t" +"ten \t" +  this.name  +"\t"  + "Luong \t"+"" +this.salary;
    }
}
