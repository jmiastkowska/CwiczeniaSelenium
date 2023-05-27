package p01basic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalesmanHelper {
    public static int howMuchWillIBuy(double productCost, double customerMoney){
   /*
   100, 250 ->2
   100,90 ->0
    */
        if(productCost <= customerMoney){
            return (int) (customerMoney/productCost); //rzutowanie
        } else
    return 0;
}
    public static double howMuchChange(double amountToCharge, double amountGiven){
        if (amountGiven>= amountToCharge){
            return amountGiven - amountToCharge;
        }
        return 0;
    }
}
