/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class RegistrarRubro extends javax.swing.JFrame {

    
    private String tienda;
    private String almacen;
    /**
     * Creates new form RegistrarRubro
     */
    public RegistrarRubro() {
        initComponents();
        this.tienda="Market Venezuela CCS";
        this.almacen="Refrigeracion";
        ArrayList <String> rubros = Controlador.ControladorRubro.ConsultarRubros(almacen, tienda);
        jComboBox1Rubro.addItem("   ");
        int i=0;
        while(i<rubros.size())
        {
            jComboBox1Rubro.addItem(rubros.get(i));
            i=i+2;
        }
    }
    private RegistrarAlmacen registrarAlmacen;
    public RegistrarRubro(String tienda, String almacen,RegistrarAlmacen registrarAlmacen) {
        initComponents();
        this.registrarAlmacen=registrarAlmacen;
        this.tienda=tienda;
        this.almacen=almacen;
        ArrayList <String> rubros = Controlador.ControladorRubro.ConsultarRubros(almacen, tienda);
        jComboBox1Rubro.addItem("   ");
        int i=0;
        while(i<rubros.size())
        {
            jComboBox1Rubro.addItem(rubros.get(i));
            i=i+2;
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Nombre = new javax.swing.JTextField();
        jTextField1Descripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1Rubro = new javax.swing.JComboBox();
        jButton1Aceptar = new javax.swing.JButton();
        jButton2Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Rubro");

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nuevo Rubro");

        jLabel3.setText("Nombre :");

        jLabel4.setText("Descripcion :");

        jLabel5.setText("Rubro :");

        jButton1Aceptar.setText("Aceptar");
        jButton1Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AceptarActionPerformed(evt);
            }
        });

        jButton2Volver.setText("Volver");
        jButton2Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1Nombre)
                    .addComponent(jTextField1Descripcion)
                    .addComponent(jComboBox1Rubro, 0, 300, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addComponent(jButton1Aceptar)
                .addGap(18, 18, 18)
                .addComponent(jButton2Volver)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1Descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1Rubro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Aceptar)
                    .addComponent(jButton2Volver))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AceptarActionPerformed
        // TODO add your handling code here:
        if(!jTextField1Nombre.getText().equals(""))
        {
            if(!jTextField1Descripcion.getText().equals(""))
            {
                String rubro="";
                if(jComboBox1Rubro.getSelectedItem().equals("   "))
                {
                    rubro=null;
                }
                else
                {
                    rubro=(String) jComboBox1Rubro.getSelectedItem();
                }
                       
                if(Controlador.ControladorRubro.RegistrarRubro(jTextField1Nombre.getText(), jTextField1Descripcion.getText(), rubro, almacen, tienda))
                {
                    JOptionPane.showMessageDialog(rootPane, "Rubro Registrado", "Rubro", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    try{
                        registrarAlmacen.setVisible(true);
                        registrarAlmacen.setEnabled(true);
                    }
                    catch(Exception e)
                    {
                        
                    }
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Error al Registrar", "Rubro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton1AceptarActionPerformed

    private void jButton2VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2VolverActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2VolverActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarRubro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarRubro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarRubro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRubro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarRubro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Aceptar;
    private javax.swing.JButton jButton2Volver;
    private javax.swing.JComboBox jComboBox1Rubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1Descripcion;
    private javax.swing.JTextField jTextField1Nombre;
    // End of variables declaration//GEN-END:variables
}