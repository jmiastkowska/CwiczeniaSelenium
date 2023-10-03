package p06_collections.helloCollections.comparable;

import java.util.Comparator;

public class PointHighAreTheGreatestComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        return o1.getY() - o2.getX();
    }
}
