/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Fecha.fecha;
import java.awt.event.KeyEvent;

/**
 *
 * @author Argenis Gomez
 */
public class CuadreCaja extends javax.swing.JFrame {

    
    public CuadreCaja() {
        initComponents();
        setLocationRelativeTo(null);
        FECHA.setText(fecha());
        LlenarDiferencia();
    }

    public void Guardar(){
        Limpiar();
        LlenarDiferencia();
    }
    
    public void Limpiar(){
        String string="";
        RcPM.setText(string);
        RcPesos.setText(string);
        RcTrans.setText(string);
        RcBolivar.setText(string);
        RcCredito.setText(string);
        RcDebito.setText(string);
        RcDolar.setText(string);
        RcEuros.setText(string);
        DclBolivar.setText(string);
        DclCredito.setText(string);
        DclDebito.setText(string);
        DclDolar.setText(string);
        DclEuro.setText(string);
        DclPM.setText(string);
        DclPesos.setText(string);
        DclTrans.setText(string);
        TtDeclarado.setText(string);
        TtDiferencia.setText(string);
        TtRecaudado.setText(string);
        Cbox_NCaja.setSelectedIndex(0);
        txt_Cajero.setText(string);
    }
    
    public void LlenarDiferencia(){
        String string="0";
        DifBolivar.setText(string);
        DifDolar.setText(string);
        DifEuro.setText(string);
        DifPeso.setText(string);
        DifDebito.setText(string);
        DifCredito.setText(string);
        DifPM.setText(string);
        DifTrans.setText(string);
    }
    
    public void DiferenciaB(){
        String cad1, cad2, cad3;
        int ent1, ent2, ent3;
        
        cad1 = RcBolivar.getText();
        ent1 = Integer.parseInt(cad1);
        
        cad2 = DclBolivar.getText();
        ent2 = Integer.parseInt(cad2);
        
        ent3 = ent1-ent2;
        cad3 = Integer.toString(ent3);
        DifBolivar.setText(cad3);
    }
    
    public void DiferenciaD(){
        
    }
    
    public void DiferenciaE(){
        
    }
    
    public void DiferenciaP(){
        
    }
    
    public void DiferenciaDto(){
        
    }
    
    public void DiferenciaCto(){
        
    }
    
    public void DiferenciaPM(){
        
    }
    
    public void DiferenciaTrans(){
        
    }
    
    public void DiferenciaTotal(){
        String cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9;
        int ent1, ent2, ent3, ent4, ent5, ent6, ent7, ent8, ent9;
        
        cad1 = DifBolivar.getText();
        cad2 = DifDolar.getText();
        cad3 = DifEuro.getText();
        cad4 = DifPeso.getText();
        cad5 = DifDebito.getText();
        cad6 = DifCredito.getText();
        cad7 = DifPM.getText();
        cad8 = DifTrans.getText();
        
        ent1 = Integer.parseInt(cad1);
        ent2 = Integer.parseInt(cad2);
        ent3 = Integer.parseInt(cad3);
        ent4 = Integer.parseInt(cad4);
        ent5 = Integer.parseInt(cad5);
        ent6 = Integer.parseInt(cad6);
        ent7 = Integer.parseInt(cad7);
        ent8 = Integer.parseInt(cad8);
        
        ent9 = ent1+ent2+ent3+ent4+ent5+ent6+ent7+ent8;
        cad9 = Integer.toString(ent9);
        TtDiferencia.setText(cad9);
    }
    
    public void BuscarCajero(){
        
    }
    
    public void TotalRecaudado(){
        String cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9;
        int ent1, ent2, ent3, ent4, ent5, ent6, ent7, ent8, ent9;
        
        cad1 = RcBolivar.getText();
        cad2 = RcDolar.getText();
        cad3 = RcEuros.getText();
        cad4 = RcPesos.getText();
        cad5 = RcDebito.getText();
        cad6 = RcCredito.getText();
        cad7 = RcPM.getText();
        cad8 = RcTrans.getText();
        
        ent1 = Integer.parseInt(cad1);
        ent2 = Integer.parseInt(cad2);
        ent3 = Integer.parseInt(cad3);
        ent4 = Integer.parseInt(cad4);
        ent5 = Integer.parseInt(cad5);
        ent6 = Integer.parseInt(cad6);
        ent7 = Integer.parseInt(cad7);
        ent8 = Integer.parseInt(cad8);
        
        ent9 = ent1+ent2+ent3+ent4+ent5+ent6+ent7+ent8;
        cad9 = Integer.toString(ent9);
        TtRecaudado.setText(cad9);
    }
    
    public void TotalDeclarado(){
        String cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9;
        int ent1, ent2, ent3, ent4, ent5, ent6, ent7, ent8, ent9;
        
        cad1 = DclBolivar.getText();
        cad2 = DclDolar.getText();
        cad3 = DclEuro.getText();
        cad4 = DclPesos.getText();
        cad5 = DclDebito.getText();
        cad6 = DclCredito.getText();
        cad7 = DclPM.getText();
        cad8 = DclTrans.getText();
        
        ent1 = Integer.parseInt(cad1);
        ent2 = Integer.parseInt(cad2);
        ent3 = Integer.parseInt(cad3);
        ent4 = Integer.parseInt(cad4);
        ent5 = Integer.parseInt(cad5);
        ent6 = Integer.parseInt(cad6);
        ent7 = Integer.parseInt(cad7);
        ent8 = Integer.parseInt(cad8);
        
        ent9 = ent1+ent2+ent3+ent4+ent5+ent6+ent7+ent8;
        cad9 = Integer.toString(ent9);
        TtDeclarado.setText(cad9);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        TtRecaudado = new javax.swing.JFormattedTextField();
        TtDeclarado = new javax.swing.JFormattedTextField();
        TtDiferencia = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FECHA = new javax.swing.JFormattedTextField();
        txt_Cajero = new javax.swing.JTextField();
        Cbox_NCaja = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        Fondo2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        DifPM = new javax.swing.JFormattedTextField();
        DclEuro = new javax.swing.JFormattedTextField();
        DclDolar = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        DclBolivar = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DclCredito = new javax.swing.JFormattedTextField();
        DclPM = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        RcBolivar = new javax.swing.JFormattedTextField();
        RcTrans = new javax.swing.JFormattedTextField();
        DifCredito = new javax.swing.JFormattedTextField();
        DifPeso = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        DclPesos = new javax.swing.JFormattedTextField();
        DifTrans = new javax.swing.JFormattedTextField();
        DclDebito = new javax.swing.JFormattedTextField();
        RcPM = new javax.swing.JFormattedTextField();
        RcDebito = new javax.swing.JFormattedTextField();
        RcPesos = new javax.swing.JFormattedTextField();
        RcEuros = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DifBolivar = new javax.swing.JFormattedTextField();
        RcDolar = new javax.swing.JFormattedTextField();
        DclTrans = new javax.swing.JFormattedTextField();
        RcCredito = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        DifEuro = new javax.swing.JFormattedTextField();
        DifDolar = new javax.swing.JFormattedTextField();
        DifDebito = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        RcZelle = new javax.swing.JFormattedTextField();
        jButton16 = new javax.swing.JButton();
        DclZelle = new javax.swing.JFormattedTextField();
        DifZelle = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CUADRE DE CAJA");
        setUndecorated(true);
        setResizable(false);

        Fondo1.setBackground(new java.awt.Color(255, 255, 255));
        Fondo1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3)));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TOTALES");

        TtRecaudado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TtRecaudado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        TtRecaudado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TtRecaudado.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        TtDeclarado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TtDeclarado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        TtDeclarado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TtDeclarado.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        TtDiferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TtDiferencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        TtDiferencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TtDiferencia.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Close_2.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CUADRE DE CAJA");

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refresh_2.png"))); // NOI18N
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Floppy_1.png"))); // NOI18N
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17))
            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cajero:");

        FECHA.setEditable(false);
        FECHA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FECHA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        FECHA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FECHA.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        txt_Cajero.setEditable(false);
        txt_Cajero.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txt_Cajero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cajero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Cbox_NCaja.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Cbox_NCaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4" }));
        Cbox_NCaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Caja:");

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refresh.png"))); // NOI18N
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Cbox_NCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_Cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Cbox_NCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Cajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Fondo2.setBackground(new java.awt.Color(255, 255, 255));
        Fondo2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bolivares");

        DifPM.setEditable(false);
        DifPM.setBackground(new java.awt.Color(153, 153, 153));
        DifPM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifPM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifPM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifPM.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DclEuro.setEditable(false);
        DclEuro.setBackground(new java.awt.Color(204, 204, 204));
        DclEuro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclEuro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DclEuro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclEuro.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DclDolar.setEditable(false);
        DclDolar.setBackground(new java.awt.Color(204, 204, 204));
        DclDolar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclDolar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DclDolar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclDolar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Pesos");

        DclBolivar.setEditable(false);
        DclBolivar.setBackground(new java.awt.Color(204, 204, 204));
        DclBolivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclBolivar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        DclBolivar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclBolivar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Diferencia");
        jLabel3.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Declarado");
        jLabel2.setToolTipText("");

        DclCredito.setEditable(false);
        DclCredito.setBackground(new java.awt.Color(204, 204, 204));
        DclCredito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclCredito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DclCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclCredito.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DclPM.setEditable(false);
        DclPM.setBackground(new java.awt.Color(204, 204, 204));
        DclPM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclPM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DclPM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclPM.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dolares");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Pago Movil");

        RcBolivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcBolivar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        RcBolivar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcBolivar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcBolivar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcBolivarKeyPressed(evt);
            }
        });

        RcTrans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcTrans.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        RcTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcTrans.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcTrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcTransKeyPressed(evt);
            }
        });

        DifCredito.setEditable(false);
        DifCredito.setBackground(new java.awt.Color(153, 153, 153));
        DifCredito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifCredito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifCredito.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DifPeso.setEditable(false);
        DifPeso.setBackground(new java.awt.Color(153, 153, 153));
        DifPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifPeso.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FORMA DE PAGO");

        DclPesos.setEditable(false);
        DclPesos.setBackground(new java.awt.Color(204, 204, 204));
        DclPesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclPesos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DclPesos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclPesos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DifTrans.setEditable(false);
        DifTrans.setBackground(new java.awt.Color(153, 153, 153));
        DifTrans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifTrans.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifTrans.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DclDebito.setEditable(false);
        DclDebito.setBackground(new java.awt.Color(204, 204, 204));
        DclDebito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclDebito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DclDebito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclDebito.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        RcPM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcPM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        RcPM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcPM.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcPMKeyPressed(evt);
            }
        });

        RcDebito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcDebito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        RcDebito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcDebito.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcDebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcDebitoKeyPressed(evt);
            }
        });

        RcPesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcPesos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        RcPesos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcPesos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcPesos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcPesosKeyPressed(evt);
            }
        });

        RcEuros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcEuros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        RcEuros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcEuros.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcEuros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcEurosKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Credito");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Euros");

        DifBolivar.setEditable(false);
        DifBolivar.setBackground(new java.awt.Color(153, 153, 153));
        DifBolivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifBolivar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifBolivar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifBolivar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        RcDolar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcDolar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        RcDolar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcDolar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcDolar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcDolarKeyPressed(evt);
            }
        });

        DclTrans.setEditable(false);
        DclTrans.setBackground(new java.awt.Color(204, 204, 204));
        DclTrans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclTrans.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DclTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclTrans.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        RcCredito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcCredito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        RcCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcCredito.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcCreditoKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recaudado");
        jLabel1.setToolTipText("");

        DifEuro.setEditable(false);
        DifEuro.setBackground(new java.awt.Color(153, 153, 153));
        DifEuro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifEuro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifEuro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifEuro.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DifDolar.setEditable(false);
        DifDolar.setBackground(new java.awt.Color(153, 153, 153));
        DifDolar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifDolar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifDolar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifDolar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DifDebito.setEditable(false);
        DifDebito.setBackground(new java.awt.Color(153, 153, 153));
        DifDebito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifDebito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifDebito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifDebito.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Debito");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Transferencias");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Zelle");

        RcZelle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RcZelle.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        RcZelle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RcZelle.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        RcZelle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RcZelleKeyPressed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        DclZelle.setEditable(false);
        DclZelle.setBackground(new java.awt.Color(204, 204, 204));
        DclZelle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DclZelle.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DclZelle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DclZelle.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        DifZelle.setEditable(false);
        DifZelle.setBackground(new java.awt.Color(153, 153, 153));
        DifZelle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifZelle.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        DifZelle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DifZelle.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        javax.swing.GroupLayout Fondo2Layout = new javax.swing.GroupLayout(Fondo2);
        Fondo2.setLayout(Fondo2Layout);
        Fondo2Layout.setHorizontalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo2Layout.createSequentialGroup()
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))
                        .addGap(50, 50, 50)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Fondo2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel2))
                            .addGroup(Fondo2Layout.createSequentialGroup()
                                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcEuros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcPM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcBolivar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Fondo2Layout.createSequentialGroup()
                                        .addComponent(RcZelle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DclDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclPM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclBolivar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclZelle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Fondo2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DifDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DifEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DifPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DifDebito)
                                            .addComponent(DifCredito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(DifPM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DifTrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DifZelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DifBolivar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Fondo2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel3))))
                    .addComponent(jLabel8))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        Fondo2Layout.setVerticalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(DifDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DifEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DifPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DifDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DifCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DifPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DifTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fondo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Fondo2Layout.createSequentialGroup()
                                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DifBolivar)
                                    .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(RcBolivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DclBolivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(RcDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DclDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RcEuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DclEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RcPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DclPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RcDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DclDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RcCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DclCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DclPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RcPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DclTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RcTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RcZelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DclZelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DifZelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout Fondo1Layout = new javax.swing.GroupLayout(Fondo1);
        Fondo1.setLayout(Fondo1Layout);
        Fondo1Layout.setHorizontalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Fondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addComponent(Fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo1Layout.createSequentialGroup()
                        .addGap(0, 102, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(37, 37, 37)
                        .addComponent(TtRecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(TtDeclarado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(TtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        Fondo1Layout.setVerticalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TtDeclarado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TtRecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AddBolivares obj = new AddBolivares();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AddDolares obj = new AddDolares();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        AddEuros obj = new AddEuros();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        AddPesos obj = new AddPesos();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        AddDebito obj = new AddDebito();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        AddCredito obj = new AddCredito();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        AddTransferencias obj = new AddTransferencias();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AddPagoM obj = new AddPagoM();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void RcBolivarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcBolivarKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            DiferenciaB();
            RcDolar.requestFocus();
            DiferenciaTotal();
        }
    }//GEN-LAST:event_RcBolivarKeyPressed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        BuscarCajero();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void RcDolarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcDolarKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            DiferenciaD();
            RcEuros.requestFocus();
            DiferenciaTotal();
        }
    }//GEN-LAST:event_RcDolarKeyPressed

    private void RcEurosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcEurosKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            DiferenciaE();
            RcPesos.requestFocus();
            DiferenciaTotal();
        }
    }//GEN-LAST:event_RcEurosKeyPressed

    private void RcPesosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcPesosKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            DiferenciaP();
            RcDebito.requestFocus();
            DiferenciaTotal();
        }
    }//GEN-LAST:event_RcPesosKeyPressed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Control_Caja obj = new Control_Caja();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void RcDebitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcDebitoKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            DiferenciaDto();
            RcCredito.requestFocus();
            DiferenciaTotal();
        }
    }//GEN-LAST:event_RcDebitoKeyPressed

    private void RcCreditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcCreditoKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            DiferenciaCto();
            RcPM.requestFocus();
            DiferenciaTotal();
        }
    }//GEN-LAST:event_RcCreditoKeyPressed

    private void RcPMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcPMKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            DiferenciaPM();
            RcTrans.requestFocus();
            DiferenciaTotal();
        }
    }//GEN-LAST:event_RcPMKeyPressed

    private void RcTransKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcTransKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            DiferenciaTrans();
            DiferenciaTotal();
        }
    }//GEN-LAST:event_RcTransKeyPressed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void RcZelleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcZelleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RcZelleKeyPressed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(CuadreCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuadreCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuadreCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuadreCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuadreCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbox_NCaja;
    private javax.swing.JFormattedTextField DclBolivar;
    private javax.swing.JFormattedTextField DclCredito;
    private javax.swing.JFormattedTextField DclDebito;
    private javax.swing.JFormattedTextField DclDolar;
    private javax.swing.JFormattedTextField DclEuro;
    private javax.swing.JFormattedTextField DclPM;
    private javax.swing.JFormattedTextField DclPesos;
    private javax.swing.JFormattedTextField DclTrans;
    private javax.swing.JFormattedTextField DclZelle;
    private javax.swing.JFormattedTextField DifBolivar;
    private javax.swing.JFormattedTextField DifCredito;
    private javax.swing.JFormattedTextField DifDebito;
    private javax.swing.JFormattedTextField DifDolar;
    private javax.swing.JFormattedTextField DifEuro;
    private javax.swing.JFormattedTextField DifPM;
    private javax.swing.JFormattedTextField DifPeso;
    private javax.swing.JFormattedTextField DifTrans;
    private javax.swing.JFormattedTextField DifZelle;
    private javax.swing.JFormattedTextField FECHA;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JPanel Fondo2;
    public static javax.swing.JFormattedTextField RcBolivar;
    private javax.swing.JFormattedTextField RcCredito;
    private javax.swing.JFormattedTextField RcDebito;
    public static javax.swing.JFormattedTextField RcDolar;
    private javax.swing.JFormattedTextField RcEuros;
    private javax.swing.JFormattedTextField RcPM;
    private javax.swing.JFormattedTextField RcPesos;
    private javax.swing.JFormattedTextField RcTrans;
    private javax.swing.JFormattedTextField RcZelle;
    private javax.swing.JFormattedTextField TtDeclarado;
    private javax.swing.JFormattedTextField TtDiferencia;
    private javax.swing.JFormattedTextField TtRecaudado;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_Cajero;
    // End of variables declaration//GEN-END:variables
}
