package empleados;

public class Gerente extends Empleados{
    protected String departamento;
    public Gerente(String nombre, String departamento, double salario){
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public double calcularSalario() {
        return salario;
    }
    @Override
    public void mostrarDetalles() {
        System.out.printf("Nombre: %s | Departamento: %s | Salario: %.2f", nombre, departamento, salario);
    }
}
