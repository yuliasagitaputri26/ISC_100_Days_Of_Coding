package Days26;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
       Scanner yu = new Scanner (System.in);
       int awal, akhir;
        System.out.println("masukkan angka");
        System.out.print("awal : ");
        awal = yu.nextInt();
        System.out.print("akhir : ");
        akhir = yu.nextInt();
        
        for(int x = awal; x <= akhir; x++){
            System.out.println(x);
            
        }
        
            
        
    }    
            
}  
