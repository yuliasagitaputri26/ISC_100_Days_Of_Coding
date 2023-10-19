import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int jawabanTepat = 8;
        int jawabanTebakan ;
        boolean statusTebakan ;
        
        System.out.print("masukkan jawaban yang tepat = ");
        jawabanTebakan = input.nextInt();
        System.out.println("jawaban yang tepat adalah = " + jawabanTebakan);
        
        statusTebakan = (jawabanTebakan == jawabanTepat);
        System.out.println("jawabanTepat anda:" + statusTebakan);
        
        System.out.println("masukkan jawaban diantara 6 dan 10: ");
        jawabanTebakan = input.nextInt();
        
        statusTebakan = (jawabanTebakan > 6) && (jawabanTebakan < 10);
        
        System.out.println("jawabanTepat anda: " + statusTebakan );
        
        
    }

        }
