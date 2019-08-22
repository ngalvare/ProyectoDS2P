
package Modeltecnoimport;

import java.util.Currency;

/**
 *
 * @author ANA
 */
public class VisaStrategy implements PagoStrategy{
    
    private String nombre;
    private String numeroTarjeta;
    private String cvv;
    private String fechaExpiracion;
    private Currency monto;

    public VisaStrategy(String nombre, String numeroTarjeta, String cvv, String fechaExpiracion, Currency monto) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
        this.monto = monto;
    }
    
    @Override
    public void pagar(Currency monto) {
       
    }
    
}
