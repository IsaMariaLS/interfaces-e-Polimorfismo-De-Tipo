package figuras;

public class Circulo implements FiguraGeometrica2D{
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String tipoFigura() {
        return "Circulo";
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(this.area(), o.area());
    }

}
