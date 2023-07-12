package pratik62;

public class Pratik62 {
    public static void main(String[] args) {

        //Bir tane ogrenciler adinda class olusturun ve icerisinde okuldaki
        // ogrenci sayisini tutan bir degisken yer alsin. Ve kayitEkle ve
        // kayitSil methodlari ile ogrenci sayisini tutan degiskeni bir artirip
        // bir azaltabilelim.
        Ogrenciler pratik = new Ogrenciler();
        pratik.kayitEkle();
        pratik.kayitEkle();
        pratik.kayitSil();
        System.out.println(pratik.ogrenciSayisi);//251

    }
}
