/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import java.util.Currency;

/**
 *
 * @author ANA
 */
public interface PagoStrategy {
    
    public void pagar(Currency monto);
    
}

