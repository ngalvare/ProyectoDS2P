
package Modeltecnoimport;

import java.util.Currency;

/**
 *
 * @author ANA
 */
public class PayPalStrategy implements PagoStrategy{
    
    private String email;
    private String password;
    private Currency monto;

    public PayPalStrategy(String email, String password, Currency monto) {
        this.email = email;
        this.password = password;
        this.monto = monto;
    }
   
    @Override
    public void pagar(Currency monto) {
        
    }
    
}
