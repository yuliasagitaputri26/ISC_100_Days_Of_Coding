package Days36;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner yu = new Scanner(System.in);
        System.out.print("masukkan jumlah baris : ");
        int jumlahBaris = yu.nextInt();
        System.out.print("masukkan jumlah kolom : ");
        int jumlahKolom = yu.nextInt();
        
        int[][] array2D = new int[jumlahBaris][jumlahKolom];
        int hasil = 1;
        for(int i = 0; i < jumlahBaris; i++){
            for(int j= 0; j < jumlahKolom; j++){
                array2D[i][j]= hasil++;
            }
            
            }
        
        for (int i = 0; i < jumlahBaris; i++){
      for (int s = 0; s < jumlahKolom; s++){
        System.out.print(array2D[i][s] + (" "));
      }
      System.out.println();
    }
  }
        }
        
        
        
