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

    public void getTotalSum() {
    }

    public void getProductsList() {
    }

    public void deleteProduct(String cheese) {
    }

    public void deleteAllProducts() {
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
