public class Tomate extends Adicional {
    
    private double valor = 1.0d;

    public Tomate(Producto producto) {
        super(producto);
    }

    @Override
    public String toString() {
        return  producto + "\nTomate " + valor;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio() + valor;
    }
}