package Assignment9;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class prob2 {
    public static void main(String[] args) {
        IntStream myIntStream = IntStream.of(5,6,2,3,4,9,11);
        IntSummaryStatistics result =  myIntStream.summaryStatistics();
        System.out.println("Max : "+result.getMax()+ ", Min : "+ result.getMin());
    }
}
