package p06_collections.helloCollections.comparable;

import p06_collections.helloCollections.HashCodeExample.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0,100));
        points.add(new Point(11,3));
        points.add(new Point(1,1));
        points.add(new Point(1,2));
        points.add(new Point(10,2));

        System.out.println(points);
        Collections.sort(points);
        System.out.println(points);

        Collections.sort(points, new PointHighAreTheGreatestComparator());
        System.out.println(points);
    }
}
