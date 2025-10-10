package empleados;

public abstract class Empleados {
    protected String nombre;
    protected double salario;
    public Empleados(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    public abstract void mostrarDetalles();
    public abstract double calcularSalario();
}