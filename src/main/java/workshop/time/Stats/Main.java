package workshop.time.Stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20};
        IntTester oddIntTester = n-> n%2!=0;
        StatCalculator[] calculators = {
                new AvgStatCalculator(),
                new MinStatCalculator(),
                new CountStatCalculator(),
                new FilteringCountStatCalculator(oddIntTester, "odd_count"),
        new FilteringCountStatCalculator(n-> n%2!=0, "odd_count"),
        new FilteringCountStatCalculator(n -> n%2 == 0, "even_count")
        };
        Statistic[] stats = calculateStats(numbers, calculators);
        System.out.println(Arrays.toString(stats));  //avg:12.5 odd count:2
    }

    public static Statistic[] calculateStats(int[] numbers, StatCalculator[] calculators){
        Statistic[] stats = new Statistic[calculators.length];
        for( int i= 0; i < stats.length; i++){
            stats[i] = calculators[i].calculate(numbers);
        }
        return stats;
    }




}
