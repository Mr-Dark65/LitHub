package Vista;

import Almacen.Almacen;
import Controles.ControlUsuarios;
import Controles.Control_Lector;
import java.awt.BorderLayout;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thexe
 */
public class frmregistro extends javax.swing.JFrame {

    Almacen almaPermisos = new Almacen();
    Control_Lector contLector = new Control_Lector();

    public frmregistro() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        label_correo = new javax.swing.JLabel();
        textcorreo = new javax.swing.JTextField();
        label_contra = new javax.swing.JLabel();
        textcontra = new javax.swing.JPasswordField();
        label_confirmar = new javax.swing.JLabel();
        textconfirmar = new javax.swing.JPasswordField();
        btnregistrar = new javax.swing.JButton();
        label_direccion = new javax.swing.JLabel();
        textdireccion = new javax.swing.JTextField();
        label_telefono = new javax.swing.JLabel();
        texttelefono = new javax.swing.JTextField();
        label_inicio = new javax.swing.JLabel();
        label_autor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        imagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Registro de Usuario");

        label_nombre.setText("Nombre:");

        textnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_correo.setText("Correo:");

        textcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_contra.setText("Contraseña:");

        textcontra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcontraActionPerformed(evt);
            }
        });

        label_confirmar.setText("Confirmar contraseña:");

        textconfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textconfirmarActionPerformed(evt);
            }
        });

        btnregistrar.setText("Registrarse");
        btnregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        label_direccion.setText("Direccion:");

        textdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_telefono.setText("Telefono:");

        texttelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_inicio.setText("Ya tienes una cuenta?");

        label_autor.setText("Eres autor?");

        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("Registrarse como autor");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(51, 0, 102));
        jButton2.setText("iniciar sesion");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(label_nombre)
                .addGap(82, 82, 82)
                .addComponent(label_telefono))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(texttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(label_correo))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(textcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(label_direccion))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(label_contra))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(textcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(label_confirmar))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(textconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnregistrar))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_inicio)
                .addGap(5, 5, 5)
                .addComponent(jButton2))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_autor)
                .addGap(4, 4, 4)
                .addComponent(jButton1))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nombre)
                    .addComponent(label_telefono))
                .addGap(4, 4, 4)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(label_correo)
                .addGap(4, 4, 4)
                .addComponent(textcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_direccion)
                .addGap(4, 4, 4)
                .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_contra)
                .addGap(4, 4, 4)
                .addComponent(textcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_confirmar)
                .addGap(4, 4, 4)
                .addComponent(textconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnregistrar)
                .addGap(28, 28, 28)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_inicio)
                    .addComponent(jButton2))
                .addGap(9, 9, 9)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_autor)
                    .addComponent(jButton1)))
        );

        getContentPane().add(PanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 510, 576));

        imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_registro_1.png"))); // NOI18N
        imagen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 540));

        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 540));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_login.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        contLector.registroLectores(this.textnombre.getText(), this.texttelefono.getText(), this.textcorreo.getText(), this.textdireccion.getText(), this.textcontra.getText());
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void textconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textconfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textconfirmarActionPerformed

    private void textcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcontraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        frmLogin login = new frmLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PanelAutor autor = new PanelAutor();
        autor.setSize(510, 650);
        autor.setLocation(0, 0);

        this.PanelUsuario.removeAll();
        this.PanelUsuario.add(autor, BorderLayout.CENTER);
        this.PanelUsuario.revalidate();
        this.PanelUsuario.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmregistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelUsuario;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_autor;
    private javax.swing.JLabel label_confirmar;
    private javax.swing.JLabel label_contra;
    private javax.swing.JLabel label_correo;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_inicio;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JPasswordField textconfirmar;
    private javax.swing.JPasswordField textcontra;
    private javax.swing.JTextField textcorreo;
    private javax.swing.JTextField textdireccion;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField texttelefono;
    // End of variables declaration//GEN-END:variables
}
