/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

/**
 *
 * @author scmz2607
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
        System.out.println("iniciarSecionUsuarioBasico"); 
    }

    @Override
    public void cambiarPsw() {
        System.out.println("cambiarPswUsuarioBasico");
    }

    @Override
    public void consultarProductos() {
        System.out.println("consultarProdutosUsuarioBasico");
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

    
    
    
}
