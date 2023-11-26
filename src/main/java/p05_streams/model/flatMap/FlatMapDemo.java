package p05_streams.model.flatMap;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<StudentGrads> studentsGradesList =
                Arrays.asList(
                        new StudentGrads("a",Arrays.asList(1,2,3)),
                        new StudentGrads("b",Arrays.asList(4,5,6))
                        );
        studentsGradesList.stream()
                .flatMap(sg ->sg.grades.stream())
                .forEach(grade -> System.out.println(grade));
    }
}
