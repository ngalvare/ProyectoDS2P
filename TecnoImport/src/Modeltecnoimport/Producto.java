
package Modeltecnoimport;

/**
 *
 * @author ANA
 */
public class Producto {
    
    private int  stock;
    private String nombre, categoria, descripcion;
    private float precio;

    public Producto(int stock, String nombre, String categoria, String descripcion, float precio) {
        
        this.stock = stock;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "stock=" + stock + ", nombre=" + nombre + ", categoria=" + categoria + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
    
    
}
