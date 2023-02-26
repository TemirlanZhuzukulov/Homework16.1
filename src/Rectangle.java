public class Rectangle extends Shapes{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public float findArea() {
       double s = getA()*getB();
       return (float) s;
    }
}
