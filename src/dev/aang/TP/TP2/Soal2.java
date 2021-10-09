package dev.aang.TP.TP1;

public class Soal2 {
    
    public static void main(String[] args) {
        int[][] numbers = new int[4][6];
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = numbers.length - (i + 1); j < numbers[i].length; j++) {
                switch(i) {
                    case 0:
                        numbers[i][j] = (j - 2) * 3;
                        break;
                    case 1:
                        numbers[i][j] = ((j - 1) * 2) - 1;
                        break;
                    case 2:
                        numbers[i][j] = factorial(j);
                        break;
                    default:
                        numbers[i][j] = j + 1;
                }
            }
        }
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 4 - (i + 1); j < numbers[i].length; j++) {
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }
    }
    
    private static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }
}
