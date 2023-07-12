package ders68_Polymorphism;

public class Main {
    /*
    Polumotphism
    Bir nesnenin birden fazla ve farkli nesneymis gibi davranabilmesi
     */
    public static void main(String[] args) {

        Hayvan hayvan1 = new Hayvan();
        hayvan1.konus();//Hayvan konusuyor...
        Kedi kedi1 = new Kedi();
        kedi1.konus();//miyav..
        Hayvan kedi2 = new Kedi();
        kedi2.konus();//miyav..
        //Class'lar miras aldiklari class'larin tum ozelliklarini tasidiklari icin
        // miras alinan class'tan(burada Hayvan class'i), miras alan class(burada Kedi classs'i)
        // nesnesi olusturulabilir. kedi2 nesnesi goruldugu gibi Hayvan tipinde olmakla
        // birlikte Kedi class'indan olusturuluyor.



    }

}
