package BASİCCALISMADAY2;

public class Q13_StringManipulation07_Calısma {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {

        String kelime = "abcdxyzm";
        boolean xyzvarmı = false;

        if (kelime.contains("xyz")) {
            xyzvarmı = true;
            System.out.println(xyzvarmı);
        } else {
            xyzvarmı = false;
            System.out.println(xyzvarmı);
        }
    }
}