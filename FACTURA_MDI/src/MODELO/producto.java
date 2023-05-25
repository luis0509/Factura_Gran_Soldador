package MODELO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class producto extends javax.swing.JFrame {
    public static int anchoprod = 80, altoprod = 50;
     mysql_conect db = new mysql_conect();
    public producto() {
        
        
        initComponents(); 
        setLocation(500, 100);        
        panelprod();
        compon();
        Jtable_Prod();
        labelprod();
        labelimagenprod();
        Image facImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/gransol.jpg"));
        setIconImage(facImage);
    }
    
    private void labelprod(){
        lblprod.setFont(new java.awt.Font("Tahoma", 3, 11));
        lblprod.setText("P R O D U C T O S");
        //MARGEN PARA EL LABEL
//        Border margen = BorderFactory.createLineBorder(Color.red, 1);
//        lblprod.setBorder(margen);
    }
    
    private void labelimagenprod(){   
       
    ImageIcon imaprod = new
    ImageIcon(getClass().getResource("/IMAG/gransol.jpg"));
    ImageIcon mitad_a = new
    ImageIcon(imaprod.getImage().getScaledInstance(anchoprod, altoprod,
    Image.SCALE_DEFAULT));
    lblimaprod.setIcon(mitad_a);
    lblimaprod.setText("");
 

        
    }

    private void panelprod(){
        jpprod.setLocation(400, 500);
        jpprod.setBackground(Color.yellow);
    }
    private void compon(){
        ActionListener salirprod  = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            //System.exit(0);
            menMarket prod_v = new menMarket();
            prod_v.setVisible(true);
            dispose();
            //setvisible(true);
    }
        
    };    
    btnsalir.setText("SALIR");
    btnsalir.setMnemonic('S');   
    btnsalir.setForeground(Color.white);//Color Letra
    btnsalir.setBackground(Color.black);//Color Fondo
    btnsalir.addActionListener(salirprod);//Accion de Salir
    
    btn_obtener.setText("Obtener");
    btn_obtener.setMnemonic('O');   
    btn_obtener.setForeground(Color.white);//Color Letra
    btn_obtener.setBackground(Color.black);//Color Fondo
    btn_obtener.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
            
                db.MySQLConnection("root", "", "mysql_conect");                
                db.getValues2("productos");
               // db.closeConnection();
                
            }
        });
    
    
    }
    private void Jtable_Prod(){
    //Relacionado con la tabla
    DefaultTableModel conttabla = new DefaultTableModel();
    conttabla.addColumn("ID");
    conttabla.addColumn("Descripcion");    
    conttabla.addColumn("IVA");
    conttabla.addColumn("Precio");
    

    
//    conttabla.addRow(new Object[]{"001", "Leche Klim", 2500, 0.19, "G"});
//    conttabla.addRow(new Object[]{"002", "Cerveza Corona", 3000, "SIN IVA", "Lts"});
//    conttabla.addRow(new Object[]{"003", "Acetaminofen", 2000, 0.19, "G"});
//    conttabla.addRow(new Object[]{"004", "Carne Especial Bufalo", 6000, 0.19, "Kg"});
//    conttabla.addRow(new Object[]{"005", "Coca Cola 3Lts", 8000, "SIN IVA", "Lts"});
//    conttabla.addRow(new Object[]{"006", "Galletas Ducales", 1600, "SIN IVA", "G"});

    jtprod.setVisible(true);
    jtprod.setModel(conttabla);
    jtprod.setPreferredSize(new Dimension(200,200));
    
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpprod = new javax.swing.JPanel();
        lblprod = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtprod = new javax.swing.JTable();
        btnsalir = new javax.swing.JButton();
        lblimaprod = new javax.swing.JLabel();
        btn_obtener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblprod.setText("jLabel1");

        jtprod.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtprod);

        btnsalir.setText("jButton1");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lblimaprod.setText("jLabel1");

        btn_obtener.setText("jButton1");

        javax.swing.GroupLayout jpprodLayout = new javax.swing.GroupLayout(jpprod);
        jpprod.setLayout(jpprodLayout);
        jpprodLayout.setHorizontalGroup(
            jpprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpprodLayout.createSequentialGroup()
                .addGroup(jpprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpprodLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpprodLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnsalir)
                        .addGap(28, 28, 28)
                        .addComponent(btn_obtener)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jpprodLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(lblprod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblimaprod)
                .addGap(50, 50, 50))
        );
        jpprodLayout.setVerticalGroup(
            jpprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpprodLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprod)
                    .addComponent(lblimaprod))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jpprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btn_obtener))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

    }//GEN-LAST:event_btnsalirActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new producto().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_obtener;
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpprod;
    private javax.swing.JTable jtprod;
    private javax.swing.JLabel lblimaprod;
    private javax.swing.JLabel lblprod;
    // End of variables declaration//GEN-END:variables
}
