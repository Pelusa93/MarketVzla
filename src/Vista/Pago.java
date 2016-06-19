/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class Pago extends javax.swing.JFrame {

    /**
     * Creates new form Pago
     */
    public Pago() {
        initComponents();
    }
    
    private static String nombreClientev,monto,compra,tiendav,clientev;
    private static DefaultTableModel defaultTableModel = new DefaultTableModel();
    private static Double montotal;
    private static ElegirCliente elegirClientev;
    private static ElegirTienda elegirTiendav;
    public Pago(ElegirCliente elegirCliente,ElegirTienda elegirTienda,String tienda,String cliente,String nombrecliente, String monto, String compra) {
        initComponents();
        getContentPane().setBackground(java.awt.Color.white);
        elegirTiendav=elegirTienda;
        elegirClientev=elegirCliente;
        clientev=cliente;
        tiendav=tienda;
        this.nombreClientev=nombrecliente;
        this.compra=compra;
        this.monto=monto;
        defaultTableModel.addColumn("Codigo");
        defaultTableModel.addColumn("Tipo");
        defaultTableModel.addColumn("Monto");
        jTable1.setModel(defaultTableModel);
        jLabel6Montototal.setText(monto);
        jLabelMoticoReal.setText("Venta");
        jLabelNombreCliente.setText(nombreClientev);
        montotal=Double.parseDouble(this.monto);
    try
    {
        
    
    ArrayList<String> debitos = Controlador.ControladorPagoCheque.ObtenerDebito(Controlador.ControladorCompra.ConsultarDatosClienteNatural(clientev).get(2).split("-")[1]);
    if(debitos!=null)
    for(String debito:debitos)
    {
        
        jComboBoxTipoPago.addItem("D-"+debito);
    }
    
    ArrayList<String> creditos = Controlador.ControladorPagoCheque.ObtenerCredito(Controlador.ControladorCompra.ConsultarDatosClienteNatural(clientev).get(2).split("-")[1]);
    if(creditos!=null)
    for(String credito:creditos)
    {
        if(!credito.equals(""))
        jComboBoxTipoPago.addItem("C-"+credito);
    }
    }
    catch(Exception e)
    {
        
    }
    
    }
    String codigocheque;
    public void agregarCheque (String codigo)
    {
        codigocheque=codigo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMotivo = new javax.swing.JLabel();
        jLabelMoticoReal = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabel5Monto = new javax.swing.JLabel();
        jLabel6Montototal = new javax.swing.JLabel();
        jComboBoxTipoPago = new javax.swing.JComboBox();
        jLabel7Monto = new javax.swing.JLabel();
        jTextField1Montotipopago = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8agregar = new javax.swing.JLabel();
        jLabel9elimnar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pago");

        jLabelMotivo.setText("Motivo");

        jLabelMoticoReal.setText("jLabel2");

        jLabelCliente.setText("Cliente");

        jLabelNombreCliente.setText("jLabel4");

        jLabel5Monto.setText("Monto Total");

        jLabel6Montototal.setText("jLabel6");

        jComboBoxTipoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Puntos", "Cheque" }));
        jComboBoxTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPagoActionPerformed(evt);
            }
        });

        jLabel7Monto.setText("Monto");

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

        jLabel8agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar.jpeg"))); // NOI18N
        jLabel8agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8agregarMouseClicked(evt);
            }
        });

        jLabel9elimnar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminar.jpg"))); // NOI18N
        jLabel9elimnar.setText("jLabel9");
        jLabel9elimnar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9elimnar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9elimnarMouseClicked(evt);
            }
        });

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("COnfirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jComboBoxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5Monto, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                            .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabelMoticoReal, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                                .addComponent(jLabelNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6Montototal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1Montotipopago, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8agregar)))))))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel9elimnar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMoticoReal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabelMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabelNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5Monto, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel6Montototal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jComboBoxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1Montotipopago, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(19, 19, 19))))
                    .addComponent(jLabel9elimnar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPagoActionPerformed
        // TODO add your handling code here:
        if(jComboBoxTipoPago.getSelectedItem().toString().equals("Puntos"))
        {
            System.err.println("AUN NO SE ACEPTAN PUNTOS");
        }
        if(jComboBoxTipoPago.getSelectedItem().toString().equals("Cheque"))
        {
            Cheque cheque = new Cheque(this);
            cheque.setVisible(true);
            this.setEnabled(false);
            
        }
    }//GEN-LAST:event_jComboBoxTipoPagoActionPerformed

    private void jLabel8agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8agregarMouseClicked
        // TODO add your handling code here:
        if(jComboBoxTipoPago.getSelectedItem().toString().equals("Efectivo"))
        {
            defaultTableModel.addRow(new Object[]{"1","Efectivo",jTextField1Montotipopago.getText()});
        }
        try{
        String [] tarjeta = jComboBoxTipoPago.getSelectedItem().toString().split("-");
        if(tarjeta[0].equals("D"))
        {
            defaultTableModel.addRow(new Object[]{Controlador.ControladorPagoCheque.ObtenerPago(tarjeta[1]),"Debito",jTextField1Montotipopago.getText()});
        }else
        {
            if(tarjeta[1].equals("C"))
            {
                defaultTableModel.addRow(new Object[]{Controlador.ControladorPagoCheque.ObtenerPagoC(tarjeta[1]),"Credito",jTextField1Montotipopago.getText()});
            }
        }
        }
        catch(Exception e)
        {
            
        }
        if(jComboBoxTipoPago.getSelectedItem().toString().equals("Cheuqe"))
        {
            defaultTableModel.addRow(new Object[] {codigocheque,"Cheque",jTextField1Montotipopago.getText()});
        }
        
    }//GEN-LAST:event_jLabel8agregarMouseClicked

    private void jLabel9elimnarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9elimnarMouseClicked
        // TODO add your handling code here:
        defaultTableModel.removeRow(select);
        jTable1.setModel(defaultTableModel);
    }//GEN-LAST:event_jLabel9elimnarMouseClicked
    private static int select=0;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        select=jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            Compra compra = new Compra(elegirClientev, elegirTiendav, tiendav, clientev);
            compra.setVisible(true);
            this.dispose();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Double monto=0.0;
        for(int i=0;i<defaultTableModel.getRowCount();i++)
        {
            monto=monto+Double.parseDouble(String.valueOf(defaultTableModel.getValueAt(i, 2)));            
        }
        System.out.println("Monto "+monto);
        if(montotal.equals(monto))
        {
            for(int j=0;j<defaultTableModel.getRowCount();j++)
            {
                Controlador.ControladorPagoCheque.RegistrarPago(clientev, compra, (String)defaultTableModel.getValueAt(j, 2),(String) defaultTableModel.getValueAt(j, 0));
            }
            
            JOptionPane.showMessageDialog(rootPane, "Compra Pagada");
            ElegirCliente elegirCliente = new ElegirCliente(elegirTiendav, tiendav);
            elegirCliente.setVisible(true);
            this.dispose();
                    
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "El pago aun no se ha hecho completo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBoxTipoPago;
    private javax.swing.JLabel jLabel5Monto;
    private javax.swing.JLabel jLabel6Montototal;
    private javax.swing.JLabel jLabel7Monto;
    private javax.swing.JLabel jLabel8agregar;
    private javax.swing.JLabel jLabel9elimnar;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelMoticoReal;
    private javax.swing.JLabel jLabelMotivo;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Montotipopago;
    // End of variables declaration//GEN-END:variables
}
