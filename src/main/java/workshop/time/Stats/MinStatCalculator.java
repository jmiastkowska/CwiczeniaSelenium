package workshop.time.Stats;

public class MinStatCalculator implements StatCalculator {

    @Override
    public Statistic calculate(int[] numbers){
        double min = numbers[0];
        for( int number : numbers){
            if(number<min){
            min = number;
        }
        return new Statistic("min", min);
    }
}
