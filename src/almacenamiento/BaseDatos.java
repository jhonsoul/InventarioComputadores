/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenamiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import procesos.Computadores;


/**
 *
 * @author Jhon
 */
public class BaseDatos {
    
    private Connection con = null; 
            
    public Connection conecta(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return con;
    }
    
    public String guardarInformacion(String sql){
        String cambio = "Se presento un error y la información no se guardo";
        try {
            Statement st = conecta().createStatement();
            st.executeUpdate(sql);
            cambio = "El cambio se realizo con exito";
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cambio;
    }
    
    public LinkedList listarComponentes(String sql){
        LinkedList lista = new LinkedList();
        try {
            Statement stm = conecta().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                lista.add(rs.getString(1));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public int consultaIDs(String sql){
        int id = 0;
        try {
            Statement stm = conecta().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt(1);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public Computadores cargaComputador(String sql){
        Computadores pc = new Computadores();
        try {
            Statement stm = conecta().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                pc.setPlaca(rs.getString(1));
                pc.setMarcaModelo(rs.getString(2));
                pc.setTipo(rs.getString(3));
                pc.setProcesador(rs.getString(4));
                pc.setPlacaBase(rs.getString(5));
                pc.setMemoriaRam(rs.getString(6));
                pc.setDiscoDuro(rs.getString(7));
                pc.setSistemaOperativo(rs.getString(8));
                pc.setOffice(rs.getString(9));
                pc.setAntivirus(rs.getString(10));
                pc.setResponsable(rs.getString(11));
                pc.setUbicacion(rs.getString(12));
                pc.setObservaciones(rs.getString(13));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pc;
    }
        
    public DefaultTableModel setTablaComputadores(String sql){
        DefaultTableModel modelo = new DefaultTableModel(
                new String[]{"ID PLACA",
                    "MARCA Y MODELO",
                    "TIPO",
                    "PROCESADOR",
                    "PLACA BASE",
                    "MEMORIA RAM",
                    "DISCO DURO",
                    "SISTEMA OPERATIVO",
                    "SOFTWARE OFFICE",
                    "ANTIVIRUS",
                    "RESPONSABLE",
                    "UBICACIÓN",
                    "OBSERVACIÓN"}, 0);
        try {
            PreparedStatement st = conecta().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int numberOfColumns = meta.getColumnCount();
            while (rs.next()){
                Object [] rowData = new Object[numberOfColumns];
                for (int i = 0; i < rowData.length; ++i){
                    rowData[i] = rs.getObject(i + 1);
                }
                modelo.addRow(rowData);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modelo;
    }
    
}
