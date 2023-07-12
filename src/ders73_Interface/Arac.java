package ders73_Interface;

public interface Arac {
    /*
    ==>Class ve interface birbirlerinden bagimsiz ve farkli yapilardir.
    ==>Interface'lerden NESNE OLUSTURULAMAZ. Icerisinde degisken ve method
    olusturulabilir.
    ==>Miras alinarak(implements) kullanilir.
    ==>extends ifadesi ile degil implememets ifadesi ile miras alinir
    ==>Bir class birden fazla interface'i miras alabilir fakat birden fazla
    class'i miras alamaz.
    ==>Interface icersindeki methodlar esasen public abstract methodlardir. Bunun alternatifi static olarak
    olusturulan methodlardir. Yani  static olarak olusturulan methodlar overrride edilmeden de kullanilabilir.
    ==>Interface icerisindeki degiskenlerin degerleri daha sonradan
    degistirilemez(final degisken)
    *****Interface'lerin kullanim amaclaridan bazilari:
    ==>Bir interface, bir sinifin belirli methodlari uygulamasini garanti altina alarak bir davranisi garanti
    altina alir ve bu davranisin takip eden diger siniflar tarafindan da uygulanmasi saglanmis olur.4

    ==>Polimorfizm; bir interface'i uygulayan sunuflar bu interface turunde birbirinin yerine kullanilabilir.
     */

    int sayi = 65;//final
    public void bilgiGoster();//Bu method interdace icerisinde olusturuldugundan Java
                              //tarafindan sanki oncesinde public ve abstract kelimleri
                              //yazilmis gibi kabul edilir. Ve bu sebeple bu methodun
                              // icerisne budy eklemek mumkun olmaz.
                              // Ancak static method olusturuldugunda
                              //durum degisiyor---->Yani public static methodlar override edilmeden
                              //kullanilabiliyor ve budy kismi eklenebiliyor.
    public static void deneme(){

        System.out.println("deneme..");
    }

}
