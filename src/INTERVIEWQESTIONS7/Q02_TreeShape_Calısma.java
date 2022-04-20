package INTERVIEWQESTIONS7;

import java.util.Scanner;

public class Q02_TreeShape_Calısma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Agacın tac uzunlugunu giriniz:");
        int tacUzunluk=scan.nextInt();
        String yaz=" ";
        for (int i = 0; i <tacUzunluk ; i++) {
            yaz+="^";
            System.out.println(yaz);
            
        }
        for (int i = 0; i <5 ; i++) {

            System.out.println("  |||");

        }
    }
}
