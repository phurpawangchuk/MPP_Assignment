package Assignment8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProbB {

	public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Shoe", 35.5, 2010),
                new Product("Pen", 25.5, 2024),
                new Product("Pen", 5.5, 2010),
                new Product("Apple", 2.5, 2010),
                new Product("Cloth", 15.5, 2010)
                );

        //Part b: sort by title and prints
        Collections.sort(productList, new CompareByTitle());
        System.out.println(productList);
    }
}