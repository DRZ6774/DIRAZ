package BASİCCALISMADAY2;

public class Q02_NestedTernary_Calısma {
    public static void main(String[] args) {
 /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        char notum='B';

        String sonuc="";

        sonuc=  (notum=='A') ? "Gayet Basarili":
                (notum=='B') ? "Basarili":
                        (notum=='C') ? "Ha gayret" : "Digerler";
        System.out.println(sonuc);

    }
}
