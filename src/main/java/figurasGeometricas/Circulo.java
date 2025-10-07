package figurasGeometricas;

public class Circulo extends Figuras{
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
        System.out.printf("El area es: %.2f:", area);
    }
    public static void main(String[] args) {
        var circulo = new Circulo(-13.3);
        circulo.calculaArea();
        circulo.mostrarArea();
    }
}