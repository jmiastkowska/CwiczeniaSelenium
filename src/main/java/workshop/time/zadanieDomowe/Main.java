package workshop.time.zadanieDomowe;

public class Main {
    public static void main(String[] args) {

        Product cheese = new Product("cheese", 10);

        Product shoe = new Product("shoe", 15);



        Cart cart = new Cart();

        cart.addProduct(cheese, 1); // By default adds 1 product

        cart.addProduct(shoe, 3); // You can add a product many times to the basket



       System.out.println("Total sum is:" +cart.getTotalSum()); // 1x10 + 3x15 = 10 + 45 = 55



        System.out.println(cart.getProductsList()); // zwraca string "cheese ::: 1 unit ::: 10; shoe ::: 3 units ::: 45"

/*



        cart.getTotalSum() // 45


*/
      //  cart.deleteProduct("cheese");
       // cart.deleteAllProducts();

/*
        cart.getTotalSum() // 0

        cart.getProductsList() // zwraca string "There are no items in your cart"

    }

*/




}}