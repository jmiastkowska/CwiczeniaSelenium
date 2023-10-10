package p05_streams.model.task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
public class StreamExercisesProducts {

    public static final List<Product> PRODUCTS = createProducts();

    public static void main(String[] args) {
        System.out.println("====wszystkie produkty=====");
        printProducts(PRODUCTS);


        //1. wypisz wszystkiezerwone ubrania
        System.out.println("===zad1 ====");
        PRODUCTS.stream()
                .filter(p -> p.getColor().equals(ProductColor.RED))
                .forEach(p -> System.out.println(p));


        //2. przygotuj liste ubran wylacznie dla mezczyzn
        System.out.println("===zad2 ====");
        List<Product> maleProducts = PRODUCTS.stream()
                .filter(p -> p.getType() == ProductType.MALE)
                .collect(Collectors.toList());
        System.out.println(maleProducts);

        //3. przygotuj liste ubran dla kobiet i unisex
        System.out.println("===zad3 ====");
        List<Product> femaleUnisexProducts = PRODUCTS.stream()
                .filter(p -> p.getType() == ProductType.FEMALE || p.getType() == ProductType.UNISEX)
                .collect(Collectors.toList());
        System.out.println(femaleUnisexProducts);


        //4. czy istnieje jakiekolwiek ubranie czerwone
        System.out.println("===zad4 ====");
        boolean anyProductsRed = PRODUCTS.stream()
                .anyMatch(p -> p.getColor().equals(ProductColor.RED));
        System.out.println(anyProductsRed);
    }
}

















//     private static List<Product> createProducts() {
 //           return Arrays.asList(
  //                  new Product("koszulka", "39,99",ProductType.FEMALE, (1, 5, 3, 0)))

    //    }

/*
        private static Map<ProductSize, Integer> createStock(int sStock, int mStock,int lStock,int xlStock){
            Map<ProductSize, Integer> stock = new HashMap<>();
            if(sStock >0){
                stock.put(ProductSize.S, sStock);
            }
             if(mStock >0){
            stock.put(ProductSize.M, sStock);
            }
            if(lStock >0){
                stock.put(ProductSize.L, sStock);
            }
            if(xlStock >0){
                stock.put(ProductSize.XL, sStock);
            }
            return stock;

        }




    }

    private static void printProducts(Product product) {
        System.out.println(product);
    }


}
*/