package p03array;

import java.util.concurrent.LinkedBlockingDeque;

public class HelloDim {
    public static void main(String[] args) {
        int[] intArray1 = new int[6];
        int[] array = {6,5,4,3,2,1};
        //{0,0,0,0,0,0}
        intArray1[0]=6; //przypisanie idneksu do 1 elementu
        intArray1[1]=5;
        //...
        intArray1[5]=1;

        int[] intArray2 = {6,5,4,3,2,1}; // przypisanie wartosci

        //printing
        System.out.println(intArray2);  //hash

        //accessing value
        System.out.println(intArray2[2]);
        //printing manualy
        for(int index= 0; index < intArray2.length; index++){
            System.out.print(intArray2[index] + ",");
        }
        System.out.println();

        //for(zmienna do przechowywania obecnego eleementu : struktura danych po ktorej mozna iterowac)
        for( int element: array) {
            System.out.print(element+ ",");
        }
    }
}
