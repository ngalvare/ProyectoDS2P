
package modelotecnoimport;

/**
 *
 * @author ANA
 */
public class Repartidor extends Empleado{
    private boolean disponible;
    public Repartidor(String numCedula, String nombre, String direccion, String numTelefono,boolean disponible) {
        super(numCedula, nombre, direccion, numTelefono);
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
