/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import backEnd.Cliente;
import backEnd.Ingrediente;
import backEnd.Pedido;
import backEnd.Plato;
import backEnd.Restaurante;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class DescripcionPlato extends javax.swing.JFrame {

    private Restaurante administrador;
    private Plato plato;
    private Cliente cliente;
    private ArrayList<JPanel> panelIngrediente;
    private ArrayList<JButton> botonMas;
    private ArrayList<JButton> botonMenos;
    private ArrayList<JLabel> labelNombreIngrediente;
    private ArrayList<JLabel> labelCantidadIngrediente;
    private ArrayList<JLabel> labelvalor;

    public DescripcionPlato() {
        initComponents();
        panelIngrediente = new ArrayList();
        botonMas = new ArrayList();
        botonMenos = new ArrayList();
        labelNombreIngrediente = new ArrayList();
        labelCantidadIngrediente = new ArrayList();
        labelvalor = new ArrayList();
    }

    public void crear(Restaurante r, Plato plato, Cliente c1) {
        administrador = r;
        this.plato = plato;
        cliente = c1;
        iniciar();

    }

    public void iniciar() {
        for (int i = 0; i < plato.getListaIngredientes().size(); i++) {
            String titulo = plato.getListaIngredientes().get(i).getNombre();
            double valorDoble = plato.getListaIngredientes().get(i).getValor();
            String valor = String.valueOf(valorDoble);

            JPanel panelIngrediente1 = new JPanel();
            JButton botonMas1 = new JButton();
            JButton botonMenos1 = new JButton();
            JLabel labelNombreIngrediente1 = new JLabel();
            JLabel labelCantidadIngrediente1 = new JLabel();
            JLabel labelvalor1 = new JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            panelIngrediente1.setBackground(new java.awt.Color(255, 255, 255));
            panelIngrediente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            panelIngrediente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            labelNombreIngrediente1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
            labelNombreIngrediente1.setText(titulo);
            panelIngrediente1.add(labelNombreIngrediente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, -1));

            labelvalor1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
            labelvalor1.setText(valor);
            panelIngrediente1.add(labelvalor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, -1));

            botonMenos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png"))); // NOI18N
            botonMenos1.setContentAreaFilled(false);
            panelIngrediente1.add(botonMenos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 50, 40));

            botonMas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
            botonMas1.setContentAreaFilled(false);
            panelIngrediente1.add(botonMas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 50, 40));

            labelCantidadIngrediente1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
            labelCantidadIngrediente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidadIngrediente1.setText("1");
            panelIngrediente1.add(labelCantidadIngrediente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 40, 60));

            jLabelImgPlato.setIcon(plato.getImagen());

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addComponent(panelIngrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(288, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(302, 302, 302)
                                    .addComponent(panelIngrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(180, Short.MAX_VALUE))
            );

            pack();
            jPanelContenedorIngredientes.add(panelIngrediente1);
            panelIngrediente.add(panelIngrediente1);
            botonMas.add(botonMas1);
            botonMenos.add(botonMenos1);
            labelNombreIngrediente.add(labelNombreIngrediente1);
            labelCantidadIngrediente.add(labelCantidadIngrediente1);
            labelvalor.add(labelvalor1);

            this.setSize(new Dimension(415, 735));
            botonMas1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int cantidaInt = Integer.parseInt(labelCantidadIngrediente1.getText());
                    cantidaInt++;
                    String canttidaString = String.valueOf(cantidaInt);
                    labelCantidadIngrediente1.setText(canttidaString);
                    String nombreIngrediente = labelNombreIngrediente1.getText();
                    double valorIngrediente = Double.parseDouble(labelvalor1.getText());
                    Ingrediente igredienteAgregado = new Ingrediente(nombreIngrediente, valorIngrediente);
                    plato.agregarIngrediente(igredienteAgregado);
                    plato.calcularExtra(valorIngrediente);
                }
            });

            botonMenos1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int cantidaInt = Integer.parseInt(labelCantidadIngrediente1.getText());
                    cantidaInt--;
                    if (cantidaInt < 0) {
                        cantidaInt = 0;
                        String canttidaString = String.valueOf(cantidaInt);
                        labelCantidadIngrediente1.setText(canttidaString);
                    } else {
                        String canttidaString = String.valueOf(cantidaInt);
                        labelCantidadIngrediente1.setText(canttidaString);
                        String nombreIngrediente = labelNombreIngrediente1.getText();
                        double valorIngrediente = Double.parseDouble(labelvalor1.getText());
                        plato.eliminarIngrediente(nombreIngrediente);
                        plato.calcularExtra(-valorIngrediente);
                    }

                }
            });

            jPanelContenedorIngredientes.updateUI();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelImgPlato = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTituloNombrePlato = new javax.swing.JLabel();
        jLabelDescripcionPlato = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelContenedorIngredientes = new javax.swing.JPanel();
        jLabelValorPlato = new javax.swing.JLabel();
        jLabelNumeroCantidadPlato = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonAgregarCanasta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelBotonCerrar = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelImgPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FRITADA.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImgPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImgPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloNombrePlato.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabelTituloNombrePlato.setText("Nombre Plato");
        jPanel2.add(jLabelTituloNombrePlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, -1));

        jLabelDescripcionPlato.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabelDescripcionPlato.setText("Descripcion del plato");
        jPanel2.add(jLabelDescripcionPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 20));

        jPanelContenedorIngredientes.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(jPanelContenedorIngredientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 390, 360));

        jLabelValorPlato.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabelValorPlato.setText("Valor del plato");
        jPanel2.add(jLabelValorPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, -1));

        jLabelNumeroCantidadPlato.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabelNumeroCantidadPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeroCantidadPlato.setText("1");
        jPanel2.add(jLabelNumeroCantidadPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 30, 40));

        jButton1.setBackground(new java.awt.Color(247, 130, 6));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 40, 40));

        jButton2.setBackground(new java.awt.Color(247, 130, 6));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 40, 40));

        jButtonAgregarCanasta.setBackground(new java.awt.Color(247, 178, 16));
        jButtonAgregarCanasta.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButtonAgregarCanasta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarCanasta.setText("Agregar al carrito");
        jButtonAgregarCanasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCanastaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAgregarCanasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 190, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 560));

        jPanel4.setBackground(new java.awt.Color(241, 240, 238));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimizar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(51, 204, 0));
        jLabelMinimizar.setText("•");
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 30));

        jLabelBotonCerrar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelBotonCerrar.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBotonCerrar.setText("•");
        jLabelBotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonCerrarMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelBotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelBotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelBotonCerrarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabelTituloNombrePlato.setText(plato.getNombre());
        jLabelDescripcionPlato.setText(plato.getDescripcion());
        String valor = String.valueOf(plato.getValor());
        jLabelValorPlato.setText("$ " + valor);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonAgregarCanastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCanastaActionPerformed
        Pedido p1 = new Pedido();
        int numero = Integer.parseInt(jLabelNumeroCantidadPlato.getText());

        /*if (cliente.getPedido() != null) {
            for (int j = 0; j < cliente.getPedido().getPlatos().size(); j++) {
                p1.agregarPlatoPedido(cliente.getPedido().getPlatos().get(j));
            }
        }*/
        if (administrador.buscarCliente(cliente.getNombre(), cliente.getNumCedula()).getPedido() != null) {
            for (int j = 0; j < administrador.buscarCliente(cliente.getNombre(), cliente.getNumCedula()).getPedido().getPlatos().size(); j++) {
                p1.agregarPlatoPedido(administrador.buscarCliente(cliente.getNombre(), cliente.getNumCedula()).getPedido().getPlatos().get(j));
            }
        }
        plato.setCantidad(numero);
        p1.agregarPlatoPedido(plato);
       // cliente.setPedidos(p1);
        administrador.buscarCliente(cliente.getNombre(), cliente.getNumCedula()).setPedidos(p1);
        System.out.println("--------------------------------------------------------------------------------");
        administrador.buscarCliente(cliente.getNombre(), cliente.getNumCedula()).getPedido().imprimirPedido();
        JOptionPane.showMessageDialog(null, "Su platillo se ha agregado a la canasta", "Mensaje", 1);
        MenuCliente i = new MenuCliente();
        try {
            i.crear(administrador, cliente);
        } catch (Exception ex) {
            Logger.getLogger(DescripcionPlato.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarCanastaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cantidaInt = Integer.parseInt(jLabelNumeroCantidadPlato.getText());
        cantidaInt--;
        if (cantidaInt == 0) {
            cantidaInt = 1;
            String canttidaString = String.valueOf(cantidaInt);
            jLabelNumeroCantidadPlato.setText(canttidaString);

        } else {
            String canttidaString = String.valueOf(cantidaInt);
            jLabelNumeroCantidadPlato.setText(canttidaString);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int cantidaInt = Integer.parseInt(jLabelNumeroCantidadPlato.getText());
        cantidaInt++;
        String canttidaString = String.valueOf(cantidaInt);
        jLabelNumeroCantidadPlato.setText(canttidaString);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        try {
            // TODO add your handling code here:
            MenuCliente i = new MenuCliente();
            i.crear(administrador, cliente);
            this.setVisible(false);
            i.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(DescripcionPlato.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(DescripcionPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DescripcionPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DescripcionPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DescripcionPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescripcionPlato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAgregarCanasta;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelBotonCerrar;
    private javax.swing.JLabel jLabelDescripcionPlato;
    private javax.swing.JLabel jLabelImgPlato;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelNumeroCantidadPlato;
    private javax.swing.JLabel jLabelTituloNombrePlato;
    private javax.swing.JLabel jLabelValorPlato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelContenedorIngredientes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
