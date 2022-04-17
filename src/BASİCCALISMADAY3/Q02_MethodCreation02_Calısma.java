package BASİCCALISMADAY3;

public class Q02_MethodCreation02_Calısma {
    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        String input="aabbcccccddddaaa";

        birKereYazdır(input);
    }

    private static void birKereYazdır(String input) {

        String sonuc="";

        for (int i=0 ; i<input.length() ; i++){
            if (!sonuc.contains(input.substring(i,i+1))){
                sonuc+=input.substring(i,i+1);
            }

        }

        System.out.println(sonuc);
    }
}
