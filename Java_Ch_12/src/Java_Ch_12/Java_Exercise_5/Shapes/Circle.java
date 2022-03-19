package Java_Ch_12.Java_Exercise_5.Shapes;

public class Circle implements TwoDimensional{
    private double r;
    private final double nil = 0;

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getNil() {
        return nil;
    }

    @Override
    public double area(double r,double nil) {
        return 3.14*r*r;
    }

    @Override
    public double perimeter(double r, double nil) {
        return 2*3.14*r;
    }
}
