package lesson5.task1;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int m = new Random().nextInt(6) + 5;
        int n = new Random().nextInt(6) + 5;

        int[] dividends = new int[m];
        int[] dividers = new int[n];
        for (int i = 0; i < m; i++) {
            dividends[i] = new Random().nextInt(6) + 4;
        }
        for (int i = 0; i < n; i++) {
            dividers[i] = new Random().nextInt(4);
        }

        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    result[i][j] = dividends[i] / dividers[j];
                } catch (ArithmeticException exception) {
                    result[i][j] = -1;
                }
            }
        }

        System.out.println("Массив dividends(m):");
        for (int dividend : dividends) System.out.print(dividend + " ");
        System.out.println();
        System.out.println("Массив dividers(n):");
        for (int divider : dividers) System.out.print(divider + " ");
        System.out.println();
        System.out.println("Массив result:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}