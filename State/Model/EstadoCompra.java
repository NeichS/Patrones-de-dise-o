
public interface EstadoCompra {

    void setNextState(); 
    void cancelOrder(); 
    void setInitialState();
    default void addProduct() {
        throw new UnsupportedOperationException("No puedes agregar productos en el estado actual");
    };
    default void paymentMethod() {
        throw new UnsupportedOperationException("Operacion {paymentMethod()} no valida en estado actual ");
    };
    
    
    default void checkPaymentMethod() {
        throw new UnsupportedOperationException("Operacion {checkPaymentMethod()} no valida en estado actual");
    }; 
    
    default void checkStock() {
        throw new UnsupportedOperationException("Operacion {checkStock()} no valida en estado actual");
    }; 



}