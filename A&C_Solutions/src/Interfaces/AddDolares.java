/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.event.KeyEvent;

/**
 *
 * @author Azuaje
 */
public class AddDolares extends javax.swing.JFrame {

    /**
     * Creates new form AddDolares
     */
    public AddDolares() {
        initComponents();
        setLocationRelativeTo(null);
    }

public void Operacion(){
        String cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8;
        int ent1, ent2, ent3, ent4, ent5, ent6, ent7, ent8;
        
        cad1 = Tt1.getText();
        cad2 = Tt2.getText();
        cad3 = Tt3.getText();
        cad4 = Tt4.getText();
        cad5 = Tt5.getText();
        cad6 = Tt6.getText();
        cad7 = Tt7.getText();
        
            ent1 = Integer.parseInt(cad1);
            ent2 = Integer.parseInt(cad2);
            ent3 = Integer.parseInt(cad3);
            ent4 = Integer.parseInt(cad4);
            ent5 = Integer.parseInt(cad5);
            ent6 = Integer.parseInt(cad6);
            ent7 = Integer.parseInt(cad7);
            
            ent8 = ent1+ent2+ent3+ent4+ent5+ent6+ent7;
            cad8 = Integer.toString(ent8);
            Tt8.setText(cad8);       
    }
    
    public void Op1$(){
        String cad1, cad2;
        int ent1, ent2=1, ent3;
        
        cad1 = Cant1.getText();
        ent1 = Integer.parseInt(cad1);
        
        ent3 = ent1*ent2;
        cad2 = Integer.toString(ent3);
        Tt1.setText(cad2);
    }
    
    public void Op2$(){
        String cad1, cad2;
        int ent1, ent2=2, ent3;
        
        cad1 = Cant2.getText();
        ent1 = Integer.parseInt(cad1);
        
        ent3 = ent1*ent2;
        cad2 = Integer.toString(ent3);
        Tt2.setText(cad2);
    }
    
    public void Op5$(){
        String cad1, cad2;
        int ent1, ent2=5, ent3;
        
        cad1 = Cant3.getText();
        ent1 = Integer.parseInt(cad1);
        
        ent3 = ent1*ent2;
        cad2 = Integer.toString(ent3);
        Tt3.setText(cad2);
    }
    
    public void Op10$(){
        String cad1, cad2;
        int ent1, ent2=10, ent3;
        
        cad1 = Cant4.getText();
        ent1 = Integer.parseInt(cad1);
        
        ent3 = ent1*ent2;
        cad2 = Integer.toString(ent3);
        Tt4.setText(cad2);
    }
    
    public void Op20$(){
        String cad1, cad2;
        int ent1, ent2=20, ent3;
        
        cad1 = Cant5.getText();
        ent1 = Integer.parseInt(cad1);
        
        ent3 = ent1*ent2;
        cad2 = Integer.toString(ent3);
        Tt5.setText(cad2);
    }
    
    public void Op50$(){
        String cad1, cad2;
        int ent1, ent2=50, ent3;
        
        cad1 = Cant6.getText();
        ent1 = Integer.parseInt(cad1);
        
        ent3 = ent1*ent2;
        cad2 = Integer.toString(ent3);
        Tt6.setText(cad2);
    }
    
    public void Op100$(){
        String cad1, cad2;
        int ent1, ent2= 100, ent3;
        
        cad1 = Cant7.getText();
        ent1 = Integer.parseInt(cad1);
        
        ent3 = ent1*ent2;
        cad2 = Integer.toString(ent3);
        Tt7.setText(cad2);
    }
    
    public void PasarDolares(){
        String dolares = Tt8.getText();
        CuadreCaja.RcDolar.setText(dolares);
        CuadreCaja.RcDolar.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cant1 = new javax.swing.JTextField();
        Cant2 = new javax.swing.JTextField();
        Cant3 = new javax.swing.JTextField();
        Cant4 = new javax.swing.JTextField();
        Cant5 = new javax.swing.JTextField();
        Cant6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Tt8 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        Tt1 = new javax.swing.JTextField();
        Tt2 = new javax.swing.JTextField();
        Tt3 = new javax.swing.JTextField();
        Tt4 = new javax.swing.JTextField();
        Tt5 = new javax.swing.JTextField();
        Tt6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Cant7 = new javax.swing.JTextField();
        Tt7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DOLARES RECAUDADOS");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("DENOMINACION");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("CANTIDAD");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("2$");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("1$");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("5$");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setText("10$");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("20$");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setText("50$");

        Cant1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Cant1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cant1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cant1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cant1KeyPressed(evt);
            }
        });

        Cant2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Cant2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cant2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cant2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cant2KeyPressed(evt);
            }
        });

        Cant3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Cant3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cant3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cant3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cant3KeyPressed(evt);
            }
        });

        Cant4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Cant4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cant4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cant4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cant4KeyPressed(evt);
            }
        });

        Cant5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Cant5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cant5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cant5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cant5KeyPressed(evt);
            }
        });

        Cant6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Cant6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cant6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cant6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cant6KeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tt8.setEditable(false);
        Tt8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tt8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        Tt8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setText("TOTAL RECAUDADO:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(23, 23, 23)
                .addComponent(Tt8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tt8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        Tt1.setEditable(false);
        Tt1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt1.setText("0");
        Tt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Tt2.setEditable(false);
        Tt2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt2.setText("0");
        Tt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tt3.setEditable(false);
        Tt3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt3.setText("0");
        Tt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tt4.setEditable(false);
        Tt4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt4.setText("0");
        Tt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tt5.setEditable(false);
        Tt5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt5.setText("0");
        Tt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tt6.setEditable(false);
        Tt6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt6.setText("0");
        Tt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("100$");

        Cant7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Cant7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cant7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cant7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cant7KeyPressed(evt);
            }
        });

        Tt7.setEditable(false);
        Tt7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Tt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tt7.setText("0");
        Tt7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cant2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cant3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cant4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cant5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cant6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Tt1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(Tt2)
                                    .addComponent(Tt6)
                                    .addComponent(Tt5)
                                    .addComponent(Tt4)
                                    .addComponent(Tt3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Cant7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Tt7)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cant1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Cant2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Cant3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Cant4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Cant5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Cant6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Tt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tt3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tt4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tt5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tt6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cant7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tt7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void Cant1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cant1KeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            Op1$();
            Operacion();
            Cant2.requestFocus();
        }
    }//GEN-LAST:event_Cant1KeyPressed

    private void Cant2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cant2KeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            Op2$();
            Operacion();
            Cant3.requestFocus();
        }
    }//GEN-LAST:event_Cant2KeyPressed

    private void Cant3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cant3KeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            Op5$();
            Operacion();
            Cant4.requestFocus();
        }
    }//GEN-LAST:event_Cant3KeyPressed

    private void Cant4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cant4KeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            Op10$();
            Operacion();
            Cant5.requestFocus();
        }
    }//GEN-LAST:event_Cant4KeyPressed

    private void Cant5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cant5KeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            Op20$();
            Operacion();
            Cant6.requestFocus();
        }
    }//GEN-LAST:event_Cant5KeyPressed

    private void Cant6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cant6KeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            Op50$();
            Operacion();
            Cant7.requestFocus();
        }
    }//GEN-LAST:event_Cant6KeyPressed

    private void Cant7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cant7KeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            Op100$();
            Operacion();
            PasarDolares();
            dispose();
        }
    }//GEN-LAST:event_Cant7KeyPressed

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
            java.util.logging.Logger.getLogger(AddDolares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDolares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDolares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDolares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDolares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cant1;
    private javax.swing.JTextField Cant2;
    private javax.swing.JTextField Cant3;
    private javax.swing.JTextField Cant4;
    private javax.swing.JTextField Cant5;
    private javax.swing.JTextField Cant6;
    private javax.swing.JTextField Cant7;
    private javax.swing.JTextField Tt1;
    private javax.swing.JTextField Tt2;
    private javax.swing.JTextField Tt3;
    private javax.swing.JTextField Tt4;
    private javax.swing.JTextField Tt5;
    private javax.swing.JTextField Tt6;
    private javax.swing.JTextField Tt7;
    public static javax.swing.JFormattedTextField Tt8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
