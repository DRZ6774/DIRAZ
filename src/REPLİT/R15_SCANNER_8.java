package REPLİT;

import java.util.Scanner;

public class R15_SCANNER_8 {
    /*
    Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üc basamaklı pozitif bir tam sayı giriniz");
        int sayi=scan.nextInt();
        int rakamlarToplami=0;
        int rakam=0;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;


        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        System.out.println("Verilen tamsayinin rakamlari toplami : " +rakamlarToplami);
    }
}

