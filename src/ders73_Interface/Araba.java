package ders73_Interface;

public class Araba implements Arac,Model {



    @Override
    public void modelBilgiler() {
        System.out.println("modeller..");
    }

    @Override
    public void bilgiGoster() {
        System.out.println("bilgiler..");
    }
}
