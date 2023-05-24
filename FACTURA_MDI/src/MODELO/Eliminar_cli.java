package MODELO;

import java.awt.event.ActionEvent;

public class Eliminar_cli extends javax.swing.JFrame {

    public Eliminar_cli() {
        setLocation(500, 150);
        initComponents();
        menu();
        cont();
    }

    public void menu() {
        fileMenu_del.add(sal_delcli);

        fileMenu_del.setText("Opcion");
        fileMenu_del.setMnemonic('O');

        sal_delcli.setText("Salir");
        sal_delcli.setMnemonic('S');
        sal_delcli.addActionListener(new java.awt.event.ActionListener() {           
            public void actionPerformed(ActionEvent ae) {
                frmReg_Cli regcli = new frmReg_Cli();
                regcli.setVisible(true);
                dispose();
            }
        });
    }
    
    public void cont(){
        lbl_borrar.setText("ID: ");
        lbl_borrar.setFont(new java.awt.Font("Tahoma",3,18));
        btn_borrar.setText("Eliminar");
        btn_borrar.setFont(new java.awt.Font("Tahoma",3,12));
        jtf_borrar.setText("");
        jtf_borrar.setBounds(55, 28, 180, 24);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        lbl_borrar = new javax.swing.JLabel();
        jtf_borrar = new javax.swing.JTextField();
        btn_borrar = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu_del = new javax.swing.JMenu();
        sal_delcli = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_borrar.setText("jLabel1");
        desktopPane.add(lbl_borrar);
        lbl_borrar.setBounds(20, 30, 41, 16);

        jtf_borrar.setText("jTextField1");
        desktopPane.add(jtf_borrar);
        jtf_borrar.setBounds(130, 30, 73, 24);

        btn_borrar.setText("jButton1");
        desktopPane.add(btn_borrar);
        btn_borrar.setBounds(160, 70, 77, 32);

        fileMenu_del.setMnemonic('f');
        fileMenu_del.setText("File");

        sal_delcli.setMnemonic('x');
        sal_delcli.setText("Exit");
        sal_delcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sal_delcliActionPerformed(evt);
            }
        });
        fileMenu_del.add(sal_delcli);

        menuBar.add(fileMenu_del);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sal_delcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sal_delcliActionPerformed
        //System.exit(0);
    }//GEN-LAST:event_sal_delcliActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar_cli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_cli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_cli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_cli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_cli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu_del;
    private javax.swing.JTextField jtf_borrar;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem sal_delcli;
    // End of variables declaration//GEN-END:variables

}
