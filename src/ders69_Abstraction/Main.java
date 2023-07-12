package ders69_Abstraction;

public class Main {

    public static void main(String[] args) {
        //Abstraction : Soyutlama
        //Abstract class'lardan nesne olusturulamaz bu class'lar miras alinarak
        //kullanilir.
        //Abstract method olusturulabilir ancak sadece abstract class icerisinde.
        // Ayrica boyle bir method olusturuldugunda bu abstract class'i miras alan
        // bir class varsa bu method o class'ta kullanilmak zorundadir.
        // Ayrica soyut class icerisinde olusturulan soyut bir methodun budy
        // bolumu olmamalidir.
        //Abstract class'lar abstract olmayan methodlari da barindirabilir.
        //Son olarak bir method abstract ise ayni zamanda static olamaz.
        Kus nesne1 = new Kus();

//        Canli nesne2 = new Canli(); Canli class'i abstract oldugundan bu class'tan
//        nesne olusturamiyoruz

        Canli nesne3 = new Kus();//Burada Kus class'i canli class'ini miras aldigi
                                 //icin canli class'indan nesne olustururken new
                                 //Canli(); seklinde kullanabiliyoruz
        nesne1.konus();//konustu..
    }
}
