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

/**
 *
 * @author Jhon
 */
public class AgregarComputador extends javax.swing.JFrame {

    private Menu menu;
    
    /**
     * Creates new form Menu
     */
    public AgregarComputador() {
        initComponents();
        new ColorPaneles(panelMenu);
        ColorBotones color = new ColorBotones();
        color.BotonTitulo(titulos);
        color.BotonMenu(guardar);
        color.BotonMenu(limpiar);
        color.BotonMenu(regresar);
        color.BotonMenu(salir);
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
        guardar = new javax.swing.JLabel();
        limpiar = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        areaTrabajo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaPlacaBase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cajaRam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cajaDD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cajaOffice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cajaAntivirus = new javax.swing.JTextField();
        comboMarcaModelo = new javax.swing.JComboBox<>();
        comboProcesador = new javax.swing.JComboBox<>();
        comboSO = new javax.swing.JComboBox<>();
        comboTipo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cajaResponsable = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cajaUbicacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaObservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear computador");
        setMaximumSize(new java.awt.Dimension(1270, 720));
        setMinimumSize(new java.awt.Dimension(1270, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 720));

        panelMenu.setBackground(new java.awt.Color(64, 75, 105));

        titulos.setBackground(new java.awt.Color(39, 37, 61));
        titulos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulos.setForeground(new java.awt.Color(255, 255, 255));
        titulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulos.setText("Crear computador");
        titulos.setOpaque(true);

        guardar.setBackground(new java.awt.Color(40, 49, 73));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Save_32px_1.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setIconTextGap(20);
        guardar.setOpaque(true);
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(40, 49, 73));
        limpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Erase_32px.png"))); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setIconTextGap(20);
        limpiar.setOpaque(true);
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
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
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(110, 110, 110)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        areaTrabajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 129, 138)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Placa:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Marca y modelo:");

        cajaPlaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajaPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaPlacaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Placa base:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Procesador:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tipo:");

        cajaPlacaBase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajaPlacaBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaPlacaBaseKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Memoria Ram:");

        cajaRam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajaRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaRamKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Disco Duro:");

        cajaDD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajaDD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaDDKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sistema operativo:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Office:");

        cajaOffice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajaOffice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaOfficeKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Antivirus:");

        cajaAntivirus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajaAntivirus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaAntivirusKeyTyped(evt);
            }
        });

        comboMarcaModelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comboProcesador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comboSO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaPlacaBase, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMarcaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaAntivirus, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaRam, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSO, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cajaRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboMarcaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(comboProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaAntivirus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cajaPlacaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 129, 138)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Responsable:");

        cajaResponsable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajaResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaResponsableKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Ubicación:");

        cajaUbicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajaUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaUbicacionKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Observaciones:");

        cajaObservaciones.setColumns(20);
        cajaObservaciones.setRows(5);
        jScrollPane1.setViewportView(cajaObservaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cajaUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cajaResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cajaUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout areaTrabajoLayout = new javax.swing.GroupLayout(areaTrabajo);
        areaTrabajo.setLayout(areaTrabajoLayout);
        areaTrabajoLayout.setHorizontalGroup(
            areaTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        areaTrabajoLayout.setVerticalGroup(
            areaTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabajoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void cajaPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPlacaKeyTyped
        MetodosEstaticos.limitaCajas(cajaPlaca, evt, 50);
    }//GEN-LAST:event_cajaPlacaKeyTyped

    private void cajaPlacaBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPlacaBaseKeyTyped
        MetodosEstaticos.limitaCajas(cajaPlacaBase, evt, 50);
    }//GEN-LAST:event_cajaPlacaBaseKeyTyped

    private void cajaRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaRamKeyTyped
        MetodosEstaticos.limitaCajas(cajaRam, evt, 20);
    }//GEN-LAST:event_cajaRamKeyTyped

    private void cajaDDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaDDKeyTyped
        MetodosEstaticos.limitaCajas(cajaDD, evt, 10);
    }//GEN-LAST:event_cajaDDKeyTyped

    private void cajaOfficeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaOfficeKeyTyped
        MetodosEstaticos.limitaCajas(cajaOffice, evt, 50);
    }//GEN-LAST:event_cajaOfficeKeyTyped

    private void cajaAntivirusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaAntivirusKeyTyped
        MetodosEstaticos.limitaCajas(cajaAntivirus, evt, 50);
    }//GEN-LAST:event_cajaAntivirusKeyTyped

    private void cajaResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaResponsableKeyTyped
        MetodosEstaticos.limitaCajas(cajaResponsable, evt, 50);
    }//GEN-LAST:event_cajaResponsableKeyTyped

    private void cajaUbicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaUbicacionKeyTyped
        MetodosEstaticos.limitaCajas(cajaUbicacion, evt, 50);
    }//GEN-LAST:event_cajaUbicacionKeyTyped

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_regresarMouseClicked

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        restableceCampos();
    }//GEN-LAST:event_limpiarMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        if (cajaPlaca.getText().isEmpty() || cajaPlacaBase.getText().isEmpty() 
                || cajaRam.getText().isEmpty() || cajaDD.getText().isEmpty()  
                || cajaOffice.getText().isEmpty() || cajaAntivirus.getText().isEmpty() 
                || cajaResponsable.getText().isEmpty() || cajaUbicacion.getText().isEmpty() 
                || cajaObservaciones.getText().isEmpty() || comboTipo.getSelectedIndex() == 0 
                || comboMarcaModelo.getSelectedIndex() == 0 || comboProcesador.getSelectedIndex() == 0
                || comboSO.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben tener datos", "Se presento un error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(null, "Confirmar la creación del computador") == 0) {
                Computadores pc = new Computadores(
                    cajaPlaca.getText().toUpperCase().trim(), 
                    comboMarcaModelo.getSelectedItem().toString(), 
                    comboTipo.getSelectedItem().toString(), 
                    comboProcesador.getSelectedItem().toString(), 
                    cajaPlacaBase.getText().trim(), 
                    cajaRam.getText().trim().toUpperCase(), 
                    cajaDD.getText().trim().toUpperCase(), 
                    comboSO.getSelectedItem().toString(), 
                    cajaOffice.getText().trim(), 
                    cajaAntivirus.getText().trim(), 
                    cajaResponsable.getText().trim(), 
                    cajaUbicacion.getText().trim(), 
                    cajaObservaciones.getText().trim(), 
                    true);
                String resultado = new BaseDatos().guardarInformacion(new sqlsGuardado().sqlInsertaComputadores(pc));
                if (resultado.startsWith("El")) {
                   restableceCampos(); 
                }
                JOptionPane.showMessageDialog(null, resultado);
            }
        }
    }//GEN-LAST:event_guardarMouseClicked
        
    private void restableceCampos(){
        cajaPlaca.setText("");
        comboMarcaModelo.setSelectedIndex(0);
        comboTipo.setSelectedIndex(0);
        comboProcesador.setSelectedIndex(0);
        cajaPlacaBase.setText("");
        cajaRam.setText("");
        cajaDD.setText("");
        comboSO.setSelectedIndex(0);
        cajaOffice.setText("");
        cajaAntivirus.setText("");
        cajaResponsable.setText("");
        cajaUbicacion.setText("");
        cajaObservaciones.setText("");
    }
    
    private void cargoTipo(){
        comboTipo.addItem("");
        comboTipo.addItem("Escritorio");
        comboTipo.addItem("Portatil");
        comboTipo.addItem("Todo en uno");
        comboTipo.addItem("Otros");
    }
    
    public void iniciadorVentanas(){
        menu = new Menu();
        MetodosEstaticos.cargadorCombo("Marca y Modelo", comboMarcaModelo);
        MetodosEstaticos.cargadorCombo("Procesador", comboProcesador);
        MetodosEstaticos.cargadorCombo("Sistema operativo", comboSO);
        cargoTipo();
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
            java.util.logging.Logger.getLogger(AgregarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaTrabajo;
    private javax.swing.JTextField cajaAntivirus;
    private javax.swing.JTextField cajaDD;
    private javax.swing.JTextArea cajaObservaciones;
    private javax.swing.JTextField cajaOffice;
    private javax.swing.JTextField cajaPlaca;
    private javax.swing.JTextField cajaPlacaBase;
    private javax.swing.JTextField cajaRam;
    private javax.swing.JTextField cajaResponsable;
    private javax.swing.JTextField cajaUbicacion;
    private javax.swing.JComboBox<String> comboMarcaModelo;
    private javax.swing.JComboBox<String> comboProcesador;
    private javax.swing.JComboBox<String> comboSO;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel guardar;
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
    private javax.swing.JLabel limpiar;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel regresar;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel titulos;
    // End of variables declaration//GEN-END:variables
}
