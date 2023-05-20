package p01basic;

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
        // TODO: 20.05.2023 zaimplementujmetode  
        return 0;
    }
}
