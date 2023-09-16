package p06_collections.helloCollections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //framework kolekcji
        //kolekcja -> Collections

        //Collections ma metody: size(), isEmpty(), add()
        //List  ma met.:  (get(int i), add(int i, E e))
        // Set to samo co w Collections ale dba ounikalnosc elementow
        //Queue ma poll()- pobierz
        //Deque - jak Queue ale dot poczatku i konca

        //Map <String, String>

        List<String> stringList = new ArrayList<>();
       // List<String> stringList2 = new LinkedList<>();
        stringList.add("ala");
        stringList.add("ma");
        stringList.add("kota");
        String firstString = stringList.get(0);
        String lastString = stringList.get(stringList.size()-1);
        System.out.println(stringList);
        String removeElement = stringList.remove(0);
        System.out.println("we removed " + removeElement);
        System.out.println(stringList);
    }
}
