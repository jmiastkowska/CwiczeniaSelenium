package p06_collections.helloCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeletingFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ala");
        list.add("ma");
        list.add("kota");
        list.add("azora");

/*
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        //usun wszystkie slowa na litere a
        for (int i=0; i< list.size(); i++){
            if(list.get(i).startsWith("a")){
                list.remove(i);
            }
        }
        System.out.println(list);
*/

        //do usuwania elementowz listyi kazdej innej kolekcji
        //najlepiej zastowac ITERATOR

        Iterator<String> iterator = list.iterator();
        System.out.println("-----iteration-----");

        while(iterator.hasNext()){
            if(iterator.next().startsWith("a")){
                iterator.remove();
                System.out.println(list);
            }
            }
        }
}
