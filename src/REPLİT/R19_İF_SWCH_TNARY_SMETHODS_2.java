package REPLİT;

import java.util.Scanner;

public class R19_İF_SWCH_TNARY_SMETHODS_2 {
    /*
Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN : **** **** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.
     */
    public static void main(String[] args) {

        String isim = "yasemin yalcin";
        String soyisim= "sari";
        String kKNo="1234567890128795";


        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");


        String yeniKKNo= "**** **** **** " + kKNo.substring(12);

        System.out.println("isim-soyisim : "+yeniIsim+" "+yeniSoyisim+
                "\nkart no : " + yeniKKNo);

    }
}
