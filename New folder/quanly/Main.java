/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanly;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ListPerson{
    ArrayList<Person> personArrayList = new ArrayList<>();
    Person person;
    void nhapDanhSach(int x)
    {
        if(x==1)
            person=new HocVien();
        else if(x==2)

        person=new NVQuanLy();
        else
            person=new GiaoVien();
        person.inPut();
        personArrayList.add(person);
    }
    void xuatDanhSach(byte loai)
    {
        if(loai == 4)
        {
            for (int i = 0; i < personArrayList.size(); i++) {
                if(personArrayList.get(i) instanceof HocVien){
                    System.out.println("-----------------");
                    personArrayList.get(i).outPut();
                }
            }
        }
        else if(loai == 5)
        {
            for (int i = 0; i < personArrayList.size(); i++) {
                if(personArrayList.get(i) instanceof NVQuanLy){
                    System.out.println("-----------------");
                    personArrayList.get(i).outPut();
                }
            }
        }
        else
        {
            for (int i = 0; i < personArrayList.size(); i++) {
                if(personArrayList.get(i) instanceof GiaoVien){
                    System.out.println("-----------------");
                    personArrayList.get(i).outPut();
                }
            }
        }
    }
    void theoTen()
    {
        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }
}
public class Main {
    public static void main(String[] args) {
        Person person;
        ListPerson listPerson = new ListPerson();
        Scanner sc = new Scanner(System.in);
        byte choose = 0;
        do{
            showMenu();
            System.out.print("\t\tnhap su lua chon: ");
            choose=sc.nextByte();
            switch (choose){
                case 1: case 2: case 3:
                    listPerson.nhapDanhSach(choose);
                    break;
                case 4 : case 5: case 6:
                    listPerson.theoTen();
                    listPerson.xuatDanhSach(choose);
                    break;
                default:choose =0;
            }
        }while(choose != 0);
        System.out.println("GOOD BEY");
    }
    static void showMenu()
    {
        System.out.println("=================MEnU==================");
        System.out.println("1.Nhap hoc vien");
        System.out.println("2.Nhap mot nhan vien quan ly ");
        System.out.println("3.Nhap mot giao vien ");
        System.out.println("4.Xuat thong tin hoc vien ");
        System.out.println("5.Xuat thong tin quan ly ");
        System.out.println("6.Xuat thong tin giao vien ");
        System.out.println("#.Thoát ");
        System.out.println("=======================================");
    }
}
