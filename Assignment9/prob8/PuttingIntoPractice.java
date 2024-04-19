package Assignment9.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	

        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> transactionsList = transactions.stream()
                .filter(t -> t.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(transactionsList);

        
        // Query 2: What are all the unique cities where the traders work?
        List<String> uniqueCityies =  transactions.stream()
                .map(t ->t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueCityies);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> tradersFromCambridge =
                 transactions.stream()
                .filter(t ->t.getTrader().getCity().equals("Cambridge"))
                .map(t ->t.getTrader())
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(tradersFromCambridge);

        // Query 4: Return a string of all traders names sorted alphabetically.
        List<String> traderNamesSorted = transactions.stream()
                .map(t->t.getTrader().getName())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(traderNamesSorted);

        // Query 5: Are there any trader based in Milan?
        Long traderInMilan = transactions.stream()
                .filter(c ->c.getTrader().getCity().equals("Milan"))
                .count();
        System.out.println(traderInMilan);


        System.out.println("+++======================");
        BiConsumer<Transaction, String> update = (t, c) -> t.getTrader().setCity(c);
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter(t ->t.getTrader().getCity().equals("Milan"))
                //.map(t -> t.getTrader().setCity("Cambridge"))
                .forEach(System.out::println);
       // update.accept(new Transaction("a","a"), "Cambridge");


        // Query 7: What's the highest value in all the transactions?
        Optional<Integer> higestTransaction = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(val ->val.getValue());
        System.out.println(higestTransaction.orElse(0));

    }
}
