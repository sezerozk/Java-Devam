package ders82_LinkedList;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {

        LinkedList liste = new LinkedList<>();
        liste.add("Sezer");
        liste.add("Kaan");
        liste.add("Levent");
        System.out.println(liste);
        liste.addLast("Sirin");
        liste.addFirst("Bulent");
        System.out.println(liste);
        liste.remove("Levent");
        liste.remove(3);
        System.out.println(liste);
        System.out.println(liste.getFirst());
        System.out.println(liste.get(2));
        System.out.println(liste.size());
        liste.clear();
        System.out.println(liste);

    }
}
