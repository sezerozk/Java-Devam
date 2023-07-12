package ders95_MapForEach;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        HashMap<String , Integer> liste = new HashMap<>();
        liste.put("Ali" , 90);
        liste.put("Bekir" , 90);
        liste.put("Zeynel" , 90);
        System.out.println(liste.get("Ali"));


        System.out.println(liste);

        for (Map.Entry<String,Integer> each:liste.entrySet()) {
            System.out.println(each);
            System.out.println(each.getKey());
            System.out.println(each.getValue());
            System.out.println();
        }
    }
}
