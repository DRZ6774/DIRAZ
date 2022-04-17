package BASİCCALISMADAY3;

import java.util.Scanner;

public class Q13_WhileLoop01_Calısma {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println(basamakToplamaWhile(sayi));  //1. yol
        basamakToplamaDoWhile(sayi);  //2. yol
    }

    public static int basamakToplamaWhile(int sayi) {
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }


        return toplam;
    }

    public static void basamakToplamaDoWhile(int sayi) {
        int toplam = 0;
        do {
            toplam += sayi % 10;
            sayi=sayi/10;


        }
        while (sayi>0);
        System.out.println(toplam);
    }
}