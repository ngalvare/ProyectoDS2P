/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelotecnoimport;


/**
 *
 * @author Nicole Alvarez
 */
public interface Usuario {
    public String getIdUser();
    public void setIdUser(String idUser);
    public Empleado getEmpleado();
    public void setEmpleado(Empleado empleado);
    public String getPassword();
    public void setPassword(String password);
    
}