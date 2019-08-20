/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport.Singleton;

import Modeltecnoimport.Cliente;
import Modeltecnoimport.Empleado;
import Modeltecnoimport.Envio;
import Modeltecnoimport.EstadoEnvio;
import Modeltecnoimport.Local;
import Modeltecnoimport.Objetos;
import Modeltecnoimport.PagoStrategy;
import Modeltecnoimport.Producto;
import Modeltecnoimport.Queries.SelectQueries;
import Modeltecnoimport.Queries.UpdateQueries;
import Modeltecnoimport.Repartidor;
import Modeltecnoimport.Usuario;
import Modeltecnoimport.Venta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author scmz2607
 */
public class Database {

    private static Connection conn = null;
    private final String driver;
    private final String user; //poner el usuario
    private final String password; //poner la clave
    private final String url;
    private static Database instance;

    private Database() {
        driver = "com.mysql.jdbc.Driver";
        user = "arun"; //poner el usuario
        password = "12345"; //poner la clave
        url = "jdbc:mysql://localhost:3306/dbTecno";
    }

    public void conectar() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se conecto " + e);
        }
    }

    public Connection getConection() {
        return conn;
    }

    public void desconectar() {
        conn = null;
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static ResultSet consultaQuery(String comando) {
        Statement st;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(comando);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static PreparedStatement prepararQuery(String query) throws SQLException {
        return conn.prepareStatement(query);
    }

    public static Usuario validaInicio(String usr, String psw) {
        Usuario u = null;
        try {

            ResultSet rs = consultaQuery(SelectQueries.getUser(usr, psw));
            while (rs.next()) {
                u = Objetos.crearUser(rs);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    public static Venta getVenta(int idVenta) {
        Venta v=null;
        try {
            PreparedStatement ps = prepararQuery(SelectQueries.getVenta(idVenta));
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                v=Objetos.crearVenta(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
    public static Cliente getCliente(String cedCl) {
        Cliente c=null;
        try {
            PreparedStatement ps = prepararQuery(SelectQueries.getCliente(cedCl));
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                c=Objetos.crearCliente(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public static Local getLocal(int idLocal) {
        Local l=null;
        try {
            PreparedStatement ps = prepararQuery(SelectQueries.getLocal(idLocal));
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                l=Objetos.crearLocal(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    
    public static Empleado getEmpleado(String cedula) {
        Empleado e = null;
        List<String> cargos = Arrays.asList("GERENTE", "JEFE", "VENDEDOR");
        try {
            for (String c : cargos) {
                PreparedStatement ps = prepararQuery(SelectQueries.getEmpCargo(cedula, c));
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    ResultSet rs2 = consultaQuery(SelectQueries.getEmpSimple(cedula));
                    while (rs2.next()) {
                        e = Objetos.crearEmp(rs2, c);
                        break;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    public static ArrayList<Usuario> getUsrsAdminLocal(Usuario usr) {
        ArrayList<Usuario> usrs = new ArrayList<>();
        try {
            Empleado e = usr.getEmpleado();
            PreparedStatement ps = prepararQuery(SelectQueries.getUsrsByLocal(e.getNumCedula()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usrs.add(Objetos.crearUser(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usrs;
    }

    public static ArrayList<Producto> getProdFilter(String dato, Usuario usr, String search) {
        ArrayList<Producto> ps = new ArrayList<>();
        Empleado e = usr.getEmpleado();
        ResultSet rs;
        if (search.equals("")) {
            rs = consultaQuery(SelectQueries.getProductAll(e.getNumCedula()));
        } else {
            rs = consultaQuery(SelectQueries.getProducto(dato, e.getNumCedula(), search));
        }
        try {
            while (rs.next()) {
                Producto p = Objetos.crearProd(rs);
                System.out.println(p);
                ps.add(p);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
    }

    public static ArrayList<Venta> getVentas(Usuario usr) {
        ArrayList<Venta> ventas = new ArrayList<>();
        Empleado e = usr.getEmpleado();
        ResultSet rs;
        rs = consultaQuery(SelectQueries.getProductAll(e.getNumCedula()));
        try {
            while (rs.next()) {
                Venta v = Objetos.crearVenta(rs);
                ventas.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return ventas;
    }

    public static ArrayList<Envio> getEnvios() {
        ArrayList<Envio> envios = new ArrayList<>();
        Envio e = null;
        try {
            ResultSet rs = consultaQuery(SelectQueries.getAllEnvios());
            int i=0;
            while (rs.next()) {
                System.out.println("creando"+i);
                e = getEnvio(rs);
                envios.add(e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(envios.size());
        return envios;
    }

    public static Envio getEnvio(ResultSet rs) {
        Envio e = null;
        List<String> tipoE = Arrays.asList("DOM", "ABAS");
        try {
            for (String t : tipoE) {
                PreparedStatement ps = prepararQuery(SelectQueries.getEnvTipo(rs.getInt(1), t));
                ResultSet rt = ps.executeQuery();
                while (rt.next()) {
                    e = Objetos.crearEnvio(EstadoEnvio.valueOf(rs.getString(3)), rt, t);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    public static boolean crearRuta(String numCedula, ArrayList<Integer> idsEnvios) {
        if(idsEnvios.isEmpty()) return false;
        try {
            PreparedStatement pst = conn.prepareStatement(UpdateQueries.getIdRepbyCed(numCedula));
            ResultSet rs2 = pst.executeQuery();
            while(rs2.next()){
                PreparedStatement ps = conn.prepareStatement(UpdateQueries.crearRuta(rs2.getInt(1),false));
                ps.execute();
                PreparedStatement ps4 = conn.prepareStatement(UpdateQueries.cambiarDisponible(rs2.getInt(1),false));
                ps4.execute();
            }
            int idRuta=idUltimaRuta();
            for(int id: idsEnvios){
                PreparedStatement ps2 = conn.prepareStatement(UpdateQueries.asignarRutaEnvio(id,idRuta));
                ps2.execute();
                PreparedStatement ps3 = conn.prepareStatement(UpdateQueries.cambiarEstadoEnvio(id,EstadoEnvio.encamino));
                ps3.execute();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public static ArrayList<Repartidor> getRepartidorF(Usuario usr) {
        ArrayList<Repartidor> ps = new ArrayList<>();
        Empleado e = usr.getEmpleado();
        ResultSet rs;
        rs = consultaQuery(SelectQueries.getRepartidores(e.getNumCedula()));
        try {
            while (rs.next()) {
                System.out.println(rs.getString(1));
                Repartidor r = Objetos.crearRep(rs);
                ps.add(r);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
    }

    public static boolean getPrivAdmin(String cedula) {
        ResultSet rs;
        rs = consultaQuery(SelectQueries.getUsrbyCed(cedula));
        try {
            while (rs.next()) {
                if (!rs.getBoolean(4)) {
                    PreparedStatement ps = conn.prepareStatement(UpdateQueries.cambiarIsAdmin(cedula, true));
                    int count = ps.executeUpdate();
                    if (count > 0) {
                        return true;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static int idUltimaRuta() {
        try {
            ResultSet rs = consultaQuery(UpdateQueries.idEstaRuta());
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void agregarClienteSQL() {
        System.out.println("base de dato agregarCliente");
    }

    public void agregarCotizacionSQL() {
        System.out.println("base de dato agregarCotizacion");
    }

    public void agregarVentaSQL() {
        System.out.println("base de dato agregarVenta");
    }

    public void crearVentaSQL() {
        System.out.println("base de dato crearVenta");
    }

    public void consultarEnvios() {
        System.out.println("base de dato consultarEnvios");
    }

    public void autenticarUsuarioSQL() {
        System.out.println("base de dato autenticarUsuario");
    }

    public void crearCotizacionSQL() {
        System.out.println("base de dato crearCotizacion");
    }

    public void consultarSolicitudesSQL() {
        System.out.println("base de dato consultarSolicitudes");
    }

    public void agregarProductoSQL() {
        System.out.println("base de dato agregarProducto");
    }

    public void agregarEnvioAbastecimientoSQL() {
        System.out.println("base de dato 1");
    }

    public void consultarEmpleadosSQL() {
        System.out.println("base de dato 2");
    }

    public void consularClientesSQL() {
        System.out.println("base de dato 3");
    }

    public void guardarEnvioSQL() {
        System.out.println("base de dato 4");
    }

    public void consultarProductosSQL() {
        System.out.println("base de dato 5");
    }

    public void cambiarEstadoEnvioSQL() {
        System.out.println("base de dato 6");
    }

    public void solicitarEnvioSQL() {
        System.out.println("base de dato 7");
    }

    public void editarProductoSQL() {
        System.out.println("base de dato 8");
    }

    public void agregarVentaDomicilio() {
        System.out.println("base de dato 9");
    }

    public void agregarVentaPresencial() {
        System.out.println("base de dato 10");
    }

    public void agregarPago() {
        System.out.println("base de dato 11");
    }

    public void seleccionarProducto() { //tiene que retorna array de productos
        System.out.println("base de dato 12");
    }

    public void registarPago(PagoStrategy pago) {
        System.out.println("base de dato 13");
    }

    public void generarEnvioDomicilio() {
        System.out.println("base de dato 14");
    }

    public void emitirDocumentoElectronico() { //aqui tienen que retornar DocumentoElectronico
        System.out.println("base de dato 15");
    }

    public void AsociarCliente(Cliente c) {
        System.out.println("base de dato 16");
    }

//    public static void main(String[] args){
//        Database.getInstance().conectar();
//        String ced = "0928283456";
//        try {
//            PreparedStatement ps = prepararQuery("select * from tblUser where idUser=\'jpere1\' and psw=\'12345\'");
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getString(3));
//            }
//            System.out.println(rs.getRow());
//        } catch (SQLException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
