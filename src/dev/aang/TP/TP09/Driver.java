package dev.aang.TP.TP09;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Side<String, Integer>> arr1 = new ArrayList<>();
        arr1.add(new Side<>("Gluekol", 7200));
        arr1.add(new Side<>("Cyanoacrylate", 1200));

        System.out.println("Array List 1");
        for (Side<String, Integer> a: arr1) {
            a.info();
        }

        ArrayList<Side<LocalDate, Double>> arr2 = new ArrayList<>();
        arr2.add(new Side<>(LocalDate.now(), 99.99));
        arr2.add(new Side<>(LocalDate.now().minusDays(1), 66.66));

        System.out.println("Array List 2");
        for (Side<LocalDate, Double> a: arr2) {
            a.info();
        }
    }
}
