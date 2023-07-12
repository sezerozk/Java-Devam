package ders55_StaticAnahtarKelimesi;

public class C01 {

    public static void main(String[] args) {
        /*
        Static kelimesi hafiza yonetimi icin kullanilir ve static kelimesinin kullanildigi
        degisken hafzada sadece bir kez olusturulur.
        Static olarak olusturulan degisken nesneye degil dogrudan class'a bagildir.Bu nedenle
        bir nesnenin static olan degiskenin degeri degistirilirse tum nesneler
        icin odegiskenin degeri degismis olacaktir
         */
        Araba nesne1 = new Araba(200, "mavi");
        System.out.println(nesne1.hiz);
        System.out.println(nesne1.renk);
        nesne1.model = 2022;//Burada yapilan degisiklik degier nesnelerde bulunan
        //degiskenleri otomatik oarak degistirir. Cunku static degiskenler nesnelere bagli degil class'a bagli olarak
        //ve bir defa olusturulurlar
        System.out.println(nesne1.model);
        Araba nesne2 = new Araba(150,"kirmizi");
        System.out.println(nesne2.hiz);
        System.out.println(nesne2.renk);
        System.out.println(nesne2.model);
        //degiskenin static olarak olusturulmasinin bir deger farki ise degier degiskenleri
        //nesne olsuturmaksizin baska bir class'ta kullanmak mumkun degilken stativ ile
        //olusutulan degiskenler dogrudan class'a baglanarak kullanilabilir.
        System.out.println(Araba.model);


    }
}