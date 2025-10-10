package errores;

public abstract class ClaseA {
    public int atributo1;
    public double atributo2;
    public ClaseA(int atributo1, double atributo2){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
    public void mostrarDetalles(){
        System.out.printf("Atributo1 = %d | Atributo2 = %f \n", atributo1, atributo2);
    }
    /*public static void main(String[] args) {
        var clase = new ClaseA(1, 1.2);
        clase.mostrarDetalles();
    }*/
}