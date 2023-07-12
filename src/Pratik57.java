public class Pratik57 {
    public static void main(String[] args) {
        // Girilen sayinin faktoriyelini hesaplayan bir program yaziniz
        // Bunu bir method icerisinde yapiniz ve return ifadesi ile sonucu
        // geri donderiniz.
        System.out.println(getFaktoriyel(5));

    }
    public static long getFaktoriyel (int sayi){
        long sonuc = 1;
        for (int i = 1; i <=sayi ; i++) {
            sonuc*=i;
        }
        return sonuc;
    }
}
