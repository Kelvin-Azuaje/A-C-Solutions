/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.TraerBancos;
import Clases.Conexion_LLenarCombo;
import Clases.Conexion;
import Clases.Conex;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Azuaje
 */
public class AddTransferencias extends javax.swing.JFrame {

    DefaultTableModel modelo1 = new DefaultTableModel();
    private Conexion_LLenarCombo con = new Conexion_LLenarCombo();
    Conexion cd = new Conexion();
    Connection cc = cd.enlazar();
    Conex conex = new Conex();
    
    public AddTransferencias() {
        initComponents();
        setLocationRelativeTo(null);
        CodBanco.requestFocus();
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("COD BANCO");
        modelo1.addColumn("BANCO");
        modelo1.addColumn("REFERENCIA");
        modelo1.addColumn("MONTO");
        this.TablaRecaudo.setModel(modelo1);
        this.CodBanco.setModel(con.Obt_DatosBancos());
    }

    public void PasarDatosCampos() {
        String codb = CodBanco.getSelectedItem().toString();
        String[] dt = new String[4];
        dt[0] = codb;
        dt[1] = Banco.getText();
        dt[2] = NReferencia.getText();
        dt[3] = Tt1.getText();
        modelo1.addRow(dt);
        SumarColumnas();
    }

    public void Limpiar() {
        NReferencia.setText("");
        Tt1.setText("");
        CodBanco.setSelectedIndex(0);
        Banco.setText("");
    }

    public void LlenarBanco(){
        String Codbanco = this.CodBanco.getSelectedItem().toString(), cap="";
        String sql = "SELECT * FROM bancos WHERE COD_BANCO ='"+Codbanco+"'";
        try {
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cap = rs.getString("COD_BANCO");
            }
            if(cap.equals("")){
               JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN BANCO..!","ADVERTENCIA", JOptionPane.WARNING_MESSAGE); 
            }else if(cap.equals(Codbanco)){
                conex.setQuery("SELECT * FROM bancos WHERE COD_BANCO = '"+Codbanco+"'");
                TraerBancos equi = conex.getClaseTraerBancos();
                Banco.setText(equi.getDescripcion());
                NReferencia.requestFocus();
            }          
        } catch (SQLException e) {
            Logger.getLogger(sql);
        }
    }

    public void SumarColumnas() {
        double suma = 0, total = 0;
        int tamFila = TablaRecaudo.getRowCount();
        for (int i = 0; i < tamFila; i++) {
            suma = Double.parseDouble(TablaRecaudo.getValueAt(i, 3).toString());
            total += suma;
        }
        String cad20 = Double.toString(total);
        BigDecimal obj = new BigDecimal(cad20);
        TotalReca.setText(obj.toString());
    }

    public void EliminarProducto() {
        int fila = TablaRecaudo.getSelectedRow();
        if (fila >= 0) {
            modelo1.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione la transaccion a eliminar..!", "ATENCION..!", JOptionPane.INFORMATION_MESSAGE);
        }
        SumarColumnas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Banco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NReferencia = new javax.swing.JTextField();
        Tt1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRecaudo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        TotalReca = new javax.swing.JTextField();
        totalReca = new javax.swing.JLabel();
        CodBanco = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 4));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOLIVARES EN CREDITO RECAUDADOS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Close_2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("COD BANCO:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("BANCO:");

        Banco.setEditable(false);
        Banco.setBackground(new java.awt.Color(255, 255, 255));
        Banco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Banco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Banco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("N° OPERACION");

        NReferencia.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NReferencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NReferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NReferenciaKeyPressed(evt);
            }
        });

        Tt1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Tt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Tt1KeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setText("MONTO");

        jButton5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refresh.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        TablaRecaudo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        TablaRecaudo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TablaRecaudo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaRecaudo.setGridColor(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(TablaRecaudo);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("TOTAL RECAUDADO:");

        TotalReca.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        TotalReca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TotalReca.setText("0.00");
        TotalReca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        totalReca.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        totalReca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalReca.setText("Bs.S");

        CodBanco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CodBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodBancoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(NReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Tt1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel3)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel12)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(TotalReca, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalReca)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(CodBanco)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalReca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(TotalReca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NReferenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NReferenciaKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            String captura = NReferencia.getText();
            if(captura.equals("")){
                JOptionPane.showMessageDialog(this, "DEBE INGRESAR EL NUMERO DE REFERENCIA" , "ADVERTENCIA" , JOptionPane.WARNING_MESSAGE);
            }else{
                Tt1.requestFocus();
            }
        }
    }//GEN-LAST:event_NReferenciaKeyPressed

    private void Tt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tt1KeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            PasarDatosCampos();
            Limpiar();
            CodBanco.requestFocus();
        }
    }//GEN-LAST:event_Tt1KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EliminarProducto();
        CodBanco.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CodBancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodBancoKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            LlenarBanco();
        }
    }//GEN-LAST:event_CodBancoKeyPressed

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
            java.util.logging.Logger.getLogger(AddTransferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTransferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTransferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTransferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTransferencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Banco;
    private javax.swing.JComboBox<String> CodBanco;
    private javax.swing.JTextField NReferencia;
    private javax.swing.JTable TablaRecaudo;
    private javax.swing.JTextField TotalReca;
    private javax.swing.JTextField Tt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalReca;
    // End of variables declaration//GEN-END:variables
}
