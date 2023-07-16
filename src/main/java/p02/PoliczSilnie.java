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
    }
}