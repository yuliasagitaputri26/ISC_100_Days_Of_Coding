package Days38;
import java.util.Arrays;
public class Main {
    public static void main (String[] args) {
        System.out.println("Array Multidimensi");
        
        int [][] array_26 = {
            {1,2,3,7,9},
            {4,5,6,8,10},
            
        };
        printArray26(array_26);
        
        int [][] arrayAngka = new int [6][4];
        
        printArray26(arrayAngka);
        
            
        }
        private static void printArray26(int[][] dataArray) {
            for(int i = 0; i < dataArray.length; i++) {
            
                System.out.println(Arrays.toString(dataArray[i]));
            }
        

  }
}      
        
