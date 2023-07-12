package ders99_ThrowThrows;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        /*
        Exception
        ArithmeticException
        ArrayIndexOutOfBoundsException
        ClassNotFoundException
        FileNotFoundException
        IOException
        InterruptedException
        NoSuchFieldException
        NoSuchMethodException
        NullPointerException
        NumberFormatException
        RunTimeException
        StringIndexOutOfBoundsException

        throw ile istersek hata mesaji firlatabiliyoruz
         */

        int num1 = 50;
        int num2 = 0;

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("qsdqs");
            if (num2==0){
                throw new StringIndexOutOfBoundsException();//Burada throw ile num2 nin 0 oldugu durumda ArithmeticException
                //hatasi vermesini soyluyoruz ve java catch de ayni hata turu varsa orayi yosa exception kislini
                //calistiriyor
            }else {
                System.out.println(num1/num2);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("258");
        }
        catch(ArithmeticException e){
            System.out.println("Hata yakalandi "+e);
        }
        catch (Exception e){
            System.out.println("exception");
        }

        System.out.println("...");

    }
}
