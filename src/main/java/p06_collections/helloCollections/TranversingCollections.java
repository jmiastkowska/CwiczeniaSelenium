package p06_collections.helloCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class TranversingCollections {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>(Arrays.asList("Ala","ma","kota"));

        //1.
        System.out.println(collection);

        System.out.println("----2----");
        //2.
        for(String str: collection){
            System.out.println(str);
        }

        System.out.println("----3----");
        //3.
        for (int i = 0; i < collection.size(); i++) {
        //takie rzeczy tylko w liscie
            //kolekcie takie jak Set, Queue,Dequeue nie pozwalaja
        }

        System.out.println("----4----");
        //4.
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----5----");
        //5.
        collection.stream().forEach(s -> System.out.println(s));
    }
}
