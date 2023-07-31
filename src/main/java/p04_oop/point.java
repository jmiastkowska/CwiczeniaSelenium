package p04_oop;

import javax.swing.text.MutableAttributeSet;
import java.awt.*;

public class point {
    private double x,y;  //wartoscidomyslne 0,0

    public Point(int someX,int someY){
        x= someX;
        y= someY;
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
}
