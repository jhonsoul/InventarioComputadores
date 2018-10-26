/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;

/**
 * Clase encargada de generar las impresiones.
 * @author Jhon
 */
public class Impresiones {
    
    private String texto;
    
    public Impresiones() {
    }
    
    /**
     * Método que genera la impresión del documento
     */
    public void imprimir() {
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);
        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
        PrintService service = ServiceUI.printDialog(null, 700, 200, printService, defaultService, flavor, pras);
        byte[] bytes = texto.getBytes();
        Doc doc = new SimpleDoc(bytes,flavor,null);
        DocPrintJob job = service.createPrintJob();
        try {
            job.print(doc, null);
        } catch (PrintException e) {
            JOptionPane.showMessageDialog(null, "Error en la impresión", "Se presento un error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Se encargado de la construcción del documento escrito con los datos de pc.
     * @param pc es un objeto que contiene todos los datos del computador.
     */
    public void construirDocumento(Computadores pc) {
        String documento;
        Date date = new Date();
        DateFormat fechahora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        documento = "Fecha de creación del documento: " + fechahora.format(date) + "\n\n";
        documento += "La Placa del computador: " + pc.getPlaca() + "\n";
        documento += "Tipo de equipo: " + pc.getTipo() + "\n";
        documento += "Procesador: " + pc.getProcesador() + "\n";
        documento += "Placa base: " + pc.getPlaca() + "\n";
        documento += "Memoria ram: " + pc.getMemoriaRam() + "\n";
        documento += "Disco duro: " + pc.getDiscoDuro() + "\n";
        documento += "Sistema operativo: " + pc.getSistemaOperativo() + "\n";
        documento += "Software office: " + pc.getSoftware() + "\n";
        documento += "Antivirus: " + pc.getAntivirus() + "\n\n";
        documento += "El responsable del equipo: " + pc.getResponsable()+ "\n";
        documento += "Ubicación: " + pc.getUbicacion()+ "\n";
        documento += "Observaciones: " + pc.getObservaciones()+ "\n";
        documento += "\n\n\n";
        documento += "______________________\n";
        documento += "Firma";
        texto = documento;
    }
}
