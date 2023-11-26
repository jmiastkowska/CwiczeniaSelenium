package p04_oop;



public class PointDemo {
    public static void main(String[] args){
        Point p1 = new Point();  //konstruktor bezparamterowy
        System.out.println(p1.getX() + " " + p1.getY());

        //przypisywanie wartosci
       // p1.setX(3);
       // p1.setY(4);
       // System.out.println(p1.getX() + " " + p1.getY());

        Point punktAsi = new Point(3,4);
        System.out.println(punktAsi.getX() + " " + punktAsi.getY());


        double distance1 = punktAsi.distanceFrom(p1);
        System.out.println(distance1);

        double distance2 = PointUtils.distance(punktAsi,p1);
        System.out.println(distance2);

        p1.equals(punktAsi);
        System.out.println(punktAsi);
    }
}
