package workshop.time.zadanieDomowe;

import p06_collections.helloCollections.HashCodeExample.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Product> {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product productToAdd) {
       addProduct(productToAdd);
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

    public void getProductsList() {
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
