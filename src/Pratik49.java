public class Pratik49 {


    public static void main(String[] args) {
        // Soru; For dongusunu kullanrak bir sayinin karekokunu hesaplayan bir program yaziniz
        System.out.println(Math.sqrt(36));// Burada da goruldugu uzere normal sartlarda Java'da
        // matematiksel islemeler yapmak icin Math'den yararlaniyoruz. Fakat burada algoritma
        // mantigilizi gelistirebilmek icin kendimiz bir algoritma olusturmaya calisacagiz.
        int sayi = 169;
        double kareKok = 5;
        for (double i = 1.00; i*i<=sayi; i+=0.01){
                kareKok=i;

        }
        String format  = String.format("%.5f", kareKok);// format methodu ile virgulden sonraki -5f yazdigimiz
                                                        // icin- 5 basamak yuvarlaniyor.
        System.out.println(format);

    }
}

