package workshop.time.zadanieDomowe;

import java.util.*;
import java.util.stream.Collectors;

public class Cart {
    private Map<Product, Integer> products;

    public Cart() {
        products = new HashMap<>();
    }

    public void addProduct(Product productToAdd) {
            addProduct(productToAdd, 1);
        }

    public void addProduct(Product productToAdd, int amount) {{
        products.put(productToAdd, products.getOrDefault(productToAdd, 0) + amount);
    }
        public double getTotalSum(){
            double totalSum = 0;
            for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                totalSum += product.getPrice() * quantity;
            }
            return totalSum;
        }

    /* public List<String> getProductsList() {
        return products.stream()
                .map(product -> product.getName() + " :::1 unit::: " + product.getPrice()).collect(Collectors.toList());

    }
*/
    public void deleteProduct(String Object product;
        product) {
        Product productToRemove = null;
        for (Product product : products.keySet()) {
            if (product.getName().equals(product)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
        }
    }

    public void deleteAllProducts() {
        products.clear();
    }

    
}
