package p04_oop;

import java.util.Arrays;

public class LoanCalculator {
    double amount;
    int noOfMonth;
    double interestRate;
    LoanTypes type;
    double capitalPartAggregator = 0;
    double currentInterestPart = 0;

    static String[] AVAILABLE_TYPES= {"EQUAL","DESCENDING"};
    public LoanCalculator(double amount, int noOfMonth, double interestRate, LoanTypes type) {
        this.amount = amount;
        this.noOfMonth = noOfMonth;
        this.interestRate = interestRate;
        this.type = type;
    }

    public double totalCost(LoanCalculator loanCalculator){
        if(loanCalculator.type == LoanTypes.EQUALS){

            return loanInstalment() * loanCalculator.noOfMonth;
        } else if(loanCalculator.type == LoanTypes.DESCENDING){
            return -2;
        }
        return -3;
    }

    public double moneyRemainToPay(LoanCalculator loanCalculator, int monthNum){
        return totalCost(loanCalculator) - (monthNum) * loanInstalment();
    }



    public Instalment[]generateSchedule(){
        Instalment[] outcome =new Instalment[noOfMonth];
        int instalmentNo;
        double remainToPay, interestPart, capitalPart;
        for(int i=0; i<noOfMonth; i++) {
            instalmentNo = i + 1;
            remainToPay = moneyRemainToPay(this, i);
            interestPart = loanInstalmentInterestPart();
            capitalPart = loanInstalmentCapitalPart();
            outcome[i]= new Instalment(instalmentNo, remainToPay, interestPart, capitalPart);
        }
        return outcome;
    }

    public double loanInstalment(){
        double a = this.amount;
        double b = this.interestRate;
        double n = this.noOfMonth;
        return (a*(b/12)*Math.pow(1+(b/12),n))/(Math.pow(1+(b/12),n)-1);
    }

    private double loanInstalmentCapitalPart() {
        double result = loanInstalment() - currentInterestPart;
        capitalPartAggregator += result;
        return result;

    }

    private double loanInstalmentInterestPart() {
        double result = (amount - capitalPartAggregator) * interestRate/12;
        currentInterestPart = result;
        return result;
    }

    public static void getInstalmentPart(double[] instalmentData, String part){
        }

    public static void main(String[] args) {
        LoanCalculator myloan = new LoanCalculator(200000.00, 200, 3600, LoanTypes.EQUALS);
        System.out.println(Arrays.deepToString(myloan.generateSchedule()));
    }
}
