package REPLİT;

import java.util.Scanner;

public class R8_SCANNER_1 {
    /*
    Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int sayininKüpü=scan.nextInt();
        System.out.println("Kullanıcıdan bir sayı alınız : "+(sayininKüpü*sayininKüpü*sayininKüpü)/2);
    }
}
