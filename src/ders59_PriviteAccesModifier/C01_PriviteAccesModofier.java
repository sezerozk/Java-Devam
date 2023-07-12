package ders59_PriviteAccesModifier;

import ders60_DefaultAccesModifier.Kitap;

public class C01_PriviteAccesModofier {

    public static void main(String[] args) {
    Ogretmen nesne = new Ogretmen();
        System.out.println(nesne.isim);
        System.out.println(nesne.yas);
        //System.out.println(nesne.kimlikNo);
        //BU degiskenin erisim belirteci privete oldugu icin
        //bu class'yan kimlik no bilgisine ulasmak mumkun
        //olmuyor



    }
}
