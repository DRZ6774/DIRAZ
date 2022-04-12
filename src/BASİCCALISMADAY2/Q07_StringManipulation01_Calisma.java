package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q07_StringManipulation01_Calisma {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi girin");
        String isim= scan.nextLine();
        System.out.println("soyisminizi girin");
        String soyİsim=scan.nextLine();

        System.out.println(isim.toUpperCase()+ " " +soyİsim.toUpperCase());
    }
}
