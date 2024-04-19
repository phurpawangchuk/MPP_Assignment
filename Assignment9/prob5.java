package Assignment9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob5 {
    public static Stream<String> streamSection(Stream<String> streamList, int m, int n) {
    // Implement the code
        return streamList
                .skip(m)
                .limit(n-m+1)
                .collect(Collectors.toList()).stream();
    }

    public static void main(String[] args) {
    // Make three calls for the streamSection() method with different inputs
    // use nextStream() method to supply the Stream input as a first argument in
    // streamSection() method
        Stream<String> result = streamSection(nextStream(), 3,5);
        System.out.println(result.collect(Collectors.toList()));

        Stream<String> result1 = streamSection(nextStream(), 1,3);
        System.out.println(result1.collect(Collectors.toList()));

        Stream<String> result2 = streamSection(nextStream(), 0,4);
        System.out.println(result2.collect(Collectors.toList()));
    }

    //support method for the main method -- for testing
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
    }

}
