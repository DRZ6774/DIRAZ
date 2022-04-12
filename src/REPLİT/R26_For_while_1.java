package REPLİT;

public class R26_For_while_1 {
    /*
Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2
     */

    public static void main(String[] args) {

            String metin = "John came late";
            char karakter = 'a';
            int tane = 0;

            for(int i = 0; i < metin.length(); i++) {
                if(karakter == metin.charAt(i)) {
                    ++tane;
                }
            }

            System.out.println( karakter + " yazı içinde  " + tane +" tanedir");
        }
    }

