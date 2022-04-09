package REPLİT;

public class R35_For_while_10 {
    /*
1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

OutPut:

Sayilarin Toplami : 5050
     */

    public static void main(String[] args) {
        int bslngc=0;
        int bitis=100;
        int toplam=0;

        for (int i = 0; i <=bitis; i++) {

            toplam+=i;
        }
        System.out.println("Sayilarin Toplami : "+toplam);

    }
}
