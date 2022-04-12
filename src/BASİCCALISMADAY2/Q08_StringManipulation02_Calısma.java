package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q08_StringManipulation02_Calısma {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("kelime 1 :");
        String str1 =scan.nextLine();
        System.out.print("kelime 2 :");
        String str2 =scan.nextLine();

        System.out.println("kelimerin 1.metotlabirlesimi :"+str1 +" "+str2);
        System.out.println("kelimerin 2.metotlabirlesimi :"+str1.concat(" "+str2));

        String str1ilkharfyok=str1.substring(0,4);
        String str2ilkharfyok=str2.substring(0,4);

        System.out.println("ilk harfsiz yazılısı :"+str1ilkharfyok+""+str2ilkharfyok);
    }
}
