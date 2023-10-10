package workshop.time.zadanieDomowe;

public class Product {

    private final String name;
    private final double price;


    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public java.lang.String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", String=" + String +
                '}';
    /*
    Utwórz klasę Product z własnościami name, price


    Utwórz klasę Cart. Będzie ona odpowiedzialna za produkty w sklepie online. Będzie zbierać produkty, i wyświetlać ich sumę.

    Kod testwy w klasie main powinien działać mniej wiecj tak:



    Product cheese = new Product("cheese", 10);

    Product shoe = new Product("shoe", 15);



    Cart cart = new Cart();

cart.addProduct(cheese); // By default adds 1 product

cart.addProduct(shoe, 3); // You can add a product many times to the basket



cart.getTotalSum() // 1x10 + 3x15 = 10 + 45 = 55



        cart.getProductsList() // zwraca string "cheese ::: 1 unit ::: 10; shoe ::: 3 units ::: 45"



        cart.deleteProduct("cheese")

        cart.getTotalSum() // 45



        cart.deleteAllProducts()

        cart.getTotalSum() // 0

        cart.getProductsList() // zwraca string "There are no items in your cart"

        */











}
