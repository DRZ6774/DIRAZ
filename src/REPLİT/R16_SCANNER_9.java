package REPLİT;

import java.util.Scanner;

public class R16_SCANNER_9 {
    /*
    Girilen zamanı saniyeye çeviren bir program yazınız.

Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir zaman dilimi giriniz");
        int saat=scan.nextInt();

        System.out.println(saat*60*60);

    }
}
