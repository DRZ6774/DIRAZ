package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q11_StringManipulation05_Calisma {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1. kelimeyi girin :");
        String kelime1 = scan.nextLine();
        System.out.println("2. kelimeyi girin :");
        String kelime2 = scan.nextLine();
        System.out.println("3. kelimeyi girin : ");
        String kelime3 = scan.nextLine();
        System.out.println("4. kelimeyi girin :");
        String kelime4 = scan.nextLine();
        System.out.println(kelime1.concat(" " + kelime2).concat(" " +kelime3).concat(" "+kelime4));



    }
}