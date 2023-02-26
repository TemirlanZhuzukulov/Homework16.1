public class Circle extends  Shapes{
   private int radios;

    public Circle(double a, double b, int radios) {
        super(a, b);
        this.radios = radios;
    }

    public int getRadios() {
        return radios;
    }

    public void setRadios(int radios) {
        this.radios = radios;
    }

    @Override
    public float findArea() {
        double s = Math.PI*Math.pow(radios,radios);
        return (float) s;
    }
}
