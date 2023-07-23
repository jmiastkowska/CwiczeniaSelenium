package p02;

import java.util.Scanner;

public class PoliczSilnie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dla której chcesz obliczyć silnię:");

        int liczba = scanner.nextInt();
        if (liczba < 0) {
            System.out.println("Nastepnym razem podaj liczbe nieujemna.");
        } else {
            int silnia = 1;

            for (int i = 1; i <= liczba; i++) {
                silnia = silnia * i;
            }
            System.out.println("Silnia z liczby " + liczba + " równa się: " + silnia);
        }
        printTree(5);
        printSquare(3);
    }


    /*
    PrintTree(4)
    **
    ****
    ******
    ********
    ***
    ***


    starNo < row*2+2
    0:2 (0*2+2=2)
    1:4 (1*2+2=4)
    2:6 (2*2+2=6)
    3:8 (3*2+2=6)


     */
    public static void printTree(int steps) {
        for (int row = 0; row < steps; row++) {
            int starLimitOnCurrentRow = row * 2 + 2;
            for (int starNo = 2; starNo < starLimitOnCurrentRow; starNo++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

public static void printSquare(int height) {
        for (int row=0; row<height; row++){
            for(int starNo =0; starNo<height; starNo++){
                System.out.print("* ");
            }
            System.out.println();
        }
}



}