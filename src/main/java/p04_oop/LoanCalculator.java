package p04_oop;

public class LoanCalculator {
    double amount;
    int noOfMonth;
    double interestRate;
    String type;

    public LoanCalculator(double amount, int noOfMonth, double interestRate, String type) {
        this.amount = amount;
        this.noOfMonth = noOfMonth;
        this.interestRate = interestRate;
        this.type = type;
    }
}
