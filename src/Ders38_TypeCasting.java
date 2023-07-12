public class Ders38_TypeCasting {
    public static void main(String[] args) {

        /*
        byte    8 bit
        short   16 bit
        int     32 bit
        long    64 bit
        float   32 bit
        double  64 bit
         */

        byte sayi1 = 100;
        int sayi2 = 50; // Bu sekilde cast islemi yaparken ornegin burada int'i byte'a cevirirken
                        // cevrilen int degerin byte'in icine sigabilecek bir deger oldugundan emin
                        // olnumasi gerek. Aksi takdirde program duzgun calismaz.
        sayi1 = (byte)sayi2;

        int sayi3 = 990;
        long sayi4 = 5671l;
        sayi3 = (int) sayi4;
        sayi4 = sayi3;
    }


}
