package BASİCCALISMADAY1;

import java.util.Scanner;

public class Q08_Scanner01_Calısma {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz ");
        int sayi1=scan.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        int sayi2=scan.nextInt();

        System.out.println(sayi1+sayi2);
    }
}
