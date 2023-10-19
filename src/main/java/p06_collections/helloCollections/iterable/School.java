package p06_collections.helloCollections.iterable;

import p06_collections.helloCollections.HashCodeExample.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School implements Iterable<Student>{
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student studentToAdd){
        students.add(studentToAdd);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {

        return students.iterator();
    }
}
