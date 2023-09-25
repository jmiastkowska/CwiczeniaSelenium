package p06_collections.helloCollections.HashCodeExample;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("123", "A1","B1"));
        studentSet.add(new Student("124", "A2","B2"));
        studentSet.add(new Student("125", "A3","B3"));

    System.out.println(studentSet);
    }
}
