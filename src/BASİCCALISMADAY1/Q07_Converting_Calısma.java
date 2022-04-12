package BASİCCALISMADAY1;

import java.util.Scanner;

public class Q07_Converting_Calısma {
    public static void main(String[] args) {
        /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

        int gallon=1000;

        double litre=gallon*3.785;

        String sonuc1 = gallon +" gallon degeri " + litre + " litredir";

        System.out.println(sonuc1);

        int litre1=100;
        double gallon2=litre/3.785;

        String sonuc2=litre1 +" litre degeri "+ gallon2 +" gallona esittir";
        System.out.println(sonuc2);

        Scanner scan =new Scanner(System.in);
        System.out.println("fahrenayt degeri giriniz : ");

        int fahrenayt=scan.nextInt();
        System.out.println((fahrenayt-32)*5/9);




    }
}
