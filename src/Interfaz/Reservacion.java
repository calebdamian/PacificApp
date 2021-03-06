/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.Date;
import backEnd.*;
import backEnd.Reserva;
import java.awt.Frame;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Chaval
 */
public class Reservacion extends javax.swing.JFrame {

    /**
     * Creates new form Reservacion
     */
    private Restaurante administrador;
    private Cliente c;

    public Reservacion() {
        initComponents();
        this.setLocationRelativeTo(this);

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelBotonCerrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10Nombre = new javax.swing.JLabel();
        jLabel11Acompa = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextAnio = new javax.swing.JTextField();
        jTextDia = new javax.swing.JTextField();
        jTextMes = new javax.swing.JTextField();
        jLabel4CancelarReservacion = new javax.swing.JLabel();
        jLabel6AgendarReservacion = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16Cedula = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JTextField();
        jLabel11Acompa1 = new javax.swing.JLabel();
        jTextAcompa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(247, 178, 6));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, 110));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reservas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 310, 80));

        jPanel3.setBackground(new java.awt.Color(253, 200, 35));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimizar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(51, 204, 0));
        jLabelMinimizar.setText("???");
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 30));

        jLabelBotonCerrar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelBotonCerrar.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBotonCerrar.setText("???");
        jLabelBotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelBotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 130));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setText("A??o:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 50, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Costo obligatorio de reservaci??n ($10)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 330, -1));

        jLabel10Nombre.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel10Nombre.setText("Nombre:");
        jLabel10Nombre.setToolTipText("");
        jPanel1.add(jLabel10Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        jLabel11Acompa.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel11Acompa.setText("Tel??fono:");
        jLabel11Acompa.setToolTipText("");
        jPanel1.add(jLabel11Acompa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel12.setText("Fecha para la reservaci??n (DD/MM/AAAA)");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 370, -1));

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel13.setText("D??a: ");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 40, -1));

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel14.setText("Mes:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 50, -1));

        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 380, 30));

        jTextNombre.setEditable(false);
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 380, 30));
        jPanel1.add(jTextAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 50, 30));

        jTextDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDiaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 50, 30));
        jPanel1.add(jTextMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 50, 30));

        jLabel4CancelarReservacion.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4CancelarReservacion.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4CancelarReservacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4CancelarReservacion.setText("CANCELAR RESERVACI??N");
        jLabel4CancelarReservacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4CancelarReservacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4CancelarReservacion.setOpaque(true);
        jLabel4CancelarReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4CancelarReservacionMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4CancelarReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 380, 40));

        jLabel6AgendarReservacion.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6AgendarReservacion.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6AgendarReservacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6AgendarReservacion.setText("AGENDAR RESERVACI??N");
        jLabel6AgendarReservacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6AgendarReservacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6AgendarReservacion.setOpaque(true);
        jLabel6AgendarReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6AgendarReservacionMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6AgendarReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 380, 40));

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel15.setText("Ingrese los datos para realizar la reservaci??n");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel16Cedula.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel16Cedula.setText("C??dula:");
        jLabel16Cedula.setToolTipText("");
        jPanel1.add(jLabel16Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        jTextCedula.setEditable(false);
        jTextCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 380, 30));

        jLabel11Acompa1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel11Acompa1.setText("Acompa??antes:");
        jLabel11Acompa1.setToolTipText("");
        jPanel1.add(jLabel11Acompa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, -1));

        jTextAcompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAcompaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextAcompa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 380, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenar(Cliente c1) {
        c = c1;
        jTextNombre.setText(c1.getNombre());
        jTextCedula.setText(c1.getNumCedula());
        jTextTelefono.setText(c1.getTelefono());
    }
    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCedulaActionPerformed

    private void jTextDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDiaActionPerformed

    private void jLabel6AgendarReservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6AgendarReservacionMouseClicked
        // TODO add your handling code here:
        if (jTextNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado de nombre esta vacio", "Advertencia", 0);
        }
        if (jTextCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado del numero de cedula esta vacio", "Advertencia", 0);
        }
        if (!validadorDeCedula(jTextCedula.getText())) {
            JOptionPane.showMessageDialog(null, "El numero de cedula es incorrecto", "Advertencia", 0);
        }
        if (jTextTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado de telefono esta vacio", "Advertencia", 0);
        }
        if (jTextAcompa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado de acompa??ante esta vacio", "Advertencia", 0);
        }

        if (c.getVerificacionReserva()) {
            JOptionPane.showMessageDialog(null, "Usted ya cuenta con una reserva el " + administrador.buscarCliente(jTextNombre.getText(), jTextCedula.getText()).getReserva().getFechaReserva().toLocaleString(), "Mensaje", 1);
        }
        if(!validarDia(Integer.parseInt(jTextDia.getText()))){
             JOptionPane.showMessageDialog(null, "Ingrese correctamente el dia de la reserva", "Advertencia", 0);
        }
        if(!validarMes(Integer.parseInt(jTextMes.getText()))){
             JOptionPane.showMessageDialog(null, "Ingrese correctamente el mes de la reserva", "Advertencia", 0);
        }
        if(!validarAnio(Integer.parseInt(jTextAnio.getText()))){
             JOptionPane.showMessageDialog(null, "Ingrese correctamente el a??o de la reserva", "Advertencia", 0);
        }
        if (validarDia(Integer.parseInt(jTextDia.getText()))&& validarMes(Integer.parseInt(jTextMes.getText()))&& validarAnio(Integer.parseInt(jTextAnio.getText()))&& !jTextAcompa.getText().isEmpty() && !jTextAnio.getText().isEmpty()&& !jTextDia.getText().isEmpty()&& !jTextMes.getText().isEmpty()){
            Date r1 = new Date(Integer.parseInt(jTextAnio.getText()) - 1900, Integer.parseInt(jTextMes.getText()) - 1, Integer.parseInt(jTextDia.getText()));
            c.reservar(r1);
            JOptionPane.showMessageDialog(null, "MENSAJE DE VERIFICACION ENVIADO A " + c.getTelefono(), "Mensaje", 1);
            LoginCliente i = new LoginCliente();
            i.crear(administrador);
            this.setVisible(false);
            i.setVisible(true);
        }

    }//GEN-LAST:event_jLabel6AgendarReservacionMouseClicked

    private void jTextAcompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAcompaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAcompaActionPerformed

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelBotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelBotonCerrarMouseClicked

    private void jLabel4CancelarReservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4CancelarReservacionMouseClicked
        // TODO add your handling code here:
         if (jTextNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado de nombre esta vacio", "Advertencia", 0);
        }
        if (jTextCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado del numero de cedula esta vacio", "Advertencia", 0);
        }
        if (!validadorDeCedula(jTextCedula.getText())) {
            JOptionPane.showMessageDialog(null, "El numero de cedula es incorrecto", "Advertencia", 0);
        }
        if (jTextTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado de telefono esta vacio", "Advertencia", 0);
        }
        
        if (administrador.buscarCliente(jTextNombre.getText(), jTextCedula.getText()) == null) {
            JOptionPane.showMessageDialog(null, "Usted no est?? registrado en el sistema", "Advertencia", 0);
        }
        if (!jTextTelefono.getText().isEmpty() && !jTextNombre.getText().isEmpty() && !jTextCedula.getText().isEmpty() && validadorDeCedula(jTextCedula.getText())) {
            c.cancelarReserva();
            JOptionPane.showMessageDialog(null, "Su reservaci??n ha sido cancelada ", "Mensaje", 1);
            JOptionPane.showMessageDialog(null, administrador.buscarCliente(jTextNombre.getText(), jTextCedula.getText()).getPenalizacion(), "Mensaje", 1);
            LoginCliente i = new LoginCliente();
            i.crear(administrador);
            this.setVisible(false);
            i.setVisible(true);
            System.out.println(administrador.buscarCliente(jTextNombre.getText(), jTextCedula.getText()).getReserva().toString());
        }

    }//GEN-LAST:event_jLabel4CancelarReservacionMouseClicked

    public boolean validarDia(int dia){
        if(dia>0 && dia<=31){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarMes(int mes){
        if(mes>0 && mes<=12){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarAnio(int anio){
       if(anio>=2021){
            return true;
        }else{
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) { // ConstantesApp.LongitudCedula
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    // Coeficientes de validaci??n c??dula
                    // El decimo digito se lo considera d??gito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }
                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }
        if (!cedulaCorrecta) {
            System.out.println("La C??dula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }

    public boolean validarNumEmergencia(String numero) {
        boolean validacion = true;
        int numeroentero;
        try {
            numeroentero = Integer.parseInt(numero);
            if (numeroentero < 99999999 || numeroentero > 1000000000) {
                validacion = false;

            }
        } catch (NumberFormatException e) {
            validacion = false;
        }
        return validacion;
    }

    public boolean validarNumAcompaniantes(String numero) {
        boolean validacion = true;
        int numeroentero;
        try {
            if (numero.compareTo("") == 0) {
                validacion = true;
            } else {
                numeroentero = Integer.parseInt(numero);
            }
        } catch (NumberFormatException e) {
            validacion = false;
        }
        return validacion;
    }

    public boolean validarAforo(String acompaniantes) {
        boolean validacion = true;
        int numeroentero;
        try {
            if (acompaniantes.compareTo("") == 0) {
                validacion = true;
            } else {
                numeroentero = Integer.parseInt(acompaniantes);
                if (administrador.getAforoMax() > (administrador.getAforoAct() + numeroentero + 1)) {
                    validacion = true;
                } else {
                    validacion = false;
                }
            }
        } catch (NumberFormatException e) {
            validacion = false;
        }
        return validacion;
    }

    public void crear(Restaurante r) {
        administrador = r;

    }

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
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10Nombre;
    private javax.swing.JLabel jLabel11Acompa;
    private javax.swing.JLabel jLabel11Acompa1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16Cedula;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4CancelarReservacion;
    private javax.swing.JLabel jLabel6AgendarReservacion;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBotonCerrar;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextAcompa;
    private javax.swing.JTextField jTextAnio;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextDia;
    private javax.swing.JTextField jTextMes;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
