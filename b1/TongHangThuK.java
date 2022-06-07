/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tonghangthuk;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TongHangThuK{
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int A[][] =new int[3][3];
        System.out.println("Nhap ma tran 2 chieu 3*3:");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                 System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = input.nextInt();            
            }
        }
        // In ra ma trận A
        System.out.println("Ma tran A:  ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.print("\n");
        }
        
        //Tính tổng các hàng của ma trận
        int dem;
        for(int i=0;i<3;i++){
            int Row=0;
            for (int j=0;j<3;j++){
                Row+=A[i][j];
            }
            System.out.printf("Tong cua hang %d: %d\n",i+1,Row);
        }
        //Tính tổng các cột của ma trận
        for(int j=0;j<3;j++){
            int Col=0;
            for (int i=0;i<3;i++){
                Col+=A[i][j];
            }
            System.out.println("Tong cac cot 1 +"+ j  +" la1"
                    + ": "+Col);
        }
    }
        // TODO code application logic here
    }
