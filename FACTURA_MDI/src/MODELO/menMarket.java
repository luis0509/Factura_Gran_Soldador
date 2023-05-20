/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;




/**
 *
 * @author Usuario1
 */
public class menMarket extends javax.swing.JFrame {
    mysql_conect db2 = new mysql_conect();
     public static int anchofond=400, altofond=400;
     
    public menMarket() {        
        setLocation(500, 150);
        initComponents();
        menuitem();
        menuventana();
        titgransol();
        fondo();
        Image facImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/gransol.jpg"));
        setIconImage(facImage);
    }

    public void titgransol(){
        jp_menfac.setLocation(500, 100);
        jp_menfac.add(lbl_titigran);
        jp_menfac.add(lbl_info);
        jp_menfac.add(lbl_info2);
        jp_menfac.add(lbl_fondogransol);
        
        lbl_titigran.setText("MINIMARKET GRAN SOLDADOR");
        lbl_titigran.setFont(new java.awt.Font("Tahoma",3,18));
        lbl_titigran.setLocation(50, 5);
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
        menuvent.add(contvent3);
        menuvent.add(contvent3);
        
                
                
        contvent1.setText("Clientes");
        contvent1.setMnemonic('C');
        contvent1.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                frmReg_Cli cli = new frmReg_Cli();
                cli.setVisible(true);
                dispose();
            }
        });
        contvent2.setText("Productos");
        contvent2.setMnemonic('P');
        contvent2.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                producto prod = new producto();
                prod.setVisible(true);
                dispose();
            }
        });
        contvent3.setText("Facturacion");
        contvent3.setMnemonic('F');
        contvent3.addActionListener(new java.awt.event.ActionListener() {           
            public void actionPerformed(ActionEvent ae) {                 
                menufac mf = new menufac();                        
                mf.setVisible(true);
                dispose();
            }
        });
        
        
        
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
                db2.closeConnection();
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

  
//    public menMarket() {
//        initComponents();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_menfac = new javax.swing.JPanel();
        lbl_titigran = new javax.swing.JLabel();
        lbl_info = new javax.swing.JLabel();
        lbl_info2 = new javax.swing.JLabel();
        lbl_fondogransol = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mi_cerrSes = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuvent = new javax.swing.JMenu();
        contvent1 = new javax.swing.JMenuItem();
        contvent3 = new javax.swing.JMenuItem();
        contvent2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titigran.setText("jLabel2");

        lbl_info.setText("jLabel3");

        lbl_info2.setText("jLabel1");

        javax.swing.GroupLayout jp_menfacLayout = new javax.swing.GroupLayout(jp_menfac);
        jp_menfac.setLayout(jp_menfacLayout);
        jp_menfacLayout.setHorizontalGroup(
            jp_menfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menfacLayout.createSequentialGroup()
                .addGroup(jp_menfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_info2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_menfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jp_menfacLayout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(lbl_titigran, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp_menfacLayout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(lbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jp_menfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_fondogransol, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
        jp_menfacLayout.setVerticalGroup(
            jp_menfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menfacLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_titigran)
                .addGap(111, 111, 111)
                .addComponent(lbl_info)
                .addGap(18, 18, 18)
                .addComponent(lbl_info2)
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(jp_menfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_menfacLayout.createSequentialGroup()
                    .addComponent(lbl_fondogransol, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jp_menfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 320));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        mi_cerrSes.setMnemonic('a');
        mi_cerrSes.setText("Save As ...");
        mi_cerrSes.setDisplayedMnemonicIndex(5);
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

        menuvent.setMnemonic('e');
        menuvent.setText("Edit");

        contvent1.setMnemonic('t');
        contvent1.setText("Cut");
        menuvent.add(contvent1);

        contvent3.setMnemonic('y');
        contvent3.setText("Copy");
        menuvent.add(contvent3);

        contvent2.setMnemonic('p');
        contvent2.setText("Paste");
        menuvent.add(contvent2);

        menuBar.add(menuvent);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menMarket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem contvent1;
    private javax.swing.JMenuItem contvent2;
    private javax.swing.JMenuItem contvent3;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel jp_menfac;
    private javax.swing.JLabel lbl_fondogransol;
    private javax.swing.JLabel lbl_info;
    private javax.swing.JLabel lbl_info2;
    private javax.swing.JLabel lbl_titigran;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuvent;
    private javax.swing.JMenuItem mi_cerrSes;
    // End of variables declaration//GEN-END:variables

}
