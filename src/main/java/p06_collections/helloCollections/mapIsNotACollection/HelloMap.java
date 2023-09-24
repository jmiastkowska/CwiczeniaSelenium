package p06_collections.helloCollections.mapIsNotACollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static javax.swing.UIManager.put;

public class HelloMap {
    public static void main(String[] args) {
        // Map<typ Klucza, Typ Wartosci> mapa = ...
        Map<String,Integer> pantoneMap = new HashMap<>();
        pantoneMap.put("zimowa przygoda", 1221);
        pantoneMap.put("zwiewny roz", 1221);
        pantoneMap.put("zimowa przygoda", 666);
        System.out.println(pantoneMap);
        Integer codeForZwiewnyRoz = pantoneMap.get("zwiewny roz");
        System.out.println(codeForZwiewnyRoz);

        System.out.println("----iterator -----");
        //iterowaie po elementach listy
        Iterator<Map.Entry<String, Integer>> iterator =  pantoneMap.entrySet().iterator();
        while (iterator.hasNext()){
        Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());

}
    }
}
