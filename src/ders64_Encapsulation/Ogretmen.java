package ders64_Encapsulation;

public class Ogretmen {
    private String brans = "Matematik";
    private int dogumTarihi = 1990;
    private long kimlikNo = 5465465464l;
    //Disariya aktarilmak istenmeyen degiskenin acces modifier'ini private yapilir. Private degiskene
    //sadece class icerisinden erisilebilir.

    public String getBrans(){
        return brans;
    }//Burada private degiskenin disaridan goruntulenebilmesi
    // saglanirken degiskenin degerinin degistirilmemesi de saglanmis oluyor.
    public int getdogumTarihi(){
        return dogumTarihi;
    }





}
