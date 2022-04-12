package BASİCCALISMADAY1;

import java.util.Scanner;

public class Q09_Scanner02_Calısma {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Adınızı giriniz");
        String isim = scan.nextLine();

        System.out.println("Memleketinizi giriniz");
        String memleket = scan.nextLine();

        System.out.println("Konumunuzu giriniz");
        String konum = scan.nextLine();

        System.out.println("Boyunuzu giriniz");
        int boy = scan.nextInt();

        System.out.println("Kilonuzu giriniz");
        int kilo = scan.nextInt();

        System.out.println("yasadıgınız yeri seviyor musunuz");
        boolean seviyormu=scan.nextBoolean();

        if (seviyormu==true){

            System.out.println("Seviyoruz"+seviyormu);

        }else
            System.out.println("Sevmiyoruz"+seviyormu);


    }
}