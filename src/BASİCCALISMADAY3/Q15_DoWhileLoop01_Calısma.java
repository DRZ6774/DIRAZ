package BASİCCALISMADAY3;

import java.util.Scanner;

public class Q15_DoWhileLoop01_Calısma {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String harf="";

        do {
            System.out.println("harf giriniz");
            harf=scan.next();
            System.out.println("program calısıyor");
        }
        while (!harf.equalsIgnoreCase("x"));

        System.out.println("program bitti");

        scan.close();
    }
}
