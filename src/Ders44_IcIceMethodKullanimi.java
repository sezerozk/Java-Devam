public class Ders44_IcIceMethodKullanimi {
    public static void main(String[] args) {
    bilgiGoster();//Goruldugu gibi methodlarin icice kullanilmazi mumkun. Burada sadece bir
                  //cagirdik fakat diger methodlarin methodun icerisinde cagirildigi icin
                  //her uc methodda calismis oldu.


    }
    public static void bilgiGoster(){
        isimYazdir();
        System.out.println("Merhaba!");

    }

    public static void isimYazdir(){
        System.out.println("Sezer");
        programlamaYazdir();
    }

    public static void programlamaYazdir(){
        System.out.println("Java");
    }
}
