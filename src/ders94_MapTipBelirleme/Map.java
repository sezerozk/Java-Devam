package ders94_MapTipBelirleme;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

       /*
       Lis<String>, Set<Integer>
        */
        HashMap<String , Integer> liste = new HashMap<>();
        liste.put("Ali", 75);
        liste.put("Ahmet", 85);
//        liste.put(50, 80); tip belirleme isleminden sonra bu sekilde yazima izin vermedi

        System.out.println(liste);

        HashMap<String , Araba> liste1 = new HashMap<>();//Araba class indan olusturulacak nesneleri
        //tutan bir map olusturmus olduk.
    }
}
