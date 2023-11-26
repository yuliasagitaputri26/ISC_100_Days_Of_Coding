package Days49;
import java.util.*;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        
        System.out.print("tinggi = ");
        int inputTinggi = yu.nextInt();
        System.out.print("alas = ");
        int inputAlas = yu.nextInt();
        
        gambar(inputTinggi,inputAlas);
        
        System.out.println("luas = " + luas(inputTinggi,inputAlas));
        System.out.println("keliling = " + keliling(inputTinggi, inputAlas));
        
        
    }
    private static double luas(int tinggi, int alas){
        double hasil = (0.5*alas * tinggi) ;
        return hasil;
    }
    private static int keliling(int tinggi, int alas){
        int hasil = (alas + tinggi) * 2;
        return hasil;
    }
    private static void gambar(int tinggi, int alas){
        for(int i = 1; i <= alas; i++){
            for(int a = 0; a < i; a++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
