public class Pratik60 {
    public static void main(String[] args) {

        // Icerisine parametre olarak gonderilen sifrenin icerisinde sayi ve
        // harf olup olmadigini kontrol eden bir method olusturunuz.

        String sifre = "qsjhdb8";
        System.out.println(getSifreKontrol(sifre));


    }
    public static boolean getSifreKontrol (String sifre){
        boolean sonuc = false;
        int flag = 0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i) > '0' && sifre.charAt(i) < '9') {
                flag ++;
                break;
            }
        }
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i) > 'a' && sifre.charAt(i) < 'z') {
            flag++;
            break;
            } else if (sifre.charAt(i) > 'A' && sifre.charAt(i) < 'Z') {
            flag++;
            break;
            }
        }
        if (flag==2){
            sonuc=true;
        }
        return sonuc;
    }
}
