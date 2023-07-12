package ders72_Overloading;

public class Main {

    public static void main(String[] args) {
        //Bir methodun imzasi degistirilerek ayni isimde birden fazla
        // method olusturulabilir.
        //Static bir class'ta ayni class'tan cagirilacak methodlarin da yine
        //static olmasi gerekli.
        int sonuc1 = toplama(10,20);
        System.out.println("sonuc1= " + sonuc1);
        int sonuc2 = toplama(10,20,30);
        System.out.println("sonuc2= " + sonuc2);


    }
    public static int toplama(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int toplama(int sayi1, int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }

}
