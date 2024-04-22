package Assignment10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prob2 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(8, 9, 22, 11, 3, 3, 3, 15));
        int result = findSecondSmallest(ints);
        System.out.println("Integers List: "+ints);
        System.out.println("Integer Second smallest: " + result);

        List<String> str = new ArrayList<>(Arrays.asList("abc", "box","baa","qas", "cppl"));
        String result1 = findSecondSmallest(str);
        System.out.println("String List: "+str);
        System.out.println("String Second smallest: " + result1);

        List<LocalDate> dates = new ArrayList<>(Arrays.asList(
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(5),
                LocalDate.now().plusDays(7),
                LocalDate.now().plusDays(2),
                LocalDate.now().plusDays(4)
        ));
        LocalDate result2 = findSecondSmallest(dates);
        System.out.println("Date List: "+dates);
        System.out.println("Date Second smallest: " + result2);
    }

    public static <T> T findSecondSmallest(List<T> list) {

        if(list.size() == 0 || list.size() == 1) return null;
        if((int)list.stream().distinct().count() == 1) return null;

        List<T> t = list.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        return t.get(1);
    }

}
