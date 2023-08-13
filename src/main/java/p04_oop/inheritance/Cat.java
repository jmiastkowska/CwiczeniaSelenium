package p04_oop.inheritance;

public class Cat extends Animal{

    private int noOfLives;



    public Cat(int age, String name){
        this(age,name,9);
    }

    public Cat(int age, String name, int noOfLives){
        super(age, name);
        this.noOfLives = noOfLives;

    }

    public void makeSound(){
        System.out.println("meow");
    }
}
