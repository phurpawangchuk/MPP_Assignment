package Assignment7.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format

        //Method 1: Lambda style
        list.forEach(s -> System.out.println(s.toUpperCase()));

        //Method 2: Using user defined consumer
        //        Consumer<String> myConsumer = new Consumer<String>() {
        //            @Override
        //            public void accept(String s) {
        //                System.out.println(s.toUpperCase());
        //            }
        //        };
        //        list.forEach(myConsumer);

        //Method 3: Using anonymous function
        //        list.forEach(new Consumer<String>() {
        //            @Override
        //            public void accept(String s) {
        //                System.out.println(s.toUpperCase());
        //            }
        //        });
	}
}