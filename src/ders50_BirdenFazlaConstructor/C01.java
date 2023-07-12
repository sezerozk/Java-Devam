package ders50_BirdenFazlaConstructor;

public class C01 {

    public static void main(String[] args) {
        Araba nesne = new Araba();
        System.out.println(nesne.hiz);
        System.out.println(nesne.renk);
        Araba nesne2 = new Araba(300);//Parametreli constructor'i cagiriyoruz
        System.out.println(nesne2.renk);
        System.out.println(nesne2.hiz);
        /*
        Goruldugu uzere birden fazla constructor eklemek mumkun ancak bunlarin
        birbirinden ayrilabilmesi icin parametre eklemek gerek.
         */


    }
}
