package Assignment8;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
//        if(p1.getPrice() > p2.getPrice()) return 1;
//        else if(p1.getPrice() < p2.getPrice()) return -1;
//        else return 0;
    }
}
