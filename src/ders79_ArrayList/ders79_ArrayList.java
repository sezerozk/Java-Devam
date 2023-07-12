package ders79_ArrayList;

import java.util.ArrayList;

public class ders79_ArrayList {
    public static void main(String[] args) {

        ArrayList isimler = new ArrayList();//ArrayList i bu  sekilde yazdigimiz zaman icerisinde
        // farkli data turunde degiskenler tutabiliyoruz. Fakat sadece belirli tipte datalari tutmak
        // istiyorsak o zaman yazim seklimizi degistirmeliyiz.
        ArrayList <String> isimler1 = new ArrayList<>();
        isimler1.add("Sezer");
        isimler1.add("Ali");
        isimler1.add("Mehmet");
        //isimler1.add(25); artik int data turunde veriler kabul edilmiyor
        //Eger primitive data turlerinden birini tutmak istiyorsak <> isaretlerinin icerisine
        // primitive data turu icin olusturulan wrapper class' i yazmaliyiz.

        ArrayList <Integer> sayilar = new ArrayList<>();
        sayilar.add(15);
        sayilar.add(155);
        sayilar.add(5);
        System.out.println(sayilar);

    }
}
