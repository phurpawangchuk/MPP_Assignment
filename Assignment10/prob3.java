package Assignment10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bob","Joe","Tom");
        boolean result = prob3.contains1(list, "Tom");
        System.out.println(result);

        List<Integer> list1 = Arrays.asList(1,3,5,6,7,8);
        boolean result1 = prob3.contains1(list1, 5);
        System.out.println(result1);

        List<LocalDate> list3 = new ArrayList<>(Arrays.asList(
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(5),
                LocalDate.now(),
                LocalDate.now().plusDays(2),
                LocalDate.now().plusDays(4)
        ));
        boolean result3 = prob3.contains1(list3, LocalDate.now());
        System.out.println(result3);

        List<Employee> list4 = new ArrayList<>(Arrays.asList(
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Annor")
        ));
        boolean result4 = prob3.contains1(list4, new Employee("Bob"));
        System.out.println(result4);

    }
    public static <T> boolean contains1(List<T> list, T s){
        for(T x: list) {
            if (x == null && s == null) return true;
            if (s == null || x == null) continue;
            if (x.equals(s)) return true;
        }
        return false;
        }
    }
