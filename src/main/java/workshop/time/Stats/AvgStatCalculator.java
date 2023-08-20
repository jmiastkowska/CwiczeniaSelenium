package workshop.time.Stats;

public class AvgStatCalculator implements StatCalculator {
    @Override
    public Statistic calculate(int[] numbers){
        double avg = 0;
        for( int number : numbers){
            avg=+number;
        }
        return new Statistic("avg", avg/numbers.length);
    }


}
