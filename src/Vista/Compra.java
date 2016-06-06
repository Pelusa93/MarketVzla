/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class Compra extends javax.swing.JFrame {
    private static SimpleDateFormat simpleDateFormat;

    /**
     * Creates new form Compra
     */
    public Compra() {
        initComponents();
    }
    private static ElegirCliente elegirClientev;
    private static ElegirTienda elegirTiendav;
    private static String tiendav;
    private static String clientev;
    private static DefaultTableModel defaultTableModel = new DefaultTableModel();
    private static int selectproductotienda;
    private static DefaultTableModel defaultTableModel1 = new DefaultTableModel();
    private static int selectproductocompra;
    
    public Compra(AdministradorCompras administradorCompras, String tienda, String nombrecliente, String compra)
    {
        initComponents();
        simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        jTable1.removeAll();
        jTable2.removeAll();
        defaultTableModel = new DefaultTableModel();
        defaultTableModel1 = new DefaultTableModel();
        getContentPane().setBackground(java.awt.Color.white);
        tiendav=tienda;
    }
    
    public Compra(ElegirCliente elegirCliente, ElegirTienda elegirTienda,String tienda, String cliente) {
        initComponents();
        simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        jTable1.removeAll();
        jTable2.removeAll();
        defaultTableModel = new DefaultTableModel();
        defaultTableModel1 = new DefaultTableModel();
        getContentPane().setBackground(java.awt.Color.white);
        elegirClientev=elegirCliente;
        elegirTiendav=elegirTienda;
        tiendav=tienda;
        clientev=cliente;
        jLabelTNombreTienda.setText(tienda);
        
        ArrayList<String> clienteDatos = Controlador.ControladorCompra.ConsultarDatosClienteNatural(cliente);
        jLabel_NombreCliente.setText(clienteDatos.get(0));
        jLabel_UsuarioCliente.setText(clienteDatos.get(1));
        String [] carnetSplit=clienteDatos.get(2).split("-");
        String carnet = carnetSplit[1];
        while(carnet.length()<8)
        {
            carnet="0"+carnet;
        }
        carnet=carnetSplit[0]+"-"+carnet;
        jLabel_NroCarnetCliente.setText(carnet);
        defaultTableModel.addColumn("Nombre");
        defaultTableModel.addColumn("Cantidad Disponible");
        defaultTableModel.addColumn("Precio");
        jTable1.setModel(defaultTableModel);
        selectproductotienda=0;
        defaultTableModel1.addColumn("Nombre");
        defaultTableModel1.addColumn("Cantidad Disponible");
        defaultTableModel1.addColumn("Precio");
        jTable2.setModel(defaultTableModel1);
        selectproductocompra=0;
        
        ArrayList<String> productosdisponibles = Controlador.ControladorCompra.ConsultarProductosDisponibles(tiendav);
        
        int i=0;
        while (i<productosdisponibles.size())
        {
            defaultTableModel.addRow(new Object[] {productosdisponibles.get(i),productosdisponibles.get(i+1),productosdisponibles.get(i+2)});
            i=i+3;
        }
        
        
        
        
    }

    
    private static DecimalFormat decimalFormat= new DecimalFormat("0.00");
    public void SetearCantidad (int cantidad)
    {
        defaultTableModel1.setValueAt(cantidad, selectproductocompra, 1);
        defaultTableModel1.setValueAt((cantidad*ObtenerPrecio((String)defaultTableModel1.getValueAt(selectproductocompra, 0))), selectproductocompra, 2);
        Double montototal=0.0;
        Double monto =0.0;
        for(int i=0;i<jTable2.getRowCount();i++)
        {
            montototal=montototal+Double.valueOf(String.valueOf(defaultTableModel1.getValueAt(i, 2)));
        }
        
        jLabel_MontoTotal.setText(String.valueOf(montototal));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Tienda = new javax.swing.JLabel();
        jLabelTNombreTienda = new javax.swing.JLabel();
        jLabel_Foto = new javax.swing.JLabel();
        jLabel_Producto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_Cliente = new javax.swing.JLabel();
        jLabel_NombreCliente = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_UsuarioCliente = new javax.swing.JLabel();
        jLabel_FechaEntregar = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel_NroCarnet = new javax.swing.JLabel();
        jLabel_NroCarnetCliente = new javax.swing.JLabel();
        jCheckBox_Reservado = new javax.swing.JCheckBox();
        jCheckBox_Online = new javax.swing.JCheckBox();
        jLabel_Agregar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel_Productos = new javax.swing.JLabel();
        jLabel_Eliminar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton_Confirmar = new javax.swing.JButton();
        jLabelPVP = new javax.swing.JLabel();
        jLabel_MontoTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Compra");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel_Tienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Tienda.setText("Tienda :");

        jLabelTNombreTienda.setText("jLabel2");

        jLabel_Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Foto.setText("FOTO NO DISPONIBLE");

        jLabel_Producto.setText("Productos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel_Cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Cliente.setText("Cliente :");

        jLabel_NombreCliente.setText("jLabel6");

        jLabel_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Usuario.setText("Usuario :");

        jLabel_UsuarioCliente.setText("jLabel8");

        jLabel_FechaEntregar.setText("Fecha Despacho :");

        jLabel_NroCarnet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NroCarnet.setText("Nro. Carnet :");

        jLabel_NroCarnetCliente.setText("jLabel11");

        jCheckBox_Reservado.setText("Reservado");

        jCheckBox_Online.setText("OnLine");

        jLabel_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar.jpeg"))); // NOI18N
        jLabel_Agregar.setText("jLabel12");
        jLabel_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AgregarMouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable2KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel_Productos.setText("Productos");

        jLabel_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminar.jpg"))); // NOI18N
        jLabel_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EliminarMouseClicked(evt);
            }
        });

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_Confirmar.setText("Comprar");
        jButton_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmarActionPerformed(evt);
            }
        });

        jLabelPVP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPVP.setText("P.V.P");

        jLabel_MontoTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_MontoTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelTNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Confirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_NroCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(jLabel_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel_UsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel_FechaEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel_NombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_NroCarnetCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                            .addComponent(jCheckBox_Reservado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCheckBox_Online, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(296, 296, 296)
                                        .addComponent(jLabel_Eliminar)))))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPVP, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel_MontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_NombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                    .addComponent(jLabel_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_UsuarioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_FechaEntregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_NroCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(jLabel_NroCarnetCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox_Reservado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox_Online)))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelTNombreTienda, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(jLabel_Tienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_MontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPVP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton_Confirmar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ElegirCliente elegirCliente = new ElegirCliente(null, null);
        elegirCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ElegirCliente elegirCliente = new ElegirCliente(elegirTiendav, tiendav);
        this.dispose();
        elegirCliente.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        selectproductotienda = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AgregarMouseClicked
        // TODO add your handling code here:

            defaultTableModel1.addRow(new Object[] {defaultTableModel.getValueAt(selectproductotienda, 0),1,defaultTableModel.getValueAt(selectproductotienda, 2)});
            Double pvp = Double.parseDouble(jLabel_MontoTotal.getText());
            
            pvp = pvp+ Double.valueOf((String)defaultTableModel.getValueAt(selectproductotienda, 2));
            
            jLabel_MontoTotal.setText(String.valueOf(pvp));
    }//GEN-LAST:event_jLabel_AgregarMouseClicked

    private static double ObtenerPrecio(String producto)
    {
        String nombre="";
        int i;
        
        for(i=0;i<defaultTableModel.getRowCount();i++)
        {
            nombre=(String) defaultTableModel.getValueAt(i,0);
            if(producto.equals(nombre))
            {
                break;
            }
            
        }
        
        String precio = String.valueOf(defaultTableModel.getValueAt(i, 2));
        return Double.parseDouble(precio);
    }
    
    private void jTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyReleased
        // TODO add your handling code here:
        
           
            
            
    }//GEN-LAST:event_jTable2KeyReleased

    private void jTable2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyTyped

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable2KeyPressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        selectproductocompra=jTable2.getSelectedRow();
        CantidadProductos cantidadProductos = new CantidadProductos(this);
        this.setEnabled(false);
        cantidadProductos.setVisible(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jLabel_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarMouseClicked
        // TODO add your handling code here:
        defaultTableModel1.removeRow(selectproductocompra);
        Double montototal=0.0;
        Double monto =0.0;
        for(int i=0;i<jTable2.getRowCount();i++)
        {
            montototal=montototal+Double.valueOf(String.valueOf(defaultTableModel1.getValueAt(i, 2)));
        }
        jLabel_MontoTotal.setText(String.valueOf(montototal));
    }//GEN-LAST:event_jLabel_EliminarMouseClicked

    private void jButton_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmarActionPerformed
        // TODO add your handling code here:
        if(jCheckBox_Reservado.isSelected())
        {
        if(Controlador.ControladorCompra.RealizarCompraReservando(tiendav, jLabel_UsuarioCliente.getText(), jLabel_MontoTotal.getText()))
        {
            ArrayList<String> productos= new ArrayList<>();
            ArrayList<String> cantidad= new ArrayList<>();
            for(int i=0;i<defaultTableModel1.getRowCount();i++)
            {
                cantidad.add(String.valueOf(defaultTableModel1.getValueAt(i, 1)));
                productos.add(String.valueOf(defaultTableModel1.getValueAt(i, 0)));
            }
            
            
            ArrayList<String> compra = Controlador.ControladorCompra.ObtenerCodigoCompra();
            System.out.println("Compra: "+compra.get(0));
            for(int i=0;i<productos.size();i++)
            {
                System.out.println("Producto: "+productos.get(i));
                ArrayList<String> ejemplares = Controlador.ControladorCompra.ObtenerEjemplares(productos.get(i), cantidad.get(i), tiendav);
                for(int j=0;j<ejemplares.size();j++)
                {
                    System.out.println("Ejemplar : "+ejemplares.get(j));
                    Controlador.ControladorCompra.ReservarEjemplares(ejemplares.get(j), compra.get(0));
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Compra Registrada Exitosamente", "Compra", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            ElegirCliente elegirCliente = new ElegirCliente(elegirTiendav, tiendav);
            elegirCliente.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Error al Registrar Compra", "Compra", JOptionPane.ERROR_MESSAGE);
        }
        }
        else
        {
            String fecha="";
            try {
            fecha = jDateChooser1.getCalendar().get(Calendar.YEAR)+"-"+(jDateChooser1.getCalendar().get(Calendar.MONTH)+1)+"-"+jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);
            } catch (Exception e) {
            fecha="";
            }
            if(!fecha.equals(""))
            if(Controlador.ControladorCompra.RealizarCompra(tiendav, jLabel_UsuarioCliente.getText(), jLabel_MontoTotal.getText()))
            {
            ArrayList<String> productos= new ArrayList<>();
            ArrayList<String> cantidad= new ArrayList<>();
            for(int i=0;i<defaultTableModel1.getRowCount();i++)
            {
                cantidad.add(String.valueOf(defaultTableModel1.getValueAt(i, 1)));
                productos.add(String.valueOf(defaultTableModel1.getValueAt(i, 0)));
            }
            
            
            ArrayList<String> compra = Controlador.ControladorCompra.ObtenerCodigoCompra();
            System.out.println("Compra: "+compra.get(0));
            int puntos=0;
            for(int i=0;i<productos.size();i++)
            {
                System.out.println("Producto: "+productos.get(i));
                ArrayList<String> ejemplares = Controlador.ControladorCompra.ObtenerEjemplares(productos.get(i), cantidad.get(i), tiendav);
                for(int j=0;j<ejemplares.size();j++)
                {
                    puntos++;
                    System.out.println("Ejemplar : "+ejemplares.get(j));
                    Controlador.ControladorCompra.ReservarEjemplares(ejemplares.get(j), compra.get(0));
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Compra Registrada Exitosamente", "Compra", JOptionPane.INFORMATION_MESSAGE);
            if(!jCheckBox_Online.isSelected())
            {
                ArrayList<String> clienteDatos = Controlador.ControladorCompra.ConsultarDatosClienteNatural(clientev);
                String[] codigo=clienteDatos.get(2).split("-");
                if(Controlador.ControladorCompra.GenerarPuntos(codigo[1], String.valueOf(puntos)))
                {
                    JOptionPane.showMessageDialog(rootPane, "Ganastes "+puntos+" por tu compra", "Canjes", JOptionPane.INFORMATION_MESSAGE);
                    Pago pago = new Pago(elegirClientev, elegirTiendav, tiendav, clientev, clienteDatos.get(0), jLabel_MontoTotal.getText(), Controlador.ControladorCompra.ObtenerCodigoCompra().get(0));
                    pago.setVisible(true);
                    this.dispose();
                }
                
                    
            }
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Error al Registrar Compra", "Compra", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_jButton_ConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Confirmar;
    private javax.swing.JCheckBox jCheckBox_Online;
    private javax.swing.JCheckBox jCheckBox_Reservado;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabelPVP;
    private javax.swing.JLabel jLabelTNombreTienda;
    private javax.swing.JLabel jLabel_Agregar;
    private javax.swing.JLabel jLabel_Cliente;
    private javax.swing.JLabel jLabel_Eliminar;
    private javax.swing.JLabel jLabel_FechaEntregar;
    private javax.swing.JLabel jLabel_Foto;
    private javax.swing.JLabel jLabel_MontoTotal;
    private javax.swing.JLabel jLabel_NombreCliente;
    private javax.swing.JLabel jLabel_NroCarnet;
    private javax.swing.JLabel jLabel_NroCarnetCliente;
    private javax.swing.JLabel jLabel_Producto;
    private javax.swing.JLabel jLabel_Productos;
    private javax.swing.JLabel jLabel_Tienda;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JLabel jLabel_UsuarioCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    
}
