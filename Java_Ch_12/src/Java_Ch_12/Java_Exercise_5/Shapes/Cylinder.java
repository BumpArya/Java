package Java_Ch_12.Java_Exercise_5.Shapes;

public class Cylinder implements ThreeDimensional{
    private double r;
    private double h;
    private final double n1 = 0;

    public double getN1() {
        return n1;
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double surfaceArea(double r, double h, double n1) {
        return ((2*3.14*r*h)+(2*3.14*r*r));
    }
    @Override
    public double volume(double r, double h, double n1) {
        return 3.14*r*r*h;
    }
}
