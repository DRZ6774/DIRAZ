package BASİCCALISMADAY3;

public class Q04_MethodCreation04_Calisma {

    /*
     * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
     * toplamini dondursun.
     *
     * Ornek
     * input : ade1r4d3
     * output : 8
     *
     * Ipucu:
     *     Character.isDigit()
     *     Integer.valueOf()
     */
    /*
            Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2));


	        */
    public static void main(String[] args) {



        donusturMetodu();
    }

    private static void donusturMetodu() {
        String  para1 ="1900";
        String  para2 = "2500";
        System.out.println(Integer.valueOf(para1)+Integer.valueOf(para2));
        int num1= 100;
        int num2 = 200;
        System.out.println(String.valueOf(num1) + String.valueOf(num2));
    }

}
