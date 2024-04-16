package Assignment8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProbA {
	public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Shoe", 35.5, 2010),
                new Product("Pen", 25.5, 2024),
                new Product("Pen", 5.5, 2010),
                new Product("Apple", 2.5, 2010),
                new Product("Cloth", 15.5, 2010)
                );
        Collections.sort(productList, new CompareByPrice());
        System.out.println(productList);
    }
}