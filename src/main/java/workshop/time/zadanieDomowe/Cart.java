package workshop.time.zadanieDomowe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Cart implements Iterable<Product> {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product productToAdd) {
               products.add(productToAdd);
    }

    public void addProduct(Product productToAdd, int amount) {
        for (int i = 0; i < amount; i++) {
            products.add(productToAdd);
        }
    }
    public double getTotalSum() {
        double totalSum = 0;
        for (Product product : products) {
            totalSum += product.getPrice();
        }
        return totalSum;
    }

    public List<String> getProductsList() {
        return products.stream()
                .map(product -> product.getName() + " :::1 unit::: " + product.getPrice()).collect(Collectors.toList());

    }

    public void deleteProduct(String productName) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(productName)) {
                iterator.remove();
                break;
            }
        }
    }

    public void deleteAllProducts() {
        products.clear();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
