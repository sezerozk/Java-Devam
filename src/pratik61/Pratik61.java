package pratik61;

public class Pratik61 {
    public static void main(String[] args) {

        /*
        Bir tane kutuphane adinda class olusturun ve icerisinde kitap sayisi
        acilis saati, kapanis saati gibi bilgiler yer alsin. Ve bu class'tan
        olusturdugunuz nesneyi kullanarak icersindeki bilgileri consola yazdirin.
         */
        Kutuphane calisma = new Kutuphane();
        System.out.println(calisma.kapanisSaati);
        System.out.println(calisma.isim);
        System.out.println(calisma.kitapSayisi);
        System.out.println(calisma.acilisSaati);
        System.out.println(calisma.salonSayisi);


    }
}
