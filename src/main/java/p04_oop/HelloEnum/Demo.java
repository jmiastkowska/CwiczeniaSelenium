package p04_oop.HelloEnum;

public class Demo {
    public static void main(String[] args) {
        Month jan = Month.APR;
        int daysInJanuary = jan.daysCount();
        String valueFromUser= "FEB";
        Month feb = Month.valueOf(valueFromUser);

        Month mar = Month.valueOf("MAR");
    }
}
