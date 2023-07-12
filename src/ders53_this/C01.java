package ders53_this;

public class C01 {
    public static void main(String[] args) {

        Araba nesne = new Araba(200);

        System.out.println(nesne.arabaninHIzi);
        System.out.println(nesne.arabaninRengi);
        /*
        Ozet olarak this() ifadesi yardimiyla biz bir constructordan diger bir constructori
        cagirabiliyoruz.
        this --> ifadesi ise constructori degil classi ifade etmek icin kullanilir
        This ifadesi genellikle constructor ya da method icerisinde genel degiskenin
        degerinin constructro ya da method icerisndeki degiskene atamak icin kullaniliyor
         */



    }


}
