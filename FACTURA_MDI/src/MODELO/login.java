package MODELO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import CONTROLADOR.Users;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
mysql_conect db = new mysql_conect();        
  public static int anchofond=130, altofond=80;
  public static int anchofond2=450, altofond2=300;
    public login() {
        setLocation(500, 100);
        initComponents();         
        jpanelfondo();        
        fond();
        titulo();
        loginuser();
        botonesmenu(); 
        jtuser_pass();
        Image facImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/gransol.jpg"));
        setIconImage(facImage);
    }
    
    public void fond (){
        ImageIcon imafond = new
        ImageIcon(getClass().getResource("/IMAG/gransol.jpg"));
        ImageIcon mitadfond = new
        ImageIcon(imafond.getImage().getScaledInstance(anchofond2,altofond2,
        Image.SCALE_DEFAULT));
        lbl_fotofon.setIcon(mitadfond);
        lbl_fotofon.setText("");
    }
    
    public void jpanelfondo(){               
        jp_fondo.setBackground(Color.black);
               
    }

    public void titulo(){
        lbl_titulo.setFont(new java.awt.Font("Tahoma", 3 , 15));
        lbl_titulo.setText("Inicio de Sesion");
        lbl_titulo.setForeground(Color.yellow);
    }
    
    public void loginuser(){
        lbl_user.setFont(new java.awt.Font("Tahoma", 3, 15));
        lbl_user.setText("Usuario");        
        lbl_user.setForeground(Color.yellow);
        
        lbl_clave.setFont(new java.awt.Font("Tahoma", 3, 15));
        lbl_clave.setText("Contraseña");        
        lbl_clave.setForeground(Color.yellow);
        
    }
    public void jtuser_pass(){
      //USUARIO
      jt_user.setText("");                          
      jt_user.setPreferredSize(new Dimension(80,25 ));
      javax.swing.border.Border mar = BorderFactory.createLineBorder(Color.yellow,3);
      jt_user.setBorder(mar);
      
      //CLAVE
      jp_clave.setText("");
      jp_clave.setPreferredSize(new Dimension(80,25 ));
      javax.swing.border.Border mar2 = BorderFactory.createLineBorder(Color.yellow,3);
      jp_clave.setBorder(mar2);
    }
    
    public void botonesmenu(){
        btn_ing.setText("Ingresar");
        btn_ing.setMnemonic('I');
        btn_ing.setBackground(Color.blue);
        btn_ing.setForeground(Color.LIGHT_GRAY);
        
        btn_sal.setText("Salir");
        btn_sal.setMnemonic('S');
        btn_sal.setBackground(Color.blue);
        btn_sal.setForeground(Color.LIGHT_GRAY);
        btn_sal.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent ae) {                
                System.exit(0);
            }
        });
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_fondo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_clave = new javax.swing.JLabel();
        jt_user = new javax.swing.JTextField();
        jp_clave = new javax.swing.JPasswordField();
        btn_ing = new javax.swing.JButton();
        btn_sal = new javax.swing.JButton();
        lbl_fotofon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setText("jLabel1");

        lbl_user.setText("jLabel1");

        lbl_clave.setText("jLabel2");

        jt_user.setText("jTextField1");

        jp_clave.setText("jPasswordField1");

        btn_ing.setText("jButton1");
        btn_ing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingActionPerformed(evt);
            }
        });

        btn_sal.setText("jButton2");

        lbl_fotofon.setText("jLabel1");

        javax.swing.GroupLayout jp_fondoLayout = new javax.swing.GroupLayout(jp_fondo);
        jp_fondo.setLayout(jp_fondoLayout);
        jp_fondoLayout.setHorizontalGroup(
            jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fondoLayout.createSequentialGroup()
                .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_fondoLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lbl_titulo))
                    .addGroup(jp_fondoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_user)
                            .addComponent(lbl_clave))
                        .addGap(70, 70, 70)
                        .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_fondoLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btn_ing)
                        .addGap(37, 37, 37)
                        .addComponent(btn_sal)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_fotofon, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jp_fondoLayout.setVerticalGroup(
            jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fondoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbl_titulo)
                .addGap(49, 49, 49)
                .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_user)
                    .addComponent(jt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_clave)
                    .addComponent(jp_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ing)
                    .addComponent(btn_sal))
                .addGap(43, 43, 43))
            .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_fondoLayout.createSequentialGroup()
                    .addComponent(lbl_fotofon, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingActionPerformed
        String pass = new String(jp_clave.getPassword());
        if (jt_user.getText().equals(Users.usr1) && pass.equals(Users.clave1)){
            JOptionPane.showMessageDialog(this,"ACCESO CORRECTO");
            db.MySQLConnection("root", "", "ba_gransoldi");            
            menMarket menf = new menMarket();
            menf.setVisible(true);
            this.dispose();
        }else if (jt_user.getText().equals(Users.usr2) && pass.equals(Users.clave2)){
            JOptionPane.showMessageDialog(this,"ACCESO CORRECTO");
            menMarket menf = new menMarket();
            menf.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"ACCESO DENEGADO");
        }
    }//GEN-LAST:event_btn_ingActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ing;
    private javax.swing.JButton btn_sal;
    private javax.swing.JPasswordField jp_clave;
    private javax.swing.JPanel jp_fondo;
    private javax.swing.JTextField jt_user;
    private javax.swing.JLabel lbl_clave;
    private javax.swing.JLabel lbl_fotofon;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_user;
    // End of variables declaration//GEN-END:variables
}
