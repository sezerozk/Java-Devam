package ders52_CostructorZinciri;

public class Araba {
    public Araba (){
        this(200);//Alttaki constructor'i this() ifadesi ile cagiriyoruz.
        System.out.println("default");
    }

    public Araba(int hiz){
        this(180,"siyah");
        System.out.println("TEKLI");
    }

    public Araba (int hiz, String renk){
        System.out.println("ikili");
    }
}
