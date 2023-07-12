package ders80_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        //Istenilen indekse veri eklemek ya da istenilen çikarmak. For-ForEach kullanimi
        List<String> isimler = new ArrayList<>();
        isimler.add("Sezer");
        isimler.add("Kazim");
        isimler.add("Selo");
        System.out.println(isimler);
        isimler.add(0, "Veli");
        System.out.println(isimler);
        isimler.remove(2);
        System.out.println(isimler);
        //Eklenme sirasina gore for dongusu ile
        for (int i = 0; i <isimler.size() ; i++) {
            System.out.print(isimler.get(i) + " ");
        }
        System.out.println();
        //Eklenme sirasinin tersine gore
        for (int i = isimler.size()-1; i >=0 ; i--) {
            System.out.print(isimler.get(i) + " ");
        }

        System.out.println();
        //forEach yardimi ile
        for (Object each: isimler) {//Burada isimler arraylist'i sadece String data turunde degisken aldigi için
            // each nesnesini String olarak belirttik. Peki data turu belirtilmeyen arrayList'lerde ne yapacagiz?
            // O ihtimalde de java'da tum classlar tarafindan miras alinan object class'indan nesne olusturmak gerek.
            System.out.print(each);
        }

        ArrayList sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Kayseri");
        sehirler.add("Istanbul");
        System.out.println();
        for (Object sehir:
                sehirler) {
            System.out.print(sehir + " ");
        }

    }
}
