package REPLİT;

import java.util.Scanner;

public class R23_İF_SWCH_TNARY_SMETHODS_6 {
    /*
Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim giriniz");
        String isim = scan.nextLine();
        String ad = "ali";

        if (isim.contains(ad)) {

            System.out.println("isim ayni karakterlere sahiptir.");

        } else {
            System.out.println("Dizenin benzersiz karakterleri var");

        }
    }
}