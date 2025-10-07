package figurasGeometricas;

public class Circulo extends Figuras{
    private double area;
    public Circulo(double radio){
        super(radio);
    }
    @Override
    public double calculaArea() {
      area = (Math.pow(this.radio, 2) * Math.PI);
        return area;
    }
    @Override
    public void mostrarArea() {
        System.out.println("El area es: " + area);
    }
    public static void main(String[] args) {
        var sa = new Circulo(13.3);
        sa.calculaArea();
        sa.mostrarArea();
    }
}
