package Assignment5.prob3;

public class Item {
    private String item;
    private double price;

    Item(String it, double p){
        item = it;
        price = p;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}
