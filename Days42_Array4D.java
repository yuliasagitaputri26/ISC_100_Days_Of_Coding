package Days42;
import java.util.Random;
public class Main {
    public static void main (String[] args) {
        
        int[][][][] array = new int[1][2][3][4];

        Random r = new Random();
        for (int a = 0; a < 1; a++) {
            for (int k = 0; k < 2; k++) {
                for (int s = 0; s < 3; s++) {
                    for (int x = 0; x < 4; x++) {
                        array[a][k][s][x] = r.nextInt(105);

                    }

                }

            }

        }
        for (int a = 0; a < 1; a++) {
            for (int k = 0; k < 2; k++) {
                for (int s = 0; s < 3; s++) {
                    for (int x = 0; x < 4; x++) {
                        System.out.print(array[a][k][s][x] + " ");
                    }
                    System.out.println();

                }
                System.out.println();

            }
            System.out.println();

        
  }}}

        
        
        
        
        
        
        
