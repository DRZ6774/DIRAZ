package REPLİT;

public class R28_For_while_3 {
    /*
Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
     */

    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        char harf1 = 'a';
        char harf2 = 's';

        for (int i = 0; i < str.length(); i++) {
            if (harf1 == str.charAt(i)) {

            }
            System.out.println(harf1);
        }
    }
}
