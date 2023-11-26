package p07_varargs;

import java.util.Arrays;
import java.util.List;

public class VarargsDemo {
    public static void main(String[] args) {
        String []names = {"a","b","c"};
        printStrings(names);
        System.out.println("----");
        printStrings("e","f","g");

        List<String>texts = Arrays.asList(names);
     //   printStrings(texts); //list nie mozna tak uzywac
    }

    private static void printStrings(String ... strings) {
        for (String string : strings){
            System.out.println(string);
        }
    }
}
