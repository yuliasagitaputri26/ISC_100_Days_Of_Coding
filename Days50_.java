package Days50;
import java.util.Arrays;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        
        int b = yu.nextInt();
        int sum = 0;
        int [] a = new int [b];

        for (int i = 1; i < b; i++) {
            a[i] = i;
            sum +=i;
        }
        System.out.print(Arrays.toString(a));
         
        System.out.print(" = "+sum);
        System.out.println();
    }

        
        
    }
