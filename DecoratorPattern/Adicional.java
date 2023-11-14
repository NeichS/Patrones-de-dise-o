public abstract class Adicional implements Producto {
    protected Producto producto;

    public Adicional(Producto producto) {
        this.producto = producto;
    }

    @Override
    abstract public String toString();

    @Override
    abstract public double getPrecio();
}





