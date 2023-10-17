package pertemuan9;
public class Main {
    public static void main (String[] args) {
          boolean y = true;
          boolean s = false;
          boolean p;
        
        // Dan /(And)
        p = y && s;
        System.out.println("true && true = " + y);
        System.out.println("false && true = " + p);
        System.out.println("true && false = " + p);
        System.out.println("false && false= " + s);
        
        // atau /(OR)
        p = y || s;
        System.out.println("true || false = " + p);
        System.out.println("false || true = " + p);
        System.out.println("true || true = " + y);
        System.out.println("false || false = " + s);
        
        // negasi (bukan)
        System.out.println("negasi, !true = " + !y);
        System.out.println("negasi, !false = " + !s);
         
        //
        }
            
        }
        
