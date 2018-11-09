/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import almacenamiento.BaseDatos;
import java.util.LinkedList;

/**
 * Encargada de tener algunos métodos muy recurrentes, para no generarlos múltiples veces se crean en esta clase y son llamados directamente por ser métodos estáticos.
 * @author Jhon
 */
public class MetodosEstaticos {
    
    /**
    * Se utiliza para cargar las listas dentro de los comboBox que se usan la aplicación.
     * @param tipo informa que tipo de componente es y solo pueda cargar el mismo tipo.
     * @param combo es el identificador en donde se cargará la información proveniente de la base de datos. 
     */
    public static void cargadorCombo(String tipo, javax.swing.JComboBox combo){
        combo.removeAllItems();
        String sql = new sqlsVisualizacion().constructorSQLs(tipo, "Listar", null);
        LinkedList lista = new BaseDatos().listarComponentes(sql);
        combo.addItem("");
        lista.forEach((object) -> {
            combo.addItem(object);
        });
    }
    
    /**
     * Utilizado para hacer las limitaciones de digitación en los campos de texto.
     * @param caja Esta la caja de texto que sera afectada por este método.
     * @param e Es el evento de digitacion que sirve para realizar la modificacion.
     * @param limite Es la cantidad de veces que se digita texto y se le asigna a cada caja de texto.
     */
    public static void limitaCajas(javax.swing.JTextField caja, java.awt.event.KeyEvent e, int limite){
        if (caja.getText().length() >= limite){
            e.consume();
            /**
             * Genera un sonido bit indicando error.
             */
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public static String informacion(){
        String mensaje = "<html>"
                + "<body>"
                + "<center><h1>Invecom</h1>"
                + "<p>Version: 2.1</p>"
                + "<br>"
                + "<p>Iconos de: <a href=\"icons8.com\">icons8.com</a></p>"
                + "<br>"
                + "</center>"
                + "</body>"
                + "</html>";
        return mensaje;
    }
}
