package p04_oop;



public class Point {
    private double x,y;  //wartoscidomyslne 0,0

    private int quarter;

    public Point(double someX, double someY){
        x= someX;
        y= someY;
        quarter = (int) (Math.random()*4+1);
    }

    public Point() {

    }

    public double distanceFrom(Point otherPoint){
        return Math.sqrt(
                Math.pow(x-otherPoint.x,2) + Math.pow(y-otherPoint.y,2)
        );

    }


    public double getX() {
        return x;
    }

    public void setX(double someValueofX){
        x=someValueofX;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj){
        if(obj== null) return false;
        if(getClass() == obj.getClass()){

        }
        x==obj.x && y==obj.y;

        return (this == obj);
    }
}
