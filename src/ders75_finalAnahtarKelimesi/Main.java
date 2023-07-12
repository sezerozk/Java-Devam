package ders75_finalAnahtarKelimesi;

public class  Main  {

    public static void main(String[] args) {
        //Final anahtar kelimesi kullanildigi yapinin nihai halini almasini saglar
        //yani o yapi artik degistirilemez.
        //Bu kelimenin kullanildigi degisken degistirilemze, class miras alinamaz ve
        //method override edilemez.
        Araba nesne = new Araba();
        System.out.println(nesne.sayi);
        nesne.deneme();

    }
}
