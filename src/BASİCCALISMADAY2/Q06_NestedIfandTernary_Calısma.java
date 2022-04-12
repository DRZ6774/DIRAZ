package BASİCCALISMADAY2;

public class Q06_NestedIfandTernary_Calısma {
    /*
    0 ~ 9 arasındaki sayilari ingilizce sayılara cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {


       String sonuc="";
        int sayi=5;

        if (sayi>=0 && sayi<=9){

        }
        if(sayi==9){
            sonuc="nine";
        }else if(sayi==8){
            sonuc="eight";
        }else if(sayi==7){
            sonuc="seven";
        } else if(sayi==6){
            sonuc="six";
        } else if(sayi==5){
            sonuc="five";
        } else if(sayi==4){
            sonuc="four";
        } else if(sayi==3){
            sonuc="three";
        } else if(sayi==2){
            sonuc="two";
        } else if(sayi==1){
            sonuc="one";
        }else if(sayi==0){
            sonuc="zero";
        }else
            sonuc="Gecersiz";

        System.out.println("sonuc ="+sonuc);


        int sayi1=5;
        String sonuc2=sayi1==0?"zero":sayi1==1?"one":sayi1==2?"two":sayi1==3?"three":sayi1==4?"four":
                sayi1==5?"five":sayi1==6?"six":sayi1==7?"seven":sayi1==8?"eight":sayi1==9?"nine":"gecersiz";
        System.out.println("sonuc = " + sonuc2);
    }
}
