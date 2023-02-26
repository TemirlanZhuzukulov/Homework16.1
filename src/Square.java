public class Square extends  Shapes{
    public Square(double a, double b) {
        super(a, b);
    }

    @Override
    public float findArea() {
       double s= getA()*getA();
       return (float) s;
    }
}
