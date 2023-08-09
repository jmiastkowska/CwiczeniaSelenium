package p04_oop;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode

public class PointLombok {
    private double x,y;  //wartoscidomyslne 0,0

    private int quarter;

    public PointLombok(double someX, double someY){
        x= someX;
        y= someY;
        quarter = (int) (Math.random()*4+1);
    }

    public PointLombok() {

    }

    public double distanceFrom(PointLombok otherPoint){
        return Math.sqrt(
                Math.pow(x-otherPoint.x,2) + Math.pow(y-otherPoint.y,2)
        );

    }



}
