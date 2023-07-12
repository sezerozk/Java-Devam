package ders49_ConstructorOlusturma;

public class Ders49_ConstructorOlusturma {

    public static void main(String[] args) {
    Araba nesne = new Araba();//Constructor cagirildi
    //Bu sekilde bir nesne olusturuldugunda Java herhangi bir islem yapmadan
        // once dogrudan constructor'a gidiyor. Default olarak olusturulan
        // constructor'in ici bos oldugunda calistirdigimizda konsolda bir sey
        // gormuyoruz. Fakat burada oldugu gibi kendimiz bir constructor olusurur
        // ve icerisine bir sey eklersek onun calistirildigini goruyoruz.
        System.out.println(nesne.hiz);//200
        System.out.println(nesne.renk);
        System.out.println(nesne.model);


    }

}
