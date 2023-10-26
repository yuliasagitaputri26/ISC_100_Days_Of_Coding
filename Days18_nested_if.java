package Days18_nestedIf;

public class Main {
    
    public static void main (String[] args) {
        
        int p = 45;
        int f = 20;
        
        System.out.println("tentukan angka genap");
        
        if (p%2==0){
            if (f%2!=0){
                System.out.println(" dimana p merupakan angka ganjil dan f adalah angka genap ");
            }else {
                System.out.println(" p adalah angka genap dan f bukan angka genap");
            }
        }else {
            System.out.println("p termasuk angka genap dan f tidak termasuk angka genap ");
            
        }
    }
}
