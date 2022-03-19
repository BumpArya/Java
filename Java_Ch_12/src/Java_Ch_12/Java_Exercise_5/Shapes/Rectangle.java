package Java_Ch_12.Java_Exercise_5.Shapes;

public class Rectangle implements TwoDimensional{

    private double l;
    private double b;

    public double getL() {
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area(double l , double b ) {
        return l*b ;
    }
    @Override
    public double perimeter(double l,double b ) {
        return 2*(l+b);
    }
}
