/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

//import static Interfaces.Conexion_BD.resultado;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class FichaProductos extends javax.swing.JFrame {

    private Conexion_LLenarCombo con = new Conexion_LLenarCombo();
    static Connection conexion;
    static Statement estatuto;

    String Codigo, Nombre, Estado, Barra, Marca, Modelo, Proveedor, TproductoK, TproductoU, TproductoB;
    String CDepartamento, Departamento, CGrupo, Grupo, CSubgrupo, Subgrupo;
    String CostoAc, CostoAn, Diferencia, Precio, Utilidad, IVA, EXC;
    Conexion_BD cn;
    Conexion cd = new Conexion();
    Connection cc = cd.enlazar();
    Conex conex = new Conex();
    
    public FichaProductos() {
        initComponents();
        setLocationRelativeTo(null);
        Deshabilitar();
        Deshabilitar_KUB();
        cn = new Conexion_BD();
        cn.conectar();
        this.BoxDepartamento.setModel(con.Obt_Datos_Departamentos()); 
    }

    public void ActualizaDatos(){
        String resp = BoxTProducto.getSelectedItem().toString();
        if(resp.equals("SELECCIONAR")){
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UNA OPCION VALIDA..!","ADVERTENCIA..!", JOptionPane.WARNING_MESSAGE);
        }else if(resp.equals("POR KG")){
            txtKilo.setText("");
            txtKilo.setEnabled(true);
            txtBulto.setText("");
            txtBulto.setEnabled(false);
            txtUnidad.setText("");
            txtUnidad.setEnabled(false);
        }else if(resp.equals("POR UNIDAD")){
            txtKilo.setText("");
            txtKilo.setEnabled(false);
            txtBulto.setText("");
            txtBulto.setEnabled(false);
            txtUnidad.setText("");
            txtUnidad.setEnabled(true);
        }else if(resp.equals("POR BULTO")){
            txtKilo.setText("");
            txtKilo.setEnabled(false);
            txtBulto.setText("");
            txtBulto.setEnabled(true);
            txtUnidad.setText("");
            txtUnidad.setEnabled(false);
        }
    }
    
    public void Deshabilitar(){
        txtCodigo.setEnabled(false);
        txtNombre.setEnabled(false);
        BtnEstado.setEnabled(false);
        txtBarra.setEnabled(false);
        txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);
        BoxTProducto.setEnabled(false);
        btnProducto.setEnabled(false);
        btnProvee.setEnabled(false);
        txtUnidad.setEnabled(false);
        txtBulto.setEnabled(false);
        txtKilo.setEnabled(false);
        BoxDepartamento.setEnabled(false);
        BoxGrupo.setEnabled(false);
        BoxSG.setEnabled(false);
        btnDepartamento.setEnabled(false);
        btnGrupo.setEnabled(false);
        btnSG.setEnabled(false);
        txtDepartamento.setEnabled(false);
        txtGrupo.setEnabled(false);
        txtSG.setEnabled(false);
        txtCosto1.setEnabled(false);
        txtCosto2.setEnabled(false);
        txtDifer.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtUtilidad.setEnabled(false);
        txtIVA.setEnabled(false);
        EditIva.setEnabled(false);
        txtProveedor.setEnabled(false);
    }
    
    public void Habilitar(){
        txtCodigo.setEnabled(true);
        txtNombre.setEnabled(true);
        BtnEstado.setEnabled(true);
        txtBarra.setEnabled(true);
        txtMarca.setEnabled(true);
        txtModelo.setEnabled(true);
        BoxTProducto.setEnabled(true);
        btnProducto.setEnabled(true);
        btnProvee.setEnabled(true);
        BoxDepartamento.setEnabled(true);
        BoxGrupo.setEnabled(true);
        BoxSG.setEnabled(true);
        btnDepartamento.setEnabled(true);
        btnGrupo.setEnabled(true);
        btnSG.setEnabled(true);
        txtDepartamento.setEnabled(true);
        txtGrupo.setEnabled(true);
        txtSG.setEnabled(true);
        txtCosto1.setEnabled(true);
        txtCosto2.setEnabled(true);
        txtDifer.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtUtilidad.setEnabled(true);
        txtIVA.setEnabled(true);
        EditIva.setEnabled(true);
        txtProveedor.setEnabled(true);
    }
    
    public void Limpiar(){
        txtCodigo.setText("");
        txtNombre.setText("");
        BtnEstado.setSelected(false);
        txtBarra.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        BoxTProducto.setSelectedIndex(0);
        btnProducto.setSelected(false);
        btnProvee.setSelected(false);
        txtUnidad.setText("");
        txtBulto.setText("");
        txtKilo.setText("");
        BoxDepartamento.setSelectedIndex(0);
        BoxGrupo.setSelectedIndex(0);
        BoxSG.setSelectedIndex(0);
        btnDepartamento.setSelected(false);
        btnGrupo.setSelected(false);
        btnSG.setSelected(false);
        txtDepartamento.setText("");
        txtGrupo.setText("");
        txtSG.setText("");
        txtCosto1.setText("");
        txtCosto2.setText("");
        txtDifer.setText("");
        txtPrecio.setText("");
        txtUtilidad.setText(Codigo);
        txtIVA.setSelectedIndex(0);
        EditIva.setSelected(false);
        txtProveedor.setText("");
    }
    
    public final void Deshabilitar_KUB(){
        txtBulto.setEnabled(false);
        txtKilo.setEnabled(false);
        txtUnidad.setEnabled(false);
    }
    
    public void CalculoPrecio(){
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.00", separadoresPersonalizados);
        String cost, util, impu, ttpdv;
        float numCosto, numUtil, numIva, TtIva=0, TtUtil, Pdv;
        
        cost = txtCosto1.getText();
        util = txtUtilidad.getText();
        impu = txtIVA.getSelectedItem().toString();
        
        numCosto = Float.parseFloat(cost);
        numUtil = Float.parseFloat(util);
        numIva = Float.parseFloat(impu);
        
//      CALCULO DEL IVA POR PRODUCTO
        
        if(impu.equals("16")){
            TtIva = (numCosto*numIva)/100;
        }else if(impu.equals("8")){
            TtIva = (numCosto*numIva)/100;
        }else if(impu.equals("0")){
            TtIva = 0;
        }
        
//      CALCULO DE PORCENTAJE DE UTILIDAD
        
        TtUtil = (numCosto*numUtil)/100;

//      CALCULO DEL PRECIO DE VENTA

        Pdv = numCosto+TtUtil+TtIva;
        ttpdv = df.format(Pdv);

        txtPrecio.setText(ttpdv);
    }
    
    public void Guardar(){
        Codigo = txtCodigo.getText();
        Nombre = txtNombre.getText();
        if(BtnEstado.isSelected()){
            Estado = "Activo";
        }else{
            Estado = "Inactivo";
        }
        Barra = txtBarra.getText();
        Marca = txtMarca.getText();
        Modelo = txtModelo.getText();
        Proveedor = txtProveedor.getText();
        TproductoK = txtKilo.getText();
        TproductoU = txtUnidad.getText();
        TproductoB= txtBulto.getText();
        
        CDepartamento = BoxDepartamento.getSelectedItem().toString();
        Departamento = txtDepartamento.getText();
        CGrupo = BoxGrupo.getSelectedItem().toString();
        Grupo = txtGrupo.getText();
        CSubgrupo = BoxSG.getSelectedItem().toString();
        Subgrupo = txtSG.getText();
        
        CostoAc = txtCosto1.getText();
        CostoAn = txtCosto2.getText();
        Diferencia = txtDifer.getText();
        Precio = txtPrecio.getText();
        Utilidad = txtUtilidad.getText();
        IVA = txtIVA.getSelectedItem().toString();
        
        String valores = " '000','"+Codigo+"','"+Nombre+"','"+Estado+"','"+Barra+"','"+Marca+"','"+Modelo+"','"+Proveedor+"',"
                + "'"+TproductoK+"','"+TproductoU+"','"+TproductoB+"','"+CDepartamento+"','"+Departamento+"','"+CGrupo+"',"
                + "'"+Grupo+"','"+CSubgrupo+"','"+Subgrupo+"','"+CostoAc+"','"+CostoAn+"','"+Diferencia+"','"+Precio+"',"
                + "'"+Utilidad+"','"+IVA+"'";
        cn.guardar("productos", valores);
    }
    
    public void LlenarDepartamento(){
        String CoDeparta = BoxDepartamento.getSelectedItem().toString(), cap="";
        String sql = "SELECT * FROM departamento WHERE COD_DEPARTAMENTO ='"+CoDeparta+"'";
        try {
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cap=rs.getString("COD_DEPARTAMENTO");
            } if(cap.equals("")){
                JOptionPane.showMessageDialog(this, "CODIGO INVALIDO","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }else if(cap.equals(CoDeparta)){
                conex.setQuery("SELECT * FROM departamento WHERE COD_DEPARTAMENTO = '"+CoDeparta+"'");
                TraerDepartamento equi = conex.getClaseTraerDepartamento();
                txtDepartamento.setText(equi.getDesripcion());
                this.BoxGrupo.setModel(con.Obt_Datos_Grupos());
            }
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void LlenarGrupo(){
        String CodGrupo = BoxGrupo.getSelectedItem().toString(), cap="";
        String sql = "SELECT * FROM grupos WHERE COD_GRUPO ='"+CodGrupo+"'";
        try {
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cap=rs.getString("COD_GRUPO");
            } if(cap.equals("")){
                JOptionPane.showMessageDialog(this, "CODIGO INVALIDO","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }else if(cap.equals(CodGrupo)){
                conex.setQuery("SELECT * FROM grupos WHERE COD_GRUPO = '"+CodGrupo+"'");
                TraerGrupos equi = conex.getClaseTraerGrupo();
                txtGrupo.setText(equi.getDesripcion());
                this.BoxSG.setModel(con.Obt_Datos_SubGrupos());
            }
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void LlenarSGrupo(){
        String CodSG = BoxSG.getSelectedItem().toString(), cap="";
        String sql = "SELECT * FROM subgrupos WHERE COD_SG ='"+CodSG+"'";
        try {
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cap=rs.getString("COD_SG");
            } if(cap.equals("")){
                JOptionPane.showMessageDialog(this, "CODIGO INVALIDO","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }else if(cap.equals(CodSG)){
                conex.setQuery("SELECT * FROM subgrupos WHERE COD_SG = '"+CodSG+"'");
                TraerSubGrupo equi = conex.getClaseTraerSubGrupo();
                txtSG.setText(equi.getDesripcion());
            }
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtModelo = new javax.swing.JTextField();
        BoxTProducto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtBarra = new javax.swing.JTextField();
        BtnEstado = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKilo = new javax.swing.JTextField();
        txtUnidad = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtBulto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnProducto = new javax.swing.JButton();
        btnProvee = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BoxDepartamento = new javax.swing.JComboBox<>();
        BoxGrupo = new javax.swing.JComboBox<>();
        BoxSG = new javax.swing.JComboBox<>();
        btnDepartamento = new javax.swing.JButton();
        btnGrupo = new javax.swing.JButton();
        btnSG = new javax.swing.JButton();
        txtDepartamento = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        txtSG = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtCosto1 = new javax.swing.JTextField();
        txtCosto2 = new javax.swing.JTextField();
        txtDifer = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUtilidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        EditIva = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Close_2.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("FICHA DE PRODUCTOS");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Edit_1.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_1.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Floppy_1.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_1.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtModelo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BoxTProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BoxTProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "POR KG", "POR UNIDAD", "POR BULTO" }));
        BoxTProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("NOMBRE*");

        txtMarca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("TIPO DE PRODUCTO*");

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBarra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtBarra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnEstado.setBackground(new java.awt.Color(255, 255, 255));
        BtnEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnEstado.setText("Activo");
        BtnEstado.setContentAreaFilled(false);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("ESTADO");

        txtNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CODIGO*");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("CODIGO DE BARRA");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("MARCA");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("MODELO");

        txtKilo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtKilo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKilo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtUnidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtUnidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUnidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBulto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtBulto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBulto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("KILOGRAMOS");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("PROVEEDOR*");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("UNIDADES");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setText("BULTOS");

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refresh.png"))); // NOI18N
        btnProducto.setContentAreaFilled(false);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refresh.png"))); // NOI18N
        btnProvee.setContentAreaFilled(false);
        btnProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(BtnEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(BoxTProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(txtBulto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BoxTProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("GRUPO");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("SUBGRUPO");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("DEPARTAMENTO*");

        BoxDepartamento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BoxDepartamento.setMaximumRowCount(20);
        BoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        BoxDepartamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BoxGrupo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BoxGrupo.setMaximumRowCount(20);
        BoxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        BoxGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BoxSG.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BoxSG.setMaximumRowCount(20);
        BoxSG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        BoxSG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refresh.png"))); // NOI18N
        btnDepartamento.setContentAreaFilled(false);
        btnDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentoActionPerformed(evt);
            }
        });

        btnGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refresh.png"))); // NOI18N
        btnGrupo.setContentAreaFilled(false);
        btnGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupoActionPerformed(evt);
            }
        });

        btnSG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refresh.png"))); // NOI18N
        btnSG.setContentAreaFilled(false);
        btnSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSGActionPerformed(evt);
            }
        });

        txtDepartamento.setEditable(false);
        txtDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        txtDepartamento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDepartamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepartamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtGrupo.setEditable(false);
        txtGrupo.setBackground(new java.awt.Color(255, 255, 255));
        txtGrupo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtGrupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSG.setEditable(false);
        txtSG.setBackground(new java.awt.Color(255, 255, 255));
        txtSG.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtSG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BoxDepartamento, 0, 132, Short.MAX_VALUE)
                    .addComponent(BoxGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxSG, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(txtGrupo)
                    .addComponent(txtSG))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxDepartamento)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDepartamento)
                    .addComponent(btnDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtGrupo)
                    .addComponent(btnGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BoxSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSG, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("PRECIO");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setText("COSTO");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("ACTUAL*");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("ANTERIOR*");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setText("DIFERENCIA");

        txtCosto1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCosto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCosto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCosto2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCosto2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCosto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDifer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDifer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDifer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("UTILIDAD");

        txtUtilidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtUtilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUtilidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("%");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("I.V.A.");

        txtIVA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "8", "16" }));
        txtIVA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("%");

        EditIva.setBackground(new java.awt.Color(255, 255, 255));
        EditIva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/System.png"))); // NOI18N
        EditIva.setBorder(null);
        EditIva.setContentAreaFilled(false);
        EditIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditIvaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("PRECIO VENTA*");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel11))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtUtilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtCosto2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtDifer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditIva, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(102, 102, 102)
                .addComponent(jLabel28)
                .addGap(83, 83, 83))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel14)
                .addGap(134, 134, 134)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(68, 68, 68))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDifer, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel18))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditIva, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUtilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel11))
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Limpiar();
        Deshabilitar();
        int opcion = JOptionPane.showConfirmDialog(this, "¿QUIERE SALIR DEL MODULO?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(opcion == JOptionPane.YES_OPTION){ 
            System.exit(0);   
        }else if (opcion == JOptionPane.NO_OPTION){
            
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        ActualizaDatos();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveeActionPerformed

    }//GEN-LAST:event_btnProveeActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentoActionPerformed
        LlenarDepartamento();
    }//GEN-LAST:event_btnDepartamentoActionPerformed

    private void btnGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupoActionPerformed
        LlenarGrupo();
    }//GEN-LAST:event_btnGrupoActionPerformed

    private void btnSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSGActionPerformed
        LlenarSGrupo();
    }//GEN-LAST:event_btnSGActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Habilitar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void EditIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditIvaActionPerformed
        CalculoPrecio();
    }//GEN-LAST:event_EditIvaActionPerformed

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
            java.util.logging.Logger.getLogger(FichaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxDepartamento;
    private javax.swing.JComboBox<String> BoxGrupo;
    private javax.swing.JComboBox<String> BoxSG;
    private javax.swing.JComboBox<String> BoxTProducto;
    private javax.swing.JCheckBox BtnEstado;
    private javax.swing.JButton EditIva;
    private javax.swing.JButton btnDepartamento;
    private javax.swing.JButton btnGrupo;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProvee;
    private javax.swing.JButton btnSG;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtBarra;
    private javax.swing.JTextField txtBulto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto1;
    private javax.swing.JTextField txtCosto2;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDifer;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JComboBox<String> txtIVA;
    private javax.swing.JTextField txtKilo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtSG;
    private javax.swing.JTextField txtUnidad;
    private javax.swing.JTextField txtUtilidad;
    // End of variables declaration//GEN-END:variables
}