/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Jhon
 */
public class ColorBotones {

    public ColorBotones() {
    }
    
    public void BotonTitulo(JLabel boton){
        boton.setBackground(Color.decode("#00204a"));
        boton.setForeground(Color.decode("#ffffff"));
    }
    
    public void BotonMenu(JLabel boton){
        boton.setBackground(Color.decode("#4e709d"));
        boton.setForeground(Color.decode("#ffffff"));
    }
}
