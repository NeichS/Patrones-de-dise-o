
public class Papa extends Adicional {

    private double valor = 3.0d;

    public Papa(Producto producto) {
        super(producto);
    }

    @Override
    public String toString() {
        return producto + "\nExtra Papas " + valor;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio() + valor;
    }

}