package ders52_CostructorZinciri;

public class C01 {
    public static void main(String[] args) {
        //Constructor zinciri; birden fazla olusturulan constructor'lardan birinin
        //icerisinde digerinin cagirilmasi duruludur.

        Araba nesne = new Araba();
        // Ayni class icerisinde biden fazla class'in this() ifadesi ile cagirilmasi
        // birden fazla nesne URETMEZ.
        //Eger diger constructor cagirilacaksa constructor'in en ust kisminda
        //cagirilmalidir aksi takdirde java kabul etmez.

    }
}
