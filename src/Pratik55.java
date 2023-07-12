public class Pratik55 {

    public static void main(String[] args) {
        //Bir array icersinde raranan datanin olup olmadigini consola yazdiran bir
        // method olusturun

        int [] arr = {20,30,40,50};
        int arananSayi = 30;
        dataBulma(arr,arananSayi);

    }
    public static void dataBulma(int[] arr, int sayi){
        boolean varMi = false;
        for (int each:arr
             ) {
            if (sayi==each){
                varMi=true;
                break;

            }

        }
        if (varMi) {
            System.out.println("Array aranan datayi icermektedir");
        }else
            System.out.println("Array aranan datayi icermemektedir");
    }
}
