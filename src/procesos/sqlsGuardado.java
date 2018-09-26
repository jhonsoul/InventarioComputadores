/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import almacenamiento.BaseDatos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jhon
 */
public class sqlsGuardado {
    
    public String sqlInsertaComponentes(String componente, String referencia){
        String sql = "INSERT INTO ";
        switch(componente) {
            case "Marca y Modelo":
                sql += "`marca_modelos`(`marca_modelo`, `activo_marca_modelo`)";
                break;
            case "Procesador":
                sql += "`procesadores`(`procesador`, `activo_procesador`)";
                break;
            case "Sistema operativo":
                sql += "`sistemas_operativos`(`sistema_operativo`, `activo_sistema_operativo`)";
                break;
        }
        sql += " VALUES (\""+ referencia + "\"," + true + ")";
        return sql;
    }
    
    public String sqlInsertaComputadores(Computadores c){
        int idMarcaModelo = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Marca y Modelo", "recuperar ID", c.getMarcaModelo()));
        int idProcesador = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Procesador", "recuperar ID", c.getProcesador()));
        int idSistemaOperativo = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Sistema operativo", "recuperar ID", c.getSistemaOperativo()));
        String sql = "INSERT INTO `computadores`"
                + "(`id_placa`, `fk_id_marca_modelo`, `tipo`, `fk_id_procesador`, `serial_placa`, `memoria_ram`, `disco_duro`, `fk_id_sistema_operativo`, `tipo_office`, `antivirus`, `responsable`, `ubicacion`, `observaciones`, `activo_pc`) "
                + "VALUES (\""+ c.getPlaca() 
                +"\",\""+ idMarcaModelo 
                +"\",\""+ c.getTipo()
                +"\",\""+ idProcesador 
                +"\",\""+ c.getPlacaBase()
                +"\",\""+ c.getMemoriaRam()
                +"\",\""+ c.getDiscoDuro()
                +"\",\""+ idSistemaOperativo 
                +"\",\""+ c.getOffice()
                +"\",\""+ c.getAntivirus()
                +"\",\""+ c.getResponsable()
                +"\",\""+ c.getUbicacion()
                +"\",\""+ c.getObservaciones()
                +"\","+ true +")";
        return sql;
    }
    
    public String sqlActualizaComputador(Computadores c){
        int idMarcaModelo = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Marca y Modelo", "recuperar ID", c.getMarcaModelo()));
        int idProcesador = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Procesador", "recuperar ID", c.getProcesador()));
        int idSistemaOperativo = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Sistema operativo", "recuperar ID", c.getSistemaOperativo()));
        String sql = "UPDATE `computadores` SET "
                + "`fk_id_marca_modelo`=\""+ idMarcaModelo +"\","
                + "`tipo`=\""+ c.getTipo() + "\","
                + "`fk_id_procesador`=\""+ idProcesador + "\","
                + "`serial_placa`=\""+ c.getPlacaBase() + "\","
                + "`memoria_ram`=\""+ c.getMemoriaRam()+ "\","
                + "`disco_duro`=\""+ c.getDiscoDuro() + "\","
                + "`fk_id_sistema_operativo`=\""+ idSistemaOperativo + "\","
                + "`tipo_office`=\""+ c.getOffice() + "\","
                + "`antivirus`=\""+ c.getAntivirus() + "\","
                + "`responsable`=\""+ c.getResponsable() + "\","
                + "`ubicacion`=\""+ c.getUbicacion() + "\","
                + "`observaciones`=\""+ c.getObservaciones() + "\""
                + "WHERE `id_placa` = \""+ c.getPlaca() + "\"";
        return sql;
    }
    
    public String sqlEliminar(String identificador, String tipo){
        Date date = new Date();
        DateFormat fechahora = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");
        String nuevoID = "DEL" + fechahora.format(date);
        String sql = "UPDATE ";
        switch(tipo) {
            case "PC":
                sql += "`computadores` SET `id_placa` = \"" + nuevoID + "\", `activo_pc`= " + false + " WHERE `id_placa`";
                break;
            case "Marca y Modelo":
                sql += "`marca_modelos` SET `activo_marca_modelo`= " + false + " WHERE `marca_modelo`";
                break;
            case "Procesador":
                sql += "`procesadores` SET `activo_procesador`= " + false + " WHERE `procesador`";
                break;
            case "Sistema operativo":
                sql += "`sistemas_operativos` SET `activo_sistema_operativo`= " + false + " WHERE `sistema_operativo`";
                break;
        }
        sql +=  " = \"" + identificador + "\"";
        return sql;
    }
    
    
}
