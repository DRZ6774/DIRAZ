package BASİCCALISMADAY3;

import java.util.Scanner;

public class Q12_MetCreationForLoop_Calısma {
    /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString
		  Bir dizeyi tersine çevirmek için bir Java programı yazın. For döngüsü kullanın ve reverseString adlı bir yöntem oluşturun
		   */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime=scan.nextLine();

        System.out.println(kelimeTersCevirme(kelime));


    }

    public static String  kelimeTersCevirme(String kelime) {
        String kelimeTersCevirme="";
        for (int i = kelime.length()-1; i >=0; i--) {

            kelimeTersCevirme+=kelime.charAt(i);

        }



        return kelimeTersCevirme;
    }

}
