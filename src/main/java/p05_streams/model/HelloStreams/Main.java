package p05_streams.model.HelloStreams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        //liczby parzyste
        IntStream.range(2,100)
                .filter(i -> i%2==0)
                .forEach(i-> System.out.println(i));

        //policz unikalne imiona
        long uniqueNamesCount = strings.stream()
               .distinct()
               .count();

        int uniqueNamesCount2 = new HashSet<>(strings).size();

        //czy istnieją imiona na z?
        boolean nameStartingWithZExists = strings.stream()
                .anyMatch(s -> s.startsWith("z"));

        //znajdz jakiekolwiek imiona na z
        Optional<String> anyNameStartingWithZOptional = strings.stream()
                .filter(s ->s.startsWith("a"))
                .findAny();


        if(anyNameStartingWithZOptional.isPresent()){
            System.out.println(anyNameStartingWithZOptional.get());
        }

        //podaj najdluzsze imie
        Optional<String> longestNameOptional =  strings.stream()
                .max((s1,s2) -> s1.length() - s2.length());

        if(longestNameOptional.isPresent()){
            System.out.println(longestNameOptional.get());
        }

//wydrukuj tylko 2 imiona na a
        strings.stream()
                .filter(s-> s.startsWith("a"))
                .limit(2)
                .forEach(s -> System.out.println(s));

    }
}