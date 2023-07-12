package ders83_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        //LinedList icerisinde sqdece belilri tipte data tutmak icin LinkedList<DATA TURU> seklinde yazilmalidir

        LinkedList liste = new LinkedList<>();
        liste.add("Sezer");
        liste.add(200);
        liste.add(true);
        liste.add(new Araba());
        liste.addFirst("ilk isim");
        liste.addLast("son isim");
        liste.remove(true);
        System.out.println(liste );
        System.out.println(liste.getFirst());
        System.out.println(liste.get(3));
        System.out.println(liste.contains("Sezer"));
        System.out.println("eleman sayisi = "+liste.size());
        liste.clear();

        LinkedList<Integer> sayilar = new LinkedList<>();
        sayilar.add(20);
        sayilar.add(12);
        sayilar.add(1,40);//Bu sekilde eklemek istedigimz datanin i,deksini belirleyebiliyoruz.
        System.out.println(sayilar);//[20, 40, 12]

        List<String> list = new LinkedList<>();
        list.add("Sezer");
        list.add("Selami");
        list.add("salut");
        // Eklenme sirasina gore
        for(int i=0 ; i<list.size() ; i++){
            System.out.println(list.get(i));
        }
        //Foreach
        for (String each:list
             ) {
            System.out.println("foreach: "+each);
        }


    /*
    Linkedlist esasen daha ileri duzey programlama icin kullaniliyor.Linkdelist'in calisma sekli arraylist'den
    farkli. Ornegin Linkdelist de eklenen veriler toplu olarak tutulmak zorunda degil. Linkdelist de bir veri
    eklendiginde java eklenen veriyle birlikte veriye ait bir referans olusturuyor. SOnrasinda bir sonraki
    verinin datasi ile onceki verinin referansini birbirine baglayarak tutuluyor. Bagli liste ismi de buradan
    geliyor. Ilk data head'e sondata ise null'a bagli olarak olusturuluyor.
    ==>Data ekleme acisindan linkedlist ile arraylist'in temel farki arraylist'de aradaki bir indekse data
    eklenmeye calisildigi zaman eklenen indeksten sonraki tum indekslerin degistirilmesi gerekir.
    Fakat ayni islem linkedlist'le yapildiginda sadece eklenen elemanin bir onceki ve bir sonraki eleman arasinda
    olusturulan dugum-baglanti(node) degistirilip geriye kalan datalara dokunulmayacagi icin data eklemek daha
    kolaydir. Yani hafiza daha verimli sekilde kullanilir. Dezavantaji ise dataya ulasmak daha maliyetli.
     */



    }
}
