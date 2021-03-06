/*
Video Club
Analisis y diseño de sistemas
 */

/**
 *
 * @author ilse1_000
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    public VPrincipal() {
        initComponents();
        
        
         this.setLocationRelativeTo(null);
         this.setTitle("Video Club");
         this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu21 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        MenuConsultas = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        menuDevolveralquiler = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        subMenuProductos = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");
        jMenu1.setName("jMenu1"); // NOI18N

        jMenu2.setText("jMenu2");
        jMenu2.setName("jMenu2"); // NOI18N

        jMenu3.setText("jMenu3");
        jMenu3.setName("jMenu3"); // NOI18N

        jMenu8.setText("jMenu8");
        jMenu8.setName("jMenu8"); // NOI18N

        jMenu13.setText("jMenu13");
        jMenu13.setName("jMenu13"); // NOI18N

        jPopupMenu1.setName("jPopupMenu1"); // NOI18N

        jPopupMenu2.setName("jPopupMenu2"); // NOI18N

        jMenuBar2.setName("jMenuBar2"); // NOI18N

        jMenu21.setText("File");
        jMenu21.setName("jMenu21"); // NOI18N
        jMenuBar2.add(jMenu21);

        jMenu22.setText("Edit");
        jMenu22.setName("jMenu22"); // NOI18N
        jMenuBar2.add(jMenu22);

        jMenuBar3.setName("jMenuBar3"); // NOI18N

        jMenu23.setText("File");
        jMenu23.setName("jMenu23"); // NOI18N
        jMenuBar3.add(jMenu23);

        jMenu24.setText("Edit");
        jMenu24.setName("jMenu24"); // NOI18N
        jMenuBar3.add(jMenu24);

        jMenuBar4.setName("jMenuBar4"); // NOI18N

        jMenu25.setText("File");
        jMenu25.setName("jMenu25"); // NOI18N
        jMenuBar4.add(jMenu25);

        jMenu26.setText("Edit");
        jMenu26.setName("jMenu26"); // NOI18N
        jMenuBar4.add(jMenu26);

        jMenu27.setText("jMenu27");
        jMenu27.setName("jMenu27"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setName("jLabel2"); // NOI18N

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu4.setText("Sistema ");
        jMenu4.setName("jMenu4"); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenu6.setText("Salir");
        jMenu6.setName("jMenu6"); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu6);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Membresias");
        jMenu7.setName("jMenu7"); // NOI18N

        jMenu10.setText("Nuevo Registro");
        jMenu10.setName("jMenu10"); // NOI18N
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenu7.add(jMenu10);

        MenuConsultas.setText("Consultar");
        MenuConsultas.setName("MenuConsultas"); // NOI18N
        MenuConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuConsultasMouseClicked(evt);
            }
        });
        MenuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultasActionPerformed(evt);
            }
        });
        jMenu7.add(MenuConsultas);

        jMenuBar1.add(jMenu7);

        jMenu16.setText("Devoluciones");
        jMenu16.setName("jMenu16"); // NOI18N

        menuDevolveralquiler.setText("Devolver Alquiler");
        menuDevolveralquiler.setName("menuDevolveralquiler"); // NOI18N
        menuDevolveralquiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDevolveralquilerMouseClicked(evt);
            }
        });
        menuDevolveralquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDevolveralquilerActionPerformed(evt);
            }
        });
        jMenu16.add(menuDevolveralquiler);

        jMenuBar1.add(jMenu16);

        jMenu28.setText("Catalogo");
        jMenu28.setName("jMenu28"); // NOI18N

        subMenuProductos.setText("Nuevo Producto");
        subMenuProductos.setName("subMenuProductos"); // NOI18N
        subMenuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMenuProductosMouseClicked(evt);
            }
        });
        subMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProductosActionPerormed(evt);
            }
        });
        jMenu28.add(subMenuProductos);

        jMenu5.setText("Consultar");
        jMenu5.setName("jMenu5"); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenu5);

        jMenuBar1.add(jMenu28);

        jMenu17.setText("Alquiler");
        jMenu17.setName("jMenu17"); // NOI18N

        jMenu18.setText("Registrar");
        jMenu18.setName("jMenu18"); // NOI18N
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenu17.add(jMenu18);

        jMenuBar1.add(jMenu17);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        // TODO add your handling code here:
         new ClienteNuevoRegistro().setVisible(true);
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        // TODO add your handling code here:
         new RegistroDAlquiler().setVisible(true);
    }//GEN-LAST:event_jMenu18MouseClicked

    private void subMenuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuProductosMouseClicked
        // TODO add your handling code here:
        new CatalogoNuevoRegistro().setVisible(true);
    }//GEN-LAST:event_subMenuProductosMouseClicked

    private void subMenuProductosActionPerormed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProductosActionPerormed
        
    }//GEN-LAST:event_subMenuProductosActionPerormed

    private void MenuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultasActionPerformed
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_MenuConsultasActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void MenuConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuConsultasMouseClicked
        // TODO add your handling code here:
         new ConsultaMembresia().setVisible(true);
        
    }//GEN-LAST:event_MenuConsultasMouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
         new ConsultaProductos().setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void menuDevolveralquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDevolveralquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDevolveralquilerActionPerformed

    private void menuDevolveralquilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDevolveralquilerMouseClicked
        // TODO add your handling code here:
        
         new Devoluciones().setVisible(true);
        
    }//GEN-LAST:event_menuDevolveralquilerMouseClicked

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenu menuDevolveralquiler;
    private javax.swing.JMenu subMenuProductos;
    // End of variables declaration//GEN-END:variables
}
