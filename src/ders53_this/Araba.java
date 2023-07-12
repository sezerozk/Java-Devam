package ders53_this;

public class Araba {
    int sayi = 5;
    int arabaninHIzi;
    int hiz = 500;
    String arabaninRengi;
    public Araba(){
        this(150,"siyah");
        System.out.println("Default");
    }
    public Araba(int hiz){
        this();// this() ifadesi bu class'taki constructor'i cagirmak icin kullaniliyor
        System.out.println("tek parametreli constructor");
    }
    public Araba(int hiz, String renk){
        System.out.println("iki parametreli constructor");
        arabaninHIzi = hiz;
        arabaninRengi = renk;
        System.out.println("this ifadesi " + hiz);// bi sekilde yazildiginda class
        //icerisinde 2 tane hiz degiskeni olmasina ragmen daha yakinda olan
        // ve constructor icinde bulunan degisken kullaniliyor
        System.out.println("this ifadesi " + this.hiz);// Bu sekilde yazildiginda ise
        //onde bulinan this ifadesi bu classi ifade ettiginden bu sefer classtaki
        //hiz degiskeni kullaniliyor.
    }

    public void bilgiYazdir (int sayi){
        sayi = sayi;//bu hali ile classtaki sayi degil parametre olarak gelen
        //degisken yine kendisne atanmis oluyor ve bir anlam ifade etmiyor
        this.sayi = sayi;//Burada ise classtaki degisken this ifadesi yardimiyla
        //method icersindeki degiskene atanmis oluyor
    }

}
