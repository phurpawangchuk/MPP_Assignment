package Assignment7.prob2;

public class Ellipse implements ClosedCurve{

    private double semiaxis;
    private double elateral;

    public Ellipse(double semiaxis, double elateral) {
        this.semiaxis = semiaxis;
        this.elateral = elateral;
    }

    public double getElateral() {
        return elateral;
    }

    public double getSemiaxis() {
        return semiaxis;
    }

    @Override
    public double computePerimeter() {
        return 4 * getElateral() * getSemiaxis();
    }
}
