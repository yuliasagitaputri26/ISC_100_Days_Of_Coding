package Days30;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
       Scanner yu = new Scanner (System.in);
        
        System.out.print("masukkan nilai n : ");
        int n = yu.nextInt();
        
        for( int y = 3; y <= n; y++){
            if(y % 3 == 0){
                System.out.println(y);
            }
        } 
        
      	}
        }
