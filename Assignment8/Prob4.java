package Assignment8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Prob4 {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "Kristy"};

        //Part 4a
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        //Imperative style
//        List<String> stringList = Arrays.asList(names);
//        System.out.println(stringList);

        //4b- Lambda
        Function<String[], List<String>> nameLists = arr -> Arrays.asList(arr);
        System.out.println(nameLists.apply(names));

        //4c: Method reference
        Function<String[], List<String>> nameList = Arrays::asList;
        System.out.println(nameList.apply(names));



    }
}
