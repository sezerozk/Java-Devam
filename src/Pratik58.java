public class Pratik58 {
    public static void main(String[] args) {
        // Bir tam sayilar arrayi icerisinde en buyuk sayiyi bulan bir method
        // olusturunuz. Method elde ettigi sonucu return etsin.
        int [] arr = {3,5,9};
        System.out.println(getEnBuyukDeger(arr));

    }
    public static int getEnBuyukDeger (int [] arr){
        int sonuc = Integer.MIN_VALUE;//Burada 0 yerine genellikle Integer wrapper class'i icerisinde
                                      // min value degeri kullaniliyor.
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>sonuc){
                sonuc = arr[i];
            }
        }
        return sonuc;
    }
}
