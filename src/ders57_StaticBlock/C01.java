package ders57_StaticBlock;

public class C01 {
    public static void main(String[] args) {
        //ststic olarak olusturulan degiskenler ya da methodlar icin her halukarda
        //hafizada yer ayrilir ancak static olmayanlar icin durum boyle degildir.
        //Bu nedenle static bir methodun icinde static olmayan bir degisken kullanilmasi
        //halinde Java hata verir
        //*******Static bolck static olarak olusturulan degisknelere, program calismadan once
        //deger atamasi yapmak icin kullanilir.
        Araba nesne = new Araba();
        System.out.println(Araba.hiz);//200

    }
}
