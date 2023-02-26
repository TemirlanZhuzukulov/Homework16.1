public class Triangle extends Shapes{
    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public float findArea() {
        float s= (float) (0.5 *(getA()*getB()));
         return s;
    }
}
