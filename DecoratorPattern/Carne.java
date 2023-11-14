
public class Carne extends Adicional {

    private double valor = 4.0d; 

    public Carne(Producto producto) {
        super(producto);
    }

    @Override
    public String toString() {
        return producto + "\nExtra carne" + valor;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio() + valor;
    }

}