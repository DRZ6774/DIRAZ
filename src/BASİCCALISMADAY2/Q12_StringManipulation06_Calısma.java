package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q12_StringManipulation06_Calısma {
    /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
               Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

              ORNEK:          INPUT     OUTPUT
                              goat        gat
                             photo        hoto
                             ghost        ghost
                             kalem        lem


             */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime giriniz :");
        String str1 = scan.next().toLowerCase();

        if (str1.startsWith("gh")) {
            System.out.println(str1);
        } else if (str1.startsWith("g")) {
            System.out.println(str1.charAt(0) + str1.substring(2));
        } else if (str1.charAt(1) == 'h') {
            System.out.println(str1.substring(1));


        } else if (str1.charAt(1) == 'h') {
            System.out.println(str1.substring(1));


        }else {
            System.out.println(str1.substring(2));


        }
    }
}
