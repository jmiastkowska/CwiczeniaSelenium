package workshop.time.Stats;

public class CountStatCalculator implements StatCalculator {

    @Override
    public Statistic calculate(int[] numbers){
            return new Statistic("count", Double.valueOf(numbers.length));
        }
    }
