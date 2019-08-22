package modelotecnoimport;


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
    
    
    public void cambiarEstadoEnvio(){
        //falta implementar
    }
    
    public void solicitar(){
        //falta implementar
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
