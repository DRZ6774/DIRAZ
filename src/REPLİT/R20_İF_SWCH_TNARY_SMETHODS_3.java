package REPLİT;

public class R20_İF_SWCH_TNARY_SMETHODS_3 {
    /*
Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT :

25

46

OUTPUT :

Numaralarin Toplami:

71
     */

    public static void main(String[] args) {

        ikisayıtoplami();


    }

    private static void ikisayıtoplami() {

        int sayi1 = -25;
        int sayi2 = -46;
        int toplam=sayi1+sayi2;
        if ((sayi1 + sayi2) >= 0) {
            System.out.println(toplam);

        }else {
            System.out.println("OwerFlow");
        }
        }
}