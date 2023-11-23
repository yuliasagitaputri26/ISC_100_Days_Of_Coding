package Days46;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        String namaVariabel = " hai guys";
        char[] namaChar = {'h', 'a', 'i', ' ', 'g', 'u', 'y', 's'};

        System.out.println(namaVariabel);
        System.out.println(Arrays.toString(namaChar));

        System.out.println("isi dari String : " + namaVariabel.charAt(3));
        System.out.println("isi dari char[] : " + namaChar[2]);
        
        namaChar[0] = 'a';
        System.out.println(Arrays.toString(namaChar));
        }
    
}
           
           
