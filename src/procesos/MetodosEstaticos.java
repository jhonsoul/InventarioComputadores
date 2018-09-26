/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import almacenamiento.BaseDatos;
import java.util.LinkedList;

/**
 *
 * @author Jhon
 */
public class MetodosEstaticos {
    
    public static void cargadorCombo(String tipo, javax.swing.JComboBox combo){
        combo.removeAllItems();
        String sql = new sqlsVisualizacion().constructorSQLs(tipo, "Listar", null);
        LinkedList lista = new BaseDatos().listarComponentes(sql);
        combo.addItem("");
        lista.forEach((object) -> {
            combo.addItem(object);
        });
    }
    
    public static void limitaCajas(javax.swing.JTextField caja, java.awt.event.KeyEvent e, int limite){
        if (caja.getText().length() >= limite){
            e.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }
}
