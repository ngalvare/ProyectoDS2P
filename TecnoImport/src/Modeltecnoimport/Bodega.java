/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import java.util.List;

/**
 *
 * @author ANA
 */
public class Bodega extends Local{
    
    List<RutaEntrega> rutas;
    
    public Bodega(int id, String direccion) {
        super(id, direccion);
    }

    public List<RutaEntrega> getRutas() {
        return rutas;
    }

    public void setRutas(List<RutaEntrega> rutas) {
        this.rutas = rutas;
    }
    
    
    
}
