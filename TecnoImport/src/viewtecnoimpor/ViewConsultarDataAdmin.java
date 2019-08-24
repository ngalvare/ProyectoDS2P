package viewtecnoimpor;

import modelotecnoimport.Producto;
import medelotecnoimpor.singleton.Database;
import modelotecnoimport.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANA
 */
public class ViewConsultarDataAdmin extends javax.swing.JFrame {
    private static Usuario logueado;
    private String search;
    /**
     * Creates new form ViewVendedor
     * @param logueado
     */
    public ViewConsultarDataAdmin(Usuario logueado) {
        this.logueado = logueado;
        search = "";
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        buttonMostrar = new javax.swing.JButton();
        buttonPorNombre = new javax.swing.JRadioButton();
        buttonCategoria = new javax.swing.JRadioButton();
        ButtonDescripcion = new javax.swing.JRadioButton();
        btnRegresar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtBuscador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnActualizarStock = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos del Sistema ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Listado de ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleados", "Productos", "Clientes" }));

        buttonMostrar.setText("Mostrar");
        buttonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarActionPerformed(evt);
            }
        });

        buttonPorNombre.setForeground(new java.awt.Color(255, 255, 255));
        buttonPorNombre.setText("Por Nombre");
        buttonPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPorNombreActionPerformed(evt);
            }
        });

        buttonCategoria.setForeground(new java.awt.Color(255, 255, 255));
        buttonCategoria.setText("Por Categoria");
        buttonCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategoriaActionPerformed(evt);
            }
        });

        ButtonDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDescripcion.setText("Por Descripcion");
        ButtonDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDescripcionActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar :");

        btnActualizarStock.setText("Actualizar Stock");
        btnActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarStockActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(369, 369, 369))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarStock))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(23, 23, 23)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(buttonMostrar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(buttonPorNombre)
                                    .addGap(28, 28, 28)
                                    .addComponent(ButtonDescripcion)
                                    .addGap(18, 18, 18)
                                    .addComponent(buttonCategoria)))
                            .addGap(0, 279, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCerrar)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPorNombre)
                    .addComponent(ButtonDescripcion)
                    .addComponent(buttonCategoria))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarStock)
                        .addGap(68, 68, 68))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        ViewLogin v = new ViewLogin();
        v.setVisible(true);
        v.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ViewSelectAdminMood v = new ViewSelectAdminMood(logueado);
        v.setVisible(true);
        v.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void buttonPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPorNombreActionPerformed
        search="nombre";
        this.buttonCategoria.setSelected(false);
        this.ButtonDescripcion.setSelected(false);
    }//GEN-LAST:event_buttonPorNombreActionPerformed

    private void buttonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarActionPerformed
        DefaultTableModel m = (DefaultTableModel) jTable2.getModel();
        switch(jComboBox1.getSelectedItem().toString()){
           
            case "Productos":
                eliminar(m);
                m.setColumnIdentifiers(new Object[]{"Nombre","Categoría","Descripcción","Precio","Cantidad"});
                String data  = this.txtBuscador.getText();
                String busq = this.search;
                List<Producto> prods = Database.getProdFilter(data, logueado, busq);
                for(Producto p: prods){
                    m.addRow(new Object[]{p.getNombre(),p.getCategoria(),p.getDescripcion(),p.getPrecio(),p.getStock()});
                }
                break;
            case "Empleados":
                JOptionPane.showMessageDialog(null, "Funcionalidad en Construccion!","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Clientes":
                JOptionPane.showMessageDialog(null, "Funcionalidad en Construccion!","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_buttonMostrarActionPerformed

    private void ButtonDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDescripcionActionPerformed
        search="descripcion";
        this.buttonCategoria.setSelected(false);
        this.buttonPorNombre.setSelected(false);
    }//GEN-LAST:event_ButtonDescripcionActionPerformed

    private void buttonCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoriaActionPerformed
        search = "nombreCat";
        this.ButtonDescripcion.setSelected(false);
        this.buttonPorNombre.setSelected(false);
    }//GEN-LAST:event_buttonCategoriaActionPerformed

    private void btnActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarStockActionPerformed
        JOptionPane.showMessageDialog(null, "Stock actualizado!","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        this.btnActualizarStock.setVisible(false);
    }//GEN-LAST:event_btnActualizarStockActionPerformed
    
     public void eliminar(DefaultTableModel t){
        try{
            DefaultTableModel temp = t;
            int a =temp.getRowCount();
            for(int i=0; i<a; i++)
                temp.removeRow(0);
        }catch(Exception e){
            
        }
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConsultarDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new ViewConsultarDataAdmin(logueado).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ButtonDescripcion;
    private javax.swing.JButton btnActualizarStock;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JRadioButton buttonCategoria;
    private javax.swing.JButton buttonMostrar;
    private javax.swing.JRadioButton buttonPorNombre;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
