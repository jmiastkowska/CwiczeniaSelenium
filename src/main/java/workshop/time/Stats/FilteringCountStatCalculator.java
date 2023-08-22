package workshop.time.Stats;

public class FilteringCountStatCalculator implements StatCalculator{

    public FilteringCountStatCalculator(IntTester tester,String statName) {
        this.tester = tester;
        this.statName = statName;
    }

    private IntTester tester;
    private String statName;

    @Override
    public Statistic calculate(int[] numbers){
       int count = 0;
        for( int number : numbers){
            if(tester.doYouLike(number) ){
                count++;
            }
    }
        return new Statistic(statName, (double) count);
}
}
