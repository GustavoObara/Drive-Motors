package view;

import db.MySQL;
import entity.Automovel;
import javax.swing.JOptionPane;
import model.TDBComboBox;

/**
 * @author gusta
 */
public class ViewSearchAuto extends javax.swing.JFrame {
    MySQL mysqldb = new MySQL();
    
    public ViewSearchAuto() {
        initComponents();
        
        cbConsultaPlaca.setEnabled(false);
        btConsultaModelo.setEnabled(false);
        btConsultaAno.setEnabled(false);
        
        TDBComboBox cbos = new TDBComboBox();
        //Panel 1
        cbos.setStatus(cbConsultaPlaca, "automovel", "nm_placa", null);
//        cbos.setStatus(cbConsultaModelo, "automovel", "nm_modelo", null);
//        cbos.setStatus(cbConsultaAno, "automovel", "nr_ano", null);
        //Panel 2
        cbos.setStatus(cbMarca, "utilidades", "nm_marca", null);
        cbos.setStatus(cbAno, "utilidades", "nr_ano", null);
        cbos.setStatus(cbCor, "utilidades", "nm_cor", null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbPlaca = new javax.swing.JRadioButton();
        rbModelo = new javax.swing.JRadioButton();
        rbRenavam = new javax.swing.JRadioButton();
        cbConsultaPlaca = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btConsultaModelo = new javax.swing.JButton();
        btConsultaAno = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbFreio = new javax.swing.JRadioButton();
        cbCor = new javax.swing.JComboBox<>();
        rbVidro = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbAlarme = new javax.swing.JRadioButton();
        txtPlaca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbDirecao = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbCambio = new javax.swing.JComboBox<>();
        cbMarca = new javax.swing.JComboBox<>();
        rbArCond = new javax.swing.JRadioButton();
        rbRodas = new javax.swing.JRadioButton();
        txtModelo = new javax.swing.JTextField();
        txtRenavam = new javax.swing.JTextField();
        cbAno = new javax.swing.JComboBox<>();
        cbCombustivel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        rbRetrovisor = new javax.swing.JRadioButton();
        rbMultimidia = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtQuilometragem = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Automóveis");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta"));

        buttonGroup1.add(rbPlaca);
        rbPlaca.setText("Placa");
        rbPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlacaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbModelo);
        rbModelo.setText("Modelo");
        rbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbModeloActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbRenavam);
        rbRenavam.setText("Ano");
        rbRenavam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRenavamActionPerformed(evt);
            }
        });

        cbConsultaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConsultaPlacaActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Deletar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("LOGO AQUI");

        btConsultaModelo.setText("Pesquisar por Modelo");
        btConsultaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaModeloActionPerformed(evt);
            }
        });

        btConsultaAno.setText("Pesquisar por Ano");
        btConsultaAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbModelo)
                    .addComponent(rbRenavam)
                    .addComponent(rbPlaca))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(cbConsultaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsultaModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultaAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPlaca)
                    .addComponent(cbConsultaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbModelo)
                    .addComponent(jButton1)
                    .addComponent(jLabel8)
                    .addComponent(btConsultaModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRenavam)
                    .addComponent(jButton2)
                    .addComponent(btConsultaAno))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Modelo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Placa:");

        rbFreio.setText("Freio ABS");
        rbFreio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFreioActionPerformed(evt);
            }
        });

        rbVidro.setText("Vidros Elétricos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Câmbio:");

        rbAlarme.setText("Alarme");
        rbAlarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlarmeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Observação:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Renavam:");

        rbDirecao.setText("Direção Hidráulica");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Cor:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Combustível:");

        cbCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automático" }));

        cbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMarcaActionPerformed(evt);
            }
        });

        rbArCond.setText("Ar condicionado");
        rbArCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbArCondActionPerformed(evt);
            }
        });

        rbRodas.setText("Rodas de liga leve");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        cbAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnoActionPerformed(evt);
            }
        });

        cbCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Etanol", "Diesel", "Gás natural veicular (GNV)", "Biodiesel", "Híbrido", "Elétrico", "Flex " }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ano:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Marca: ");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        rbRetrovisor.setText("Retrovisor Elétrico");

        rbMultimidia.setText("Multimídia");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Quilometragem:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Valor:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAlarme)
                            .addComponent(rbVidro)
                            .addComponent(rbFreio)
                            .addComponent(rbArCond))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel12)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbMultimidia)
                                        .addComponent(rbDirecao)
                                        .addComponent(rbRodas)
                                        .addComponent(rbRetrovisor))
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel7)))
                            .addComponent(txtQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPlaca)
                                .addComponent(cbCombustivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbCambio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtRenavam)
                    .addComponent(cbCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtModelo))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(rbAlarme)
                            .addGap(6, 6, 6)
                            .addComponent(rbFreio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbArCond)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbVidro))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(rbDirecao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbRodas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbRetrovisor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbMultimidia)))
                    .addComponent(jScrollPane1))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlacaActionPerformed
        //cbConsultaPlaca.setVisible(true);
        if (rbPlaca.isSelected()) {
            cbConsultaPlaca.setEnabled(true);
            btConsultaModelo.setEnabled(false);
            btConsultaAno.setEnabled(false);
        }
    }//GEN-LAST:event_rbPlacaActionPerformed

    private void rbFreioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFreioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFreioActionPerformed

    private void rbAlarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlarmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlarmeActionPerformed

    private void cbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMarcaActionPerformed

    private void rbArCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbArCondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbArCondActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void cbAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnoActionPerformed

    private void cbConsultaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConsultaPlacaActionPerformed
        String placa = (String) cbConsultaPlaca.getSelectedItem();
        try {
            mysqldb.conectaBanco();
            Automovel novo_auto = new Automovel();
            
            String query = "SELECT * FROM automovel WHERE nm_placa = '" + placa + "'";
//          System.out.println(query);
            this.mysqldb.executarSQL(query);

            while (this.mysqldb.getResultSet().next()) {
                //Info
                novo_auto.setMarca(this.mysqldb.getResultSet().getString(1));
                novo_auto.setModelo(this.mysqldb.getResultSet().getString(2));
                novo_auto.setCambio(this.mysqldb.getResultSet().getString(3));
                novo_auto.setAno(this.mysqldb.getResultSet().getString(4));
                novo_auto.setCombustivel(this.mysqldb.getResultSet().getString(5));
                novo_auto.setCor(this.mysqldb.getResultSet().getString(6));
                novo_auto.setPlaca(this.mysqldb.getResultSet().getString(7));
                novo_auto.setRenavam(this.mysqldb.getResultSet().getString(8));
                novo_auto.setQuilometragem(this.mysqldb.getResultSet().getString(9));
                novo_auto.setValor(this.mysqldb.getResultSet().getString(10));
                novo_auto.setObservacao(this.mysqldb.getResultSet().getString(11));
                //Add
                novo_auto.setAlarme(this.mysqldb.getResultSet().getBoolean(12));
                novo_auto.setFreio(this.mysqldb.getResultSet().getBoolean(13));
                novo_auto.setAr(this.mysqldb.getResultSet().getBoolean(14));
                novo_auto.setVidro(this.mysqldb.getResultSet().getBoolean(15));
                novo_auto.setDirecao(this.mysqldb.getResultSet().getBoolean(16));
                novo_auto.setRodas(this.mysqldb.getResultSet().getBoolean(17));
                novo_auto.setRetrovisor(this.mysqldb.getResultSet().getBoolean(18));
                novo_auto.setMultimidia(this.mysqldb.getResultSet().getBoolean(19));
            }
            
            if (!novo_auto.getPlaca().isBlank()) {
                //Info
                cbMarca.setSelectedItem(novo_auto.getMarca());
                txtModelo.setText(novo_auto.getModelo());
                cbCambio.setSelectedItem(novo_auto.getCambio());
                cbAno.setSelectedItem(novo_auto.getAno());
                cbCombustivel.setSelectedItem(novo_auto.getCombustivel());
                cbCor.setSelectedItem(novo_auto.getCor());
                txtPlaca.setText(novo_auto.getPlaca());
                txtRenavam.setText(novo_auto.getRenavam());
                txtQuilometragem.setText(novo_auto.getQuilometragem());
                txtValor.setText(novo_auto.getValor());
                txtDescricao.setText(novo_auto.getObservacao());
                //Add
                rbAlarme.setSelected(novo_auto.isAlarme());
                rbFreio.setSelected(novo_auto.isFreio());
                rbArCond.setSelected(novo_auto.isAr());
                rbVidro.setSelected(novo_auto.isVidro());
                rbDirecao.setSelected(novo_auto.isDirecao());
                rbRodas.setSelected(novo_auto.isRodas());
                rbRetrovisor.setSelected(novo_auto.isRetrovisor());
                rbMultimidia.setSelected(novo_auto.isMultimidia());
                       
            }
            
        } catch (Exception e) {        
            JOptionPane.showMessageDialog(rootPane, "Erro ao Buscar a locação");
        } finally {
            mysqldb.fechaBanco();
        }
        
    }//GEN-LAST:event_cbConsultaPlacaActionPerformed

    private void rbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbModeloActionPerformed
        if (rbModelo.isSelected()) {
            cbConsultaPlaca.setEnabled(false);
            btConsultaModelo.setEnabled(true);
            btConsultaAno.setEnabled(false);
        }
    }//GEN-LAST:event_rbModeloActionPerformed

    private void rbRenavamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRenavamActionPerformed
        if (rbRenavam.isSelected()) {
            cbConsultaPlaca.setEnabled(false);
            btConsultaModelo.setEnabled(false);
            btConsultaAno.setEnabled(true);
        }
    }//GEN-LAST:event_rbRenavamActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // Deletar valores
        mysqldb.conectaBanco();
        String placa = (String) cbConsultaPlaca.getSelectedItem();
        boolean status = false;
        
        try {
                String query = "DELETE FROM automovel WHERE nm_placa = '" + placa + "'";
                
                status = this.mysqldb.updateSQL(query);
                
                if (status) {
                    JOptionPane.showMessageDialog(rootPane, "Veículo excluído com sucesso!");
                   
                } else {
                    JOptionPane.showMessageDialog(rootPane, "O Veículo não pôde ser excluído");
                }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } finally {
            mysqldb.fechaBanco();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Alterar valores
        String placa = (String) txtPlaca.getText();
        try {
            
            //CODIGO DO WORK
            mysqldb.conectaBanco();
            Automovel novo_auto = new Automovel();

            novo_auto.setMarca((String)cbMarca.getSelectedItem());
            novo_auto.setModelo(txtModelo.getText());
            novo_auto.setCambio((String)cbCambio.getSelectedItem());
            novo_auto.setAno((String)cbAno.getSelectedItem());
            novo_auto.setCombustivel((String)cbCombustivel.getSelectedItem());
            novo_auto.setCor((String)cbCor.getSelectedItem());
            novo_auto.setPlaca(txtPlaca.getText());
            novo_auto.setRenavam(txtRenavam.getText());
            novo_auto.setQuilometragem((String)txtQuilometragem.getText());
            novo_auto.setValor((String)txtValor.getText());
            novo_auto.setObservacao(txtDescricao.getText());
    
            novo_auto.setAlarme(rbAlarme.isSelected());
            novo_auto.setFreio(rbFreio.isSelected());
            novo_auto.setAr(rbArCond.isSelected());
            novo_auto.setVidro(rbVidro.isSelected());
            novo_auto.setDirecao(rbDirecao.isSelected());
            novo_auto.setRodas(rbRodas.isSelected());
            novo_auto.setRetrovisor(rbRetrovisor.isSelected());
            novo_auto.setMultimidia(rbMultimidia.isSelected());
            
            System.out.println(novo_auto);

		String query = "UPDATE automovel SET "
                + "nm_marca = '" + novo_auto.getMarca() + "',"
                + "nm_modelo = '" + novo_auto.getModelo() + "',"
                + "nm_cambio = '" + novo_auto.getCambio() + "',"
                + "nr_ano = '" + novo_auto.getAno() + "',"
                + "nm_combustivel = '" + novo_auto.getCombustivel() + "',"
                + "nm_cor = '" + novo_auto.getCor() + "',"
                + "nm_placa = '" + novo_auto.getPlaca() + "',"
                + "nr_renavam = '" + novo_auto.getRenavam() + "',"
                + "nr_quilometragem = '" + novo_auto.getQuilometragem() + "',"
                + "nr_valor = '" + novo_auto.getValor() + "',"
                + "txt_obs = '" + novo_auto.getObservacao() + "',"
                        
                + "add_alarme = " + novo_auto.isAlarme() + ","
                + "add_freio = " + novo_auto.isFreio() + ","
                + "add_ar = " + novo_auto.isAr() + ","
                + "add_vidro = " + novo_auto.isVidro() + ","
                + "add_direcao = " + novo_auto.isDirecao() + ","
                + "add_rodas = " + novo_auto.isRodas() + ","
                + "add_retrovisor = " + novo_auto.isRetrovisor() + ","
                + "add_multimidia = " + novo_auto.isMultimidia() + "";
                
             query = query + " where nm_placa =  '" + placa + "'";
             
             System.out.println(query);
            
            
            int status = 0;
            
            status = this.mysqldb.insertSQL(query);

            if (status == 1) {
                
                JOptionPane.showMessageDialog(rootPane, "Automóvel alterado com sucesso!");
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Houve problemas na alteração do automóvel. Revise os dados.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar o automóvel");
        } finally {
            mysqldb.fechaBanco();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Limpar Valores
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btConsultaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaModeloActionPerformed
        // Consulta Modelo
        ViewSearchYearModel mySearchModel = new ViewSearchYearModel();
        mySearchModel.setVisible(true);
        mySearchModel.pnModel();
    }//GEN-LAST:event_btConsultaModeloActionPerformed

    private void btConsultaAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaAnoActionPerformed
        // Consulta Ano
        ViewSearchYearModel mySearchModel = new ViewSearchYearModel();
        mySearchModel.setVisible(true);
        mySearchModel.pnAno();
    }//GEN-LAST:event_btConsultaAnoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSearchAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSearchAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSearchAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSearchAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSearchAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultaAno;
    private javax.swing.JButton btConsultaModelo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbCambio;
    private javax.swing.JComboBox<String> cbCombustivel;
    private javax.swing.JComboBox<String> cbConsultaPlaca;
    private javax.swing.JComboBox<String> cbCor;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rbAlarme;
    private javax.swing.JRadioButton rbArCond;
    private javax.swing.JRadioButton rbDirecao;
    private javax.swing.JRadioButton rbFreio;
    private javax.swing.JRadioButton rbModelo;
    private javax.swing.JRadioButton rbMultimidia;
    private javax.swing.JRadioButton rbPlaca;
    private javax.swing.JRadioButton rbRenavam;
    private javax.swing.JRadioButton rbRetrovisor;
    private javax.swing.JRadioButton rbRodas;
    private javax.swing.JRadioButton rbVidro;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtQuilometragem;
    private javax.swing.JTextField txtRenavam;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
