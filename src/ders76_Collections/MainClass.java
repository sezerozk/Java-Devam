package ders76_Collections;

public class MainClass {

    public static void main(String[] args) {
        int [] sayilar = {1,2,3,4,5};

        Araba nesne1 = new Araba();
        Araba nesne2 = new Araba();
        Araba nesne3 = new Araba();

        Araba [] arabalar = new Araba[3];//3 adet araba nesnesini tutan bir array olusturmus olduk
        arabalar = new Araba[]{nesne1, nesne2, nesne3};//gORULDUGU UZERE array'lerle primitive data
        // turunde degerler tutulabildigi gibi non-primitivi data turunde degerlerde tutulabiliyor.
        // Burada olusturulan nesneleri array'de tutuyoruz.
        // Array'ler disinda collections lari kullanarak da listeler tutabiliriz. Fakat bu listelerin
        // array'lerden farklari vardir. Ornegin array'in icersindeki data sayisi bastan bellidir ve
        // sabittir. Ama collections framework'unun yardimiyla dinamik sayida veri tutan listeler
        // olusturabiliyoruz. Ya da tutulan veriler istenirse sirali istenirse sirasiz olarak tutulabiliyor.
        // Bir diger yontem olarak anahtar =deger seklinde de data tutabiliyoruz.
        // Collections kullanimi bir cok kolaylik saglamkla birlikte hafiza kullanimi acisinda da
        // daha verimlidir. Uc ana tipte interface vardir. Bunler:
        // set    => kume gibi yani icersine eklenen datalar sirasiz olarak tutulur
        // list   => liste mantigi ile sirali olarak tutulur
        // map    => anahtar=deger iliskisi seklinde datalar tutulur



    }
}
