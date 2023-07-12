package ders96_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
        /*
        Iterator'ler collection lar ile birlikte karsimiza cikan, bizi liste icerisinde gezintiye
         cikaran yapilar.
         Iterator     ==>Bastan sona dogru ilerliyoruz
         ListIterator ==>Sondan basa dopru ya da bastan sona dogru ilerleyebiliyoruz. Gelismis iterator
         Iterator bir interface
         */

        ArrayList<String> liste = new ArrayList<>();

        liste.add("Burcu");
        liste.add("Nesrin");
        liste.add("Busra");


        Iterator iterator = liste.iterator();
        System.out.println(iterator.hasNext());//true
        //hasNext methodu bir sonraki datanin var olup olmadigini kontrol eder ve boolean bir sonuc dondurur

//        System.out.println(iterator.next());//Burcu
//        iterator.remove();//remove methodu iterator un o sirada uzerinde bulundugu datayi siliyor
//        System.out.println(iterator.next());//Nesrin
//        System.out.println(iterator.next());//Busra
        //next methodu bir sonraki datayi getiriyor
        System.out.println(liste);//[Nesrin, Busra]
        System.out.println("********DONGU*********");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Yukarida yoruma alinan ksim yoruma alinmazsa iterator donguye ulasmadan tum
        // datalara bakildigi icin hasnext methdu false oluyor ve dongu calismiyor.


    }
}
