public class Ders40_WrapperClasslarIleDonusum {
    public static void main(String[] args) {
        String yas = "50";
        int yasTamSayi = Integer.parseInt(yas);
        System.out.println(yasTamSayi);
        // Burada Integer wrapper class'i icersinde yer alan parseInt methodu ile String bir degeri
        // Integer bir degere donusturmus olduk.
        String sonuc = "false";
        boolean sonucBoolean = Boolean.parseBoolean(sonuc);
        System.out.println(sonucBoolean); // Burada String bir deger booean cast edildi.Bunu diger wrapper class'lar
        // ile de yapabiliyoruz(byte-short-int-long-float-double).
        //Bir int'den String elde etme
        int sayi = 60;
        String yazi = String.valueOf(sayi);
        System.out.println(yazi);
        //Fakat valueOf methodundan daha kolay bir yontem vardir ve daha sik kullanilir=>
        int a = 565;
        String b = a + "";// Bu yontem diger primitive data turleri ile de calisir.
        System.out.println(b);




    }
}
