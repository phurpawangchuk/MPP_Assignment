package Assignment9.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final QuaFunction<List<Employee>, Integer, Character, Character, String>
             FILTER_EMPLOYEE = (emp, sal,start, end) -> emp.stream()
                    .filter(n->n.getLastName().charAt(0)>=start && n.getLastName().charAt(0)<=end)
                    .filter(n -> n.getSalary() > sal)
                    .map(n -> n.getFullName())
                    .sorted()
                    .collect(Collectors.joining(", "));

    public static final TriFunction<List<Employee>, Character, Character, String>
            FILTERRED_EMPLOYEE = (emp, start, end) -> emp.stream()
                    .filter(n->n.getLastName().charAt(0)>=start && n.getLastName().charAt(0)<=end)
                    .filter(n -> n.getSalary() > 100000)
                    .map(n -> n.getFullName())
                    .sorted()
                    .collect(Collectors.joining(", "));
}
