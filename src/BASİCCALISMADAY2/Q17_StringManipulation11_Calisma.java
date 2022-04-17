package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q17_StringManipulation11_Calisma {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyİsim= scan.nextLine();

        if(isim.length()>soyİsim.length()){
            System.out.println("isim soyisimden uzundur");
        }else if(soyİsim.length()>isim.length()){
            System.out.println("soyisim isimden uzundur");

        }else System.out.println("isim ve soyisminiz esit uzunluktadir");













    }



}
