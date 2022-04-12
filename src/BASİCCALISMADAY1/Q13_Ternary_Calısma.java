package BASİCCALISMADAY1;

import java.util.Scanner;

public class Q13_Ternary_Calısma {
    /*
 * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
 * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
 * olsun
 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int fiyat=scan.nextInt();

        String sonuc=(fiyat<10 ? "ucuz" : fiyat<20 ? "normal ": "pahalı");

        System.out.println(sonuc);





        if (fiyat<10){
            System.out.println("ucuz");
        } else if (fiyat>=10 && fiyat<20) {
            System.out.println("normal");
        } else  {
            System.out.println("pahalı");
        }
    }
}
