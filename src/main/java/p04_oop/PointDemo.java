package p04_oop;

import java.awt.*;

public class PointDemo {
    public static void main(String[] args){
        point p1 = new Point();  //konstruktor bezparamterowy
        System.out.println(p1.getX() + " " + p1.getY());

        //przypisywanie wartosci
       // p1.setX(3);
       // p1.setY(4);
       // System.out.println(p1.getX() + " " + p1.getY());

        Point punktAsi = new Point(3,4);
        System.out.println(punktAsi.getX() + " " + punktAsi.getY());


        double distance = punktAsi.distanceFrom(p1);
        System.out.println(distance);
    }
}
