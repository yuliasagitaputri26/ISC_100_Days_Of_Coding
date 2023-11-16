package Days39;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
       Scanner yu = new Scanner(System.in);
        
        int a = yu.nextInt();
        int [] angka = new int[a];
        
        System.out.print(" [ ");
        if( a%2 == 0){
        for(int x = 0; x < a; x++){
            angka[x] = (x + 1)*2;
            System.out.print(angka[x]);
            
            if(x < (a - 1)){
                System.out.print(",");
            }
            }
            
            }else{
                for(int x = 0; x < a; x++){
                    angka[x] = (x * 2)+ 1;
                    System.out.print(angka[x]);
                    
                    if(x < (a - 1)){
                        System.out.print(" , ");
                    }
                }
        }
        System.out.print(" ] ");
  }}
      
        
        
        
        
