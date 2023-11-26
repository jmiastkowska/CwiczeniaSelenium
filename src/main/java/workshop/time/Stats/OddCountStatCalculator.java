package workshop.time.Stats;

public class OddCountStatCalculator implements StatCalculator{

    @Override
    public Statistic calculate(int[] numbers){
       int count = 0;
        for( int number : numbers){
            if(number%2!=0){
                count++;
            }
    }
        return new Statistic("odd_count", (double) count);
}
}
