package REPLİT;

import java.util.Scanner;

public class R10_SCANNER_3 {
    /*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kısa kenar uzunlugu giriniz");
        int kisaKenarUzunlugu=scan.nextInt();
        System.out.println("Lütfen uzun kenar uzunlugu giriniz");
        int uzunKenarUzunlugu=scan.nextInt();

        System.out.println("Alan: "+(kisaKenarUzunlugu*uzunKenarUzunlugu));
        System.out.println("Cevre: "+(kisaKenarUzunlugu+uzunKenarUzunlugu)*2);
    }
}