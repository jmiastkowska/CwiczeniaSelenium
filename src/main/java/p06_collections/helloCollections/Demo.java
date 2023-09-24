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

        //set  -skupia sie na unikalnosci (niekoniecznie na kolejnosci)
        System.out.println("-----set----");
        Set<String> stringSet = new HashSet<>();  //new linkedHashSet
        stringSet.add("ala");
        stringSet.add("ala");
        stringSet.add("ma");
        stringSet.add("kota");
        System.out.println(stringSet);

        List<String> listFromSet= new ArrayList <>(stringSet);
        listFromSet.get(0);
        // z tablicy do listy
        String[] arr = {"a","b","c"};
        List<String> listFromArray = new ArrayList<>(Arrays.asList(arr));
        List<String> listFromArray2 = Arrays.asList(arr);
        listFromArray.add("d");
        System.out.println(listFromArray); //a,b,c,d




    }
}
