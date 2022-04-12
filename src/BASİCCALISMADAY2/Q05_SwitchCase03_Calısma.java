package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q05_SwitchCase03_Calısma {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();

        int onlarBasamagı = (sayi / 10) % 10, birlerBasamagı = (sayi % 10), yüzlerBasamagı = sayi / 100;


        switch (onlarBasamagı) {
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;


        }
        scan.close();
    }
}
