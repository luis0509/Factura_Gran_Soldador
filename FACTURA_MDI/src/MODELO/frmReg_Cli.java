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

    public frmReg_Cli() {
        setTitle("REGISTROS CLIENTES");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //setLocationRelativeTo(null);
        setLocation(500, 100);
        initComponents();
        tabla_ema.addColumn("ID");
        tabla_ema.addColumn("NOMBRE");
        tabla_ema.addColumn("APELLIDO");
        tabla_ema.addColumn("CIUDAD");
        tabla_ema.addColumn("TELEFONO");
//        refrescartab();
        ///////////////////////////////////////////
        //Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/gransol.png"));
        //setIconImage(icono);

        //jlbLogo.setIcon(new ImageIcon(icono.getScaledInstance(jlbLogo.getWidth(), jlbLogo.getWidth(), Image.SCALE_SMOOTH)));
        //setSize(new Dimension(998, 550));

       // Image iconoAgregar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/nuevo.png"));
        //btNue_cli.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(btNue_cli.getWidth(), btNue_cli.getWidth(), Image.SCALE_SMOOTH)));
        ///////////////////////////////////////////////////
        //Image iconoCancel = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/cancelar.png"));
        //btCancelar.setIcon(new ImageIcon(iconoCancel.getScaledInstance(btCancelar.getWidth(), btCancelar.getWidth(), Image.SCALE_SMOOTH)));
        getContentPane().setBackground(Color.cyan);
        ///////////////////////////////////////////////////
        //Image iconoSalir = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/salir.png"));
        //btSalir.setIcon(new ImageIcon(iconoSalir.getScaledInstance(btSalir.getWidth(), btSalir.getWidth(), Image.SCALE_SMOOTH)));
        getContentPane().setBackground(Color.cyan);
        ///////////////////////////////////////////////////
        //Image iconoVertod = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/vertodo.png"));
        //btVer_todo.setIcon(new ImageIcon(iconoVertod.getScaledInstance(btVer_todo.getWidth(), btVer_todo.getWidth(), Image.SCALE_SMOOTH)));
        getContentPane().setBackground(Color.cyan);
        ///////////////////////////////////////////////////
        //Image iconoGuardar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/guardar.png"));
        //btGuardar.setIcon(new ImageIcon(iconoGuardar.getScaledInstance(btGuardar.getWidth(), btGuardar.getWidth(), Image.SCALE_SMOOTH)));
        getContentPane().setBackground(Color.cyan);

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

//        btGuardar.setToolTipText("click para guardar cliente");
//        btCancelar.setToolTipText("click para cancelar cliente");
//        btNue_cli.setText("click para nuevo cliente");
//        btSalir.setToolTipText("click para salir");
//        btVer_todo.setToolTipText("click para ver todo");

        jlbIde.setText("Id");
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
        jlbCiudad.setText("Ciudad");
        jlbCiudad.setFont(new Font("Arial", Font.BOLD, 18));
        jlbCiudad.setForeground(Color.BLACK);
        ////////////////////////////////////////////
        lblTituloEma.setText("REGISTRO CLIENTE");
        lblTituloEma.setFont(new Font("Arial", Font.BOLD, 22));
        lblTituloEma.setForeground(Color.BLACK);

        ///////////////////////////////
        jlbTelef.setText("Telefono");
        jlbTelef.setFont(new Font("Arial", Font.BOLD, 18));
        jlbTelef.setForeground(Color.BLACK);
        //////////////////////////////////////////////////////////////
        jlbMinititulo.setText("Mini Market");
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
        jtIde.setText("Id");
        jtIde.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtNombre.setText("Nombre");
        jtNombre.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtApellido.setText("Apellido");
        jtApellido.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtCiudad.setText("Ciudad");
        jtCiudad.setForeground(Color.LIGHT_GRAY);

        //////////////////////////////////////////////
        jtTele.setText("Telefono");
        jtTele.setForeground(Color.LIGHT_GRAY);
        //////////////////////////////////////////////
        jtIde.setToolTipText("Digita identificacion");
        jtNombre.setToolTipText("escribe nombre");
        jtApellido.setToolTipText("escribe apellido");
        jtCiudad.setToolTipText("ciudad");
        jtTele.setToolTipText("digita telefono");
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

        btNue_cli.setFont(new Font("Arial", Font.BOLD, 18));
        btNue_cli.setForeground(Color.BLACK);

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
        jlbLogo = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        btVer_todo = new javax.swing.JButton();
        btNue_cli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_cli = new javax.swing.JTable();
        lblTituloEma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jlbLogo.setBackground(new java.awt.Color(255, 255, 255));
        jlbLogo.setToolTipText("");

        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btNue_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNue_cliActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlbIde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbApel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbCiudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbTelef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jtCiudad)
                            .addComponent(jtNombre)
                            .addComponent(jtIde)
                            .addComponent(jtTele)))
                    .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblTituloEma, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbMinidir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbMinititulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btNue_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btVer_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbMinititulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbMinidir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbRegion)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(btNue_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btVer_todo, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTituloEma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
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
                            .addComponent(jtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbTelef))))
                .addContainerGap(46, Short.MAX_VALUE))
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
        if (jtIde.getText().equals("Id")) {
            jtIde.setText("");
            jtIde.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtIdeFocusGained

    private void jtIdeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdeFocusLost
        if (jtIde.getText().equals("")) {
            jtIde.setText("Id");
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
        if (jtCiudad.getText().equals("Ciudad")) {
            jtCiudad.setText("");
            jtCiudad.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtCiudadFocusGained

    private void jtCiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCiudadFocusLost
        if (jtCiudad.getText().equals("")) {
            jtCiudad.setText("Ciudad");
            jtCiudad.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jtCiudadFocusLost

    private void jtTeleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTeleFocusGained
        if (jtTele.getText().equals("Telefono")) {
            jtTele.setText("");
            jtTele.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtTeleFocusGained

    private void jtTeleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTeleFocusLost
        if (jtTele.getText().equals("")) {
            jtTele.setText("Telefono");
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

    private void btNue_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNue_cliActionPerformed
        try {

            regCliclass cli = new regCliclass();
            cli.setNom(jtNombre.getText());
            cli.setApell(jtApellido.getText());
            cli.setCiu(jtCiudad.getText());
            listaCli.add(cli);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "ERROR DE CLIENTE");
            }
//        cli.tel(Integer.parseInt(jtTele.getSelectedItem().toString()));

    }//GEN-LAST:event_btNue_cliActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        int can = JOptionPane.showConfirmDialog(null, "Vas a Cancelar el registro", "Cancelar Registro", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (can == 0) {

            jtIde.setText("Id");
            jtIde.setForeground(Color.LIGHT_GRAY);

            jtNombre.setText("Nombre");
            jtNombre.setForeground(Color.LIGHT_GRAY);

            jtApellido.setText("Apellido");
            jtApellido.setForeground(Color.LIGHT_GRAY);

            jtCiudad.setText("Direccion");
            jtCiudad.setForeground(Color.LIGHT_GRAY);

            jtTele.setText("Telefono");
            jtTele.setForeground(Color.LIGHT_GRAY);

            dispose();
        }    }//GEN-LAST:event_btCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNue_cli;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVer_todo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbApel;
    private javax.swing.JLabel jlbCiudad;
    private javax.swing.JLabel jlbIde;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbMinidir;
    private javax.swing.JLabel jlbMinititulo;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbRegion;
    private javax.swing.JLabel jlbTelef;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCiudad;
    private javax.swing.JTextField jtIde;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTele;
    private javax.swing.JTable jt_cli;
    private javax.swing.JLabel lblTituloEma;
    // End of variables declaration//GEN-END:variables
}
