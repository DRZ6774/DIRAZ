package BASİCCALISMADAY1;

import java.util.Scanner;

public class Q11_IfStatement02_Calısma {
    public static void main(String[] args) {
         /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0 ile 100 arası not giriniz");
        int not=scan.nextInt();

        if (not >= 90 && not <= 100){
            System.out.println("A");
        }
         else if (not >= 80 && not <= 89){
            System.out.println("B");
        }
        else if (not >= 70 && not <= 79){
            System.out.println("C");
        }else if (not >= 60 && not <= 69){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
