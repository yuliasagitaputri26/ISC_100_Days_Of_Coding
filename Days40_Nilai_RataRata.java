package Days40;

public class Main {
    public static void main (String[] args) {
        
        int sum = 0;
        int s = 100;
        int hasil = 0;
        
        for(int x = 1; x <= 100; x++){
            if(x % 2 != 0){
                System.out.println(x);
                hasil += x;
                sum++;
                
            }else if(x < (s - 1)){
                System.out.println(" ");
            }else{
                System.out.println("hasil dari semua angka ganjil adalah : " + hasil);
                
            }
            sum = hasil;
        }
        int avg = sum/sum;
        System.out.println("avg = " + (sum /50));
        
  }}
      
        
