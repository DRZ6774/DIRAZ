package INTERVIEWQESTIONS7;

import java.util.Scanner;

public class Q01_UseContinue_Calısma {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        Scanner scan = new Scanner(System.in);
        System.out.print("bir strin giriniz :");
        String ifade= scan.nextLine();

        for (int i = 0; i <ifade.length(); i++) {
           if (ifade.charAt(i)=='a' ||ifade.charAt(i)==' ')
             continue;
               System.out.println(ifade.charAt(i));


        }

    }
}
