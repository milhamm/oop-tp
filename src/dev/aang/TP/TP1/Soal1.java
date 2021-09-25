package dev.aang.TP.TP1;

public class Soal1 {

    public static void main(String[] args) {
        for(int i_1301194276 = 2; i_1301194276 < 11; i_1301194276++) {
            System.out.printf("%d ", fibonnaci_1301194276(i_1301194276));
        }
    }
    
    private static int fibonnaci_1301194276(int x_1301194276) {
        if (x_1301194276 < 2) return x_1301194276;
        return fibonnaci_1301194276(x_1301194276 - 2) + fibonnaci_1301194276(x_1301194276 - 1);
    }
}
