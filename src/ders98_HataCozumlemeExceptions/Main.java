package ders98_HataCozumlemeExceptions;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Uc tip hata ile karsilasabiliriz
        -Soz dizimi yanlislari syntax errors
        -Mantiksal yanlislar logical errors
        -Kosma zamani yanlislari Run time errors

        ***Try-Catch-Finally
        ***Throw,Throws
        try{
        //kodlar
        }catch(){
        //hata yakalandi
        }finally{
        ust kisimda islem
        bittikten sonra
        calistirilacak kodlar
        ]

        catch bolumu birden fazla olabilir eger farkli hata turleri ozel olarak belirtilmek istenoyorsa.
        catch bolumunda yakalanacak hata turu belirtilmeli ozel olarak belirtilmek istenmiyorsa
        exception ifadesi kullanilmali bu sayede java hangi hata ile karsilasirsa karsilassin catch
        bolumunu calistiracaktir. Try catch sayesinde hata olmasi durumunda program calismaya devam ediyor.
        Finally hata olsun ya da olmasin calisir. Ancak cok fazla kullanilmiyor cunki onun yerine catch
        bolumunun hemen sonrasina istenen kodlar yazilabilir.
         */

        Scanner sc= new Scanner(System.in);
        System.out.println("ILk sayi : ");
        int ilkSayi = sc.nextInt();
        System.out.println("Ikinci sayi : ");
        int ikinicSayi = sc.nextInt();

        int sonuc = 0;

        try {
            sonuc= ilkSayi/ikinicSayi;
        }
        catch (ArithmeticException e){
            System.out.println("Hata olustu" +e);

        }
        catch (StringIndexOutOfBoundsException e){

        }
        finally {
            System.out.println("Finally");
        }

        System.out.println("...");



    }


}
