package MODELO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class menufac extends javax.swing.JFrame {
    
     final int ancho = 300, alto = 140;
    int[] id = {1, 2, 3, 4};
    String[] ruta = {"/IMAG/gransol4.jpg"};

    public static String[] selec = {"Efectivo", "Tarjeta D."};

    public static ArrayList<String> productos = new ArrayList<>();

    public menufac() {
        
         setTitle("Facturacion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(300, 500));
        setLocationRelativeTo(null);
        
        Image facImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/gransol4.jpg"));
        setIconImage(facImage);//AGREGAR IMAGEN A UN JLABEL A UN LADO COMO PRESENTACION
        
        setLocation(500, 100);
        
        initComponents();
        
         getContentPane().setBackground(Color.GRAY);

        setLocation(200, 50);//Centrar o Ubicar Ventana
        stev_c();
        tabla();
        salir_men();
    }
    DefaultTableModel tabla_st;
    private void tabla(){
        //DefaultTableModel tabla_st = new DefaultTableModel();
        tabla_st=new DefaultTableModel();
        tabla_st.addColumn("ID");
        tabla_st.addColumn("Nombre");
        tabla_st.addColumn("Precio");
        tabla_st.addColumn("IVA");
        tabla_st.addColumn("Peso");
        //this.jTable3.setModel(tabla_st); REVISAR
        
        
        
//        jTable3.setVisible(true); REVISAR
//        jTable3.setModel(tabla_st); REVISAR
    }
    public void salir_men(){
       menu_factura.setText("OPCIONES");
       menu_factura.setMnemonic('O');
       menu_factura.add(btn_salfactura);
       
       btn_salfactura.setText("Salir");
       btn_salfactura.setMnemonic('S');
       btn_salfactura.addActionListener(new java.awt.event.ActionListener() {           
            public void actionPerformed(ActionEvent ae) { 
                menMarket mK = new menMarket();
                mK.setVisible(true);
                dispose();
            }
        });
    }
    
    private void stev_c(){
         
        btnFact1.setToolTipText("Clik para buscar Cliente");
        btnFact2.setToolTipText("Clik para buscar Producto");
//        btnFact3.setToolTipText("Clik para Aceptar Compra");
//        btnFact4.setToolTipText("Clik para Cancelar Compra");
//        btnFact5.setToolTipText("Clik para Salir de Ventana");

        ImageIcon foto = new ImageIcon(getClass().getResource(ruta[0]));
        ImageIcon mitad = new ImageIcon(foto.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
//        lblImage.setIcon(mitad); REVISAR

        cmxFact1.removeAllItems();//Limpiar el combobox 
        for (String sele : selec) {//
            cmxFact1.addItem(sele);

//        Border line = BorderFactory.createLineBorder(Color.yellow);
        }
//AGREGANDO TITULOS A LOS LABEL (ETIQUETAS)
        lblFact1.setText("MINI MARKET");
        lblFact1.setFont(new Font("Arial", Font.BOLD, 25));
        lblFact1.setForeground(Color.cyan);

        lblFact2.setText("Calle 10 # 25-10");
        lblFact2.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact2.setForeground(Color.BLACK);

        lblFact3.setText("Tel: 3214596070");
        lblFact3.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact3.setForeground(Color.BLACK);

        lblFact4.setText("Cali/Valle");
        lblFact4.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact4.setForeground(Color.BLACK);

        lblFact5.setText("No. Factura");
        lblFact5.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact5.setForeground(Color.BLACK);

        lblFact6.setText("No. identificacion");
        lblFact6.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact6.setForeground(Color.BLACK);

        lblFact7.setText("Nombre Cliente");
        lblFact7.setFont(new Font("Arial", Font.BOLD, 15));
        lblFact7.setForeground(Color.BLACK);

        lblFact8.setText("Telefono");
        lblFact8.setFont(new Font("Arial", Font.BOLD, 15));
        lblFact8.setForeground(Color.BLACK);

        lblFact9.setText("Direccion Cliente");
        lblFact9.setFont(new Font("Arial", Font.BOLD, 15));
        lblFact9.setForeground(Color.BLACK);

        lblFact11.setText("Tipo Pago");
        lblFact11.setFont(new Font("Arial", Font.BOLD, 15));
        lblFact11.setForeground(Color.BLACK);

        lblFact12.setText("Sub Total");
        lblFact12.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact12.setForeground(Color.BLACK);

        lblFact13.setText("Descuento");
        lblFact13.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact13.setForeground(Color.BLACK);

        lblFact14.setText("Iva");
        lblFact14.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact14.setForeground(Color.BLACK);

        lblFact15.setText("Pago Total");
        lblFact15.setFont(new Font("Arial", Font.BOLD, 18));
        lblFact15.setForeground(Color.BLACK);

        //AGREGANDO TITULOS A LOS TEXTOS PARA DAR AVISO EH INGRESAR DATOS   
        txtFact2.setText("Identificacion");
        txtFact2.setForeground(Color.LIGHT_GRAY);
        txtFact2.setPreferredSize(new Dimension(125, 25));

        txtFact3.setText("Ingrese Nombre");
        txtFact3.setForeground(Color.LIGHT_GRAY);
        txtFact3.setPreferredSize(new Dimension(125, 25));

        txtFact4.setText("Ingrese Telefono");
        txtFact4.setForeground(Color.LIGHT_GRAY);
        txtFact4.setPreferredSize(new Dimension(125, 25));

        txtFact5.setText("Ingrese Direccion");
        txtFact5.setForeground(Color.LIGHT_GRAY);
        txtFact5.setPreferredSize(new Dimension(125, 25));

        txtFact6.setText("Ingrese Codigo");
        txtFact6.setForeground(Color.LIGHT_GRAY);
        txtFact6.setPreferredSize(new Dimension(125, 25));

        //CAJAS DE TEXTO PRECIOS PONER EN BLANCO
        txtFact1.setText(" ");
        txtFact7.setText(" ");
        txtFact8.setText(" ");
        txtFact9.setText(" ");
        txtFact10.setText(" ");

        //AGREGAR TEXTOS A LOS BOTONES
        btnFact1.setText("Buscar Cliente");
        btnFact1.setFont(new Font("Arial", Font.BOLD, 18));
        btnFact1.setBackground(Color.GREEN);

        btnFact2.setText("Buscar Producto");
        btnFact2.setFont(new Font("Arial", Font.BOLD, 18));
        btnFact2.setBackground(Color.BLUE);

//        btnFact3.setText("Aceptar");
//        btnFact3.setFont(new Font("Arial", Font.BOLD, 18));
//        btnFact3.setBackground(Color.ORANGE);
//
//        btnFact4.setText("Cancelar");
//        btnFact4.setFont(new Font("Arial", Font.BOLD, 18));
//        btnFact4.setBackground(Color.YELLOW);
//
//        btnFact5.setText("Salir");
//        btnFact5.setFont(new Font("Arial", Font.BOLD, 18));
//        btnFact5.setBackground(Color.RED);
    }
        
         
   
       
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFact1 = new javax.swing.JLabel();
        lblFact2 = new javax.swing.JLabel();
        lblFact3 = new javax.swing.JLabel();
        lblFact4 = new javax.swing.JLabel();
        lblFact6 = new javax.swing.JLabel();
        lblFact7 = new javax.swing.JLabel();
        lblFact8 = new javax.swing.JLabel();
        lblFact9 = new javax.swing.JLabel();
        btnFact1 = new javax.swing.JButton();
        txtFact2 = new javax.swing.JTextField();
        txtFact3 = new javax.swing.JTextField();
        txtFact4 = new javax.swing.JTextField();
        txtFact5 = new javax.swing.JTextField();
        lblFact11 = new javax.swing.JLabel();
        cmxFact1 = new javax.swing.JComboBox<>();
        lblFact5 = new javax.swing.JLabel();
        txtFact10 = new javax.swing.JTextField();
        txtFact6 = new javax.swing.JTextField();
        lblFact12 = new javax.swing.JLabel();
        lblFact13 = new javax.swing.JLabel();
        lblFact14 = new javax.swing.JLabel();
        lblFact15 = new javax.swing.JLabel();
        txtFact1 = new javax.swing.JTextField();
        txtFact7 = new javax.swing.JTextField();
        txtFact8 = new javax.swing.JTextField();
        txtFact9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFact2 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menu_factura = new javax.swing.JMenu();
        btn_salfactura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFact1.setText("jLabel1");
        getContentPane().add(lblFact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 128, -1));

        lblFact2.setText("jLabel2");
        getContentPane().add(lblFact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 128, -1));

        lblFact3.setText("jLabel3");
        getContentPane().add(lblFact3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 128, -1));

        lblFact4.setText("jLabel4");
        getContentPane().add(lblFact4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 128, -1));

        lblFact6.setText("jLabel5");
        getContentPane().add(lblFact6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 113, -1));

        lblFact7.setText("jLabel6");
        getContentPane().add(lblFact7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 113, -1));

        lblFact8.setText("jLabel7");
        getContentPane().add(lblFact8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, 113, -1));

        lblFact9.setText("jLabel8");
        getContentPane().add(lblFact9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 113, -1));

        btnFact1.setText("jButton1");
        getContentPane().add(btnFact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 138, -1, -1));

        txtFact2.setText("jTextField1");
        getContentPane().add(txtFact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 139, 146, -1));

        txtFact3.setText("jTextField2");
        getContentPane().add(txtFact3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 167, 146, -1));

        txtFact4.setText("jTextField3");
        getContentPane().add(txtFact4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 193, 146, -1));

        txtFact5.setText("jTextField4");
        getContentPane().add(txtFact5, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 219, 146, -1));

        lblFact11.setText("jLabel9");
        getContentPane().add(lblFact11, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 196, 106, -1));

        cmxFact1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmxFact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 193, 89, -1));

        lblFact5.setText("jLabel10");
        getContentPane().add(lblFact5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 100, 20));

        txtFact10.setText("jTextField5");
        txtFact10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFact10ActionPerformed(evt);
            }
        });
        getContentPane().add(txtFact10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 150, -1));

        txtFact6.setText("jTextField6");
        getContentPane().add(txtFact6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 113, -1));

        lblFact12.setText("jLabel12");
        getContentPane().add(lblFact12, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 298, 87, -1));

        lblFact13.setText("jLabel13");
        getContentPane().add(lblFact13, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 329, 87, -1));

        lblFact14.setText("jLabel14");
        getContentPane().add(lblFact14, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 360, 87, -1));

        lblFact15.setText("jLabel15");
        getContentPane().add(lblFact15, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 386, 87, -1));

        txtFact1.setText("jTextField7");
        getContentPane().add(txtFact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 295, 117, -1));

        txtFact7.setText("jTextField8");
        txtFact7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFact7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtFact7, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 326, 117, -1));

        txtFact8.setText("jTextField9");
        getContentPane().add(txtFact8, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 357, 117, -1));

        txtFact9.setText("jTextField10");
        getContentPane().add(txtFact9, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 383, 117, -1));

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

        btnFact2.setText("jButton1");
        getContentPane().add(btnFact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 257, 100, -1));

        menu_factura.setMnemonic('f');
        menu_factura.setText("File");

        btn_salfactura.setMnemonic('x');
        btn_salfactura.setText("Exit");
        btn_salfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salfacturaActionPerformed(evt);
            }
        });
        menu_factura.add(btn_salfactura);

        menuBar.add(menu_factura);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salfacturaActionPerformed
        
    }//GEN-LAST:event_btn_salfacturaActionPerformed

    private void txtFact10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFact10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFact10ActionPerformed

    private void txtFact7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFact7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFact7ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFact1;
    private javax.swing.JButton btnFact2;
    private javax.swing.JMenuItem btn_salfactura;
    private javax.swing.JComboBox<String> cmxFact1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFact1;
    private javax.swing.JLabel lblFact11;
    private javax.swing.JLabel lblFact12;
    private javax.swing.JLabel lblFact13;
    private javax.swing.JLabel lblFact14;
    private javax.swing.JLabel lblFact15;
    private javax.swing.JLabel lblFact2;
    private javax.swing.JLabel lblFact3;
    private javax.swing.JLabel lblFact4;
    private javax.swing.JLabel lblFact5;
    private javax.swing.JLabel lblFact6;
    private javax.swing.JLabel lblFact7;
    private javax.swing.JLabel lblFact8;
    private javax.swing.JLabel lblFact9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menu_factura;
    private javax.swing.JTextField txtFact1;
    private javax.swing.JTextField txtFact10;
    private javax.swing.JTextField txtFact2;
    private javax.swing.JTextField txtFact3;
    private javax.swing.JTextField txtFact4;
    private javax.swing.JTextField txtFact5;
    private javax.swing.JTextField txtFact6;
    private javax.swing.JTextField txtFact7;
    private javax.swing.JTextField txtFact8;
    private javax.swing.JTextField txtFact9;
    // End of variables declaration//GEN-END:variables

}
