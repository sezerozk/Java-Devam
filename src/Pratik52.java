public class Pratik52 {
    public static void main(String[] args) {
        // Soru: Asagidaki array icerisinde Ali isminin var olup olmadigini
        // dogrulayan bir program yaziniz.
        String  [] arr = {"hamza", "ali", "hamza", "ahmet", "ahmet", "ahmet"};
        String isim = "hamza";
        boolean iceriyorMu = false;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].equalsIgnoreCase(isim)){
                iceriyorMu = true;
                break;
            }
        }
        if (iceriyorMu){
            System.out.println("Array ismi iceriyor");
        }else {
            System.out.println("Array ismi icermiyor");
        }



    }
}
