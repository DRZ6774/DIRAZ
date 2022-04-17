package BASİCCALISMADAY3;

import java.util.Scanner;

public class Q03_MethodCreation03_Calisma {

    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("uzunluk giriniz");
        double uzunluk=scan.nextDouble();

        uzunlukDonusturme(uzunluk);
    }

    private static void uzunlukDonusturme(double uzunluk) {



            double metre=uzunluk/100;
            double km=uzunluk/100000;

        System.out.println("Your " + uzunluk + " sentimeter " + "is equal to " + metre + " Metre " + "and "
                + km + " kilometers");




        }


}

