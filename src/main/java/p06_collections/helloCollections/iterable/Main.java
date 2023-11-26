package p06_collections.helloCollections.iterable;

import p06_collections.helloCollections.HashCodeExample.Student;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("idx1","A","B"));
        school.addStudent(new Student("idx2","y","Z"));

        System.out.println(school);

    for(Student student : school){
        System.out.println(student);
    }




    }
}
