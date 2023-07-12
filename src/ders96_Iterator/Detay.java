package ders96_Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Detay {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Burcu");
        liste.add("Nesrin");
        liste.add("Busra");

        ListIterator iterator = liste.listIterator();

        System.out.println(iterator.next());
        iterator.set("Burcu 1234");
        iterator.add("Ayse");
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());//previous methodu ile sondan basa dogru geliyoruz
        System.out.println(iterator.previous());
        System.out.println(liste);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
