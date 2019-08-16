/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
    
    @Override
    public void iniciarSesion() {
        System.out.println("iniciarSecionUsuarioDecorator"); 
    }

    @Override
    public void cambiarPsw() {
        System.out.println("cambiarPswUsuarioDecorator");
    }

    @Override
    public void consultarProductos() {
        System.out.println("consultarProdutosUsuarioDecorator");
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
