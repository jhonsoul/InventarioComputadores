/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.awt.Color;
import javax.swing.JLabel;

/**
 * Esta clase se encarga de alterar los colores de las etiquetas las cuales representan botones.
 * @author Jhon
 */
public class ColorBotones {

    public ColorBotones() {
    }
    
/**
* Se encarga de modificar el color de la letra y el fondo para los títulos.
* @param boton es un parámetro para identificar el objeto que se quiere modificar dentro de la aplicación.
*/  
    public void BotonTitulo(JLabel boton){
        boton.setBackground(Color.decode("#00204a"));
        boton.setForeground(Color.decode("#ffffff"));
    }

/**
* Se encarga de modificar los colores de los botones, junto con el texto que tienen.
 * @param boton es el parámetro identificador que se le entrega al método y pueda modificar sus colores.
 */    
    public void BotonMenu(JLabel boton){
        boton.setBackground(Color.decode("#4e709d"));
        boton.setForeground(Color.decode("#ffffff"));
    }
}
