/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import backEnd.Cliente;
import backEnd.Cola;
import backEnd.Ingrediente;
import backEnd.NodoArbol;
import backEnd.Plato;
import backEnd.Restaurante;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class MenuCliente extends javax.swing.JFrame {

    private Restaurante administrador;
    private Cliente cliente;
    private ArrayList<JPanel> panel1;
    private ArrayList<JButton> boton;
    private ArrayList<JLabel> labetitulo;
    private ArrayList<JLabel> labeldescripcion;
    private ArrayList<JLabel> labelvalor;
    private ArrayList<JLabel> labelImagen;
    private ArrayList<JLabel> labelValorDescuento;
    private ArrayList<JLabel> labelEtiquetaDescuento;
    private ArrayList<JLabel> labelEtiquetaValor;
    

    public MenuCliente() {
        initComponents();
        panel1 = new ArrayList();
        boton = new ArrayList();
        labetitulo = new ArrayList();
        labeldescripcion = new ArrayList();
        labelvalor = new ArrayList();
        labelImagen = new ArrayList();
        labelValorDescuento = new ArrayList();
        labelEtiquetaDescuento = new ArrayList();
        labelEtiquetaValor = new ArrayList();

    }

    public void crear(Restaurante r, Cliente c1) throws Exception {
        administrador = r;
        this.cliente = c1;
        iniciar();

    }

    public void iniciar() throws Exception {
        Cola cola = administrador.getMenu().getPlatos().niveles();
        for (int i = 0; i < administrador.getMenu().getPlatos().contar(administrador.getMenu().getPlatos().getRaiz()); i++) {
            NodoArbol dato = cola.desencolar();
            int referencia = dato.getDato().getReferencia();
            String titulo = dato.getDato().getNombre();
            String descripcion = dato.getDato().getDescripcion();
            double valorDoble = dato.getDato().getValor();
            ImageIcon imagen = dato.getDato().getImagen();
            String valor = String.valueOf(valorDoble);
            JPanel jPanelPlatoMenu = new javax.swing.JPanel();
            JLabel jLabelNombrePlato = new javax.swing.JLabel();
            JLabel jLabelDescripcionPlato = new javax.swing.JLabel();
            JLabel jLabelValorPlato = new javax.swing.JLabel();
            JButton jButtonBotonAgregar = new javax.swing.JButton();
            JLabel jLabelImagen = new javax.swing.JLabel();
            JLabel jLabelValorDescuento = new javax.swing.JLabel();
            JLabel jLabelEtiquetaValor = new javax.swing.JLabel();
            JLabel jLabelEtiquetaDescuento = new javax.swing.JLabel();
            ArrayList<Ingrediente> a = new ArrayList();
            for (int j = 0; j < administrador.getMenu().buscarPlato(referencia).getListaIngredientes().size(); j++) {
                a.add(administrador.getMenu().buscarPlato(referencia).getListaIngredientes().get(j));
            }
            Plato plato1 = new Plato(titulo, descripcion, valorDoble, a, imagen);
            jPanelPlatoMenu.setBackground(new java.awt.Color(255, 255, 255));
            jPanelPlatoMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jPanelPlatoMenu.setPreferredSize(new java.awt.Dimension(355, 180));
            jPanelPlatoMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            //linea a cambiar para la imagen
            //jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caldo de gallina (1).png")));// NOI18N
            //SETEAR IMAGEN EN INTERFAZ OJO
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPlatoMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPlatoMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPlatoMenu.setPreferredSize(new java.awt.Dimension(372, 180));

        jLabelImagen.setIcon(plato1.getImagen()); // NOI18N

        jButtonBotonAgregar.setBackground(new java.awt.Color(247, 178, 6));
        jButtonBotonAgregar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButtonBotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBotonAgregar.setText("Ver");
       

        jLabelNombrePlato.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabelNombrePlato.setText(plato1.getNombre());

        jLabelDescripcionPlato.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelDescripcionPlato.setText(plato1.getDescripcion());

        jLabelValorDescuento.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelValorDescuento.setText(String.valueOf(plato1.getValor()-plato1.calcularValorConDescuento(plato1.getDescuento())));

        jLabelEtiquetaValor.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelEtiquetaValor.setText("Valor subtotal");

        jLabelEtiquetaDescuento.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelEtiquetaDescuento.setText("Descuento");

        jLabelValorPlato.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelValorPlato.setText(String.valueOf(plato1.getValor()));

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
        
            PanelPrincipal.add(jPanelPlatoMenu);
            panel1.add(jPanelPlatoMenu);
            boton.add(jButtonBotonAgregar);
            labetitulo.add(jLabelNombrePlato);
            labeldescripcion.add(jLabelDescripcionPlato);
            labelvalor.add(jLabelValorPlato);
            labelvalor.add(jLabelImagen);

            jButtonBotonAgregar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DescripcionPlato i = new DescripcionPlato();
                    i.crear(administrador, plato1, cliente);
                    setVisible(false);
                    i.setVisible(true);
                }
            });
            PanelPrincipal.updateUI();

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

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelBotonCerrar = new javax.swing.JLabel();
        jButtonVerPoliticas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelMinimizar1 = new javax.swing.JLabel();
        jLabelBotonCerrar1 = new javax.swing.JLabel();
        jButtonCanasta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(253, 200, 35));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimizar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(51, 204, 0));
        jLabelMinimizar.setText("•");
        jPanel3.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 30));

        jLabelBotonCerrar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelBotonCerrar.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBotonCerrar.setText("•");
        jPanel3.add(jLabelBotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        jButtonVerPoliticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion (1).png"))); // NOI18N
        jButtonVerPoliticas.setContentAreaFilled(false);
        jButtonVerPoliticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerPoliticasActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonVerPoliticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel1.setBackground(new java.awt.Color(247, 178, 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(200, 194, 194));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 250, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menú");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, 76));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-pequeno.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 90));

        jPanel4.setBackground(new java.awt.Color(253, 200, 35));
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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jButtonCanasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito.png"))); // NOI18N
        jButtonCanasta.setContentAreaFilled(false);
        jButtonCanasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanastaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCanasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(PanelPrincipal);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 550));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizar1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizar1MouseClicked

    private void jLabelBotonCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonCerrar1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelBotonCerrar1MouseClicked

    private void jButtonCanastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanastaActionPerformed
        Canasta i = new Canasta();
        i.crear(administrador, cliente);
        setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jButtonCanastaActionPerformed

    private void jButtonVerPoliticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerPoliticasActionPerformed
        Politicas i = new Politicas();
        i.crear(administrador, cliente);
        i.llenar(administrador);
        setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jButtonVerPoliticasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginCliente i = new LoginCliente();
        i.crear(administrador);
        this.setVisible(false);
        i.setVisible(true);
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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCanasta;
    private javax.swing.JButton jButtonVerPoliticas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBotonCerrar;
    private javax.swing.JLabel jLabelBotonCerrar1;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelMinimizar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
