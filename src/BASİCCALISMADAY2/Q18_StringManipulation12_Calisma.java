package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q18_StringManipulation12_Calisma {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {


        boolean bosMu=false;

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String str1=scan.nextLine();

        System.out.println(str1.contains(" "));
        System.out.println(str1.equals(bosMu));


    }
}
