package figurasGeometricas;

public class Rectangulo extends Figuras {
    public Rectangulo(double largo, double ancho){
        super(largo, ancho);
    }
    @Override
    public double calculaArea() {
        area = largo*ancho;
        return area;
    }
    @Override
    public void mostrarArea() {
        System.out.printf("El area del rectagulo: %.2f", area);
    }
    public static void main(String[] args) {
        var rectangulo = new Rectangulo(13,5);
        rectangulo.calculaArea();
        rectangulo.mostrarArea();
    }
}