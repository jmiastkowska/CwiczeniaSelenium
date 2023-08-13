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

        Animal[]animals = {
                new Cat(2, "c1"),
                new Dog(2, "C1"),
                new Cat(2, "c1"),
                new Dog(2, "C1"),
        };

        System.out.println("---------");
        makeSomeNoise(animals);
    }


    public static void makeSomeNoise(Animal[] animals){
        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}
