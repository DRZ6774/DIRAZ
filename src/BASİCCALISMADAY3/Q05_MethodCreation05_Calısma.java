package BASİCCALISMADAY3;

import java.util.Scanner;

public class Q05_MethodCreation05_Calısma {
    /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("47 den küçük pozitif bir sayı giriniz");
        int sayi=scan.nextInt();

        fibonacci(sayi);
    }
    public static void fibonacci(int num){
        int sayi1=0;
        int sayi2=1;
        int sayi3;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        if (num<47){

            for (int i = 2; i <num; i++) {

                sayi3=sayi1+sayi2;
                System.out.println("sayi3 = " + sayi3);
                sayi1=sayi2;
                sayi2=sayi3;


            }
        }else
            System.out.println("47 den küçük bir sayı giriniz");

    }
}
