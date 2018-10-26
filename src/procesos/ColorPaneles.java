/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 * Se encarga de generar un degradado en los paneles.
 * @author Jhon
 */
public class ColorPaneles extends JPanel{
    
    private Color colorUno;
    private Color colorDos;
    
    /**
     * Método constructor que carga los colores y el panel a modificar.
     * @param panel seria el panel en donde se aplicara el degradado.
     */
    public ColorPaneles(JPanel panel) {
        this.colorUno = Color.decode("#0960bd");
        this.colorDos = Color.decode("#00204a");
        this.setSize(panel.getSize());
        panel.add(this);
    }
    
    
    /**
     * Metodo encargado de la generación del degradado.
     * @param g es necesario para generar el degradado en el panel.
     */
    @Override
    public void paint(Graphics g) {    
        Graphics2D g2 = (Graphics2D) g.create();
        Rectangle clip = g2.getClipBounds();                        
        g2.setPaint(new GradientPaint(0.0f, 0.0f, colorUno, getWidth()/2, getHeight(), colorDos));        
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);        
    }
}
