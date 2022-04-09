package REPLİT;

public class R29_For_while_4 {
    /*
Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
     */

    public static void main(String[] args) {
        int input = 6;
        int faktoryel=1;
        String faktoryelAcikYazim="";

        for (int i = input; i >=1 ; i--) {

            faktoryel *=i;

            if (i==input){
                faktoryelAcikYazim =faktoryelAcikYazim + i ;
            } else
                faktoryelAcikYazim =faktoryelAcikYazim +  "*" + i ;

        }
        System.out.println(input+"! = " + faktoryelAcikYazim + " =" + faktoryel);

    }

}
