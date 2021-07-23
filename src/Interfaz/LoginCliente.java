/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Frame;
import backEnd.Cliente;
import backEnd.Ingrediente;
import backEnd.Plato;
import backEnd.Restaurante;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class LoginCliente extends javax.swing.JFrame {

    private Restaurante administrador;

    public LoginCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelBotonCerrar = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonAforo = new javax.swing.JButton();
        jButtonVerificarReservacion = new javax.swing.JButton();
        jButtonAgendarReserva = new javax.swing.JButton();
        jTextNumeroAcompaniantes = new javax.swing.JTextField();
        jtextNombre = new javax.swing.JTextField();
        jTextNumeroCedula = new javax.swing.JTextField();
        jTextNumeroTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonRegistrar1 = new javax.swing.JButton();
        jButtonYaRegistrado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 178, 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(200, 194, 194));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 250, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PacificApp");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 260, 76));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 90));

        jPanel3.setBackground(new java.awt.Color(253, 200, 35));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimizar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(51, 204, 0));
        jLabelMinimizar.setText("•");
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 30));

        jLabelBotonCerrar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelBotonCerrar.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBotonCerrar.setText("•");
        jLabelBotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelBotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel3.setText("Ingrese sus datos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 36));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel5.setText("Cédula:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setText("Número de acompañantes:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButtonAforo.setBackground(new java.awt.Color(247, 178, 6));
        jButtonAforo.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButtonAforo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAforo.setText("Verificar el aforo");
        jButtonAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAforoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 180, -1));

        jButtonVerificarReservacion.setBackground(new java.awt.Color(247, 178, 6));
        jButtonVerificarReservacion.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButtonVerificarReservacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerificarReservacion.setText("Verificar reservación");
        jButtonVerificarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarReservacionActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVerificarReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, -1));

        jButtonAgendarReserva.setBackground(new java.awt.Color(247, 178, 6));
        jButtonAgendarReserva.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButtonAgendarReserva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgendarReserva.setText("Gestionar Reservaciones");
        jButtonAgendarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgendarReservaMouseClicked(evt);
            }
        });
        jButtonAgendarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarReservaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAgendarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 200, -1));
        jPanel2.add(jTextNumeroAcompaniantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 340, -1));

        jtextNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jtextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 340, -1));
        jPanel2.add(jTextNumeroCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 340, -1));
        jPanel2.add(jTextNumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Instagram.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GMail.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Facebook.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        jButtonRegistrar1.setBackground(new java.awt.Color(247, 178, 6));
        jButtonRegistrar1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButtonRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar1.setText("Registrarse");
        jButtonRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 180, -1));

        jButtonYaRegistrado.setBackground(new java.awt.Color(247, 178, 6));
        jButtonYaRegistrado.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButtonYaRegistrado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonYaRegistrado.setText("¿Ya está registrado?");
        jButtonYaRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYaRegistradoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonYaRegistrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jLabelBotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelBotonCerrarMouseClicked

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jButtonAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAforoActionPerformed
        int acompañantes = 0;
        if (jTextNumeroAcompaniantes.getText().isEmpty()) {
            acompañantes = 0;
        } else if (!validarNumAcompaniantes(jTextNumeroAcompaniantes.getText())) {
            JOptionPane.showMessageDialog(null, "El apartado de acompañates tiene datos incorrectos", "Advertencia", 0);
        } else if (!validarAforo(jTextNumeroAcompaniantes.getText())) {
            int numeroentero = Integer.parseInt(jTextNumeroAcompaniantes.getText());
            JOptionPane.showMessageDialog(null, "Supera el aforo por: " + ((administrador.getAforoAct() + numeroentero) - administrador.getAforoMax()+1) + " acompañantes", "Advertencia", 0);
        } else {
            acompañantes = Integer.parseInt(jTextNumeroAcompaniantes.getText());
        }
        System.out.println(validarNumAcompaniantes(jTextNumeroAcompaniantes.getText()));
        System.out.println(validarAforo(jTextNumeroAcompaniantes.getText()));
        if ((validarNumAcompaniantes(jTextNumeroAcompaniantes.getText())) && (validarAforo(jTextNumeroAcompaniantes.getText()))) {
            JOptionPane.showMessageDialog(null, "Si hay aforo disponible", "Mensaje", 1);
        }
    }//GEN-LAST:event_jButtonAforoActionPerformed

    private void jButtonVerificarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarReservacionActionPerformed
        if (jtextNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado de nombre esta vacio", "Advertencia", 0);
        }
        if (jTextNumeroCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado del numero de cedula esta vacio", "Advertencia", 0);
        }
        if (!validadorDeCedula(jTextNumeroCedula.getText())) {
            JOptionPane.showMessageDialog(null, "El numero de cedula es incorrecto", "Advertencia", 0);
        } else {
            if (administrador.buscarCliente(jTextNumeroCedula.getText()) != null) {
                if (administrador.buscarCliente(jtextNombre.getText(), jTextNumeroCedula.getText()).getVerificacionReserva()) {
                    System.out.println("aqui si entro");
                    JOptionPane.showMessageDialog(null, "Usted cuenta con una reserva el " + administrador.buscarCliente(jtextNombre.getText(), jTextNumeroCedula.getText()).getReserva().getFechaReserva().toLocaleString(), "Mensaje", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Usted no cuenta con una reservacion", "Mensaje", 1);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Ustes no esta registrado en el sistema", "Mensaje", 1);

            }
        }
    }//GEN-LAST:event_jButtonVerificarReservacionActionPerformed

    private void jButtonAgendarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarReservaActionPerformed
        try {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
            String cedula = JOptionPane.showInputDialog(null, "Ingrese su número de cédula:");
            if (administrador.buscarCliente(nombre, cedula) != null) {
                Reservacion l = new Reservacion();
                l.llenar(administrador.buscarCliente(nombre, cedula));
                l.crear(administrador);
                this.setVisible(false);
                l.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Debe registrarse en el sistema para agendar una reservacion", "Advertencia", 0);
            }
        } catch (Exception e) {
            System.out.println("Cancelacion");

        }
    }//GEN-LAST:event_jButtonAgendarReservaActionPerformed

    private void jButtonRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrar1ActionPerformed
        // TODO add your handling code here:
        int acompañantes = 0;
        if (jtextNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado de nombre esta vacio", "Advertencia", 0);
        }
        if (jTextNumeroCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado del numero de cedula esta vacio", "Advertencia", 0);
        }
        if (!validadorDeCedula(jTextNumeroCedula.getText())) {
            JOptionPane.showMessageDialog(null, "El numero de cedula es incorrecto", "Advertencia", 0);
        }
        if (jTextNumeroTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apartado de numero de telefono esta vacio", "Advertencia", 0);
        }
        if (!validarNumEmergencia(jTextNumeroTelefono.getText())) {
            JOptionPane.showMessageDialog(null, "El numero de telefono es incorrecto", "Advertencia", 0);
        }
        if (jTextNumeroAcompaniantes.getText().isEmpty()) {
            acompañantes = 0;
        } else if (!validarAforo(jTextNumeroAcompaniantes.getText())) {
            int numeroentero = Integer.parseInt(jTextNumeroAcompaniantes.getText());
            JOptionPane.showMessageDialog(null, "Supera el aforo por: " + ((administrador.getAforoAct() + numeroentero) - administrador.getAforoMax()+1) + " acompañantes", "Advertencia", 0);
        } else {
            acompañantes = Integer.parseInt(jTextNumeroAcompaniantes.getText());
        }
        if (!verificarCedulaIngresada(jTextNumeroCedula.getText())) {
            JOptionPane.showMessageDialog(null, "La cedula ingresada ya consta en el sistema", "Advertencia", 0);
        }
        if (!(jtextNombre.getText().isEmpty()) && !(jTextNumeroCedula.getText().isEmpty()) && (validadorDeCedula(jTextNumeroCedula.getText())) && !(jTextNumeroTelefono.getText().isEmpty()) && (validarNumEmergencia(jTextNumeroTelefono.getText())) && (validarNumAcompaniantes(jTextNumeroAcompaniantes.getText())) && (validarAforo(jTextNumeroAcompaniantes.getText())) && verificarCedulaIngresada(jTextNumeroCedula.getText())) {
            int input = JOptionPane.showConfirmDialog(null, "¿Tu informacion es correcta?\nNombre: " + jtextNombre.getText() + "\nNumero de cedula: " + jTextNumeroCedula.getText() + "\nNumero de telefono: " + jTextNumeroTelefono.getText() + "\nAcompañantes: " + acompañantes, "Confirmación", 2);
            if (input == 0) {
                Cliente c1 = new Cliente(jtextNombre.getText(), jTextNumeroCedula.getText(), acompañantes, jTextNumeroTelefono.getText());
                if (administrador.agregarCliente(c1).compareTo("Bienvenido al restaurante pacifico") == 0) {
                    administrador.agregarCliente(c1);
                    administrador.setAforoAct(administrador.getClientes().contar() + acompañantes);
                    MenuCliente i = new MenuCliente();
                    try {
                        i.crear(administrador, c1);
                    } catch (Exception ex) {
                        Logger.getLogger(LoginCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.setVisible(false);
                    i.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, administrador.agregarCliente(c1), "Advertencia", 0);
                }
            } else {

            }
        }
    }//GEN-LAST:event_jButtonRegistrar1ActionPerformed

    private void jButtonAgendarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgendarReservaMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jButtonAgendarReservaMouseClicked

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        LoginPrincipal i = new LoginPrincipal();
        i.crear(administrador);
        this.setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonYaRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYaRegistradoActionPerformed
        // TODO add your handling code here:
        String cedula = JOptionPane.showInputDialog(null, "Ingrese su número de cédula:");
        if (!validadorDeCedula(cedula)) {
            JOptionPane.showMessageDialog(null, "La cedula ingresada es incorrecta", "Advertencia", 0);
        }
        if (administrador.buscarCliente(cedula) != null && validadorDeCedula(cedula)) {
            String numAcom = JOptionPane.showInputDialog(null, "Ingrese el número de acompañantes");
            if (isNumeric(numAcom)) {
                Cliente c1;
                c1 = administrador.buscarCliente(cedula);
                c1.setAcompaniantes(Integer.parseInt(numAcom));
                MenuCliente i = new MenuCliente();
                try {
                    i.crear(administrador, c1);
                } catch (Exception ex) {
                    Logger.getLogger(LoginCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
                i.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un número por favor", "Error", 1);
            }

        } else {
            JOptionPane.showMessageDialog(null, "La cedula ingresada no consta en el sistema", "Advertencia", 0);
        }
    }//GEN-LAST:event_jButtonYaRegistradoActionPerformed

    public void crear(Restaurante r) {
        administrador = r;
    }

    public boolean verificarCedulaIngresada(String cedula) {
        Cliente clienteAux = administrador.buscarCliente(cedula);
        if (clienteAux == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) { // ConstantesApp.LongitudCedula
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    // Coeficientes de validación cédula
                    // El decimo digito se lo considera dígito verificador
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
            System.out.println("La Cédula ingresada es Incorrecta");
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

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
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
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAforo;
    private javax.swing.JButton jButtonAgendarReserva;
    private javax.swing.JButton jButtonRegistrar1;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVerificarReservacion;
    private javax.swing.JButton jButtonYaRegistrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBotonCerrar;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextNumeroAcompaniantes;
    private javax.swing.JTextField jTextNumeroCedula;
    private javax.swing.JTextField jTextNumeroTelefono;
    private javax.swing.JTextField jtextNombre;
    // End of variables declaration//GEN-END:variables
}