package Java_Ch_12.Java_Exercise_5.Shapes;

public class Square implements TwoDimensional{
    private double s;
    private final double nil = 0;

    public double getS() {
        return s;
    }
    public void setS(double s) {
        this.s = s;
    }

    public double getNil() {
        return nil;
    }

    @Override
    public double area(double s,double nil) {
        return s*s;
    }

    @Override
    public double perimeter(double s, double nil) {
        return 4*s;
    }
}
