package ders67_Inheritence;

public class main {

    public static void main(String[] args) {

        Araba nesne = new Araba();
        nesne.calistir();
//        nesne.durdur();
        //Genel isleyis su sekilde oluyor. Nesne olusturuldugu
        // zaman java ilk once nesne olusturulan class'a gidiyor
        //ve o class'ta bir miras alma islemi varsa sonrasinda bir
        // islem yapmadan miras alinan class'a giyor ve nesne olusturulma
        // islemi o class'tan baslatiliyor. Dolayisi ile burada
        // once motor class'inin constructor'i sonra araba class'inin
        // constructor'i calisiyor.

    }
}
