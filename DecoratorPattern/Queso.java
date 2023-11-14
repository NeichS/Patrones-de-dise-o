
public class Queso extends Adicional {

    private double valor = 2.0d;
    
    Queso(Producto producto) {
        super(producto);
    }

    public String toString() {
        return producto + "\nExtra queso " + valor;
    }

    @Override
    public double getPrecio() {
        return  producto.getPrecio() + valor;
    }

}