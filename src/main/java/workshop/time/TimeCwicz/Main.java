package workshop.time.TimeCwicz;

public class Main {
    public static void main(String[] args) {
        Time time1 =new Time("13:25:59");
        System.out.println(time1);  //13:25:59
        time1.addMinutes(3);
        System.out.println(time1); //to nie pomylka -inutable
        Time time2 = time1.addMinutes(3);
        System.out.println(time2);  //13:28:59
        System.out.println(time2.addHours(12)); //01:28:59
    }
}
