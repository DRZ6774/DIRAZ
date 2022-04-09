package REPLİT;

import java.util.Scanner;

public class R9_SCANNER_2 {
    /*
    Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :

Alan: 9

Cevre: 12
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kenar uzunlugu giriniz4");
        int kenarUzunlugu=scan.nextInt();
        System.out.println("Alan: "+(kenarUzunlugu*kenarUzunlugu));
        System.out.println("Cevre: "+(kenarUzunlugu*4));
    }
}
