package dev.aang.TP.TP09;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Side<String, Integer>> A = new ArrayList<>();
        A.add(new Side<>("Gluekol", 7200));
        A.add(new Side<>("Cyanoacrylate", 1200));

        System.out.println("Array List A");
        for (Side<String, Integer> a: A) {
            a.info();
        }

        ArrayList<Side<LocalDate, Double>> B = new ArrayList<>();
        B.add(new Side<>(LocalDate.parse("2021-11-28"), 99.99));
        B.add(new Side<>(LocalDate.parse("2021-11-27"), 66.66));

        System.out.println("Array List B");
        for (Side<LocalDate, Double> b: B) {
            b.info();
        }
    }
}
