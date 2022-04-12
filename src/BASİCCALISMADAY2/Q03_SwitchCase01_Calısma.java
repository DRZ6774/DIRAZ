package BASİCCALISMADAY2;

import java.util.Scanner;

public class Q03_SwitchCase01_Calısma {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String günler=scan.next();

        switch (günler){
            case "pazartesi" :
            case "salı" :
                System.out.println("JAva ders günleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum ders");
                break;

            case "carsamba":
            case "cumartesi":
                System.out.println("SQL ders");
                break;
            default:
                System.out.println("izin günü");
        }
    }
}
