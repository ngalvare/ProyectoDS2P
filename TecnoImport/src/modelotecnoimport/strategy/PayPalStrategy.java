
package modelotecnoimport.strategy;

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
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Currency getMonto() {
        return monto;
    }

    public void setMonto(Currency monto) {
        this.monto = monto;
    }
    
}
