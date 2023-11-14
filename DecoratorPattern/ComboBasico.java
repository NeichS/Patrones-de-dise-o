
public class ComboBasico implements Producto {


    public ComboBasico() {
    }

    public double getPrecio() {
        return 7d;
    }

    public String toString() {
        return "Combo Basico "  + getPrecio();
    }

}