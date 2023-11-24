package Days47;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int[][] array2D = new int[3][3];

        Scanner yu = new Scanner(System.in);
        System.out.println("Masukkan elemen array 2D ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1) + " , kolom " + (j + 1) + " : ");
                array2D[i][j] = yu.nextInt();

            }
        }
        System.out.print("================================\n");
        System.out.println("Array 2D yang diisi : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        
        
        }
}
           
           
           
