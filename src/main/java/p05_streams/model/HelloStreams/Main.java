package p05_streams.model.HelloStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("ala", "ma", "kota"));


        List<String> stringInUpper = strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(stringInUpper);

        // slowa zaczynajace sie na "a"
        List<String> startingWithA = strings.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(startingWithA);

        //zamien liste stringow na liste dlugosci tych stringow
        List<Integer> stringsAsInts = strings.stream()
                .map(s-> s.length())
                .collect(Collectors.toList());
        System.out.println(stringsAsInts);

        //zamiast zamieniac strumien na liste po prostu go drukuj
        strings.stream()
                .map(s-> s.length())
                .forEach(i -> System.out.println(i));



    }
}