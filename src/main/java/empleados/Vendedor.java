package empleados;

public class Vendedor extends Empleados{
    protected int numVentas;
    public Vendedor(String nombre, int numVentas, double salario){
      super(nombre, salario);
      this.numVentas = numVentas;

    }
    @Override
    public double calcularSalario() {
        double salarioFinal = salario;
        if(numVentas >= 5){
            salarioFinal += 1000;
            return salarioFinal;
        }
        return salarioFinal;
    }
    @Override
    public void mostrarDetalles() {
        System.out.printf("Nombre: %-10s | Numero de Ventas: %d |Salario: $%.2f%n",
                nombre,numVentas, calcularSalario());
    }
    public static void main(String[] args) {
        var veden = new Vendedor("Juan", 8, 770);
        veden.mostrarDetalles();
    }
}