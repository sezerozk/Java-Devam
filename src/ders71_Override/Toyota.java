package ders71_Override;

public class Toyota extends Araba {
    @Override
    public void hareket() {
        System.out.println("toyota calisti");
    }

    @Override
    public void durdur() {
        System.out.println("toyota durdu..");
    }
}
