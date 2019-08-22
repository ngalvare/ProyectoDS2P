
package Modeltecnoimport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicole Alvarez
 */
public class RutaEntrega {
    
    private int id;
    private String nombreRep;
    private boolean esExitosa;

    public RutaEntrega(int id, String nombreRep, boolean esExitosa) {
        this.id = id;
        this.nombreRep = nombreRep;
        this.esExitosa = esExitosa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRep() {
        return nombreRep;
    }

    public void setNombreRep(String nombreRep) {
        this.nombreRep = nombreRep;
    }

    
    public boolean isEsExitosa() {
        return esExitosa;
    }

    public void setEsExitosa(boolean esExitosa) {
        this.esExitosa = esExitosa;
    }
    
   
}
