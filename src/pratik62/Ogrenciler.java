package pratik62;

public class Ogrenciler {

    int ogrenciSayisi = 250;

    public int kayitEkle(){
        ogrenciSayisi++;
        return ogrenciSayisi;
    }

    public int kayitSil(){
        ogrenciSayisi--;
        return ogrenciSayisi;
    }

}
