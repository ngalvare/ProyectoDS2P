
package modelotecnoimport;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ANA
 */
public class Inventario {
    
    private int id;
    private List<Producto> productos;
    private Date fechaModificacion;
    private String descripcion;

    public Inventario(int id, List<Producto> productos, Date fechaModificacion, String descripcion) {
        this.id = id;
        this.productos = productos;
        this.fechaModificacion = fechaModificacion;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
