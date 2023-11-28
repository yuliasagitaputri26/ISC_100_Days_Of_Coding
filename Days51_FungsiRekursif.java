package Days51;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        int a = yu.nextInt();

        System.out.println("Saya memasukkan nilai = " + a);

        printNilai(a);

        int hasil = jumlahNilai(a);
        System.out.println("hasil = " + hasil);

        int faktorial = hitungFaktorial(a);
        System.out.println("Hasil faktorial = " + faktorial);
    }

    private static int hitungFaktorial(int parameter) {
        System.out.println("Parameter = " + parameter);

        if (parameter == 1) {
            return 1;
        }

        return parameter * hitungFaktorial(parameter - 1);
    }

    private static void printNilai(int parameter) {
        System.out.println("Nilai yang di-print = " + parameter);
    }

    private static int jumlahNilai(int parameter) {
        System.out.println("Parameter = " + parameter);

        if (parameter == 1) {
            return 1;
        }

        return parameter + jumlahNilai(parameter - 1);
    }
}
