package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q04_SwitchCase02_Calısma {
    /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A,B,C harflerinden birini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);

        switch(harf){
            case 'A':
                System.out.println("Java kolaydır");
                break;
            case 'B':
                System.out.println("Java eglencelidir");
                break;
            case 'C':
                System.out.println("Ders calısman lazım");
                break;
            default:
                System.out.println("Gecerli bir karakter giriniz");

        }
    }
}
