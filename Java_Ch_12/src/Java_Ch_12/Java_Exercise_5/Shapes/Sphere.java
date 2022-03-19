package Java_Ch_12.Java_Exercise_5.Shapes;

public class Sphere implements ThreeDimensional{
    private double r;
    private final double n1 = 0;
    private final double n2 = 0;

    public double getN1() {
        return n1;
    }
    public double getN2() {
        return n2;
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double surfaceArea(double r, double n1 , double n2) {
        return 4*3.14*r*r;
    }

    @Override
    public double volume(double r, double n1 , double n2) {
        return (1.33)*(3.14*r*r*r);
    }
}
