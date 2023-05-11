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
    String[] ruta = {"/Imagenes/minimarket.jpg"};

    public static String[] selec = {"Efectivo", "Tarjeta D."};

    public static ArrayList<String> productos = new ArrayList<>();

    public menufac() {
        
         setTitle("Facturacion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(300, 500));
        setLocationRelativeTo(null);
        
        Image facImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/minimarket.jpg"));
        setIconImage(facImage);//AGREGAR IMAGEN A UN JLABEL A UN LADO COMO PRESENTACION
        
        //setLocation(500, 100);
        
        initComponents();
        
         getContentPane().setBackground(Color.GRAY);

        setLocation(200, 50);//Centrar o Ubicar Ventana
        stev_c();
        tabla();
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
        this.jTable3.setModel(tabla_st);
        
        
        
        jTable3.setVisible(true);
        jTable3.setModel(tabla_st);
    }
    
    private void stev_c(){
         
        btnFact1.setToolTipText("Clik para buscar Cliente");
        btnFact2.setToolTipText("Clik para buscar Producto");
        btnFact3.setToolTipText("Clik para Aceptar Compra");
        btnFact4.setToolTipText("Clik para Cancelar Compra");
        btnFact5.setToolTipText("Clik para Salir de Ventana");

        ImageIcon foto = new ImageIcon(getClass().getResource(ruta[0]));
        ImageIcon mitad = new ImageIcon(foto.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        lblImage.setIcon(mitad);

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

        lblFact8.setText("Numero Cliente");
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

        btnFact2.setText("Buscar Codigo Pro");
        btnFact2.setFont(new Font("Arial", Font.BOLD, 18));
        btnFact2.setBackground(Color.BLUE);

        btnFact3.setText("Aceptar");
        btnFact3.setFont(new Font("Arial", Font.BOLD, 18));
        btnFact3.setBackground(Color.ORANGE);

        btnFact4.setText("Cancelar");
        btnFact4.setFont(new Font("Arial", Font.BOLD, 18));
        btnFact4.setBackground(Color.YELLOW);

        btnFact5.setText("Salir");
        btnFact5.setFont(new Font("Arial", Font.BOLD, 18));
        btnFact5.setBackground(Color.RED);
    }
        
         
   
       
    
    
    
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
        
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
