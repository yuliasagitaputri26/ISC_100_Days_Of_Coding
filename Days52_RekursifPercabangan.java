package Days52;
import java.util.*;
import java.lang.String;
public class Main{

    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        int hasil = yu.nextInt();
        int hasil_yulia = yulia(hasil,"kanan");
        System.out.println("hasil peecobaan yulia yang ke - " + hasil + " adalah " + hasil_yulia);
        
    }
    private static int yulia(int a, String tangan){
        System.out.println("tangan " + tangan);
        
        System.out.println("yulia ke-" + a);
        if(a == 2 || a == 1){
            return 1;
        }
        return yulia(a - 1, "kiri") + yulia(a - 2, "kanan");
    }
}
