package p05_streams.model.HelloStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaMethodReference {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>(Arrays.asList("ala","ma","kota","ala"));
        
        string.stream()
                .map(new StringToUpperFunction())
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return string.toString().toUpperCase();
                    }
                })
                .map(s -> s.toUpperCase())
                // obiekty w strumieniu posiadaja jakas metode to mozna ja po prostu wywolac
                .map(String::toLowerCase)
        .forEach(s -> System.out.println(s));
    }
}
