package REPLİT;

import java.util.Scanner;

public class R13_SCANNER_6 {
    /*
    Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen float bir sayı giriniz");
        float sayi1=scan.nextFloat();
        short sayi2= (short) sayi1;

        System.out.println(sayi2);
    }
}
