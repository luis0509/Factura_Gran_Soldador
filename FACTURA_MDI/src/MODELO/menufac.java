package MODELO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import static javafx.scene.paint.Color.color;
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

        desktopPane = new javax.swing.JDesktopPane();
        lbl_titigran = new javax.swing.JLabel();
        lbl_fondogransol = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mi_cerrSes = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuvent = new javax.swing.JMenu();
        contvent1 = new javax.swing.JMenuItem();
        contvent2 = new javax.swing.JMenuItem();
        contvent3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titigran.setText("jLabel1");
        desktopPane.add(lbl_titigran);
        lbl_titigran.setBounds(170, 50, 34, 14);

        lbl_fondogransol.setText("jLabel1");
        desktopPane.add(lbl_fondogransol);
        lbl_fondogransol.setBounds(-6, -6, 410, 290);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem contvent1;
    private javax.swing.JMenuItem contvent2;
    private javax.swing.JMenuItem contvent3;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel lbl_fondogransol;
    private javax.swing.JLabel lbl_titigran;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuvent;
    private javax.swing.JMenuItem mi_cerrSes;
    // End of variables declaration//GEN-END:variables

}
