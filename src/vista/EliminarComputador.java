/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import almacenamiento.BaseDatos;
import javax.swing.JOptionPane;
import procesos.ColorBotones;
import procesos.ColorPaneles;
import procesos.Computadores;
import procesos.MetodosEstaticos;
import procesos.sqlsGuardado;
import procesos.sqlsVisualizacion;

/**
 *
 * @author Jhon
 */
public class EliminarComputador extends javax.swing.JFrame {

    private Menu menu;
    /**
     * Creates new form Menu
     */
    public EliminarComputador() {
        initComponents();
        new ColorPaneles(panelMenu);
        ColorBotones color = new ColorBotones();
        color.BotonTitulo(titulos);
        color.BotonMenu(Borrar);
        color.BotonMenu(regresar);
        color.BotonMenu(salir);
        color.BotonMenu(buscar);
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
        Borrar = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        areaTrabajo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaObservaciones = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        textoMM = new javax.swing.JLabel();
        textoDD = new javax.swing.JLabel();
        textoSO = new javax.swing.JLabel();
        textoOf = new javax.swing.JLabel();
        textoAn = new javax.swing.JLabel();
        textoTi = new javax.swing.JLabel();
        textoPro = new javax.swing.JLabel();
        textoPB = new javax.swing.JLabel();
        textoR = new javax.swing.JLabel();
        textoMR = new javax.swing.JLabel();
        textoU = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JLabel();
        comboPlacas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar computador");
        setMaximumSize(new java.awt.Dimension(1270, 720));
        setMinimumSize(new java.awt.Dimension(1270, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 720));

        panelMenu.setBackground(new java.awt.Color(64, 75, 105));

        titulos.setBackground(new java.awt.Color(39, 37, 61));
        titulos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulos.setForeground(new java.awt.Color(255, 255, 255));
        titulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulos.setText("Eliminar computador");
        titulos.setOpaque(true);

        Borrar.setBackground(new java.awt.Color(40, 49, 73));
        Borrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Delete_Document_32px.png"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Borrar.setIconTextGap(20);
        Borrar.setOpaque(true);
        Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarMouseClicked(evt);
            }
        });

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
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulos, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(titulos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        areaTrabajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 129, 138)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Marca y modelo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Placa base:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Procesador:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Memoria Ram:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Disco Duro:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sistema operativo:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Office:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Antivirus:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Responsable:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Ubicación:");

        cajaObservaciones.setColumns(20);
        cajaObservaciones.setRows(5);
        cajaObservaciones.setEnabled(false);
        jScrollPane1.setViewportView(cajaObservaciones);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Observaciones:");

        textoMM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoMM.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoDD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoDD.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoSO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoSO.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoOf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoOf.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoAn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoAn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoTi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoTi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoPro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoPB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoPB.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoR.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoMR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoMR.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoU.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoMR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoMM, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoTi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoPB, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textoOf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textoAn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                        .addComponent(textoDD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(29, 29, 29)
                                        .addComponent(textoSO, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoDD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(textoSO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(textoOf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(textoAn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textoMM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoTi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(textoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(textoPB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(textoMR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(textoU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 129, 138)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Placa:");

        buscar.setBackground(new java.awt.Color(40, 49, 73));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Search_32px.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.setIconTextGap(20);
        buscar.setOpaque(true);
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });

        comboPlacas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(comboPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout areaTrabajoLayout = new javax.swing.GroupLayout(areaTrabajo);
        areaTrabajo.setLayout(areaTrabajoLayout);
        areaTrabajoLayout.setHorizontalGroup(
            areaTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaTrabajoLayout.setVerticalGroup(
            areaTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        if (comboPlacas.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "El campo placa deben tener datos", "Se presento un error", JOptionPane.ERROR_MESSAGE);
        } else {
            Computadores pc = new BaseDatos().cargaComputador(new sqlsVisualizacion().sqlSelecionaComputadores(comboPlacas.getSelectedItem().toString()));
            textoMM.setText(pc.getMarcaModelo());
            textoTi.setText(pc.getTipo());
            textoPro.setText(pc.getProcesador());
            textoPB.setText(pc.getPlacaBase());
            textoMR.setText(pc.getMemoriaRam());
            textoDD.setText(pc.getDiscoDuro());
            textoSO.setText(pc.getSistemaOperativo());
            textoOf.setText(pc.getOffice());
            textoAn.setText(pc.getAntivirus());
            textoR.setText(pc.getResponsable());
            textoU.setText(pc.getUbicacion());
            cajaObservaciones.setText(pc.getObservaciones());
            comboPlacas.setEnabled(false);
        }
    }//GEN-LAST:event_buscarMouseClicked

    private void BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseClicked
        if (textoMM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El computador no a sido buscado para ser eliminado", "Se presento un error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showInternalConfirmDialog(null, "Confirmar borrado del computador") == 0) {
                String sql = new sqlsGuardado().sqlEliminar(comboPlacas.getSelectedItem().toString(), "PC");
                String resultado = new BaseDatos().guardarInformacion(sql);
                JOptionPane.showMessageDialog(null, resultado);
                if (resultado.startsWith("El")) {
                    this.setVisible(false);
                    menu.setVisible(true); 
                }
                JOptionPane.showMessageDialog(null, resultado);
            }
        }
    }//GEN-LAST:event_BorrarMouseClicked
    
    public void iniciadorVentanas(){
        menu = new Menu();
        MetodosEstaticos.cargadorCombo("Placas", comboPlacas);
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
            java.util.logging.Logger.getLogger(EliminarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Borrar;
    private javax.swing.JPanel areaTrabajo;
    private javax.swing.JLabel buscar;
    private javax.swing.JTextArea cajaObservaciones;
    private javax.swing.JComboBox<String> comboPlacas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel regresar;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel textoAn;
    private javax.swing.JLabel textoDD;
    private javax.swing.JLabel textoMM;
    private javax.swing.JLabel textoMR;
    private javax.swing.JLabel textoOf;
    private javax.swing.JLabel textoPB;
    private javax.swing.JLabel textoPro;
    private javax.swing.JLabel textoR;
    private javax.swing.JLabel textoSO;
    private javax.swing.JLabel textoTi;
    private javax.swing.JLabel textoU;
    private javax.swing.JLabel titulos;
    // End of variables declaration//GEN-END:variables
}
