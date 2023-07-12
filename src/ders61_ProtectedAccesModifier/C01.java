package ders61_ProtectedAccesModifier;

public class C01 {

    public static void main(String[] args) {

        //Protected acces modifier ayni class ve ayni package'dan ulasima izin verdigi gibi
        // eger miras alan adurumu varsa farkli package'dan da ulasima izin veriyor.
        KimlikBilgileri nesne = new KimlikBilgileri();
        System.out.println(nesne.sayiDefault);
        System.out.println(nesne.sayiProtected);

    }
}
