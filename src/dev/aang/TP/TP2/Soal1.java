package dev.aang.TP.TP1;

public class Soal1 {

    public static void main(String[] args) {
        for(int i = 2; i < 11; i++) {
            System.out.printf("%d ", fibonnaci(i));
        }
    }
    
    private static int fibonnaci(int x) {
        if (x < 2) return x;
        return fibonnaci(x - 2) + fibonnaci(x - 1);
    }
}
