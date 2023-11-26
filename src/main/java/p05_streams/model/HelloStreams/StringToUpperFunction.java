package p05_streams.model.HelloStreams;

import java.util.function.Function;

public class StringToUpperFunction implements Function<String, String> {
@Override
    public String apply(String s){
    return s.toUpperCase();
}
}
