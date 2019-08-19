/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import Modeltecnoimport.Singleton.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author scmz2607
 */
public class Objetos {
    public static Usuario crearUser(ResultSet rs){
        try {   System.out.println(rs.getString(2));
                UsuarioBasico ub  = new UsuarioBasico(rs.getString(1), rs.getString(3), Database.getEmpleado(rs.getString(2)));
                if(rs.getBoolean(4)){
                    return new UsuarioAdmin(ub);
                }else{
                    return new UsuarioDecorator(ub);
                }
        } catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static Empleado crearEmp(ResultSet rs,String cargo){
        Empleado e = null;
        try{
            switch (cargo){
            case "GERENTE":
                e = new Gerente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                break;
            case "JEFE":
                System.out.println("creando jefe");
                e = new JefeBodega(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                break;
            case "VENDEDOR":
                e = new Vendedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                break;
            case "REPARTIDOR":
                e = new Repartidor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                break;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
