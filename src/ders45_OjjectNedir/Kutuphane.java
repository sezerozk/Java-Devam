package ders45_OjjectNedir;

public class Kutuphane {
    public static void main(String[] args) {
        Kitap nesne = new Kitap();
        /*
        Nesne olusturma yontemi => class ismi nesne ismi = new class ismi();
        Boylece nesne isminde bir object olusturmus olduk
         */
        System.out.println(nesne.sayfa);
        System.out.println(nesne.yazar);
        System.out.println(nesne.aciklama);
    }
}
