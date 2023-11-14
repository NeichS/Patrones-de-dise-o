public class ComboEspecial implements Producto {

    public ComboEspecial() {
    }

    public double getPrecio() {
        return 10.0d;
    }

    public String toString() {
        return "Combo Especial " + getPrecio();
    }

}