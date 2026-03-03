package figuras;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {
    List<FiguraGeometrica2D> figuras;

    public RepositorioDeFiguras2D(){
        this.figuras = new ArrayList<>();
    }

    public void adicionar(FiguraGeometrica2D f) {
        figuras.add(f);
    }

    public FiguraGeometrica2D remover(int posicao) {
        return figuras.remove(posicao);
    }

    public double getArea(int posicao) {
        return figuras.get(posicao).area();
    }

    public double getPerimetro(int posicao) {
        return figuras.get(posicao).perimetro();
    }

    public String getTipo(int posicao) {
        return figuras.get(posicao).tipoFigura();
    }

    public void ordenarPorArea() {
        Collections.sort(figuras);
    }
}

}
