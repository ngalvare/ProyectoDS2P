/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelotecnoimport.strategy;

import java.util.Currency;

/**
 *
 * @author ANA
 */
public class EfectivoStrategy implements PagoStrategy{
    
    private int id;
    private Currency monto;

    public EfectivoStrategy(int id, Currency monto) {
        this.id = id;
        this.monto = monto;
    }
    
    @Override
    public void pagar(Currency monto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
