
package modelotecnoimport;

import java.util.Date;

/**
 *
 * @author Nicole Alvarez
 */
public class EnvioAbastecimiento extends Envio {
    private Local lugarDestino;
    private Date fechaEmision;


    public EnvioAbastecimiento(int id, Date fechaEmision, EstadoEnvio estado, Local local) {
        super(id,estado);
        this.lugarDestino = local;
        this.fechaEmision=fechaEmision;
        
    }

    public Local getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(Local lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    
    
    
}
