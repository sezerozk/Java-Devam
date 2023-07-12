package ders86_Set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {
        /*
        HashSet
        TreeSet(SortedSet interface)(Eklenen veriler sirali bir sekilde ekleyebiliyoruz.)
        Set bir interface ve herhangi bir siralama yapilamdan veri tutuluyor.
        Bir eleman iki kere eklenemez. Matematikteki kumelere benzer sekilde
        calisiyor.
        HashSet==>Kume mantiginda olusturukan liste. Set interface'inden olusturuyoruz.
        TreeSet==>Esasen bu liste yapisi da set interface'i kullanilarak olusturuluyor. Fakat treeset de
        ayni zamanda sortedset interface'inden de faydalanilmis. Ozelligi eklenen datalari sirali sekilde
        tutmasidir.
         */

        HashSet liste = new HashSet<>();
        liste.add("Sezer");
        liste.add(100);
        liste.add(true);
        liste.add("Burak");
        liste.add("Sezer");


        System.out.println(liste);
        System.out.println(liste.contains("Sezer"));//true
        System.out.println(liste.isEmpty());//false
        liste.remove("Burak");
        System.out.println(liste);
        System.out.println(liste.size());//3
        Object [] array = liste.toArray();//toArray methodu HashSeti array'e çeviriyor
        //HashSet icerisindeki datalar farkli tipte oldugundan burada hepsini kapsayan object'i kullandik.
        String metin = liste.toString();
        System.out.println(metin);//[Sezer, 100, true]

        TreeSet list = new TreeSet();
        System.out.println("************TREESET**********");
        //TreeSet deki datalarin ayni turde olmasi gerek aksi halde siralama yapamiyor ve hata veriyor.
        list.add("Hamza");
        list.add("Ali");
        list.add("Betul");
        System.out.println(list);
        list.remove("Hamza");
        System.out.println(list.contains("Hamza"));
        System.out.println(list);
        System.out.println(list.size());

        for (Object each:
        liste     ) {
            System.out.println("liste : " + each);
        }

        liste.clear();
    }
}
