
package interfazgrafica;

import entidaddenegocio.Recetas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logicadenegocios.RecetasBL;

public class jpSegundo extends javax.swing.JPanel {

     void llenarTabla (ArrayList<Recetas> receta ){
        Object[] obj = new Object[6];
        
        lisRecetas= new ArrayList<>();
        String[] encabaezado = {"ID", "PACIENTE", "MEDICO", "MEDICAMENTO", "FECHA EMISION", "INDICACIONES"};
        DefaultTableModel tm = new DefaultTableModel(null, encabaezado);
        lisRecetas.addAll(receta);

        for (Recetas item : lisRecetas) {
            obj[0] = item.getId();
            obj[1] = item.getPaciente();
            obj[2] = item.getMedico();
            obj[3] = item.getMedicamentos();
            obj[4] = item.getFecha_emision();
            obj[5] = item.getIndicaciones();

            tm.addRow(obj);
            
        }
        tbMostrar.setModel(tm);
    }
    
     void actualiza() throws SQLException{
        llenarTabla(recetaBL.obtenerTodos());
    }
     
    public jpSegundo() throws SQLException {
        initComponents();
         actualiza();
           
    }
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        txtB = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbId = new javax.swing.JRadioButton();
        rbMedico = new javax.swing.JRadioButton();
        rbPaci = new javax.swing.JRadioButton();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(173, 216, 230));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(532, 501));
        setMinimumSize(new java.awt.Dimension(532, 501));
        setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCAR RECETAS");

        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbMostrar);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre: ");

        grupo.add(rbId);
        rbId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbId.setText("ID");

        grupo.add(rbMedico);
        rbMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbMedico.setText("Medico");

        grupo.add(rbPaci);
        rbPaci.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbPaci.setText("Paciente");
        rbPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPaciActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimpiar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbPaci)
                                        .addGap(98, 98, 98)
                                        .addComponent(rbMedico)))))
                        .addGap(77, 77, 77))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(rbId)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbId)
                    .addComponent(rbMedico)
                    .addComponent(rbPaci))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<Recetas> lisRecetas;
    Recetas receta;
    RecetasBL recetaBL = new RecetasBL();
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        grupo.add(rbId);
        grupo.add(rbMedico);
        grupo.add(rbPaci);
        
        if(txtB.getText().equals("")|| (!rbId.isSelected() && !rbPaci.isSelected() && !rbMedico.isSelected())){
            JOptionPane.showMessageDialog(null, "Seleccione uno");
        }
        receta = new Recetas();
        
        if(rbId.isSelected()){
            receta.setId(Integer.parseInt(txtB.getText()));
            
            try{
                llenarTabla(recetaBL.obtenerDatosFiltrados(receta));
            }
            catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
            
        }else if(rbPaci.isSelected()){
            receta.setPaciente(txtB.getText());
            
            try{
                llenarTabla(recetaBL.obtenerDatosFiltrados(receta));
            
            }catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
        }else if(rbMedico.isSelected()){
            receta.setMedico(txtB.getText());
            
            try{
                llenarTabla(recetaBL.obtenerDatosFiltrados(receta));
            }catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPaciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPaciActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtB.setText("");
        grupo.clearSelection();
         try {
             actualiza();
         } catch (SQLException ex) {
             Logger.getLogger(jpSegundo.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbMedico;
    private javax.swing.JRadioButton rbPaci;
    private javax.swing.JTable tbMostrar;
    private javax.swing.JTextField txtB;
    // End of variables declaration//GEN-END:variables
}