package figurasGeometricas;

public abstract class Figuras {
    protected double radio;
    protected double largo;
    protected double ancho;
    protected double area;
    public Figuras(Double radio){
        this.radio = radio;
        if (radio < 0){
        throw new IllegalArgumentException("No puede tener radio negativo");
        }
    }
    public Figuras(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
        if (largo < 0 || ancho < 0){
            throw new IllegalArgumentException("No puede tener lados negativos");
        }
    }
   public abstract double calculaArea();
   public abstract void mostrarArea();
}