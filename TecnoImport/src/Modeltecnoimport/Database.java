/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import Modeltecnoimport.Queries.SelectQueries;
import java.sql.Connection;
import java.sql.DriverManager;
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
    private final String url ; 
    private static Database instance;

    private Database() {
        driver = "com.mysql.jdbc.Driver";
        user = "root"; //poner el usuario
        password = "0928283373"; //poner la clave
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
    
    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    
    public static ResultSet consultaQuery(String comando){
        Statement st;
        ResultSet rs=null;
        try {
            st= conn.createStatement();
            rs= st.executeQuery(comando);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
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
    
    public static Empleado getEmpleado(String cedula){
        Empleado e = null;
        List<String> cargos= Arrays.asList("JEFE","GERENTE","VENDEDOR");
        try{
            for(String c:cargos){
                ResultSet rs = consultaQuery(SelectQueries.getEmpCargo(cedula, c));
                System.out.println("reg: "+String.valueOf(rs.getRow()));
                if (rs.getRow()!=0){
                    e = Objetos.crearEmp(rs, c);
                    break;
                }
            }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    public void agregarClienteSQL(){
        System.out.println("base de dato agregarCliente");
    }
    
    public void agregarCotizacionSQL(){
        System.out.println("base de dato agregarCotizacion");
    }
    
    public void agregarVentaSQL(){
        System.out.println("base de dato agregarVenta");
    }
    
    public void crearVentaSQL(){
        System.out.println("base de dato crearVenta");
    }
    
    public void consultarEnvios(){
        System.out.println("base de dato consultarEnvios");
    }
    
    public void autenticarUsuarioSQL(){
        System.out.println("base de dato autenticarUsuario");
    }
    
    public void crearCotizacionSQL(){
        System.out.println("base de dato crearCotizacion");
    }
    
    public void consultarSolicitudesSQL(){
        System.out.println("base de dato consultarSolicitudes");
    }
    
    public void agregarProductoSQL(){
        System.out.println("base de dato agregarProducto");
    }

    public void agregarEnvioAbastecimientoSQL(){
        System.out.println("base de dato 1");
    }
    
    public void consultarEmpleadosSQL(){
        System.out.println("base de dato 2");
    }
    
    public void consularClientesSQL(){
        System.out.println("base de dato 3");
    }
    
    public void guardarEnvioSQL(){
        System.out.println("base de dato 4");
    }

    public void consultarProductosSQL(){
        System.out.println("base de dato 5");
    }
    
    public void cambiarEstadoEnvioSQL(){
        System.out.println("base de dato 6");
    }

    public void solicitarEnvioSQL(){
        System.out.println("base de dato 7");
    }
    
    public void editarProductoSQL(){
        System.out.println("base de dato 8");
    }
    
    public void agregarVentaDomicilio(){
        System.out.println("base de dato 9");
    }

    public void agregarVentaPresencial(){
        System.out.println("base de dato 10");
    }
    
    public void agregarPago(){
        System.out.println("base de dato 11");
    }
    
    public void seleccionarProducto(){ //tiene que retorna array de productos
        System.out.println("base de dato 12");
    }
    
    public void registarPago(PagoStrategy pago){
        System.out.println("base de dato 13");
    }
    
    public void generarEnvioDomicilio(){
        System.out.println("base de dato 14");
    }
    
    public void emitirDocumentoElectronico(){ //aqui tienen que retornar DocumentoElectronico
        System.out.println("base de dato 15");
    }
    
    public void AsociarCliente(Cliente c){
        System.out.println("base de dato 16");
    }
    
}
