/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

/**
 *
 * @author Jhon
 */
public class sqlsVisualizacion {
    
    public String constructorSQLs(String componente, String accion, Object identificador){
        String sql = "SELECT ";
         switch(componente) {
            case "Marca y Modelo":
                switch(accion) {
                    case "Listar":
                        sql += "`marca_modelo` FROM `marca_modelos` WHERE `activo_marca_modelo` = 1";
                        break;
                    case "recuperar ID":
                        sql += "`id_marca_modelo` FROM `marca_modelos` WHERE `marca_modelo` = \"" + identificador.toString() + "\"";
                        break;
                    case "Recuperar Nombre":
                        sql += "`marca_modelo` FROM `marca_modelos` WHERE `id_marca_modelo` = \"" + (int)identificador + "\"";
                        break;
                }
                break;
            case "Procesador":
                switch(accion) {
                    case "Listar":
                        sql += "`procesador` FROM `procesadores` WHERE `activo_procesador` = 1";
                        break;
                    case "recuperar ID":
                        sql += "`id_procesador` FROM `procesadores` WHERE `procesador` = \"" + identificador.toString() + "\"";
                        break;
                    case "Recuperar Nombre":
                        sql += "`procesador` FROM `procesadores` WHERE `id_procesador` = \"" + (int)identificador + "\"";
                        break;
                }
                break;
            case "Sistema operativo":
                switch(accion) {
                    case "Listar":
                        sql += "`sistema_operativo` FROM `sistemas_operativos` WHERE `activo_sistema_operativo` = 1";
                        break;
                    case "recuperar ID":
                        sql += "`id_sistema_operativo` FROM `sistemas_operativos` WHERE `sistema_operativo` = \"" + identificador.toString() + "\"";
                        break;
                    case "Recuperar Nombre":
                        sql += "`sistema_operativo` FROM `sistemas_operativos` WHERE `id_sistema_operativo` = \"" + (int)identificador + "\"";
                        break;
                }
                break;
            case "Placas":
                sql += "`id_placa` FROM `computadores` WHERE `activo_pc` = 1";
                break;
        }
        return sql;
    }

    public String sqlSelecionaComputadores(String id){
        String sql = "SELECT * FROM `computadores` WHERE `id_placa` = \"" + id + "\"";
        return sql;
    }
    
    public String sqlTodosComputadores(){
        String sql = "SELECT * FROM `computadores` WHERE `activo_pc` = " + true + "";
        return sql;
    }
}
