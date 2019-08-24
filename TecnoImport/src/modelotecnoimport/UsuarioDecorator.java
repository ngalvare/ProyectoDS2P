package modelotecnoimport;

/**
 *
 * @author Nicole Alvarez
 */
public class UsuarioDecorator implements Usuario{
    protected String idUser;
    protected String password;
    protected Empleado empleado;

    public UsuarioDecorator(Usuario usuario) {
        this.idUser = usuario.getIdUser();
        this.password = usuario.getPassword();
        this.empleado = usuario.getEmpleado();
    }
    
    public void permisosAdmin(){
        throw new UnsupportedClassVersionError();
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
    public Empleado getEmpleado() {
        return empleado;
    }
    
    @Override
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
   
    
}
