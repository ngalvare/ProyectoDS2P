/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
        System.out.println("Clase PayPalStrategy metodo pagar");
    }
    
}
