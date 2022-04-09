package REPLİT;

import java.util.Scanner;

public class R17_SCANNER_10 {
    /*
    Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dakıka giriniz");
        int dakika=scan.nextInt();

        System.out.println(dakika/60/24 +" gün eder ");
    }
}
