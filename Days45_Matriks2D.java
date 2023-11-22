package matriks2D;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        int[][] matriks_m = {
            {2, 4, 6, 18},
            {3, 5, 7, 19},
            {6, 8, 4, 12},};

        int[][] matriks_l = {
            {1, 2, 3, 14},
            {2, 3, 4, 12},
            {4, 5, 3, 10},};
        printArray(matriks_m);
        printArray(matriks_l);

        int baris_m = matriks_m.length;
        int kolom_m = matriks_m[0].length;

        int[][] hasil = new int[baris_m][kolom_m];

        for (int a = 0; a < baris_m; a++) {
            for (int u = 0; u < kolom_m; u++) {
                hasil[a][u] = matriks_m[a][u] - matriks_l[a][u];

            }
        }
        printArray(hasil);

    }

    public static void printArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int a = 0; a < baris; a++) {
            System.out.print("[");
            for (int u = 0; u < kolom; u++) {
                System.out.print(dataArray[a][u]);

                if (u < (kolom - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

}
