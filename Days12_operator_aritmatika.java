import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner bajukemeja = new Scanner (System.in);
        
        System.out.print("total kemeja = ");
        int totalKemeja = bajukemeja.nextInt();
        System.out.print("total kotak = ");
        int totalkotak = bajukemeja.nextInt();
        
        int kotak = totalKemeja / totalkotak;
        System.out.println("total kotak yang terisi = " + totalkotak);
        kotak = totalKemeja % totalkotak;
        System.out.println("sisa kemeja = " + kotak);
        
        
    }

        }
