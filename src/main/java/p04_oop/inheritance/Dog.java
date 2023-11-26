package p04_oop.inheritance;

public class Dog extends Animal{

    public Dog(int age, String name){
        super(4, "Azor");   //wywolaj konstruktor bezparametrowy u rodzica
    }

    public void makeSound(){
        System.out.println("whoof");
    }
}
