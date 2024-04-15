package Assignment7.prob2;

public class EQTriangle implements Polygon {

    private double side;

    public EQTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double[] getLengths() {
        return new double[]{getSide(), getSide(), getSide()};
    }
}
