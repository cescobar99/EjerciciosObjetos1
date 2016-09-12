/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo_Escobar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumera1 = new javax.swing.JTextField();
        txtDenomina1 = new javax.swing.JTextField();
        cmbOper = new javax.swing.JComboBox<>();
        txtNumera2 = new javax.swing.JTextField();
        txtDenomina2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumera3 = new javax.swing.JTextField();
        txtDenomina3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMix = new javax.swing.JTextField();
        txtNumera4 = new javax.swing.JTextField();
        txtDenomina4 = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Numeros Con Fraccionarios Y Mixtos");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtNumera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumera1ActionPerformed(evt);
            }
        });
        txtNumera1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumera1KeyTyped(evt);
            }
        });
        jPanel3.add(txtNumera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 30));

        txtDenomina1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenomina1KeyTyped(evt);
            }
        });
        jPanel3.add(txtDenomina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, 30));

        cmbOper.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación ", "División" }));
        jPanel3.add(cmbOper, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 30));

        txtNumera2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumera2KeyTyped(evt);
            }
        });
        jPanel3.add(txtNumera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 70, 30));

        txtDenomina2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenomina2ActionPerformed(evt);
            }
        });
        txtDenomina2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenomina2KeyTyped(evt);
            }
        });
        jPanel3.add(txtDenomina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, 30));

        jLabel2.setText("=");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 90, 10, 30));

        txtNumera3.setEditable(false);
        jPanel3.add(txtNumera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 70, 30));

        txtDenomina3.setEditable(false);
        jPanel3.add(txtDenomina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Convertir A Un Numero Mixto");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 12, 290, 40));

        txtMix.setEditable(false);
        jPanel3.add(txtMix, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 70, 30));

        txtNumera4.setEditable(false);
        txtNumera4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumera4ActionPerformed(evt);
            }
        });
        jPanel3.add(txtNumera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 80, 30));

        txtDenomina4.setEditable(false);
        jPanel3.add(txtDenomina4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 80, 30));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(0, 0, 255));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(0, 0, 255));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

        setSize(new java.awt.Dimension(774, 296));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDenomina2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenomina2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenomina2ActionPerformed

    private void txtNumera4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumera4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumera4ActionPerformed

    private void txtNumera1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumera1KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtNumera1KeyTyped

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        try {
            int Operacion, Numero1, Numero2, Numero3, Denominador1, Denominador2, Denominador3, Mixto = 0;
            Clase f1, f2, f3 = null;
            Operacion = cmbOper.getSelectedIndex();
            Numero1 = Integer.parseInt(txtNumera1.getText());
            Numero2 = Integer.parseInt(txtNumera2.getText());
            Denominador1 = Integer.parseInt(txtDenomina1.getText());
            Denominador2 = Integer.parseInt(txtDenomina2.getText());

            f1 = new Clase(Numero1, Denominador1, 1);
            f2 = new Clase(Numero2, Denominador2, 1);

            switch (Operacion) {
                case 0:
                    f3 = f1.Sumar(f2);
                    break;
                case 1:
                    f3 = f1.Restar(f2);
                    break;
                case 2:
                    f3 = f1.Multiplicar(f2);
                    break;
                case 3:
                    f3 = f1.Dividir(f2);
                    break;
            }
            txtNumera3.setText("" + f3.getNumerador());
            txtDenomina3.setText("" + f3.getDenominador());

            if (f3.getNumerador() <= f3.getDenominador()) {
                JOptionPane.showMessageDialog(this, "Si EL Numerador Es Menor Que El Denominador, por favor cambie el numero del denominador", "Error", JOptionPane.ERROR_MESSAGE);
                txtMix.setText("");
                txtNumera4.setText("");
                txtDenomina4.setText("");

            } else {
                Numero3 = f3.getNumerador();
                Denominador3 = f3.getDenominador();
                txtMix.setText("" + Numero3 / Denominador3);
                txtNumera4.setText("" + Numero3 % Denominador3);
                txtDenomina4.setText("" + Denominador3);
            }
        } catch (DenominadorCeroException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            txtDenomina1.requestFocusInWindow();
            txtDenomina1.selectAll();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Rectifique suss numeros", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumera1.setText("");
            txtNumera2.setText("");
            txtDenomina1.setText("");
            txtDenomina2.setText("");
            txtNumera1.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed

        txtNumera1.setText("");
        txtNumera2.setText("");
        txtNumera3.setText("");
        txtNumera4.setText("");
        txtDenomina1.setText("");
        txtDenomina2.setText("");
        txtDenomina3.setText("");
        txtDenomina4.setText("");
        txtMix.setText("");
        txtNumera1.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumera1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumera1ActionPerformed

    private void txtNumera2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumera2KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumera2KeyTyped

    private void txtDenomina1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenomina1KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenomina1KeyTyped

    private void txtDenomina2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenomina2KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenomina2KeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOper;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDenomina1;
    private javax.swing.JTextField txtDenomina2;
    private javax.swing.JTextField txtDenomina3;
    private javax.swing.JTextField txtDenomina4;
    private javax.swing.JTextField txtMix;
    private javax.swing.JTextField txtNumera1;
    private javax.swing.JTextField txtNumera2;
    private javax.swing.JTextField txtNumera3;
    private javax.swing.JTextField txtNumera4;
    // End of variables declaration//GEN-END:variables
}
