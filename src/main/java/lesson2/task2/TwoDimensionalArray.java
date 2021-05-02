package lesson2.task2;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[8][8];

        //заполнение массива
        for (int a=0; a < 8; a++) {
            for (int b=0; b < 8; b++) {
                array[a][b]= (a+b) % 2;
            }
        }
        //вывод через for
        for (int a=0; a < 8; a++) {
            for (int b=0; b < 8; b++) {
                System.out.print(array[a][b]);
            }
            System.out.println();
        }

        System.out.println();

        //вывод через for each
        for (int row[] : array) {
            for (int number : row) {
                System.out.print(number);
            }
            System.out.println();
        }

        System.out.println();

        //вывод через while
        int a=0;
        while (a<8){
            int b=0;
            while (b<8){
                System.out.print(array[a][b]);
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
