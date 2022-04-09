package REPLİT;

import java.util.Scanner;

public class R11_SCANNER_4 {
    /*
    Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ne kadar çay ? ");
        double caymiktari = scan.nextDouble();
        System.out.println("Ne kadar şeker ? ");
        double sekermiktari = scan.nextDouble();

        double sonuc = ((caymiktari * sekermiktari * 1.7)*365)/1000;

        System.out.println("Yılda " + sonuc + " kg şeker kullanıyor...");
    }
}
