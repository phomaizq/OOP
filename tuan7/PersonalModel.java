/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author hp
 */
import java.util.ArrayList;

public class PersonalModel<T> {
    private ArrayList<T> list;

    public PersonalModel() {
        list = new ArrayList<T>();
    }

    public PersonalModel(ArrayList<T> list) {
        this.list = list;
    }

    public void add(T t) {
        list.add(t);
    }

    public void display() {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
