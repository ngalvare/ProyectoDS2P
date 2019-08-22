
package modelotecnoimport.strategy;


import java.util.Currency;

/**
 *
 * @author ANA
 */
public class VisaStrategy implements PagoStrategy{
    
    private final String nombre;
    private final String numeroTarjeta;
    private final String cvv;
    private final String fechaExpiracion;
    private final Currency monto;

    public VisaStrategy(String nombre, String numeroTarjeta, String cvv, String fechaExpiracion, Currency monto) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
        this.monto = monto;
    }

    @Override
    public void pagar(Currency monto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
