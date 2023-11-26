package p04_oop.HelloEnum;

public enum Month {
    JAN(31,1),
    FEB(28,2),
    MAR(31,3),
    APR(30,4),
    NOV(30,11),
    DEC(31,12);

    private int days,no;
    Month(int days, int no){
        this.days = days;
        this.no = no;
    }

    public int daysCount(){
        return days;
    }
}
