package Days43;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner yu = new Scanner(System.in);
        
        int a =yu.nextInt();
        int angka[] = new int[a];
        int penjumlahan = 0;
        int hasil = 0;
        
        for(int i = 0; i < angka.length; i++){
             penjumlahan++;
            System.out.print(angka[i] + penjumlahan );
            
            hasil+=penjumlahan;
            if(i < (a -1)){
                System.out.print(" + ");
                
                
            }else{
                System.out.print(" = " + hasil);
                
            }
        }
        System.out.println();
        
  }}

        
        
        
        
        
        
        
    
