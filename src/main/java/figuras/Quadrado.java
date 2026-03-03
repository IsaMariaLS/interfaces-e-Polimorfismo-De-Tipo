package figuras;

public class Quadrado implements FiguraGeometrica2D{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String tipoFigura() {
        return "Quadrado";
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(this.area(), o.area());
    }
}
