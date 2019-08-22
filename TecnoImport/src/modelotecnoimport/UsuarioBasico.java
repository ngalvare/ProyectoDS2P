package modelotecnoimport;

/**
 *
 * @author ANA
 */
public class UsuarioBasico implements Usuario{
    private String idUser;
    private String password;
    private Empleado empleado;
    
    public UsuarioBasico(String idUser, String password, Empleado empleado) {
        this.idUser = idUser;
        this.password = password;
        this.empleado = empleado;
    }
    
    @Override
    public void iniciarSesion() {
         //falta implementar
    }
    
    @Override
    public void cambiarPsw() {
        //falta implementar
    }
    
    @Override
    public void consultarProductos() {
        //falta implementar
    }
    
    @Override
    public Empleado getEmpleado() {
        return empleado;
    }
    
    @Override
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    @Override
    public String getIdUser() {
        return idUser;
    }
    
    @Override
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    @Override
    public String getPassword() {
        return password;
    }
    
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "UsuarioBasico{" + "idUser=" + idUser + ", password=" + password + ", empleado=" + empleado + '}';
    }
    
}