package Days34;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        
        Scanner yu = new Scanner(System.in);
        
        System.out.print("Size array : ");
        int n = yu.nextInt();
        
        int angka []= new int[n];
        for(int a = 0; a < n; a++){
            angka[a] = yu.nextInt();
        }
        System.out.print("{");
        for(int a = 0; a < n; a++){
            System.out.print(angka[a]);
            if (a < (n - 1)){
                System.out.print(" , ");
            }else{
                System.out.println("}");
            }
        }
        
    }}
