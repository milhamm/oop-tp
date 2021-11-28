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
        B.add(new Side<>(LocalDate.now(), 99.99));
        B.add(new Side<>(LocalDate.now().minusDays(1), 66.66));

        System.out.println("Array List B");
        for (Side<LocalDate, Double> b: B) {
            b.info();
        }
    }
}
