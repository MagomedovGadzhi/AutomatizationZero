package lesson2.task6;

import java.util.Random;

public class RandomMassiveInvert {
    public static void main(String[] args) {
        int m = new Random().nextInt(3) + 3;
        int n = new Random().nextInt(3) + 3;
        int[][] firstMatrix = new int[m][n];

        //заполняем матрицу
        for (int line = 0; line < m; line++) {
            for (int column = 0; column < n; column++) {
                firstMatrix[line][column] = new Random().nextInt(2);
            }
        }
        //заполняем случайный элемент(исключая края) двойкой
        int randomLine = new Random().nextInt(m - 2) + 1;

        int randomColumn = new Random().nextInt(m - 2) + 1;
        firstMatrix[randomLine][randomColumn] = 2;

        int[][] secondMatrix = new int[m][n];
        boolean isTwo = false;
        for (int line = 0; line < m; line++) {
            for (int column = 0; column < n; column++) {
                if (firstMatrix[line][column] == 2) {
                    secondMatrix[line][column] = 2;
                    isTwo = true;
                } else secondMatrix[line][column] = isTwo
                        ? (firstMatrix[line][column] + 1) % 2
                        : firstMatrix[line][column];
            }
        }
        System.out.println("Исходная матрица");
        for (int[] row : firstMatrix) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("Инвертированная матрица");
        for (int[] row : secondMatrix) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}