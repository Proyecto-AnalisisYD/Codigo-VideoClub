/*
Video Club
Analisis y diseño de sistemas
 */
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilse1_000
 */
public class Devoluciones extends javax.swing.JFrame {
ConexionBd oConn=new ConexionBd();
DefaultTableModel modelo= new DefaultTableModel();

    /**
     * Creates new form Devoluciones
     */
    public Devoluciones() {
           if(!oConn.FnBoolConnectionOpen("com.mysql.jdbc.Driver","jdbc:mysql://localhost/movedb","root",""))
        {
            JOptionPane.showMessageDialog(null,"No se logro conexion al host");
            System.exit(0);
           
            
            
        }
        else
        {
         initComponents();
         this.setLocationRelativeTo(null);
         this.setTitle(" Devoluciones");
         this.setResizable(false);
         mostrarDatos();
      
        }
    }
    
    void mostrarDatos()
    {
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Codigo-Pelicula");
        modelo.addColumn("Fecha de alquiler");
        modelo.addColumn("Fecha Devolucion");
        tbDevoluciones.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        butBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDevoluciones = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        butDevolucion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setText("ID-Cliente:");
        jLabel1.setName("jLabel1"); // NOI18N

        txtID.setName("txtID"); // NOI18N

        butBuscar.setText("Buscar");
        butBuscar.setName("butBuscar"); // NOI18N
        butBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tbDevoluciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDevoluciones.setName("tbDevoluciones"); // NOI18N
        jScrollPane1.setViewportView(tbDevoluciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(butBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butBuscar))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton2.setText("Salir");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        butDevolucion.setText("Hacer Devolucion");
        butDevolucion.setName("butDevolucion"); // NOI18N
        butDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDevolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(butDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(butDevolucion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void butBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBuscarActionPerformed
        // TODO add your handling code here:
         String sqlStmt;
            String []datos=new String[10];
              
               
        if("Buscar".equals(butBuscar.getText()))
        {
      
            sqlStmt="Select * From alquileres";
            //agrego la condicion del usuario
            
            sqlStmt+=" Where ClienteId='"+txtID.getText()+"'";
           
            
            oConn.subQueryExecute(sqlStmt);
           
            try
            {
                if(oConn.setResult.next())
               {
                   
                 datos[0]=oConn.setResult.getString("ClienteId");
                 datos[1]=oConn.setResult.getString("Nombres");
                 datos[2]=oConn.setResult.getString("CodPelicula");
                 datos[3]=oConn.setResult.getString("FechaCompra");
                 datos[4]=oConn.setResult.getString("FechaDevolucion");
                 
                 modelo.addRow(datos);
                 tbDevoluciones.setModel(modelo);
                 
                  
                }
                else
                {
                    
                JOptionPane.showMessageDialog(null,"Cliente no resgistrado");
                }
                //cierra la consulta
                oConn.setResult.close();
            
            }
            catch(SQLException e)
            {
                  JOptionPane.showMessageDialog(null,"No hay conexion");
            }
        }
    }//GEN-LAST:event_butBuscarActionPerformed

    private void butDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDevolucionActionPerformed
        // TODO add your handling code here:
        
        String sCodigo;
        String sQuery;
        int iResult;
        
       
        // Valida que esté seleccionado  un dato
        if (tbDevoluciones.getSelectedRow()>=0)
        {
             // Confirmación de la Eliminación
             if (oConn.fnIntSistemaPregunta("Desea realmente eliminar el Registro")==JOptionPane.YES_OPTION)
             {     
                // Variable para el modelo de la tabla
                DefaultTableModel modelo = (DefaultTableModel) tbDevoluciones.getModel();

                // Obtengo el Codigo de la celda
                sCodigo = modelo.getValueAt(tbDevoluciones.getSelectedRow(),0).toString();

                // Prepara el Query para Borrar
                sQuery ="Delete from alquileres Where ClienteId='"+sCodigo+"'";

                if (oConn.FnBoolQueryExecuteUpdate(sQuery))
                   oConn.SubSistemaMensaje("El Producto ha sido eliminado");

                // Carga los productos al terminar        
          
             }
        }
        else
            oConn.SubSistemaMensaje("Seleccione un Producto");
    }//GEN-LAST:event_butDevolucionActionPerformed

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
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBuscar;
    private javax.swing.JButton butDevolucion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDevoluciones;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}