package ders51_ParametreliConstructorKullanma;

public class C01 {
    public static void main(String[] args) {
        Araba nesne = new Araba();
        nesne.hiz = 200;
        nesne.renk = "beyaz";
        System.out.println(nesne.hiz);
        System.out.println(nesne.renk);

        Araba nesne2 = new Araba(250,"gri");
        System.out.println(nesne2.hiz);//250
        System.out.println(nesne2.renk);//gri


    }
}
