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
        String sonuc="";

        for (int i = 1; i <str.length(); i++) {
            for (int j = i+1; j <str.length(); j++){

                if (str.substring(i-1,i).equals(str.substring(j-1,j))){
                    if (!sonuc.contains(str.substring(i-1,i))){
                        sonuc+=str.substring(i-1,i);
                    }

                }
            }

        }
        System.out.println(sonuc);

    }
}
