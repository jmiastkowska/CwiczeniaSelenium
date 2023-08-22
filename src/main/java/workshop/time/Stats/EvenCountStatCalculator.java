package workshop.time.Stats;

public class EvenCountStatCalculator implements StatCalculator{

    @Override
    public Statistic calculate(int[] numbers){
       int count = 0;
        for( int number : numbers){
            if(number % 2 ==0){
                count++;
            }
    }
        return new Statistic("even_count", (double) count);
}
}
