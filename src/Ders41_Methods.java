public class Ders41_Methods {
    public static void main(String[] args) {
        /*
        Methodlari programimizi alt programlara bolerek daha anlasilir hale getirmek icin
        ve tekrarlanan islemleri kolaylikla yapmak icin kullaniyoruz.
         */

        int[] arr = {10,20,30,40,50};
        System.out.println(arrayToplama(arr));
        toplama();
        toplama();
        toplama();
        toplama(50,45);


    }
    public static int arrayToplama (int [] arr){
        int toplam = 0 ;
        for (int each:arr
             ) {
            toplam+=each;
        }
        return toplam;
    }
    public static void toplama(){
        System.out.println("Toplma methodu cagirildi.");
    }
    public static void toplama (int sayi1, int sayi2){
        System.out.println(sayi1+sayi2);
    }

}
