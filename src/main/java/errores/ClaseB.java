package errores;

public class ClaseB extends ClaseA{
    public ClaseB(int atributo1, double atributo2){
        super(atributo1, atributo2);
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Esos son los 2 atributos");
    }
    public static void main(String[] args) {
        var clase = new ClaseB(1, 1.1);
        clase.mostrarDetalles();
    }
}