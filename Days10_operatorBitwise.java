package pertemuan10;
public class Main {
    public static void main (String[] args) {
        
        String binary[]={
            
          "0000","0001","0010","0011","0100","0101",

          "0110","0111","1000","1001","1010",

          "1011","1100","1101","1110","1111"
            
          };
        
         

      int y = 3; // 0+2+1 or 0011 in binary

      int b = 6; // 4+2+0 or 0110 in binary

      // bitwise or

      int c= y | b;

      // bitwise and

      int d= y & b;
        
      // bitwise xor

      int e= y ^ b;

      // bitwise not

      int f= (~y & b)|(y &~b);

      int g= ~y & 0x0f;
        
        System.out.println(" y = " + binary[y]);

        System.out.println(" b = " + binary[b]);

        System.out.println(" y|b = " + binary[c]);

        System.out.println(" y&b = " + binary[d]);

        System.out.println(" y^b= " + binary[e]);

        System.out.println("~y & b|y&~b= "+binary[f]);

        System.out.println("~y= " + binary[g]);

    }

        }

        
        
           
        
  
        
