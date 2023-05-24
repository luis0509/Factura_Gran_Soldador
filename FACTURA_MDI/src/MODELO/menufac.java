package MODELO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;



public class menufac extends javax.swing.JFrame {
    String productos[]={"Seleccione","Leche Klim","Cerveza"};
    int cantidad=0;
    double precios[]={0,2000,2500};
    double precio=0;
    ArrayList<venta> listaventas = new ArrayList<venta>();
    final int ancho = 300, alto = 140;
    int[] id = {1, 2, 3, 4};
    String[] ruta = {"/IMAG/gransol.jpg"};

    public static String[] selec = {"Efectivo", "Tarjeta D."};

    //public static ArrayList<String> productos = new ArrayList<>();

    public menufac() {

        setTitle("Facturacion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(300, 500));
        setLocationRelativeTo(null);

        Image facImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAG/gransol.jpg"));
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
    
    private void tabla() {
        
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
       jboxproductos.setModel(comboModel);
       
        tabla_st = new DefaultTableModel();
        tabla_st.addColumn("Descripcion");
        tabla_st.addColumn("Cantidad");
        tabla_st.addColumn("Precio U.");
        tabla_st.addColumn("Precio x Cant");

        modelo.setVisible(true);
        modelo.setModel(tabla_st);
        actualizartabla();
        calcprecio();

    }
    
public boolean buscarvent(venta nueva) {
        for (venta v : listaventas) {
            if (v.getId() == nueva.getId()) {
                int nuevacantidad = v.getCantidad() + nueva.getCantidad();
                v.setCantidad(nuevacantidad);
                v.setIva(v.getPrecio() * nuevacantidad);
                return true;
            }
        }
        return false;
    }

//    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {
//        venta venta = new venta();
//        venta.setId(jboxproductos.getSelectedIndex());
//        venta.setDescripcion(jboxproductos.getSelectedItem().toString());
//        venta.setPrecio(precio);
//        venta.setCantidad(cantidad);
//        venta.setIva(precio * cantidad);
//        if (!buscarvent(venta)) {
//            listaventas.add(venta);
//        }
//        actualizartabla();
//        borrar();
//    }

    public void borrar() {
        precio = 0;
        cantidad = 1;
        jboxproductos.setSelectedIndex(0);
        jscantidad.setValue(0);
        calcprecio();

    }

    public void calcprecio() {

        precio = precios[jboxproductos.getSelectedIndex()];
        cantidad = Integer.parseInt(jscantidad.getValue().toString());
        txtFact7.setText(amoneda(precio));        
        txtFact8.setText(amoneda(precio * cantidad));
    }

    public String amoneda(double precio) {
        return "$ " + Math.round(precio * 10) / 10 + " COP";
    }

    public void actualizartabla() {
        while (tabla_st.getRowCount() > 0) {
            tabla_st.removeRow(0);
        }
        double subtotal = 0;

        for (venta v : listaventas) {
            Object x[] = new Object[4];

            x[0] = v.getDescripcion();
            x[1] = v.getCantidad();
            x[2] = amoneda(v.getPrecio());
            x[3] = amoneda(v.getIva());

            subtotal += v.getIva();
            tabla_st.addRow(x);
        }
        double iva = subtotal * 0.19;
        double total = subtotal + iva;
        txtFact1.setText(amoneda(subtotal));
        txtFact8.setText(amoneda(iva));
        txtFact9.setText(amoneda(total));
        //txtFact9.setModel(tabla_st);
            
    }
    public void salir_men() {
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

    private void stev_c() {

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
        lblFact1.setFont(new Font("Arial", Font.BOLD, 20));
        lblFact1.setForeground(Color.cyan);

        lblFact2.setText("Calle 10 # 25-10");
        lblFact2.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact2.setForeground(Color.BLACK);

        lblFact3.setText("Tel: 3214596070");
        lblFact3.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact3.setForeground(Color.BLACK);

        lblFact4.setText("Cali/Valle");
        lblFact4.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact4.setForeground(Color.BLACK);

        lblFact5.setText("No. Factura");
        lblFact5.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact5.setForeground(Color.BLACK);

        lblFact6.setText("No. identificacion");
        lblFact6.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact6.setForeground(Color.BLACK);

        lblFact7.setText("Nombre Cliente");
        lblFact7.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact7.setForeground(Color.BLACK);

        lblFact8.setText("Telefono");
        lblFact8.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact8.setForeground(Color.BLACK);

        lblFact9.setText("Direccion Cliente");
        lblFact9.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact9.setForeground(Color.BLACK);

        lblFact11.setText("Tipo Pago");
        lblFact11.setFont(new Font("Arial", Font.BOLD, 12));
        lblFact11.setForeground(Color.BLACK);

        lblFact12.setText("Sub Total");
        lblFact12.setFont(new Font("Arial", Font.BOLD, 15));
        lblFact12.setForeground(Color.BLACK);

        lblFact13.setText("Valor x U.");
        lblFact13.setFont(new Font("Arial", Font.BOLD, 15));
        lblFact13.setForeground(Color.BLACK);

        lblFact14.setText("Iva");
        lblFact14.setFont(new Font("Arial", Font.BOLD, 15));
        lblFact14.setForeground(Color.BLACK);

        lblFact15.setText("Pago Total");
        lblFact15.setFont(new Font("Arial", Font.BOLD, 15));
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
        txtFact1.setText("$ 0");
        txtFact7.setText("$ 0");
        txtFact8.setText("$ 0");
        txtFact9.setText("$ 0");
        txtFact10.setText(" ");

        //AGREGAR TEXTOS A LOS BOTONES
        btnFact1.setText("Buscar Cliente");
        btnFact1.setFont(new Font("Arial", Font.BOLD, 15));
        btnFact1.setBackground(Color.white);

        btnFact2.setText("Buscar Producto");
        btnFact2.setFont(new Font("Arial", Font.BOLD, 13));
        btnFact2.setBackground(Color.white);
        btnagregar.setText("REGISTRAR");

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
        modelo = new javax.swing.JTable();
        btnFact2 = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jboxproductos = new javax.swing.JComboBox<>();
        lbl_prodfac = new javax.swing.JLabel();
        lbl_prodcant = new javax.swing.JLabel();
        jscantidad = new javax.swing.JSpinner();
        menuBar = new javax.swing.JMenuBar();
        menu_factura = new javax.swing.JMenu();
        btn_salfactura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFact1.setText("jLabel1");
        getContentPane().add(lblFact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 20, 210, -1));

        lblFact2.setText("jLabel2");
        getContentPane().add(lblFact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 40, 210, -1));

        lblFact3.setText("jLabel3");
        getContentPane().add(lblFact3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 60, 210, -1));

        lblFact4.setText("jLabel4");
        getContentPane().add(lblFact4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 80, 210, -1));

        lblFact6.setText("jLabel5");
        getContentPane().add(lblFact6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 113, -1));

        lblFact7.setText("jLabel6");
        getContentPane().add(lblFact7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 113, -1));

        lblFact8.setText("jLabel7");
        getContentPane().add(lblFact8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, 113, -1));

        lblFact9.setText("jLabel8");
        getContentPane().add(lblFact9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 113, -1));

        btnFact1.setText("jButton1");
        getContentPane().add(btnFact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 138, 140, -1));

        txtFact2.setText("jTextField1");
        txtFact2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFact2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFact2FocusLost(evt);
            }
        });
        txtFact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFact2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtFact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 139, 146, -1));

        txtFact3.setText("jTextField2");
        txtFact3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFact3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFact3FocusLost(evt);
            }
        });
        getContentPane().add(txtFact3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 167, 146, -1));

        txtFact4.setText("jTextField3");
        txtFact4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFact4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFact4FocusLost(evt);
            }
        });
        getContentPane().add(txtFact4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 193, 146, -1));

        txtFact5.setText("jTextField4");
        txtFact5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFact5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFact5FocusLost(evt);
            }
        });
        getContentPane().add(txtFact5, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 219, 146, -1));

        lblFact11.setText("jLabel9");
        getContentPane().add(lblFact11, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 196, 106, -1));

        cmxFact1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmxFact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 193, 89, -1));

        lblFact5.setText("jLabel10");
        getContentPane().add(lblFact5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 80, 20));

        txtFact10.setText("jTextField5");
        txtFact10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFact10ActionPerformed(evt);
            }
        });
        getContentPane().add(txtFact10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 150, -1));

        txtFact6.setText("jTextField6");
        txtFact6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFact6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFact6FocusLost(evt);
            }
        });
        getContentPane().add(txtFact6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 113, -1));

        lblFact12.setText("jLabel12");
        getContentPane().add(lblFact12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 87, -1));

        lblFact13.setText("jLabel13");
        getContentPane().add(lblFact13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 87, -1));

        lblFact14.setText("jLabel14");
        getContentPane().add(lblFact14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 87, -1));

        lblFact15.setText("jLabel15");
        getContentPane().add(lblFact15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 87, -1));

        txtFact1.setText("jTextField7");
        getContentPane().add(txtFact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 117, -1));

        txtFact7.setText("jTextField8");
        txtFact7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFact7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtFact7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 117, -1));

        txtFact8.setText("jTextField9");
        getContentPane().add(txtFact8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 117, -1));

        txtFact9.setText("jTextField10");
        getContentPane().add(txtFact9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 117, -1));

        modelo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(modelo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 400, 220));

        btnFact2.setText("jButton1");
        getContentPane().add(btnFact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 257, 150, -1));

        btnagregar.setText("jButton1");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 140, -1));

        jboxproductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jboxproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxproductosActionPerformed(evt);
            }
        });
        getContentPane().add(jboxproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 100, -1));

        lbl_prodfac.setText("jLabel1");
        getContentPane().add(lbl_prodfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 90, 20));

        lbl_prodcant.setText("jLabel2");
        getContentPane().add(lbl_prodcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 304, 90, 20));
        getContentPane().add(jscantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 40, -1));

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

    private void txtFact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFact2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFact2ActionPerformed

    private void txtFact2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact2FocusGained
        if (txtFact2.getText().equals("Identificacion")) {
            txtFact2.setText("");
            txtFact2.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFact2FocusGained

    private void txtFact2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact2FocusLost
        if (txtFact2.getText().equals("")) {
            txtFact2.setText("Identificacion");
            txtFact2.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_txtFact2FocusLost

    private void txtFact3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact3FocusGained
        if (txtFact3.getText().equals("Ingrese Nombre")) {
            txtFact3.setText("");
            txtFact3.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFact3FocusGained

    private void txtFact3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact3FocusLost
        if (txtFact3.getText().equals("")) {
            txtFact3.setText("Ingrese Nombre");
            txtFact3.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_txtFact3FocusLost

    private void txtFact4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact4FocusGained
        if (txtFact4.getText().equals("Ingrese Telefono")) {
            txtFact4.setText("");
            txtFact4.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFact4FocusGained

    private void txtFact4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact4FocusLost
        if (txtFact4.getText().equals("")) {
            txtFact4.setText("Ingrese Telefono");
            txtFact4.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_txtFact4FocusLost

    private void txtFact5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact5FocusGained
        if (txtFact5.getText().equals("Ingrese Direccion")) {
            txtFact5.setText("");
            txtFact5.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFact5FocusGained

    private void txtFact5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact5FocusLost
        if (txtFact5.getText().equals("")) {
            txtFact5.setText("Ingrese Direccion");
            txtFact5.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_txtFact5FocusLost

    private void txtFact6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact6FocusGained
        if (txtFact6.getText().equals("Ingrese Codigo")) {
            txtFact6.setText("");
            txtFact6.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFact6FocusGained

    private void txtFact6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFact6FocusLost
        if (txtFact6.getText().equals("")) {
            txtFact6.setText("Ingrese Codigo");
            txtFact6.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_txtFact6FocusLost

    private void jboxproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxproductosActionPerformed
        calcprecio();
    }//GEN-LAST:event_jboxproductosActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        
        venta venta= new venta();
        venta.setId(jboxproductos.getSelectedIndex());
        venta.setDescripcion(jboxproductos.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setIva(precio*cantidad);
        if(!buscarvent(venta)){
           listaventas.add(venta); 
        }       
        actualizartabla();
        borrar();
    }//GEN-LAST:event_btnagregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFact1;
    private javax.swing.JButton btnFact2;
    private javax.swing.JMenuItem btn_salfactura;
    private javax.swing.JButton btnagregar;
    private javax.swing.JComboBox<String> cmxFact1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jboxproductos;
    private javax.swing.JSpinner jscantidad;
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
    private javax.swing.JLabel lbl_prodcant;
    private javax.swing.JLabel lbl_prodfac;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menu_factura;
    private javax.swing.JTable modelo;
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
