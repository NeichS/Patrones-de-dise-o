
public class Compra {
    private EstadoCompra state;

    public Compra(EstadoCompra state) {
        this.state = state;
    }


    public void setState(EstadoCompra state ) {
        this.state = state;
    }

    public String checkState() {
        if (state instanceof EstadoInicial) { 
            return "Compra en estado inicial";
        } else if (state instanceof VerificarPago) {
            return "Compra en Verificar pago";
        } else if (state instanceof VerificarStock) {
            return "Compra en verificar stock"; 
        } else {
            return "Compra enviada!!";
        }
    }
}