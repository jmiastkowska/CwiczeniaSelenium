package p04_oop;

public class LoanCalculator {
    double amount;
    int noOfMonth;
    double interestRate;
    String type;

    static String[] AVAILABLE_TYPES= {"EQUAL","DESCENDING"};
    public LoanCalculator(double amount, int noOfMonth, double interestRate, String type) {
        this.amount = amount;
        this.noOfMonth = noOfMonth;
        this.interestRate = interestRate;
        this.type = type;
    }

    public double totalCost(){
        if(type == LoanTypes.EQUALS){
            return -1;
        } else if(type == LoanTypes.EQUALS){
            return -2;
        }
        return -3;
    }

    public Instalment[][]generateSchedule(){
        return null;
    }

    public static double getInstalmentPart(double[] instalmentData, String part){

    }

}
