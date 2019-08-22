/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewtecnoimpor;

import modelotecnoimport.Gerente;
import modelotecnoimport.JefeBodega;
import modelotecnoimport.Repartidor;
import medelotecnoimpor.singleton.Database;
import modelotecnoimport.Usuario;
import modelotecnoimport.Vendedor;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Nicole Alvarez
 */
public class ViewSelectAdminMood extends javax.swing.JFrame {
    public static Queue<Repartidor> repartidores;
    private static Usuario logueado;

    /**
     * Creates new form ViewSelectAdminMood
     *
     * @param logueado
     */
    public ViewSelectAdminMood(Usuario logueado) {
        ViewSelectAdminMood.logueado = logueado;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPrincipal = new javax.swing.JButton();
        buttonAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);

        buttonPrincipal.setBackground(new java.awt.Color(193, 203, 240));
        buttonPrincipal.setText("Menu Principal");
        buttonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrincipalActionPerformed(evt);
            }
        });

        buttonAdmin.setBackground(new java.awt.Color(193, 203, 240));
        buttonAdmin.setText("Menu Administrador");
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Ingresar");

        btnRegresar.setBackground(new java.awt.Color(193, 203, 240));
        btnRegresar.setText("Cerrar sesión");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static Usuario getLogueado() {
        return logueado;
    }

    public static void setLogueado(Usuario logueado) {
        ViewSelectAdminMood.logueado = logueado;
    }

    public JButton getBtnRegresar() {
        return btnRegresar;
    }

    public void setBtnRegresar(JButton btnRegresar) {
        this.btnRegresar = btnRegresar;
    }

    public JButton getButtonAdmin() {
        return buttonAdmin;
    }

    public void setButtonAdmin(JButton buttonAdmin) {
        this.buttonAdmin = buttonAdmin;
    }

    public JButton getButtonPrincipal() {
        return buttonPrincipal;
    }

    public void setButtonPrincipal(JButton buttonPrincipal) {
        this.buttonPrincipal = buttonPrincipal;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
        ViewConsultarDataAdmin v = new ViewConsultarDataAdmin(logueado);
        v.setVisible(true);
        v.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAdminActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ViewLogin v = new ViewLogin();
        v.setVisible(true);
        v.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void buttonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrincipalActionPerformed
        if (logueado.getEmpleado() instanceof JefeBodega) {
            repartidores= new LinkedList<>();
            ViewJefeBodega v = new ViewJefeBodega(logueado);
            List<Repartidor> reps = Database.getRepartidorF(logueado);
            
            reps.forEach((r) -> {
                repartidores.offer(r);
            });
            v.setVisible(true);
            v.setResizable(false);
            this.setVisible(false);
        } else if (logueado.getEmpleado() instanceof Gerente) {
            ViewGerente v = new ViewGerente(logueado);
            v.setVisible(true);
            v.setResizable(false);
            this.setVisible(false);
        } else if (logueado.getEmpleado() instanceof Vendedor) {
            ViewVendedor v = new ViewVendedor(logueado);
            v.setVisible(true);
            v.setResizable(false);
            this.setVisible(false);
        }
    }//GEN-LAST:event_buttonPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewSelectAdminMood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSelectAdminMood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSelectAdminMood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSelectAdminMood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new ViewSelectAdminMood(logueado).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonPrincipal;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
