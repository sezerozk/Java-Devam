package ders78_ArrayList;

import java.util.ArrayList;

public class ders78_ArrayList {

    public static void main(String[] args) {
        // * Liste uzunlugu dinamiktir.
        // * Icerisine farkli turde datalar eklenebilir.
        // * Eklenecek degerlerin tek tek eklenmesi gerekir.
        // add methodu veri eklemek icin kullanilir..

        ArrayList isimler = new ArrayList<>();

        isimler.add("ali");
        isimler.add("Sezer");
        isimler.add("Yasin");
        isimler.add(20);
        isimler.add(false);
        isimler.add(20.5f);
        System.out.println(isimler);
        System.out.println(isimler.indexOf("Sezer"));
        boolean varMi = isimler.contains("Sezer");//contains methodu aranan datanin listede olup olmadigini kontrol edioyruz
        System.out.println(varMi);//true
        System.out.println(isimler.size());//6
        System.out.println(isimler.get(2));//2. indeksteki veri yi get methodunu kullanrak goruyoruz
        isimler.remove(0);//remove methodu belirtilen indeksteki veriyi siler ve listeyi gunceller
        System.out.println(isimler);
        System.out.println(isimler.size());//5 size methodu ile liste icerisinde kac tane veri oldugunu
        // ogreniyoruz.
//        isimler.addAll() addAll methodu ile bir listeyi baska bir listeye ekliyoruz
        isimler.clear();//Bu method tum elementleri siler.



    }
}
