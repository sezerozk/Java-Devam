public class Pratik51 {


    public static void main(String[] args) {


        String  [] arr = {"hamza", "ali", "hamza", "ahmet", "ahmet", "ahmet"};
        // Yukaridaki array icerisinde hangi ismin kac defa gectigini consola yazdiran bir
        // program yaziniz.
        String bos = "";
        for (int i = 0; i <arr.length ; i++) {

            if (!bos.contains(arr[i])){
                int sayi = 1;
                for (int j = i+1; j <arr.length ; j++) {

                    if (arr[i].equals(arr[j])){
                        sayi++;
                    }

                }
                System.out.println(arr[i] + ": " + sayi);
                bos+=arr[i];
            }

        }

    }
}
