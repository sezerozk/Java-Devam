package ders47_NesneIcerisindekiBilgileriDegistirme;

public class C01 {
    public static void main(String[] args) {
        Araba nesne = new Araba();
        System.out.println(nesne.hiz);//250
        System.out.println(nesne.marka);//Toyota

        Araba nesne2 = new Araba();
        nesne2.marka = "Audi";
        nesne2.hiz = 320;

        System.out.println(nesne2.hiz);//320
        System.out.println(nesne2.marka);//Audi



    }
}
