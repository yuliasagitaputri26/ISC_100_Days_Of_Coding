package Days24;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
       Scanner yu = new Scanner (System.in);
        
        System.out.println("jumlah saudara");
        int x = 0;
        boolean yulia = true;
        
        do {
            x++;
            System.out.println(" saudara ke- " + x);
            if (x == 4){
                yulia = false;
            }
        }	while (yulia);
        System.out.println("saya anak bungsu");
    }
    }
