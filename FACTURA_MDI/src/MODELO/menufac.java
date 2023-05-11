package MODELO;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class menufac extends javax.swing.JFrame {

    public static int anchofond=450, altofond=300;
    public menufac() {
        setLocation(500, 100);
        initComponents();
        menuitem();
        menuventana();
        titgransol();
        fondo();
        Image facImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/gransol.jpg"));
        setIconImage(facImage);
    }

    public void titgransol(){
        lbl_titigran.setText("MINIMARKET GRAN SOLDADOR");
        lbl_titigran.setFont(new java.awt.Font("Tahoma",3,23));
        lbl_titigran.setLocation(10, 5);
        lbl_titigran.setSize(500, 60);
        lbl_titigran.setForeground(Color.CYAN);
    }
    
    
    public void fondo(){
        ImageIcon imafond = new
        ImageIcon(getClass().getResource("/IMAG/gransol.jpg"));
        ImageIcon mitadfond = new
        ImageIcon(imafond.getImage().getScaledInstance(anchofond,altofond,
        Image.SCALE_DEFAULT));
        lbl_fondogransol.setIcon(mitadfond);
        lbl_fondogransol.setText("");
        
        
        lbl_info.setText("POR FAVOR ESCOGE UNA DE LAS OPCIONES QUE HAY");
        lbl_info.setFont(new java.awt.Font("Tahoma",3,13));
        lbl_info.setForeground(Color.white);
        lbl_info.setLocation(40, 100);
        lbl_info.setSize(500, 60);
        lbl_info2.setText(" DISPONIBLES EN EL APARTADO DE VENTANA");
        lbl_info2.setFont(new java.awt.Font("Tahoma",3,13));
        lbl_info2.setForeground(Color.white);
        lbl_info2.setLocation(60, 150);
        lbl_info2.setSize(500, 60);   
    }
    
    public void menuventana(){
        menuvent.setText("Ventana");
        menuvent.setMnemonic('V');
        menuBar.add(menuvent);
        menuvent.add(contvent1);
        menuvent.add(contvent2);
        menuvent.add(contvent3);
        
                
                
        contvent1.setText("Clientes");
        contvent1.setMnemonic('C');
        contvent2.setText("Productos");
        contvent2.setMnemonic('P');
        contvent3.setText("Facturacion");
        contvent3.setMnemonic('F');
        
        
        
    }
    
    public void menuitem(){//Inicio menuitem
        
        fileMenu.setText("Opciones");
        fileMenu.setMnemonic('O');
        fileMenu.add(mi_cerrSes);
        fileMenu.add(exitMenuItem);
        
        
        
        
        mi_cerrSes.setText("Cerrar Sesion");
        mi_cerrSes.setMnemonic('C');
        mi_cerrSes.addActionListener(new java.awt.event.ActionListener() {           
            public void actionPerformed(ActionEvent ae) {
                login log = new login();
                log.setVisible(true);
                dispose();
            }
        });
        
        exitMenuItem.setMnemonic('S');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });    
            
    }//Final menuitem 
       
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mi_cerrSes = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuvent = new javax.swing.JMenu();
        contvent1 = new javax.swing.JMenuItem();
        contvent2 = new javax.swing.JMenuItem();
        contvent3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 128, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 128, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 128, -1));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 128, -1));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 113, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 113, -1));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, 113, -1));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 113, -1));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 138, -1, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 139, 146, -1));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 167, 146, -1));

        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 193, 146, -1));

        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 219, 146, -1));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 196, 106, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 193, 89, -1));

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 100, 20));

        jTextField5.setText("jTextField5");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 150, -1));

        jTextField6.setText("jTextField6");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 113, -1));

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 257, 130, 20));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 298, 87, -1));

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 329, 87, -1));

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 360, 87, -1));

        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 386, 87, -1));

        jTextField7.setText("jTextField7");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 295, 117, -1));

        jTextField8.setText("jTextField8");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 326, 117, -1));

        jTextField9.setText("jTextField9");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 357, 117, -1));

        jTextField10.setText("jTextField10");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 383, 117, -1));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 461, -1, 36));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 461, -1, 36));

        jButton4.setText("jButton4");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 461, -1, 36));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 400, 220));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        mi_cerrSes.setMnemonic('o');
        mi_cerrSes.setText("Open");
        fileMenu.add(mi_cerrSes);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        menuvent.setMnemonic('h');
        menuvent.setText("Help");

        contvent1.setMnemonic('c');
        contvent1.setText("Contents");
        menuvent.add(contvent1);

        contvent2.setMnemonic('c');
        contvent2.setText("Contents");
        menuvent.add(contvent2);

        contvent3.setMnemonic('c');
        contvent3.setText("Contents");
        menuvent.add(contvent3);

        menuBar.add(menuvent);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem contvent1;
    private javax.swing.JMenuItem contvent2;
    private javax.swing.JMenuItem contvent3;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuvent;
    private javax.swing.JMenuItem mi_cerrSes;
    // End of variables declaration//GEN-END:variables

}
