package figurasGeometricas;

public abstract class Figuras {
    protected double radio;
    protected double largo;
    protected double ancho;
    public Figuras(Double radio){
        this.radio = radio;
    }
    public Figuras(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
   public abstract double calculaArea();
   public abstract void mostrarArea();
}
