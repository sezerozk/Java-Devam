package ders91_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        /*
         ==>Map(donusum)
         Set ya da list ile tutulan datalar tek tek tutulurken map de sistem farkli calisiyor.
         Veriler anahtar deger iliskisi seklinde tutuluyor.
         Map interface i ile kullanilabilecek iki farkli yapi var; HashMAp ve TreeMap(SortedMap interface i).
         HAshMAp te eklenme sirasi yok.
         TreeMap te kendi icersinde anahtar degerlerini siraliyor.
         key     = value
         anahtar = deger
         Anahtarlar benzersiz olmak zorunda.
         */

        HashMap liste = new HashMap<>();

        String str = "qsd";

        //Hashmap te eleman eklemek icin put methodunu kullaniyoruz
        liste.put("Sezer", 90);
        liste.put("Ali", 75);
        liste.put("Gul", 60);
//        liste.remove("Sezer");
        System.out.println(liste.get("Ali"));
        liste.put("Sezer", 100);//ayni anahtarla ikinci defa ekleme yapinca son eklenen deger
        //baz alinarak deger guncelleniyor.
        System.out.println(liste);
        System.out.println(liste.containsKey("Sezer"));
        System.out.println(liste.containsValue(90));

        System.out.println("entrySet : " +liste.entrySet());
        //entrySet methodu ile eklenen datalarin listesini aliyoruz
        System.out.println("keySet : " + liste.keySet());
        //keySet denilen yapi bize set yapisi ile olusturulmus bir liste donderiyor.

        System.out.println(liste.size());

        TreeMap list = new TreeMap();
        list.put("Zeynep", 90);
        list.put("Berk", 75);
        list.put("Ali", 60);
        System.out.println(list);//{Ali=60, Berk=75, Zeynep=90} goruldugu uzere girilen veriler
                                 //alfabetik olarak siralanmis durumdalar



    }
}
