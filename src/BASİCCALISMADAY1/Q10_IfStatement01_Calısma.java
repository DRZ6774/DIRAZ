package BASİCCALISMADAY1;

import java.util.Scanner;

public class Q10_IfStatement01_Calısma {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Y yada N giriniz");
        char deger = scan.next().charAt(0);

        if (deger=='Y' || deger=='y'){
            System.out.println("Yes");
        }else if (deger=='N' || deger=='n'){
            System.out.println("No");

        }else
            System.out.println("Yanlış karakter girdiniz");

    }
}
