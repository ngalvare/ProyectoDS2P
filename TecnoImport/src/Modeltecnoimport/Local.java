
package Modeltecnoimport;



/**
 *
 * @author ANA
 */
public class Local {
    
    protected int id;
    protected String direccion;

    public Local(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    
    
}
