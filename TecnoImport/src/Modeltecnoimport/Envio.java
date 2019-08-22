package Modeltecnoimport;

import java.util.List;

/**
 *
 * @author Nicole Alvarez
 */
public class Envio {
    protected int id;
    protected EstadoEnvio estado;

    public Envio(int id, EstadoEnvio estado) {
        this.id = id;
        this.estado = estado;
    }
    
    
    public void cambiarEstadoEnvio(EstadoEnvio estado){
    
        System.out.println("EnvioCambiarEstadoEnvio");
    }
    
    public void solicitar(List<Producto> productos){
    
        System.out.println("Enviosolicitar");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public EstadoEnvio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }
    
    
}
