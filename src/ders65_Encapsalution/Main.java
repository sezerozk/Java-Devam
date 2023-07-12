package ders65_Encapsalution;



public class Main {
    public static void main(String[] args) {
        Ogretmen nesne = new Ogretmen();
        System.out.println(nesne.getYas());
        nesne.setYas(25);
        System.out.println(nesne.getYas());
        nesne.setYas(33);
        nesne.setIsim("Sezer");
        System.out.println(nesne.getIsim());


    }
}
