package workshop.time.Stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20};
        StatCalculator[] calculators = {
                new AvgStatCalculator(),
                new MinStatCalculator(),
                new CountStatCalculator()
        };
        Statistic[] stats = calculateStats(numbers, calculators);
        System.out.println(Arrays.toString(stats));  //avg:12.5 odd count:2
    }

    public static Statistic[] calculateStats(int[] numbers, StatCalculator[], calculators){
        Statistic[] stats = new Statistic[calculators.lenght];
        for( int i= 0; i < stats.length; i++){
            stats[i] = calculators[i].calculate(numbers);
        }
        return stats;
    }




}
