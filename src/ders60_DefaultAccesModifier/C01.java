package ders60_DefaultAccesModifier;

public class C01 {

    public static void main(String[] args) {
        //Default acces modofoer sadece ayni class ve ayni
        //package icersinden erisime izin verir.
        //Yani degisken ya da method baskaca bir erisim belirteci kullanilmamaissa
        //default(varsayilan) olarak Java bu sekilde calisir.
        Kitap nesne = new Kitap();
        System.out.println(nesne.sayfaSayisi);


    }
}
