package ders67_Inheritence;

public class Araba extends Motor{

    String isim = "Toyota";
    int maxHiz = 180;
    public Araba(){
        this("yas");
        System.out.println("araba");
    }

    public Araba (String yas){
        System.out.println("contructor");
    }
}
