package p04_oop.inheritance;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void makeSound(){
        System.out.println("?");
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}
