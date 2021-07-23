/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import backEnd.Restaurante;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Caleb
 */
public class VerPedidos extends javax.swing.JFrame {

    private Restaurante administrador;
    private ArrayList<JPanel> panelPedido;
    private ArrayList<JLabel> nombreCliente;
    private ArrayList<JLabel> jLabel1;
    private ArrayList<JLabel> valor;
    private ArrayList<JScrollPane> scroll;
    private ArrayList<JTextArea> textArea;
    private ArrayList<JLabel> numCedul;
    private ArrayList<JLabel> jLabel2;

    /**
     * Creates new form VerPedidos
     */
    public VerPedidos() {
        initComponents();
        this.setLocationRelativeTo(this);
        panelPedido = new ArrayList();
        nombreCliente = new ArrayList();
        jLabel1 = new ArrayList();
        valor = new ArrayList();
        scroll = new ArrayList();
        textArea = new ArrayList();
        numCedul = new ArrayList();
        jLabel2 = new ArrayList();
    }

    public void iniciar() throws Exception {

        for (int i = 0; i < administrador.getClientes().contar(); i++) {
            if (administrador.getClientes().valorIndice(i).getPedido() != null) {
                String pedido = administrador.getClientes().valorIndice(i).getPedido().getPlatos().toString();
                double a = administrador.getClientes().valorIndice(i).getPedido().valorSubtotal();
                a = a * 1.12;
                a = Math.round(a * 100.0) / 100.0;
                String valorTotal = String.valueOf(a);
                JPanel jPanelPedido = new javax.swing.JPanel();
                JLabel jLabelNombreCliente = new javax.swing.JLabel();
                JLabel jLabel1 = new javax.swing.JLabel();
                JLabel jLabel2 = new javax.swing.JLabel();
                JLabel jLabelValor = new javax.swing.JLabel();
                JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
                JTextArea jTextArea1 = new javax.swing.JTextArea();
                JLabel numCedul = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanelPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabelNombreCliente.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
                jLabelNombreCliente.setText(administrador.getClientes().valorIndice(i).getNombre());

                jLabel1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
                jLabel1.setText("Valor total a pagar:");

                jLabelValor.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
                jLabelValor.setText(valorTotal);

                jTextArea1.setColumns(20);
                jTextArea1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
                jTextArea1.setRows(5);
                jTextArea1.setText(pedido);
                jTextArea1.setEditable(false);
                jScrollPane2.setViewportView(jTextArea1);

                numCedul.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
                numCedul.setText(administrador.getClientes().valorIndice(i).getNumCedula());

                jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
                jLabel2.setText("CI:");

                javax.swing.GroupLayout jPanelPedidoLayout = new javax.swing.GroupLayout(jPanelPedido);
                jPanelPedido.setLayout(jPanelPedidoLayout);
                jPanelPedidoLayout.setHorizontalGroup(
                        jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jLabel1)
                                                        .addGap(76, 76, 76)
                                                        .addComponent(jLabelValor)
                                                        .addGap(126, 126, 126))
                                                .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                                        .addComponent(jLabelNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(numCedul, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())
                                                .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );
                jPanelPedidoLayout.setVerticalGroup(
                        jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelNombreCliente)
                                                .addComponent(numCedul)
                                                .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabelValor))
                                        .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(35, Short.MAX_VALUE)
                                        .addComponent(jPanelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(jPanelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(402, Short.MAX_VALUE))
                );
                pack();

                panelPedido.add(jPanelPedido);
                nombreCliente.add(jLabelNombreCliente);
                valor.add(jLabelValor);
                scroll.add(jScrollPane2);
                textArea.add(jTextArea1);
                this.numCedul.add(numCedul);
                panel.add(jPanelPedido);
                this.setSize(new Dimension(730, 480));
                panel.updateUI();

            }
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

        jPanelArriba = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTituloPanel = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualización de pedidos");
        setResizable(false);

        jPanelArriba.setBackground(new java.awt.Color(247, 178, 6));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo.png"))); // NOI18N

        jLabelTituloPanel.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabelTituloPanel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloPanel.setText("Pedidos de los clientes");

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/flecha.png"))); // NOI18N
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelArribaLayout = new javax.swing.GroupLayout(jPanelArriba);
        jPanelArriba.setLayout(jPanelArribaLayout);
        jPanelArribaLayout.setHorizontalGroup(
            jPanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArribaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelLogo)
                .addGap(30, 30, 30)
                .addComponent(jLabelTituloPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButtonRegresar)
                .addGap(20, 20, 20))
        );
        jPanelArribaLayout.setVerticalGroup(
            jPanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArribaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegresar)
                    .addComponent(jLabelTituloPanel))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        InterfazAdmin i = new InterfazAdmin();
        i.crear(administrador);
        this.setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerPedidos().setVisible(true);
            }
        });
    }

    public void crear(Restaurante r) throws Exception {
        administrador = r;
        iniciar();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTituloPanel;
    private javax.swing.JPanel jPanelArriba;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
