
package modelotecnoimport.query;

/**
 *
 * @author scmz2607
 */
public class SelectQueries {
    
    static String q1 = "select distinct nombre,nombreCat,descripcion,precio,cantidad from \n" +
        "tblEmpleado\n" +
        "join tblLocal l using(idLocal)\n" +
        "join tblInventario i using(idInventario)\n" +
        "join tblProductoInv pi using (idInventario)\n" +
        "join tblProducto p using(idProducto)\n" +
        "join tblCategory using (idCat)\n" +
        "where cedulaEmp = \'";
    
    static String allEnvios = "select * from tblEnvio where estado =\'pedido\';";
    
    private SelectQueries() {
        throw new IllegalStateException("Utility class");
    } 
    
    public static String getUser(String id, String psw){
        return "select * from tblUser where idUser=\'"+id+"\' and psw=\'"+psw+"\';";
    }
    
    public static String getEmpCargo(String ced, String cargo){
        String tabla = "";
        switch (cargo){
            case "GERENTE":
                tabla = "tblGerente";
                break;
            case "JEFE":
                tabla = "tblJefe";
                break;
            case "VENDEDOR":
                tabla = "tblVendedor";
                break;
            case "REPARTIDOR":
                tabla = "tblRepartidor";
                break;
            default:
                break;
        }
        return "select * from "+tabla+" where cedulaEmp=\'"+ced+"\';";
    }
    
    public static String getEmpSimple(String cedula){
        return "select * from tblEmpleado where cedulaEmp=\'"+cedula+"\';";
    }
    
    public static String getProducto(String data, String cedula,String search){
        return q1+cedula+"\' and "+search+" like \'%"+data+"%\';";
    }
    
    public static String getProductAll(String cedula){
        return q1+cedula+"\'";
    }
    
    
    public static String getVentasAll(String cedula){
        return q1+cedula+"\'";
    }
    
    
      
    public static String getRepartidores(String cedulaUsr){
        return "select distinct cedulaEmp,nombreEmp,direccion,telefono,disponible from \n" +
"        tblEmpleado\n" +
"        join tblRepartidor r using(cedulaEmp)\n" +
"        join (select l.idLocal as idLocal from tblLocal l join tblEmpleado using (idLocal) where cedulaEmp = \'"+cedulaUsr+"\')a \n" +
"        using(idLocal) where disponible = 1;";
    }

    public static String getUsrsByLocal(String numCedula) {
        return "select distinct idUser,cedulaEmp,psw,isAdmin from \n" +
"        tblEmpleado join tblUser using (cedulaEmp)\n" +
"        join (select l.idLocal as idLocal from tblLocal l join tblEmpleado using (idLocal) where cedulaEmp = \'"+numCedula+"\')a \n" +
"        using(idLocal)\n" +
"        where cedulaEmp not in (select cedulaEmp from tblRepartidor) and cedulaEmp <> \'"+numCedula+"\';";
    }
    
    public static String getUsrbyCed(String ced){
        return "select * from tblUser where cedulaEmp = \'"+ced+"\';";
    }

    public static String getAllEnvios() {
        return allEnvios;
    }

    public static String getEnvTipo(int idEnvio, String tipo) {
        String tabla = "";
        switch (tipo){
            case "DOM":
                tabla = "tblEnvioDom";
                break;
            case "ABAS":
                tabla = "tblEnvioAbas";
                break;
            default:
                break;
        }
        return "select * from "+tabla+" where idEnvio=\'"+idEnvio+"\';";
    }

    public static String getEnvSimple(int idEnvio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getVenta(int idVenta) {
        return "select * from tblVenta where idVenta = \'"+idVenta+"\';";
    }

    public static String getCliente(String cedulaCl) {
        return "select * from tblCliente where cedulaCl = \'"+cedulaCl+"\';";
    }

    public static String getLocal(int idLocal) {
        return "select * from tblLocal where idLocal = \'"+idLocal+"\';";
    }
    
    public static String getRutas(){
        return "select distinct idRuta, nombreEmp from tblRuta join tblRepartidor using(idRepartidor)\n" +
"join tblEmpleado using(cedulaEmp) where tblRuta.cerrada=0;";
    }
    
    public static String getRepbyRuta(int idRuta){
        return "select distinct cedulaEmp, nombreEmp, direccion, telefono, disponible from \n" +
"tblRuta join tblRepartidor using(idRepartidor)\n" +
"join tblEmpleado using(cedulaEmp) where idRuta =\'"+idRuta+"\';";
    }
}
