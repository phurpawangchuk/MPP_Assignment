package Assignment8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProbC {
    enum SORT_METHOD {
        TITLE,
        PRICE
    };

	public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("Shoe", 35.5, 2010),
                new Product("Pen", 25.5, 2024),
                new Product("Pen", 5.5, 2010),
                new Product("Apple", 2.5, 2010),
                new Product("Cloth", 15.5, 2010)
                );

        //Part c: Sort using only one sort method
        sortList(productList, SORT_METHOD.TITLE);
        System.out.println(productList);

    }

    private static void sortList(List<Product> productList, SORT_METHOD method) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2){
               if(method == SORT_METHOD.TITLE){
                   return p1.title.compareTo(p2.title);
               }else{
                   return Double.compare(p1.getPrice(), p2.getPrice());
//
//                   if(p1.price > p2.price) return 1;
//                   else if(p1.price < p2.price) return -1;
//                   else return 0;
               }
            }
        }

        Collections.sort(productList, new ProductComparator());
    }
}