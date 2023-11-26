package p06_collections.helloCollections.HashCodeExample;

import java.util.Objects;

public class Student {
    private String indexNumber, name, surname;

    public Student(String indexNumber, String name, String surname) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass())return false;
        Student student = (Student) o;
        return Objects.equals(indexNumber, student.indexNumber) &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexNumber, name, surname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNumber='" + indexNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
