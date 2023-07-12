public class Pratik59 {
    public static void main(String[] args) {

        // Parametre olarak gonderilen bir arrua icerisindeki tam sayilarin
        // buyukten kucuge dogru sirali olup olmadigini boolean tipinde bir degiskenle
        // kontrol eden ve bu degiskeni geri donduren bir method olusturun.
        int [] arr = {4,3,2};
        System.out.println(getSiraliMi(arr));

    }
    public static boolean getSiraliMi(int[] arr){
        boolean sonuc = true;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (!(arr[i]>arr[i+1])){
                sonuc = false ;
                break;
            }
        }
        return sonuc;
    }
}
