/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binhphuonglapphuong;

/**
 *
 * @author hp
 */
public class Binhphuonglapphuong {

    public static void main (String[] args) {
        System.out.println("Binh phuong tu 1 den 10");
        for(int i = 1; i<=10; i++) {
            System.out.println(i +"^" + 2 + "=" +(i*i));
        }
        System.out.println("Lap phuong tu 1 den 10");
        for(int j= 1;j<=10; j++) {
            System.out.println(j + "^" + 3 + "=" +(j*j*j));
        }
    }
}

