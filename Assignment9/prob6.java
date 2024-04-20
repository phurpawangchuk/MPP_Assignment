package Assignment9;

import java.util.*;

public class prob6 {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(Set.of("A","B"));
        Set<String> set2 = new HashSet<>(Set.of("a","b"));
        Set<String> set3 = new HashSet<>(Set.of("1","2"));

        List<Set<String>> sets = List.of(set1, set2, set3);

        Set<String> result = union(sets);
        System.out.println(result);

//       [{“A”, “B”}, {“D”}, {“1”, “3”, “5”}]
//      [{“A”, “B”}, {“D”}, {“1”, “3”, “5”}] to the set
//      {“A”, “B”, “D”, “1”, “3”, “5”}.

    }
    public static Set<String> union(List<Set<String>> sets) {
        return sets.stream()
                .reduce(new HashSet<>(), (resultSet, currentSet) -> {
                    resultSet.addAll(currentSet);
                    return resultSet;
                });
    }
}
