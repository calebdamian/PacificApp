/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Frame;
import backEnd.Cliente;
import backEnd.Factura;
import backEnd.Plato;
import backEnd.Restaurante;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Canasta extends javax.swing.JFrame {

    private Restaurante administrador;
    private Cliente cliente;
    private ArrayList<JPanel> JPanelArray;
    private ArrayList<JLabel> JLabelNombrePlatilloArray;
    private ArrayList<JLabel> JLabelCantidadPlatosArray;
    private ArrayList<JLabel> JLabelDescripcionArray;
    private ArrayList<JButton> jButtonEliminarArray;
    private ArrayList<JLabel> JLabelValorArray;
    private ArrayList<JLabel> JLabelEiquetaCantidadPlatosArray;
    private ArrayList<JLabel> JLabelEiquetaValorSubtotalArray;
    private Plato platoaux;
    private ArrayList<JButton> jButtonModificarArray;

    public Canasta() {
        initComponents();
        JPanelArray = new ArrayList();
        JLabelNombrePlatilloArray = new ArrayList();
        JLabelCantidadPlatosArray = new ArrayList();
        JLabelDescripcionArray = new ArrayList();
        jButtonEliminarArray = new ArrayList();
        JLabelValorArray = new ArrayList();
        JLabelEiquetaCantidadPlatosArray = new ArrayList();
        JLabelEiquetaValorSubtotalArray = new ArrayList();
        jButtonModificarArray = new ArrayList();

        boolean a = false;
    }

    public void crear(Restaurante r, Cliente c1) {
        administrador = r;
        this.cliente = c1;
        if (cliente.getPedido() != null) {
            iniciar();
        }
    }

    public void iniciar() {
        String nombre = cliente.getNombre();
        String numCedul = cliente.getNumCedula();

        for (int i = 0; i < cliente.getPedido().getPlatos().size(); i++) {

            String nombrePlato = cliente.getPedido().getPlatos().get(i).getNombre();
            String descripcionPlato = cliente.getPedido().getPlatos().get(i).getDescripcion();
            String valorSubtotalString = String.valueOf(cliente.getPedido().getPlatos().get(i).calcularValorSubtotal());
            String cantidadPlatosString = Integer.toString(cliente.getPedido().getPlatos().get(i).getCantidad());

            //platoaux = administrador.buscarCliente(nombre, numCedul).getPedido().getPlatos().get(i);
            platoaux = cliente.getPedido().getPlatos().get(i);
            JPanel jPanelPlatos = new JPanel();
            JLabel jLabelCantidadPlatos1 = new JLabel();
            JLabel jLabelDescripcion = new JLabel();
            JLabel jLabelEtiquetaCantidaPlatos1 = new JLabel();
            JLabel jLabelEtiquetaValorSubtotal = new JLabel();
            JLabel jLabelNombrePlatillo = new JLabel();
            JLabel jLabel1Valor = new JLabel();
            JButton jButtonEliminar = new JButton();
            JButton jButtonModificar = new JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanelPlatos.setBackground(new java.awt.Color(255, 255, 255));
            jPanelPlatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jPanelPlatos.setPreferredSize(new java.awt.Dimension(372, 180));

            //SETEAR IMAGEN PLATO--------------
            jButtonModificar.setIcon(platoaux.getImagen()); // NOI18N

            jLabelEtiquetaCantidaPlatos1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
            jLabelEtiquetaCantidaPlatos1.setText("Cantidad Platos");

            jButtonEliminar.setBackground(new java.awt.Color(247, 178, 6));
            jButtonEliminar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
            jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
            jButtonEliminar.setText("Eliminar");

            jLabelNombrePlatillo.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
            jLabelNombrePlatillo.setText(nombrePlato);

            jLabelDescripcion.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
            jLabelDescripcion.setText(descripcionPlato);

            jLabel1Valor.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
            jLabel1Valor.setText(valorSubtotalString);

            jLabelEtiquetaValorSubtotal.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
            jLabelEtiquetaValorSubtotal.setText("Valor subtotal");

            jLabelCantidadPlatos1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
            jLabelCantidadPlatos1.setText(cantidadPlatosString);

            javax.swing.GroupLayout jPanelPlatosLayout = new javax.swing.GroupLayout(jPanelPlatos);
            jPanelPlatos.setLayout(jPanelPlatosLayout);
            jPanelPlatosLayout.setHorizontalGroup(
                    jPanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPlatosLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelPlatosLayout.createSequentialGroup()
                                                    .addGroup(jPanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelNombrePlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanelPlatosLayout.createSequentialGroup()
                                                                    .addComponent(jLabelEtiquetaValorSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(20, 20, 20)
                                                                    .addComponent(jLabel1Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelPlatosLayout.createSequentialGroup()
                                                    .addComponent(jLabelEtiquetaCantidaPlatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jLabelCantidadPlatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(20, 20, 20)
                                                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
            );
            jPanelPlatosLayout.setVerticalGroup(
                    jPanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPlatosLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelPlatosLayout.createSequentialGroup()
                                                    .addComponent(jLabelNombrePlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelEtiquetaValorSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel1Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEtiquetaCantidaPlatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelCantidadPlatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addComponent(jPanelPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(288, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(430, 430, 430)
                                    .addComponent(jPanelPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(168, Short.MAX_VALUE))
            );
            pack(); //metodo que acopla todo lo creado
            JPanelArray.add(jPanelPlatos);
            jButtonModificarArray.add(jButtonModificar);
            JLabelNombrePlatilloArray.add(jLabelNombrePlatillo);
            JLabelCantidadPlatosArray.add(jLabelCantidadPlatos1);
            JLabelDescripcionArray.add(jLabelDescripcion);
            jButtonEliminarArray.add(jButtonEliminar);
            JLabelValorArray.add(jLabel1Valor);
            JLabelEiquetaCantidadPlatosArray.add(jLabelEtiquetaCantidaPlatos1);
            JLabelEiquetaValorSubtotalArray.add(jLabelEtiquetaValorSubtotal);
            jPanelPrincipal.add(jPanelPlatos);

            jButtonEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cliente.getPedido().eliminarplatoPedidoTotal(platoaux);
                    int input = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el platillo " + platoaux.getNombre() + "?", "Advertencia", 0);
                    if (input == 0) {
                        administrador.buscarCliente(nombre, numCedul).getPedido().imprimirPedido();
                        Canasta i = new Canasta();
                        i.crear(administrador, cliente);
                        setVisible(false);
                        i.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha eliminado el platillo");
                    }
                }
            });

            this.setSize(new Dimension(415, 730));
            jPanelPrincipal.updateUI();

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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelMinimizar1 = new javax.swing.JLabel();
        jLabelBotonCerrar1 = new javax.swing.JLabel();
        jButtonRegresarMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jButtonRealizarPedido = new javax.swing.JButton();
        jLabelValorSubtotalTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 178, 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(200, 194, 194));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 250, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mi pedido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 220, 76));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 90));

        jPanel4.setBackground(new java.awt.Color(253, 200, 35));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 31));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimizar1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelMinimizar1.setForeground(new java.awt.Color(51, 204, 0));
        jLabelMinimizar1.setText("•");
        jLabelMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizar1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabelMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 30));

        jLabelBotonCerrar1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelBotonCerrar1.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBotonCerrar1.setText("•");
        jLabelBotonCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonCerrar1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabelBotonCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        jButtonRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        jButtonRegresarMenu.setContentAreaFilled(false);
        jButtonRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarMenuActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonRegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(395, 485));
        jPanelPrincipal.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(jPanelPrincipal);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        jButtonRealizarPedido.setBackground(new java.awt.Color(247, 178, 16));
        jButtonRealizarPedido.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButtonRealizarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealizarPedido.setText("Realizar Pedido");
        jButtonRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarPedidoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRealizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        jLabelValorSubtotalTotal.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabelValorSubtotalTotal.setText("valor");
        jPanel2.add(jLabelValorSubtotalTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 110, -1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel4.setText("Subtotal:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 400, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizar1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizar1MouseClicked

    private void jLabelBotonCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonCerrar1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelBotonCerrar1MouseClicked

    private void jButtonRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarMenuActionPerformed
        MenuCliente i = new MenuCliente();
        try {
            i.crear(administrador, cliente);
        } catch (Exception ex) {
            Logger.getLogger(Canasta.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jButtonRegresarMenuActionPerformed

    private void jButtonRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarPedidoActionPerformed
        LoginCliente i = new LoginCliente();
        try {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el metodo de pago: tarjeta o efectivo");
            if (nombre.compareToIgnoreCase("tarjeta") == 0) {
                Factura f = new Factura("Tarjeta", cliente);
                f.calcularTotalFactura();
                JPanel panel = new JPanel();
                JTextArea texto = new JTextArea(f.toString());
                texto.setFont(new java.awt.Font("Ebrima", 0, 14));
                texto.setEditable(false);
                panel.add(texto);
                JOptionPane.showMessageDialog(null, panel);
                administrador.getClientes().eliminarInicio();
                JOptionPane.showMessageDialog(null, "Su pedido ha sido enviado a la cocina", "Mensaje", 1);
                i.crear(administrador);
                this.setVisible(false);
                i.setVisible(true);
            } else if (nombre.compareToIgnoreCase("efectivo") == 0) {
                Factura f = new Factura("Efectivo", cliente);
                f.calcularTotalFactura();
                JPanel panel = new JPanel();
                JTextArea texto = new JTextArea(f.toString());
                texto.setFont(new java.awt.Font("Ebrima", 0, 14));
                texto.setEditable(false);
                panel.add(texto);
                JOptionPane.showMessageDialog(null, panel);
                administrador.getClientes().eliminarInicio();
                JOptionPane.showMessageDialog(null, "Su pedido ha sido enviado a la cocina", "Mensaje", 1);
                i.crear(administrador);
                this.setVisible(false);
                i.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado un metodo de pago", "Error", 0);
            }
        } catch (NullPointerException e) {
            System.out.println("No se ingresó metodo de pago");
        } catch (Exception ex) {
            Logger.getLogger(Canasta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonRealizarPedidoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String nombre = cliente.getNombre();
        String numCedul = cliente.getNumCedula();
        double a = administrador.buscarCliente(nombre, numCedul).getPedido().valorSubtotal();
        a = a * 1.12;
        a = Math.round(a * 100.0) / 100.0;
        String aString = String.valueOf(a);
        String valorSubtotal = String.valueOf(administrador.buscarCliente(nombre, numCedul).getPedido().valorSubtotal());
        jLabelValorSubtotalTotal.setText("$" + valorSubtotal);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Canasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Canasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Canasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Canasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Canasta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizarPedido;
    private javax.swing.JButton jButtonRegresarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBotonCerrar1;
    private javax.swing.JLabel jLabelMinimizar1;
    private javax.swing.JLabel jLabelValorSubtotalTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
