/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewtecnoimpor;

import modelotecnoimport.Envio;
import modelotecnoimport.EnvioAbastecimiento;
import modelotecnoimport.EnvioDomicilio;
import modelotecnoimport.RutaEntrega;
import medelotecnoimpor.singleton.Database;
import modelotecnoimport.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANA
 */
public class ViewRutaEntrega extends javax.swing.JFrame {

    private static Usuario logueado;

    /**
     * Creates new form ViewVendedor
     * @param logueado
     */
    public ViewRutaEntrega(Usuario logueado) {
        ViewRutaEntrega.logueado = logueado;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonNuevaRutaEntrega = new javax.swing.JButton();
        buttonListadoRutas = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        buttonNuevaRutaEntrega.setBackground(new java.awt.Color(255, 255, 255));
        buttonNuevaRutaEntrega.setText("Nueva Ruta de Entrega");
        buttonNuevaRutaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevaRutaEntregaActionPerformed(evt);
            }
        });

        buttonListadoRutas.setText("Listado de Ruta de Entregas");
        buttonListadoRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListadoRutasActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("RUTAS DE ENTREGAS");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTitulo)
                            .addComponent(buttonListadoRutas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonNuevaRutaEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelTitulo)
                .addGap(44, 44, 44)
                .addComponent(buttonNuevaRutaEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonListadoRutas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNuevaRutaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevaRutaEntregaActionPerformed

        ViewNuevaRutaEntrega v = new ViewNuevaRutaEntrega(logueado);
        this.setVisible(false);
        v.setVisible(true);
        v.setResizable(false);
        llenarTable(v);
        v.setRep(ViewSelectAdminMood.repartidores.peek());
        v.getTxtRepartidor().setText(ViewSelectAdminMood.repartidores.peek().toString());

    }//GEN-LAST:event_buttonNuevaRutaEntregaActionPerformed

    private void llenarTable(ViewNuevaRutaEntrega v) {
        ViewNuevaRutaEntrega ve = v;
        DefaultTableModel m = (DefaultTableModel) v.getjTable1().getModel();
        Object[] rows = new Object[4];
        List<Envio> envios = Database.getEnvios();
        envios.forEach((e) -> {
            if (e instanceof EnvioDomicilio) {
                EnvioDomicilio ed = (EnvioDomicilio) e;
                rows[0] = ed.getId();
                rows[1] = ed.getVenta().getCliente().getAddress();
                rows[2] = ed.getVenta().getFecha();
                m.addRow(rows);
            } else if (e instanceof EnvioAbastecimiento) {
                EnvioAbastecimiento ea = (EnvioAbastecimiento) e;
                rows[0] = ea.getId();
                rows[1] = ea.getLugarDestino().getDireccion();
                rows[2] = ea.getFechaEmision();
                m.addRow(rows);
            }
        });

    }


    private void buttonListadoRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListadoRutasActionPerformed

        ViewListadoRutas v = new ViewListadoRutas(logueado);
        this.setVisible(false);
        DefaultTableModel m = (DefaultTableModel) v.getjTable1().getModel();
        Object[] rows = new Object[2];
        List<RutaEntrega> rutas = Database.getRutas();
        rutas.stream().map((r) -> {
            rows[0] = r.getId();
            return r;
        }).map((r) -> {
            rows[1] = r.getNombreRep();
            return r;
        }).forEachOrdered((_item) -> {
            m.addRow(rows);
        });
        v.setVisible(true);
        v.setResizable(false);
    }//GEN-LAST:event_buttonListadoRutasActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ViewJefeBodega v = new ViewJefeBodega(logueado);
        v.setVisible(true);
        v.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRutaEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRutaEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRutaEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRutaEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new ViewRutaEntrega(logueado).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton buttonListadoRutas;
    private javax.swing.JButton buttonNuevaRutaEntrega;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
