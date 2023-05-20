package p01basic;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SalesmanHelperTest {

   @Test
    public void howMuchWillIBuyWhenCustomerHasTwiceAsMuchMoney(){
      int result =  SalesmanHelper.howMuchWillIBuy(100,250);
      int expected = 2;
      assertEquals(expected,result);

    }

    @Test
    public void howMuchWillIBuyWhenCustomerHasNoMoney(){
        int result =  SalesmanHelper.howMuchWillIBuy(100,10);
        int expected = 0;
        assertEquals(expected,result);

    }
}