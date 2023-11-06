package p05_streams.model.task;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExercisesProducts {

    public static final List<Product> PRODUCTS = createProducts();

    public static void main(String[] args) {
        System.out.println("====wszystkie produkty=====");
        printProducts(PRODUCTS);


        //1. wypisz wszystkie czerwone ubrania
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


        //5. Czy istnieje jakiekolwiek ubranie z pustym stanem rozmiaru XL?
        System.out.println("===zad 5 ====");
        boolean productsWithNoXLExist = PRODUCTS.stream()
                .anyMatch(p -> p.getStock().get(ProductSize.XL) == null || p.getStock().get(ProductSize.XL)==0);
        System.out.println(productsWithNoXLExist);

        //7. wypisz wszystkie ubrania, ktore maja przynajmniej 1 szt kazdego rozmiaru
        System.out.println("===zad 7 ====");
        PRODUCTS.stream()
                .filter(p -> hasAnyStockFromAllSizes(p))
                .forEach(System.out::println);

        //9. wypisz wszystkie ubrania w postaci spodnie, 50zł (S,L) (w nawiasach wszystkie dostepne rozmiary)
        System.out.println("===zad 9 ====");
        PRODUCTS.stream()
              .map(p -> {
                  StringBuilder sb = new StringBuilder();
                  return sb.append(p.getName())
                          .append(", ")
                          .append(p.getPrice())
                          .append("zl (")
                          .append(getAvaibleSizes(p).toString())
                          .append(")")
                          .toString();
              })
                .forEach(System.out::println);

    }

    private static void printProducts(List<Product> products) {
    }










    private static boolean hasAnyStockFromAllSizes(Product product){
    return product.getStock().get(ProductSize.S) != null
            && product.getStock().get(ProductSize.M) != null
            && product.getStock().get(ProductSize.XL) != null
            && product.getStock().get(ProductSize.L) != null;
    }


    private static List<ProductSize> getAvaibleSizes (Product p) {
       return p.getStock().keySet().stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

}






     private static List<Product> createProducts() {
            return Arrays.asList(
         new Product(ProductColor.BLUE,"koszulka", "39,99",ProductType.FEMALE, (1, 5, 3, 0)),
         new Product(ProductColor.BLUE,"koszulka", "39,99",ProductType.MALE, (1, 1, 1, 2)),
         new Product(ProductColor.RED,"koszulka", "50",ProductType.MALE, (4, 1, 31, 1)),
         new Product(ProductColor.YELLOW,"sukienka", "49,99",ProductType.FEMALE, (5, 1, 3, 1)),
         new Product(ProductColor.BLACK,"spodnie", "23,00",ProductType.UNISEX, (1, 5, 3, 1)),
         new Product(ProductColor.BLUE,"koszulka", "80,00",ProductType.UNISEX, (1, 5, 3, 0)),
         new Product(ProductColor.RED,"sukienka", "69,99",ProductType.FEMALE, (1, 5, 3, 0)))
      }


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




}
