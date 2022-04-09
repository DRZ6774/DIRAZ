package REPLİT;

public class R34_For_while_9 {
    /*
Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

Input :1238

Output :Girilen Numananin Tersi: 8321
     */

    public static void main(String[] args) {
        int sayi = 2345;
        int tersi=0;

        for(;sayi != 0; sayi /= 10) {
            int basamak = sayi % 10;
            tersi = tersi * 10 + basamak;
        }

        System.out.println("Girilen Numananin Tersi: "+tersi);

    }
}
