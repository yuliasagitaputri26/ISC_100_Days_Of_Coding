package Days53;
import java.util.Scanner;
import java.util.Arrays;
public class Main{

    public static void main(String[] args){
        
        Scanner yu = new Scanner(System.in);
        int a = yu.nextInt();
        double[] tinggi = new double[a];
            for(int i = 0; i < a; i++){
                tinggi[i] = yu.nextInt();
                
            }
        System.out.println(Arrays.toString(tinggi));
    }
}
        
       
