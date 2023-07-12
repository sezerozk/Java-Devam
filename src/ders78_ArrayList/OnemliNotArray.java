package ders78_ArrayList;

import java.util.Arrays;

public class OnemliNotArray {
    public static void main(String[] args) {
        /*
        ONEMLI; CoddingBat de array-1 kisminda swapENds sorusunu cozerken benim icin ilginc olan bir durumla
        karsilastim. Asagidaki ornekten giderek soruda nums array'inin ilk ve son elemanlarinin yernin degistirilmesi
        ortadaki elemanlarin ayni kaldigi yeni bir array olusturulmesi isteniyordu. Ben de ilk ve son elmanin yerini
        degistirmeden once dongu kullanmama gerek kalmasin diye ilk is array=nums diyerek iki array'i esitledim.
        Daha sonrasinda . array[0] = nums[nums.length-1]; diyerek array'in ilk elemani ile nums in son elemanini
        birbirine esitledim. Kanaatimce boyle yaptigimda array'de degisiklik olacak ama nums'da bir degisiklik olmayacakti.
        Boylece bir sonraki asamada array'in so elemani ile nums'in ilk elemanini esitleigimde soru cozulmus olacakti.
        Ancak oyle olmadi yukaridaki esitlgi yaptigimda nums ve array in her ikisi de degistiler ve birbirlerine esit
        olmaya devam ettiler. BUNUN SEBEBI array=nums; esitligini kullanmamadi. Cunku ben bunu yaptigimda sadece
        array'i nums'a esitlemedi array = nums; ifadesi, array referansını nums dizisinin referansına eşitledi.
        Bu, array'nin başlangıçta oluşturduğumuz boş dizinin referansını kaybederek nums dizisinin referansını
        almasına neden oldu ve referanslari ayni oldugu icin elimizde isimleri farkli ve fakat referanslari ayni olan
        iki array olmus oldu ve cozum istendigi gibi calismadi.
         */
        int [] nums = {1,2,3,4};
        int [] array = new int [nums.length];
//      array=nums;
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
        }
        System.out.println(Arrays.toString(array));
        array[0] = nums[nums.length-1];
        System.out.println("nums:" + Arrays.toString(nums));
        array[array.length-1] = nums[0];
        System.out.println(Arrays.toString(array));


    }
}
