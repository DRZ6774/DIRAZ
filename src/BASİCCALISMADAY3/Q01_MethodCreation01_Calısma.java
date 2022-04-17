package BASİCCALISMADAY3;

import java.util.Scanner;

public class Q01_MethodCreation01_Calısma {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Yapacagınız dört işlemi * + - / olarak seciniz");
        char islem=scan.next().charAt(0);

        System.out.println("Birinci sayi :");
        double sayi1=scan.nextDouble();
        System.out.println("İkinci sayı :");
        double sayi2=scan.nextDouble();

        hesapMakinesi(islem,sayi1,sayi2);



    }

    private static void hesapMakinesi(char islem, double sayi1, double sayi2) {
        boolean b = islem == '*';
        if (islem=='+' || islem=='-' || islem=='/' || islem=='*'){
            switch(islem) {
                case '+':
                    System.out.println(sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println(sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println(sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
                    break;
                case '/':
                    System.out.println(sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));
                    break;
                //default:
                //System.out.println("Hatalı işlem girişi yaptınız");
            }

        }else
            System.out.println("Hatalı giris");
    }
}
