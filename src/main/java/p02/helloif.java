package p02;

public class helloif {
    public static void main(String[] args) {
        int age = -1;

        if (age >= 0 && age < 11) {
            System.out.println("Jesteś dzieckiem");
        } else if (age >= 11 && age < 18) {
            System.out.println("jesteś nastolatkiem");
        } else if (age >= 18 && age < 60) {
            System.out.println("jesteś pelnoletni");
        } else if (age >= 60) {
            System.out.println("jesteś seniorem");
        } else {
            System.out.println("błędny wiek");
        }
    }
}
