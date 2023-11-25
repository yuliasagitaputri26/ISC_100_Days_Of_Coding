package Days48;

public class Main{

    public static void main(String[] args) {
        float a, b;
        a = 30;
        b = jumlah(a);
        
        System.out.println("a = " + a + ", b = " + b);
        
        a = 50;
        b = (a + 4) + a;
        System.out.println("a = " + a + ", b = " + b);
        
        a = 80;
        b = (a + 4) + a;
        System.out.println("a = " + a + ", b = " + b);
        
        a = 5;
        b = (a + 4) + a;
        System.out.println("a = " + a + ", b = " + b);
        
        
        }
    public static float jumlah(float input){
        float jumlah;
        float jumlah_A = (input) + input;
        
        return jumlah_A;
    }
}
           
           
