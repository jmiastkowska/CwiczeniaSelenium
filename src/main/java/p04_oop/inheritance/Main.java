package p04_oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2,"Felix");
        Dog dog1 = new Dog(2,"Azor");

        cat1.makeSound(); //meow
        dog1.makeSound(); //whoof

        //polimorfizm
        Animal someAnimal = new Dog(3, "Burek");
        someAnimal.makeSound();


    }
}
