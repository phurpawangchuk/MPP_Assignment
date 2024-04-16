package Assignment8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProbD {
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
        //Part d: Sort using lambda
        sortUsingLambda(productList, SORT_METHOD.TITLE);
        System.out.println(productList);
    }

    private static void sortUsingLambda(List<Product> productList, SORT_METHOD method) {
        Collections.sort(productList, (p1, p2) -> {
            if(method == SORT_METHOD.TITLE){
                int compareResult =  p1.getTitle().compareTo(p2.getTitle());
                //If title is same
                if(compareResult == 0){
                    if(p1.model > p2.model) return 1;
                    else if(p1.model < p2.model) return -1;
                    else return 0;
                }else{
                    return compareResult;
                }
            }else{
                if(p1.price > p2.price) return 1;
                else if(p1.price < p2.price) return -1;
                else return 0;
            }
        });
    }
}