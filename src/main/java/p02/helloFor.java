package p02;

import java.util.Arrays;

public class helloFor {
    public static void main(String[] args) {
        int limit = 3;
        int counter = 0;

        while (counter < limit) {
            System.out.println("hej");
            counter++;
        }

        /*
        for(deklaruj licznik; wyrazenie logiczne; co robic z licznikiem) { kod dowykoniania}
         */
        for (int licznik = 0; licznik < 3; licznik++) {
            System.out.println("hej");
            System.out.println("----------");
        }

        String[] owoce = new String[]{"malina", "jerzyna","gruszka"};
        for( int index = 0; index< owoce.length; index++){
            System.out.println(owoce[index]);
        }

    }
}