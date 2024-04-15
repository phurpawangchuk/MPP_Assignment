package Assignment7.prob2;

public interface Polygon extends ClosedCurve{
    double[] getLengths();

    @Override
    default double computePerimeter(){
        double perimeter = 0.0;

        for(double side: getLengths()){
            perimeter += side;
        }
        return perimeter;
    }
}
