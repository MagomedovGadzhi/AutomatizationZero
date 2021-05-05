package lesson2.task5;

import java.util.Random;

public class MatrixTransposition {
    public static void main(String[] args) {
        int m = new Random().nextInt(3) + 3;
        int n = new Random().nextInt(3) + 3;

        int [][] firstMatrix = new int[m][n];

        for (int x = 0; x < m; x++){
            for (int y = 0; y < n; y++){
                firstMatrix[x][y] = new Random().nextInt(9);
            }
        }

        int [][] resultMatrix = new int[n][m];
        for (int x = 0; x < n; x++){
            for (int y = 0; y < m; y++){
                resultMatrix[x][y] = firstMatrix[y][x];
            }
        }

        System.out.println("Исходная матрица");
        for (int[] row : firstMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Транспонированная матрица");
        for (int[] row : resultMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }
    }
}
