package Modeltecnoimport.Singleton;

import Modeltecnoimport.Cliente;
import Modeltecnoimport.Empleado;
import Modeltecnoimport.Envio;
import Modeltecnoimport.EstadoEnvio;
import Modeltecnoimport.Local;
import Modeltecnoimport.Objetos;
import Modeltecnoimport.Producto;
import Modeltecnoimport.Queries.SelectQueries;
import Modeltecnoimport.Queries.UpdateQueries;
import Modeltecnoimport.Repartidor;
import Modeltecnoimport.RutaEntrega;
import Modeltecnoimport.Usuario;
import Modeltecnoimport.Venta;
import Viewtecnoimport.ViewSelectAdminMood;
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
    private final String user;
    private final String password;
    private final String url;
    private static Database instance;

    private Database() {
        driver = "com.mysql.jdbc.Driver";
        user = "arun";
        password = "12345";
        url = "jdbc:mysql://localhost:3306/dbTecno";
    }

    public void conectar() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger("No se pudo Conectar").log(Level.SEVERE, null, new Exception());
        }
    }

    public Connection getConection() {
        return conn;
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static ResultSet consultaQuery(String comando) {
        ResultSet rs = null;
        try (Statement st = conn.createStatement()) {
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
        Venta v = null;
        try {
            PreparedStatement ps = prepararQuery(SelectQueries.getVenta(idVenta));
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    v = Objetos.crearVenta(rs);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    public static Cliente getCliente(String cedCl) {
        Cliente c = null;
        try {
            PreparedStatement ps = prepararQuery(SelectQueries.getCliente(cedCl));
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    c = Objetos.crearCliente(rs);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public static Local getLocal(int idLocal) {
        Local l = null;
        try {
            PreparedStatement ps = prepararQuery(SelectQueries.getLocal(idLocal));
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    l = Objetos.crearLocal(rs);
                }
            }
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
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        ResultSet rs2 = consultaQuery(SelectQueries.getEmpSimple(cedula));
                        while (rs2.next()) {
                            e = Objetos.crearEmp(rs2, c);
                            break;
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    public static List<Usuario> getUsrsAdminLocal(Usuario usr) {
        List<Usuario> usrs = new ArrayList<>();
        try {
            Empleado e = usr.getEmpleado();
            PreparedStatement ps = prepararQuery(SelectQueries.getUsrsByLocal(e.getNumCedula()));
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    usrs.add(Objetos.crearUser(rs));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usrs;
    }

    public static List<Producto> getProdFilter(String dato, Usuario usr, String search) {
        List<Producto> ps = new ArrayList<>();
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
                ps.add(p);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
    }

    public static List<Venta> getVentas(Usuario usr) {
        List<Venta> ventas = new ArrayList<>();
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

    public static List<Envio> getEnvios() {
        List<Envio> envios = new ArrayList<>();
        Envio e = null;
        try {
            ResultSet rs = consultaQuery(SelectQueries.getAllEnvios());
            while (rs.next()) {
                e = getEnvio(rs);
                envios.add(e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return envios;
    }

    public static Envio getEnvio(ResultSet rs) {
        Envio e = null;
        List<String> tipoE = Arrays.asList("DOM", "ABAS");
        try {
            for (String t : tipoE) {
                PreparedStatement ps = prepararQuery(SelectQueries.getEnvTipo(rs.getInt(1), t));
                try (ResultSet rt = ps.executeQuery()) {
                    while (rt.next()) {
                        e = Objetos.crearEnvio(EstadoEnvio.valueOf(rs.getString(3)), rt, t);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    public static boolean crearRuta(Repartidor r, ArrayList<Integer> idsEnvios) {
        if (idsEnvios.isEmpty()) {
            return false;
        }
        try {
            PreparedStatement pst = conn.prepareStatement(UpdateQueries.getIdRepbyCed(r.getNumCedula()));
            try (ResultSet rs2 = pst.executeQuery()) {
                while (rs2.next()) {
                    PreparedStatement ps = conn.prepareStatement(UpdateQueries.crearRuta(rs2.getInt(1), false));
                    ps.execute();
                    PreparedStatement ps4 = conn.prepareStatement(UpdateQueries.cambiarDisponible(rs2.getInt(1), 0));
                    ps4.execute();
                    ViewSelectAdminMood.repartidores.poll();
                    break;
                }
            }
            int idRuta = idUltimaRuta();
            for (int id : idsEnvios) {
                PreparedStatement ps2 = conn.prepareStatement(UpdateQueries.asignarRutaEnvio(id, idRuta));
                ps2.execute();
                PreparedStatement ps3 = conn.prepareStatement(UpdateQueries.cambiarEstadoEnvio(id, EstadoEnvio.ENCAMINO));
                ps3.execute();

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public static List<Repartidor> getRepartidorF(Usuario usr) {
        List<Repartidor> ps = new ArrayList<>();
        Empleado e = usr.getEmpleado();
        ResultSet rs;
        rs = consultaQuery(SelectQueries.getRepartidores(e.getNumCedula()));
        try {
            while (rs.next()) {
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

    public static List<RutaEntrega> getRutas() {
        List<RutaEntrega> rutas = new ArrayList<>();
        ResultSet rs = consultaQuery(SelectQueries.getRutas());
        try {
            while (rs.next()) {
                RutaEntrega r = new RutaEntrega(rs.getInt(1), rs.getString(2), false);
                rutas.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rutas;
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

    public static void completarRuta(int idRuta) {
        try {
            PreparedStatement ps = conn.prepareStatement(UpdateQueries.cambiarEstadoRuta(idRuta, 1));
            ps.executeUpdate();
            PreparedStatement ps2 = conn.prepareStatement(UpdateQueries.cambiarEstadoEnviosRuta(idRuta, EstadoEnvio.ENTREGADO));
            ps2.executeUpdate();
            PreparedStatement ps3 = conn.prepareStatement(UpdateQueries.cambiarDisponibleRep(idRuta, 1));
            ps3.executeUpdate();
            ResultSet rs2 = consultaQuery(SelectQueries.getRepbyRuta(idRuta));
            Repartidor r = null;

            while (rs2.next()) {
                r = new Repartidor(rs2.getString(1), rs2.getString(2), rs2.getString(3), rs2.getString(4), rs2.getBoolean(5));
            }
            ViewSelectAdminMood.repartidores.offer(r);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
