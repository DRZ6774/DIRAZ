package REPLİT;

public class R32_For_while_7 {
    /*
    Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
Input :

6

Output:

6 Mukemmel Sayidir.

======================

Input

7

Output:

7 Mukemmel Sayidir degildir.
     */
    public static void main(String[] args) {
        int sayi=6;
        int toplam=0;

        for (int i = 1; i <sayi; i++) {
            if (sayi%i==0){
                toplam+=i;

            }

        }
        if (toplam==sayi){
            System.out.println(sayi+" mükemmel sayıdır");
        }else{
            System.out.println("mükemmel sayı degildir");
        }
    }
}
