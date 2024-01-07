package Vista;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class PanelAutor extends javax.swing.JPanel {

    public PanelAutor() {
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        label_apellido = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        label_pais = new javax.swing.JLabel();
        comboPais = new javax.swing.JComboBox<>();
        label_provincia = new javax.swing.JLabel();
        comboProvincia = new javax.swing.JComboBox<>();
        label_fecha = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        label_obras = new javax.swing.JLabel();
        txtobras = new javax.swing.JTextField();
        label_correo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        label_contra = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        label_confirmar = new javax.swing.JLabel();
        txtconfirmar = new javax.swing.JPasswordField();
        btnregistrar = new javax.swing.JButton();
        label_inicio = new javax.swing.JLabel();
        btniniciarsesion = new javax.swing.JButton();
        label_autor = new javax.swing.JLabel();
        btnregistroautor = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        lbClave = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registro de Autores");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        label_nombre.setText("Nombre:");
        add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));
        add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 115, 140, 30));

        label_apellido.setText("Apellido:");
        add(label_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));
        add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 115, 140, 30));

        label_pais.setText("Pais:");
        add(label_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 155, -1, -1));

        comboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecuador", "Peru", "Mexico", "Bolivia", "Argentina" }));
        add(comboPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 140, 30));

        label_provincia.setText("Provincia:");
        add(label_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 155, -1, -1));

        comboProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tungurahua", "El Oro", "Guayas", " " }));
        add(comboProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, 30));

        label_fecha.setText("Fecha nacimiento:");
        add(label_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));
        add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 245, 140, 30));

        label_obras.setText("Numero de Obras");
        add(label_obras, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 220, -1, -1));
        add(txtobras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 245, 140, 30));

        label_correo.setText("Correo:");
        add(label_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 285, 100, -1));
        add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 290, 30));

        label_contra.setText("Contraseña:");
        add(label_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));
        add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 375, 290, 30));

        label_confirmar.setText("Confirmar contraseña:");
        add(label_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 415, -1, -1));
        add(txtconfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 290, 30));

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 503, -1, -1));

        label_inicio.setText("Ya tienes una cuenta?");
        add(label_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        btniniciarsesion.setForeground(new java.awt.Color(51, 0, 102));
        btniniciarsesion.setText("iniciar sesion");
        btniniciarsesion.setBorder(null);
        btniniciarsesion.setContentAreaFilled(false);
        btniniciarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarsesionActionPerformed(evt);
            }
        });
        add(btniniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 550, -1, -1));

        label_autor.setText("No eres autor?");
        add(label_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 575, -1, -1));

        btnregistroautor.setForeground(new java.awt.Color(51, 0, 102));
        btnregistroautor.setText("Registrarse como usuario");
        btnregistroautor.setBorder(null);
        btnregistroautor.setContentAreaFilled(false);
        btnregistroautor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregistroautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroautorActionPerformed(evt);
            }
        });
        add(btnregistroautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 575, -1, -1));
        add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 503, 144, -1));

        lbClave.setText("Clave:");
        add(lbClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 476, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarsesionActionPerformed
        // TODO add your handling code here:
        frmregistro registro = new frmregistro();
        frmLogin login = new frmLogin();
        login.setVisible(true);
        this.setVisible(false);
        registro.dispose();
    }//GEN-LAST:event_btniniciarsesionActionPerformed

    private void btnregistroautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroautorActionPerformed
        // TODO add your handling code here:

        frmregistro registro = new frmregistro();
        registro.PanelUsuario.setSize(510, 540);
        registro.PanelUsuario.setLocation(0, 0);

        this.removeAll();
        this.add(registro.PanelUsuario, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();

    }//GEN-LAST:event_btnregistroautorActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
//        boolean aux = contAutor.registroAutores(this.txtnombre.getText(), this.txtapellido.getText(), this.comboPais.getSelectedItem().toString(), this.txtfecha.getText(), Integer.parseInt(this.txtobras.getText()), this.txtcorreo.getText(), this.txtcontra.getText(), Integer.parseInt(this.txtClave.getText()));
//        if (aux) {
//            JOptionPane.showMessageDialog(null, "Se registro con exito");
//        }
    }//GEN-LAST:event_btnregistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciarsesion;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnregistroautor;
    private javax.swing.JComboBox<String> comboPais;
    private javax.swing.JComboBox<String> comboProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_autor;
    private javax.swing.JLabel label_confirmar;
    private javax.swing.JLabel label_contra;
    private javax.swing.JLabel label_correo;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_inicio;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_obras;
    private javax.swing.JLabel label_pais;
    private javax.swing.JLabel label_provincia;
    private javax.swing.JLabel lbClave;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JPasswordField txtconfirmar;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtobras;
    // End of variables declaration//GEN-END:variables
}
