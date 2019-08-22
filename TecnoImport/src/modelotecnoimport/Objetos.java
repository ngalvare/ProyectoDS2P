
package modelotecnoimport;

import medelotecnoimpor.singleton.Database;
import java.sql.Date;
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
        try {   
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
                    e = new Gerente(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5));
                    break;
                case "JEFE":
                    e = new JefeBodega(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5));
                    break;
                default:
                    e = new Vendedor(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5));
                    break;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    public static Envio crearEnvio(EstadoEnvio estado,ResultSet rt,String tipo) {
        Envio e = null;
        try{
            if(tipo == "DOM"){
                e = new EnvioDomicilio(rt.getInt(2), estado, Database.getVenta(rt.getInt(3)));
            }else{
                e = new EnvioAbastecimiento(rt.getInt(3), Date.valueOf(rt.getString(2)), estado, Database.getLocal(rt.getInt(4)));
            }
        }catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    public static Producto crearProd(ResultSet rs) {
        Producto p = null;
        try {
            p  = new Producto(rs.getInt(5), rs.getString(1), rs.getString(2),rs.getString(3),rs.getFloat(4));
        } catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    
    public static Venta crearVenta(ResultSet rs) {
        Venta v = null;
        try {
            v  = new Venta(rs.getInt(1),Database.getCliente(rs.getString(2)), Date.valueOf(rs.getString(5)));
        } catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
    
    
    
    public static Repartidor crearRep(ResultSet rs) {
        Repartidor r = null;
        try {
            r  = new Repartidor(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getBoolean(5));
        } catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public static Cliente crearCliente(ResultSet rs) {
        Cliente c = null;
        try {
            c  = new Cliente(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
        } catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public static Local crearLocal(ResultSet rs) {
        Local l = null;
        try {
            l  = new Local(rs.getInt(1),rs.getString(3));
        } catch (SQLException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    
}
