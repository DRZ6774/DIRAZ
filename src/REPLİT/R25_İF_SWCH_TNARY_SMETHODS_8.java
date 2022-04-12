package REPLİT;

import java.util.Scanner;

public class R25_İF_SWCH_TNARY_SMETHODS_8 {
    /*
Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim=scan.nextLine();

        if(isim.length()>=3){
            System.out.print(isim.substring(isim.length()-2) + isim.substring(isim.length()-2) + isim.substring(isim.length()-2) );
        }else
            System.out.println(isim);


    }
}
