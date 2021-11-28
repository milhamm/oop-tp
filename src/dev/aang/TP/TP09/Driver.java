package dev.aang.TP.TP09;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Side<String, Integer>> ar1 = new ArrayList<>();
        ar1.add(new Side<>("Value", 60));
        ar1.add(new Side<>("Year", 2021));

        System.out.println("Array List 1");
        for (Side<String, Integer> a: ar1) {
            a.info();
        }

        ArrayList<Side<LocalDate, Double>> ar2 = new ArrayList<>();
        ar2.add(new Side<>(LocalDate.now(), 9.6));
        ar2.add(new Side<>(LocalDate.now().minusDays(1), 7.8));

        System.out.println("Array List 2");
        for (Side<LocalDate, Double> a: ar2) {
            a.info();
        }
    }
}
