public class Main {
    public static void main(String[] args) {
        // Seleccionar un producto
        Producto producto = new ComboFamiliar();

        // Agregar porciones adicionales
        producto = new Tomate(producto);
        producto = new Papa(producto);
        producto = new Queso(producto);
        producto = new Queso(producto);



        // Imprimir el pedido y el valor total

        System.out.println(producto);
        System.out.println("Valor final: " + producto.getPrecio() );
            
    }
}
