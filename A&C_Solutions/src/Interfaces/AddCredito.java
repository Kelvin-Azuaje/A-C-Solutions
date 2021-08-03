/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Azuaje
 */
public class AddCredito extends javax.swing.JFrame {

    DefaultTableModel modelo1 = new DefaultTableModel();
    
    public AddCredito() {
        initComponents();
        setLocationRelativeTo(null);
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("COD BANCO");
        modelo1.addColumn("BANCO");
        modelo1.addColumn("REFERENCIA");
        modelo1.addColumn("MONTO");
        this.TablaRecaudo.setModel(modelo1);
        CodBanco.requestFocus();
    }

    public void Limpiar() {
        NReferencia.setText("");
        Tt1.setText("");
        CodBanco.setText("");
        Banco.setText("");
    }
    
    public void Cod_Bancos() {
        String dat = CodBanco.getText();
        if(dat.equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el codigo del Banco", "ADVERTENCIA..!", JOptionPane.WARNING_MESSAGE);
            CodBanco.setText("");
        }else if(dat.equals("0102")){
            Banco.setText("BANCO DE VENEZUELA S.A.C.A");
            NReferencia.requestFocus();
        }else if(dat.equals("0104")){
            Banco.setText("VENEZOLANO DE CREDITO");
            NReferencia.requestFocus();
        }else if(dat.equals("0105")){
            Banco.setText("BANCO MERCANTIL");
            NReferencia.requestFocus();
        }else if(dat.equals("0108")){
            Banco.setText("BANCO PROVINCIAL");
            NReferencia.requestFocus();
        }else if(dat.equals("0114")){
            Banco.setText("BANCARIBE");
            NReferencia.requestFocus();
        }else if(dat.equals("0115")){
            Banco.setText("BANCO EXTERIOR");
            NReferencia.requestFocus();
        }else if(dat.equals("0116")){
            Banco.setText("BANCO OCCIDENTAL DE DESCUENTO");
            NReferencia.requestFocus();
        }else if(dat.equals("0128")){
            Banco.setText("BANCO CARONI");
            NReferencia.requestFocus();
        }else if(dat.equals("0134")){
            Banco.setText("BANCO BANESCO");
            NReferencia.requestFocus();
        }else if(dat.equals("0138")){
            Banco.setText("BANCO PLAZA");
            NReferencia.requestFocus();
        }else if(dat.equals("0151")){
            Banco.setText("BANCO FONDO COMUN BFC");
            NReferencia.requestFocus();
        }else if(dat.equals("0156")){
            Banco.setText("100% BANCO");
            NReferencia.requestFocus();
        }else if(dat.equals("0157")){
            Banco.setText("BANCO EL SUR");
            NReferencia.requestFocus();
        }else if(dat.equals("0163")){
            Banco.setText("BANCO DEL TESORO");
            NReferencia.requestFocus();
        }else if(dat.equals("0166")){
            Banco.setText("BANCO AGRICOLA DE VENEZUELA");
            NReferencia.requestFocus();
        }else if(dat.equals("0172")){
            Banco.setText("BANCAMIGA");
            NReferencia.requestFocus();
        }else if(dat.equals("0174")){
            Banco.setText("BANPLUS");
            NReferencia.requestFocus();
        }else if(dat.equals("0175")){
            Banco.setText("BANCO BICENTENARIO");
            NReferencia.requestFocus();
        }else if(dat.equals("0176")){
            Banco.setText("BANFANB");
            NReferencia.requestFocus();
        }else if(dat.equals("0191")){
            Banco.setText("BNC BANCO NACIONAL DE CREDITO");
            NReferencia.requestFocus();
        }else{
            JOptionPane.showMessageDialog(this, "CODIGO INCORRECTO..!", "ADVERTENCIA..!", JOptionPane.WARNING_MESSAGE);
            CodBanco.setText("");
        }
    }
    
    public void PasarDatosCampos() {
        String[] dt = new String[4];
        dt[0] = CodBanco.getText();
        dt[1] = Banco.getText();
        dt[2] = NReferencia.getText();
        dt[3] = Tt1.getText();
        modelo1.addRow(dt);
        SumarColumnas();
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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NReferencia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Tt1 = new javax.swing.JTextField();
        CodBanco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Banco = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRecaudo = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TotalReca = new javax.swing.JTextField();
        totalReca = new javax.swing.JLabel();

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

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setText("MONTO");

        Tt1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Tt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Tt1KeyPressed(evt);
            }
        });

        CodBanco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        CodBanco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CodBanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CodBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodBancoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("COD BANCO:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("BANCO:");

        Banco.setEditable(false);
        Banco.setBackground(new java.awt.Color(255, 255, 255));
        Banco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Banco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Banco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Banco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BancoKeyPressed(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL RECAUDADO:");

        TotalReca.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        TotalReca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TotalReca.setText("0.00");
        TotalReca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TotalReca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalRecaActionPerformed(evt);
            }
        });

        totalReca.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        totalReca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalReca.setText("Bs.S");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Tt1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Banco))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(TotalReca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalReca)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalReca)
                    .addComponent(TotalReca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void CodBancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodBancoKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            Cod_Bancos();
        }
    }//GEN-LAST:event_CodBancoKeyPressed

    private void BancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BancoKeyPressed

    }//GEN-LAST:event_BancoKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EliminarProducto();
        CodBanco.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TotalRecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalRecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalRecaActionPerformed

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
            java.util.logging.Logger.getLogger(AddCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Banco;
    private javax.swing.JTextField CodBanco;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalReca;
    // End of variables declaration//GEN-END:variables
}
