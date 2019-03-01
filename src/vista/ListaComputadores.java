/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import almacenamiento.BaseDatos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import procesos.ColorBotones;
import procesos.ColorPaneles;
import procesos.Computadores;
import procesos.Impresiones;
import procesos.MetodosEstaticos;
import procesos.sqlsVisualizacion;

/**
 *
 * @author Jhon
 */
public class ListaComputadores extends javax.swing.JFrame {

    private Menu menu;
    
    /**
     * Creates new form Menu
     */
    public ListaComputadores() {
        initComponents();
        new ColorPaneles(panelMenu);
        ColorBotones color = new ColorBotones();
        color.BotonTitulo(titulos);
        color.BotonMenu(imprimir);
        color.BotonMenu(regresar);
        color.BotonMenu(salir);
        MetodosEstaticos.cargadorCombo("Placas", comboPlacas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        titulos = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        areaTrabajo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        comboPlacas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        imprimir = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de computadores");
        setMinimumSize(new java.awt.Dimension(1270, 720));
        setPreferredSize(new java.awt.Dimension(1270, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 720));

        panelMenu.setBackground(new java.awt.Color(64, 75, 105));

        titulos.setBackground(new java.awt.Color(39, 37, 61));
        titulos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulos.setForeground(new java.awt.Color(255, 255, 255));
        titulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulos.setText("Lista de computadores");
        titulos.setOpaque(true);

        regresar.setBackground(new java.awt.Color(40, 49, 73));
        regresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Go_Back_32px.png"))); // NOI18N
        regresar.setText("Regresar");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.setIconTextGap(20);
        regresar.setOpaque(true);
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
        });

        salir.setBackground(new java.awt.Color(40, 49, 73));
        salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Shutdown_32px_1.png"))); // NOI18N
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setIconTextGap(20);
        salir.setOpaque(true);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulos, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(titulos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        areaTrabajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 129, 138)));

        comboPlacas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Placa del computador a imprimir:");

        imprimir.setBackground(new java.awt.Color(40, 49, 73));
        imprimir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        imprimir.setForeground(new java.awt.Color(255, 255, 255));
        imprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Search_32px.png"))); // NOI18N
        imprimir.setText("Imprimir");
        imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimir.setIconTextGap(20);
        imprimir.setOpaque(true);
        imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimirMouseClicked(evt);
            }
        });

        listaTabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listaTabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        listaTabla.setRowHeight(20);
        listaTabla.getTableHeader().setResizingAllowed(false);
        jScrollPane2.setViewportView(listaTabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(comboPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout areaTrabajoLayout = new javax.swing.GroupLayout(areaTrabajo);
        areaTrabajo.setLayout(areaTrabajoLayout);
        areaTrabajoLayout.setHorizontalGroup(
            areaTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        areaTrabajoLayout.setVerticalGroup(
            areaTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_regresarMouseClicked

    private void imprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirMouseClicked
        if (comboPlacas.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "El campo placa deben tener datos", "Se presento un error", JOptionPane.ERROR_MESSAGE);
        } else {
            Computadores pc = new BaseDatos().cargaComputador(new sqlsVisualizacion().sqlPCs("PC", comboPlacas.getSelectedItem().toString()));
            Impresiones imp = new Impresiones();
            imp.construirDocumento(pc);
            imp.imprimir();
        }
    }//GEN-LAST:event_imprimirMouseClicked

    public void iniciadorVentanas(){
        menu = new Menu();
        listaTabla.setModel(new BaseDatos().setTablaComputadores(new sqlsVisualizacion().sqlPCs("Todos", null)));
        TableColumnModel col = listaTabla.getColumnModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        for (int i = 0; i < listaTabla.getColumnCount(); i++) {
            if (i == listaTabla.getColumnCount()-1) {
                col.getColumn(i).setPreferredWidth(300);
            } else {
                col.getColumn(i).setPreferredWidth(150); 
            }
            listaTabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaComputadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaTrabajo;
    private javax.swing.JComboBox<String> comboPlacas;
    private javax.swing.JLabel imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaTabla;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel regresar;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel titulos;
    // End of variables declaration//GEN-END:variables
}
