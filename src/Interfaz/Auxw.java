/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Dell
 */
public class Auxw extends javax.swing.JFrame {

    /**
     * Creates new form Auxw
     */
    public Auxw() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Valor1 = new javax.swing.JLabel();
        jPanelPlatoMenu = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jButtonBotonAgregar = new javax.swing.JButton();
        jLabelNombrePlato = new javax.swing.JLabel();
        jLabelDescripcionPlato = new javax.swing.JLabel();
        jLabelValorDescuento = new javax.swing.JLabel();
        jLabelEtiquetaValor = new javax.swing.JLabel();
        jLabelEtiquetaDescuento = new javax.swing.JLabel();
        jLabelValorPlato = new javax.swing.JLabel();

        jLabel1Valor1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1Valor1.setText("Valor");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPlatoMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPlatoMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPlatoMenu.setPreferredSize(new java.awt.Dimension(372, 180));

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caldo de gallina (1).png"))); // NOI18N

        jButtonBotonAgregar.setBackground(new java.awt.Color(247, 178, 6));
        jButtonBotonAgregar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButtonBotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBotonAgregar.setText("Ver");
        jButtonBotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBotonAgregarActionPerformed(evt);
            }
        });

        jLabelNombrePlato.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabelNombrePlato.setText("Nombre Plato");

        jLabelDescripcionPlato.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelDescripcionPlato.setText("Descripcion");

        jLabelValorDescuento.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelValorDescuento.setText("Valor");

        jLabelEtiquetaValor.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelEtiquetaValor.setText("Valor subtotal");

        jLabelEtiquetaDescuento.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelEtiquetaDescuento.setText("Descuento");

        jLabelValorPlato.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelValorPlato.setText("Valor");

        javax.swing.GroupLayout jPanelPlatoMenuLayout = new javax.swing.GroupLayout(jPanelPlatoMenu);
        jPanelPlatoMenu.setLayout(jPanelPlatoMenuLayout);
        jPanelPlatoMenuLayout.setHorizontalGroup(
            jPanelPlatoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlatoMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelPlatoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlatoMenuLayout.createSequentialGroup()
                        .addGroup(jPanelPlatoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescripcionPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPlatoMenuLayout.createSequentialGroup()
                                .addComponent(jLabelEtiquetaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelValorPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPlatoMenuLayout.createSequentialGroup()
                        .addComponent(jLabelEtiquetaDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonBotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanelPlatoMenuLayout.setVerticalGroup(
            jPanelPlatoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlatoMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelPlatoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlatoMenuLayout.createSequentialGroup()
                        .addComponent(jLabelNombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelDescripcionPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelPlatoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEtiquetaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPlatoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlatoMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonBotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPlatoMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPlatoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEtiquetaDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jPanelPlatoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jPanelPlatoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBotonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBotonAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Auxw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auxw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auxw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auxw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auxw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBotonAgregar;
    private javax.swing.JLabel jLabel1Valor1;
    private javax.swing.JLabel jLabelDescripcionPlato;
    private javax.swing.JLabel jLabelEtiquetaDescuento;
    private javax.swing.JLabel jLabelEtiquetaValor;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombrePlato;
    private javax.swing.JLabel jLabelValorDescuento;
    private javax.swing.JLabel jLabelValorPlato;
    private javax.swing.JPanel jPanelPlatoMenu;
    // End of variables declaration//GEN-END:variables
}
