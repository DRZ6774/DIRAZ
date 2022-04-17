package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q19_StringManipulation13_Calisma {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("dort harfli kelime giriniz");
        String kelime=scan.next();

        if(kelime.length()<=4){
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);

            System.out.println("tersden = " + dort + uc + iki + bir);


        }else System.out.println("yanlis girdi\nlutfen dort harfli bir kelime giriniz");













    }
}
