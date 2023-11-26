package workshop.time.Stats;

public class NegativeCountStatCalculator implements StatCalculator{

    @Override
    public Statistic calculate(int[] numbers){
       int count = 0;
        for( int number : numbers){
           if(number<0){
                count++;
            }
    }
        return new Statistic("even_count", (double) count);
}
}
