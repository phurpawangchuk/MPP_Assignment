package Assignment9.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Trader> traders = Arrays.asList(raoul,mario,alan,brian);

		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> transactions1 = transactions.stream()
                .filter(t -> t.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(transactions1);

        
        // Query 2: What are all the unique cities where the traders work?
        List<String> result =  traders.stream()
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> result1 = traders.stream()
                .filter(c ->c.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(result1);

        // Query 4: Return a string of all traders names sorted alphabetically.
        List<String> traderNames = traders.stream()
                .map(t->t.getName())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(traderNames);

        // Query 5: Are there any trader based in Milan?
        Long result2 = traders.stream()
                .filter(c ->c.getCity().equals("Milan"))
                .count();
        System.out.println(result2);


        System.out.println("+++======================");
        BiConsumer<Trader, String> update = (t, c) -> t.setCity(c);
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        traders.stream()
                .filter(t ->t.getCity().equals("Milan"))
                .map(t -> update)
                .forEach(System.out::println);
        update.accept(new Trader("a","a"), "Cambridge");
        System.out.println(traders);

        System.out.println("+++======================");

        // Query 7: What's the highest value in all the transactions?
        Optional<Integer> maxTransaction = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(v ->v.getValue());
        System.out.println(maxTransaction.orElse(0));

    }
}
