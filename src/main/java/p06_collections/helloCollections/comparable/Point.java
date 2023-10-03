package p06_collections.helloCollections.comparable;

import java.util.Objects;

public class Point implements Comparable<Point>{        //interfejs sluzacy do porownywania (toString ma ja wbudowana)
    private int x, y;    //4,5

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    @Override
    public int compareTo(Point o) {
        if(x>0.x) return 1;
        else if(x==o.x) return 0;
    return -1;
    }
}
