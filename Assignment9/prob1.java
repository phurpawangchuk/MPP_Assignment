package Assignment9;

import java.util.stream.Stream;

public class prob1 {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("Bill", "Thomas","Mary");
        str.forEach(System.out::println);
    }
}
