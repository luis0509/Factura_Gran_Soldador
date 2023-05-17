package MODELO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmReg_Cli extends javax.swing.JFrame {

    DefaultTableModel tabla_ema = new DefaultTableModel();
    ArrayList<regCliclass> listaCli = new ArrayList<regCliclass>();

    public static int anchofond = 120, altofond = 120;
    int[] id = {1, 2, 3, 4};
    String[] ruta = {"/IMAG/gransol2.jpg"};

    public frmReg_Cli() {

        setTitle("REGISTROS CLIENTES");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image regImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/gransol.jpg"));
        setIconImage(regImage);
        //setLocationRelativeTo(null);
        initComponents();

        setLocation(500, 100);
        ImageIcon fotos = new ImageIcon(getClass().getResource(ruta[0]));
        ImageIcon mitad = new ImageIcon(fotos.getImage().getScaledInstance(anchofond, altofond, Image.SCALE_DEFAULT));
        jlb_img.setIcon(mitad);

        tabla_ema = new DefaultTableModel();
        tabla_ema.addColumn("Documento");
        tabla_ema.addColumn("Nombre");
        tabla_ema.addColumn("Apellido");
        tabla_ema.addColumn("Direccion");
        tabla_ema.addColumn("Celular");

        jt_cli.setVisible(true);
        jt_cli.setModel(tabla_ema);

//        refrescartab();
        ///////////////////////////////////////////
        Image iconoAgregar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/AGREGAR.png"));
        bt_nvocli.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(bt_nvocli.getWidth(), bt_nvocli.getWidth(), Image.SCALE_SMOOTH)));
        /////////////////////////////////////////////////
        Image iconoCancel = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/CANCELAR.png"));
        btCancelar.setIcon(new ImageIcon(iconoCancel.getScaledInstance(btCancelar.getWidth(), btCancelar.getWidth(), Image.SCALE_SMOOTH)));

        /////////////////////////////////////////////////
        Image iconoSalir = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/CERRAR.png"));
        btSalir.setIcon(new ImageIcon(iconoSalir.getScaledInstance(btSalir.getWidth(), btSalir.getWidth(), Image.SCALE_SMOOTH)));

        /////////////////////////////////////////////////
        Image iconoVertod = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/MOSTRAR_DATOS.png"));
        btVer_todo.setIcon(new ImageIcon(iconoVertod.getScaledInstance(btVer_todo.getWidth(), btVer_todo.getWidth(), Image.SCALE_SMOOTH)));

        /////////////////////////////////////////////////
        Image iconoGuardar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/GUARDAR.png"));
        btGuardar.setIcon(new ImageIcon(iconoGuardar.getScaledInstance(btGuardar.getWidth(), btGuardar.getWidth(), Image.SCALE_SMOOTH)));

        ema();

        ActionListener guardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//               

            }
        };
        ActionListener mostrarcli = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//              
            }
        };
        btVer_todo.addActionListener(mostrarcli);

    }

    private void ema() {

        btGuardar.setToolTipText("GUARDAR CLIENTE");

        btCancelar.setToolTipText("CANCELAR CLIENTE");

        bt_nvocli.setText("NUEVO CLIENTE");

        btSalir.setToolTipText("SALIR");

        btVer_todo.setToolTipText("VER TODO");

        jlbIde.setText("CC");
        jlbIde.setFont(new Font("Arial", Font.BOLD, 18));
        jlbIde.setForeground(Color.BLACK);
        ///////////////////////////////////////////
        jlbNombre.setText("Nombre");
        jlbNombre.setFont(new Font("Arial", Font.BOLD, 18));
        jlbNombre.setForeground(Color.BLACK);
        ////////////////////////////////////////////
        jlbApel.setText("Apellido");
        jlbApel.setFont(new Font("Arial", Font.BOLD, 18));
        jlbApel.setForeground(Color.BLACK);
        ////////////////////////////////////////////
        jlbCiudad.setText("Direccion");
        jlbCiudad.setFont(new Font("Arial", Font.BOLD, 16));
        jlbCiudad.setForeground(Color.BLACK);
        ////////////////////////////////////////////
        lblTituloEma.setText("REGISTRO CLIENTE");
        lblTituloEma.setFont(new Font("Arial", Font.BOLD, 22));
        lblTituloEma.setForeground(Color.BLACK);

        ///////////////////////////////
        jlbTelef.setText("Celular");
        jlbTelef.setFont(new Font("Arial", Font.BOLD, 18));
        jlbTelef.setForeground(Color.BLACK);
        //////////////////////////////////////////////////////////////
        jlbMinititulo.setText("MiniMarket G.soldier");
        jlbMinititulo.setFont(new Font("Arial", Font.BOLD, 15));
        jlbMinititulo.setForeground(Color.BLACK);
        ////////////////////////////////////////////////////////////////////
        jlbMinidir.setText("Calle 10 # 25-10");
        jlbMinidir.setFont(new Font("Arial", Font.BOLD, 15));
        jlbMinidir.setForeground(Color.BLACK);
        ////////////////////////////////////////////////////////////////
        jlbRegion.setText("Cali/Valle");
        jlbRegion.setFont(new Font("Arial", Font.BOLD, 15));
        jlbRegion.setForeground(Color.BLACK);
        ////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////tamaño y tipo de letra de los jtext
        jtIde.setText("Dni");
        jtIde.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtNombre.setText("Nombre");
        jtNombre.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtApellido.setText("Apellido");
        jtApellido.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtCiudad.setText("Direccion");
        jtCiudad.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtTele.setText("Celular");
        jtTele.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtIde.setToolTipText("Digita identificacion");
        jtNombre.setToolTipText("escribe nombre");
        jtApellido.setToolTipText("escribe apellido");
        jtCiudad.setToolTipText("Direccion");
        jtTele.setToolTipText("digita Celular");
        /////////////////////////////////boton aceptar

        btGuardar.setFont(new Font("Arial", Font.BOLD, 18));
        btGuardar.setForeground(Color.BLACK);
        /////////////////////////////////boton cancelar 

        btCancelar.setFont(new Font("Arial", Font.BOLD, 18));
        btCancelar.setForeground(Color.BLACK);
        /////////////////////////////////////////boton salir

        btSalir.setFont(new Font("Arial", Font.BOLD, 18));
        btSalir.setForeground(Color.BLACK);
        ///////////////////////////////////////////////boton editar

        /////////////////////////////////////////////////boton ver todo
        btVer_todo.setFont(new Font("Arial", Font.BOLD, 18));
        btVer_todo.setForeground(Color.BLACK);
        ///////////////////////////////////////////////////boton nuevo cliente

        bt_nvocli.setFont(new Font("Arial", Font.BOLD, 18));
        bt_nvocli.setForeground(Color.BLACK);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbIde = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbApel = new javax.swing.JLabel();
        jlbCiudad = new javax.swing.JLabel();
        jtIde = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtCiudad = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jlbTelef = new javax.swing.JLabel();
        jtTele = new javax.swing.JTextField();
        jlbMinititulo = new javax.swing.JLabel();
        jlbMinidir = new javax.swing.JLabel();
        jlbRegion = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        btVer_todo = new javax.swing.JButton();
        bt_nvocli = new javax.swing.JButton();
        jlb_img = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_cli = new javax.swing.JTable();
        lblTituloEma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));

        jlbIde.setText("jLabel1");

        jlbNombre.setText("jLabel2");

        jlbApel.setText("jLabel3");

        jlbCiudad.setText("jLabel5");

        jtIde.setText("jTextField1");
        jtIde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtIdeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdeFocusLost(evt);
            }
        });

        jtNombre.setText("jTextField2");
        jtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreFocusLost(evt);
            }
        });

        jtApellido.setText("jTextField3");
        jtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtApellidoFocusLost(evt);
            }
        });

        jtCiudad.setText("jTextField5");
        jtCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCiudadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCiudadFocusLost(evt);
            }
        });

        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jlbTelef.setText("jLabel1");

        jtTele.setText("jTextField1");
        jtTele.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtTeleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtTeleFocusLost(evt);
            }
        });

        jlbMinititulo.setText("jLabel1");

        jlbMinidir.setText("jLabel2");

        jlbRegion.setText("jLabel1");

        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        bt_nvocli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nvocliActionPerformed(evt);
            }
        });

        jt_cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jt_cli);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jlbApel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbIde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtIde, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTele, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlb_img, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_nvocli, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVer_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblTituloEma, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlbMinidir, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jlbMinititulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbIde)
                            .addComponent(jtIde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNombre)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbApel)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCiudad)
                            .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbTelef)
                            .addComponent(jtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloEma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbMinititulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbMinidir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbRegion)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_nvocli, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btVer_todo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//public void refrescartab() {
//    while (tabla_ema.getRowCount()>0) {        
//        tabla_ema.removeRow(0);
//    }for (regCliclass cliclass : listaCli) {
//     
//    }
//        jt_cli.setModel(tabla_ema);
//    }
    private void jtIdeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdeFocusGained
        if (jtIde.getText().equals("Dni")) {
            jtIde.setText("");
            jtIde.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtIdeFocusGained

    private void jtIdeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdeFocusLost
        if (jtIde.getText().equals("")) {
            jtIde.setText("Dni");
            jtIde.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jtIdeFocusLost

    private void jtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusGained
        if (jtNombre.getText().equals("Nombre")) {
            jtNombre.setText("");
            jtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtNombreFocusGained

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost
        if (jtNombre.getText().equals("")) {
            jtNombre.setText("Nombre");
            jtNombre.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jtNombreFocusLost

    private void jtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtApellidoFocusGained
        if (jtApellido.getText().equals("Apellido")) {
            jtApellido.setText("");
            jtApellido.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtApellidoFocusGained

    private void jtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtApellidoFocusLost
        if (jtApellido.getText().equals("")) {
            jtApellido.setText("Apellido");
            jtApellido.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jtApellidoFocusLost

    private void jtCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCiudadFocusGained
        if (jtCiudad.getText().equals("Direccion")) {
            jtCiudad.setText("");
            jtCiudad.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtCiudadFocusGained

    private void jtCiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCiudadFocusLost
        if (jtCiudad.getText().equals("")) {
            jtCiudad.setText("Direccion");
            jtCiudad.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jtCiudadFocusLost

    private void jtTeleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTeleFocusGained
        if (jtTele.getText().equals("Celular")) {
            jtTele.setText("");
            jtTele.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtTeleFocusGained

    private void jtTeleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTeleFocusLost
        if (jtTele.getText().equals("")) {
            jtTele.setText("Celular");
            jtTele.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jtTeleFocusLost

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        int sal = JOptionPane.showConfirmDialog(null, "Vas a salir", "Salir", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (sal == 0) {
            menMarket mK = new menMarket();
            mK.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        int can = JOptionPane.showConfirmDialog(null, "Vas a Cancelar el registro", "Cancelar Registro", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (can == 0) {

            jtIde.setText("Dni");
            jtIde.setForeground(Color.LIGHT_GRAY);

            jtNombre.setText("Nombre");
            jtNombre.setForeground(Color.LIGHT_GRAY);

            jtApellido.setText("Apellido");
            jtApellido.setForeground(Color.LIGHT_GRAY);

            jtCiudad.setText("Direccion");
            jtCiudad.setForeground(Color.LIGHT_GRAY);

            jtTele.setText("Celular");
            jtTele.setForeground(Color.LIGHT_GRAY);


        }    }//GEN-LAST:event_btCancelarActionPerformed

    private void bt_nvocliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nvocliActionPerformed
       try {

            regCliclass cli = new regCliclass();
            cli.setNom(jtNombre.getText());
            cli.setApell(jtApellido.getText());
            cli.setCiu(jtCiudad.getText());
            listaCli.add(cli);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR DE CLIENTE");
        }
    }//GEN-LAST:event_bt_nvocliActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVer_todo;
    private javax.swing.JButton bt_nvocli;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbApel;
    private javax.swing.JLabel jlbCiudad;
    private javax.swing.JLabel jlbIde;
    private javax.swing.JLabel jlbMinidir;
    private javax.swing.JLabel jlbMinititulo;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbRegion;
    private javax.swing.JLabel jlbTelef;
    private javax.swing.JLabel jlb_img;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCiudad;
    private javax.swing.JTextField jtIde;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTele;
    private javax.swing.JTable jt_cli;
    private javax.swing.JLabel lblTituloEma;
    // End of variables declaration//GEN-END:variables
}
