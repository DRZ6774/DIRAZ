package BASİCCALISMADAY1;

import java.util.Scanner;

public class Q12_IfStatement03_Calısma {
    public static void main(String[] args) {
        /*
        Yazdır "Lutfen is unvaninizi girin
        İs ünvanı isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru İs ünvanı yazdirmak icin asagidaki test datalarini kullanin. Example :

        Eger İs ünvanı  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("İş unvanınızı giriniz");
        String isUnvani= scan.nextLine();

        if (isUnvani.equals("qa")){
            System.out.println("Quality Analyst");
        }else if (isUnvani.equals("dev")){
            System.out.println("Developer");
        }else if (isUnvani.equals("ba")){
            System.out.println("Business Analyst");
        }else if (isUnvani.equals("pm")){
            System.out.println("Project Manager");
        }else System.out.println("Yanlış ünvan girdiniz");



    }
}