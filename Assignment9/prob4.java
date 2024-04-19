package Assignment9;

import java.util.stream.Stream;

public class prob4 {
    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num){
        Stream.iterate(1, i->i+1)
                .map(n->n*n)
                .limit(num)
                .forEach(System.out::println);
    }
}
