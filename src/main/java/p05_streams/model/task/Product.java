package p05_streams.model.task;

import java.util.Map;

public class Product {
    private ProductType type;
    private final String name;
    private final double price;
    private final ProductColor color;
    private final Map<ProductSize, Integer> stock;

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }

    public Product(String name, double price, ProductColor color, Map<ProductSize, Integer> stock) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.type = type;
        this.stock = stock;
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductColor getColor() {
        return color;
    }

    public Map<ProductSize, Integer> getStock() {
        return stock;
    }
}
