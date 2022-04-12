package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q10_StringManipulation04_Calısma {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime giriniz :");
        String str1 =scan.next();

        if (str1.length()>=3){
            System.out.println(str1.substring(str1.length()-3 )+str1.substring(str1.length()-3 )+str1.substring(str1.length()-3));
        }else {
            System.out.println(str1);
        }

    }
}
