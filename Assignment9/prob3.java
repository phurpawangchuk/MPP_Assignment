package Assignment9;

import java.util.Arrays;
import java.util.List;

public class prob3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Abcd","Nabs","Thanks","fine","that");
        int result = countWords(words, 'b','i',4);
        System.out.println(result);
    }

    public static int countWords(List<String> words, char c, char d, int len){
        return (int)words.stream()
                .filter(l -> l.length() == len)
                .filter(ch -> ch.contains(""+c))
                .filter(n -> !n.contains(""+d))
                .count();
    }
}
