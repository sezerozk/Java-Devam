public class Ders39_WrapperClasses {
    public static void main(String[] args) {
        /*
        byte        Byte
        short       Short
        int         Integer
        long        Long
        float       Float
        double      Double
        booelan     Boolean
        char        Character
         */

        int sayi1 = 5;
        Integer sayi2 = new Integer(5);
        System.out.println(sayi2);//Esasen sayi1 de oldugu gibi burada sayi2 degerini saklamak icin
                                  //Integer Wrapper Class'ini kullanmaya ihtiyac yoktur. Bu sekilde yazmaktan
                                  // maksadiliz Integer Wrapper Class'i icersinde yer alan hazir methodlardan
                                  // faydalanabilmektir.
    }
}
