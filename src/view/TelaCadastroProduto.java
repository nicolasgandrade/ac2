package view;

import javax.swing.JOptionPane;
import utils.MySQL;
import model.Produto;

public class TelaCadastroProduto extends javax.swing.JFrame {
    MySQL conn;
    Produto produto;

    public TelaCadastroProduto() {
        initComponents();
        conn = new MySQL();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jpCadastro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmpresa = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        rbtnRevista = new javax.swing.JRadioButton();
        rbtnJornal = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        lblCategoria1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblIdioma = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();
        lblIdioma1 = new javax.swing.JLabel();
        cboClassificação = new javax.swing.JComboBox<>();
        btnLimparCadastro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblEmpresa1 = new javax.swing.JLabel();
        btnAtualiza = new javax.swing.JButton();
        btnLimparBusca = new javax.swing.JButton();
        lblTipo1 = new javax.swing.JLabel();
        lblCategoria2 = new javax.swing.JLabel();
        lblIdioma2 = new javax.swing.JLabel();
        lblIdioma3 = new javax.swing.JLabel();
        lblCategoria3 = new javax.swing.JLabel();
        rbtnRevista1 = new javax.swing.JRadioButton();
        rbtnJornal1 = new javax.swing.JRadioButton();
        txtEditoraBusca = new javax.swing.JTextField();
        cboCategoria1 = new javax.swing.JComboBox<>();
        cboClassificação1 = new javax.swing.JComboBox<>();
        txtIdioma1 = new javax.swing.JTextField();
        txtValor1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Produto"));
        jpCadastro.setPreferredSize(new java.awt.Dimension(450, 360));

        lblNome.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblNome.setText("Nome Produto:");

        lblEmpresa.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEmpresa.setText("Editora:");

        buttonGroup1.add(rbtnRevista);
        rbtnRevista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnRevista.setText("Revista");

        buttonGroup1.add(rbtnJornal);
        rbtnJornal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnJornal.setText("Jornal");

        lblTipo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTipo.setText("Tipo:");

        lblCategoria.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblCategoria.setText("Categoria:");

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Arte & Moda", "Atualidade & Política", "Ciência & Tecnologia", "Educação ", "Esporte & Lazer", "Infantil", "Negócios & Carreras", "Pets", "Saúde", "Viagem & Turismo" }));

        lblCategoria1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblCategoria1.setText("Valor:");

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblIdioma.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblIdioma.setText("Idioma:");

        lblIdioma1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblIdioma1.setText("Classificação:");

        cboClassificação.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "L", "+10", "+12", "+14", "+16", "+18" }));

        btnLimparCadastro.setText("LIMPAR");
        btnLimparCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCadastroLayout = new javax.swing.GroupLayout(jpCadastro);
        jpCadastro.setLayout(jpCadastroLayout);
        jpCadastroLayout.setHorizontalGroup(
            jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addComponent(btnLimparCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jpCadastroLayout.createSequentialGroup()
                                    .addComponent(lblNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroLayout.createSequentialGroup()
                                    .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEmpresa)
                                        .addComponent(lblTipo)
                                        .addComponent(lblCategoria))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jpCadastroLayout.createSequentialGroup()
                                            .addComponent(rbtnRevista)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbtnJornal))
                                        .addComponent(txtEditora)
                                        .addComponent(txtValor)
                                        .addComponent(txtIdioma)
                                        .addComponent(cboCategoria, 0, 200, Short.MAX_VALUE)))
                                .addComponent(cboClassificação, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIdioma)
                            .addComponent(lblCategoria1)
                            .addComponent(lblIdioma1))
                        .addContainerGap(95, Short.MAX_VALUE))))
        );
        jpCadastroLayout.setVerticalGroup(
            jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa)
                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnRevista)
                        .addComponent(rbtnJornal)))
                .addGap(18, 18, 18)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdioma1)
                    .addComponent(cboClassificação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdioma)
                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca Produto"));

        lblNome1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblNome1.setText("Nome Produto:");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDeletar.setText("DELETAR");

        lblEmpresa1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEmpresa1.setText("Editora:");

        btnAtualiza.setText("ATUALIZAR");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        btnLimparBusca.setText("LIMPAR");
        btnLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaActionPerformed(evt);
            }
        });

        lblTipo1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTipo1.setText("Tipo:");

        lblCategoria2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblCategoria2.setText("Categoria:");

        lblIdioma2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblIdioma2.setText("Classificação:");

        lblIdioma3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblIdioma3.setText("Idioma:");

        lblCategoria3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblCategoria3.setText("Valor:");

        buttonGroup2.add(rbtnRevista1);
        rbtnRevista1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnRevista1.setText("Revista");

        buttonGroup2.add(rbtnJornal1);
        rbtnJornal1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnJornal1.setText("Jornal");

        cboCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Arte & Moda", "Atualidade & Política", "Ciência & Tecnologia", "Educação ", "Esporte & Lazer", "Infantil", "Negócios & Carreras", "Pets", "Saúde", "Viagem & Turismo" }));

        cboClassificação1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "L", "+10", "+12", "+14", "+16", "+18" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNome1)
                                .addComponent(lblEmpresa1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTipo1)
                                .addComponent(lblIdioma2)
                                .addComponent(lblCategoria2)
                                .addComponent(lblIdioma3))
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(txtEditoraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(rbtnRevista1)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbtnJornal1)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(cboCategoria1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtIdioma1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboClassificação1, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                                            .addComponent(txtValor1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnLimparBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(lblCategoria3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa1)
                    .addComponent(txtEditoraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnRevista1)
                        .addComponent(rbtnJornal1))
                    .addComponent(lblTipo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria2)
                    .addComponent(cboCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdioma2)
                    .addComponent(cboClassificação1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdioma3)
                    .addComponent(txtIdioma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria3)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        int status = 0;
        
        conn.conectaBanco();
        
        produto = new Produto();
        produto.setNome_produto(txtNome.getText());
        produto.setEditora(txtEditora.getText());
        if (rbtnJornal.isSelected()) {
            produto.setTipo("Jornal");
        } else if (rbtnRevista.isSelected()) {
            produto.setTipo("Revista");
        }
        produto.setCategoria((String)cboCategoria.getSelectedItem());
        produto.setClassificacao((String)cboClassificação.getSelectedItem());
        produto.setIdioma(txtIdioma.getText());
        produto.setValor(Integer.parseInt(txtValor.getText()));
        
        try {
            status = this.conn.insertSQL("INSERT INTO Produto ("
                    + "nome_produto,"
                    + "editora,"
                    + "tipo,"
                    + "categoria,"
                    + "classificacao,"
                    + "idioma,"
                    + "valor"
                + ") VALUES ("
                    + "'" + produto.getNome_produto()+ "',"
                    + "'" + produto.getEditora()+ "',"
                    + "'" + produto.getTipo()+ "',"
                    + "'" + produto.getCategoria()+ "',"
                    + "'" + produto.getClassificacao()+ "',"
                    + "'" + produto.getIdioma()+ "',"
                    + produto.getValor()
                + ");");
            
            if (status == 1){
                 JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.", "Sucesso.", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Houve algum problema no cadastro do Produto.", "Erro no cadastro." , JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro no cadastro do Produto.", "Erro no cadastro.", JOptionPane.ERROR_MESSAGE);
        } finally {
            conn.fechaBanco();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCadastroActionPerformed
        txtNome.setText("");
        txtEditora.setText("");
        rbtnJornal.setSelected(false);
        rbtnRevista.setSelected(false);
        cboCategoria.setSelectedIndex(0);
        cboClassificação.setSelectedIndex(0);
        txtIdioma.setText("");
        txtValor.setText("");
    }//GEN-LAST:event_btnLimparCadastroActionPerformed

    private void btnLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaActionPerformed
        txtNome1.setText("");
        txtEditoraBusca.setText("");
        rbtnJornal1.setSelected(false);
        rbtnRevista1.setSelected(false);
        cboCategoria1.setSelectedIndex(0);
        cboClassificação1.setSelectedIndex(0);
        txtIdioma1.setText("");
        txtValor1.setText("");
    }//GEN-LAST:event_btnLimparBuscaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        conn.conectaBanco();
        
        produto = new Produto();
        String nomeProduto = txtNome1.getText();
        
        try {
            this.conn.executarSQL("SELECT "
                    + "editora,"
                    + "tipo,"
                    + "categoria,"
                    + "classificacao,"
                    + "idioma,"
                    + "valor"
                 + " FROM"
                     + " Produto"
                 + " WHERE"
                     + " nome_produto LIKE '%" + nomeProduto + "%'"
                + ";"
            );
            
            while (conn.getResultSet().next()) {
                produto.setEditora(conn.getResultSet().getString("editora"));
                produto.setTipo(conn.getResultSet().getString("tipo"));
                produto.setCategoria(conn.getResultSet().getString("categoria"));
                produto.setClassificacao(conn.getResultSet().getString("classificacao"));
                produto.setIdioma(conn.getResultSet().getString("idioma"));
                produto.setValor(Float.parseFloat(conn.getResultSet().getString("valor")));
            }
            
            if (produto.getEditora().equals("")) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.", "Erro na busca", JOptionPane.ERROR_MESSAGE);
            } else {
                txtEditoraBusca.setText(produto.getEditora());
                if (produto.getTipo().equals("Revista")) {
                    rbtnRevista1.setSelected(true);
                    rbtnJornal1.setSelected(false);
                } else if (produto.getTipo().equals("Jornal")) {
                    rbtnJornal1.setSelected(true);
                    rbtnRevista1.setSelected(false);
                }
                
                if (produto.getCategoria().equals("Arte & Moda")) {
                    cboCategoria1.setSelectedIndex(1);
                } else if (produto.getCategoria().equals("Atualidade & Política")) {
                    cboCategoria1.setSelectedIndex(2);
                } else if (produto.getCategoria().equals("Ciência & Tecnologia")) {
                    cboCategoria1.setSelectedIndex(3);
                } else if (produto.getCategoria().equals("Educação")) {
                    cboCategoria1.setSelectedIndex(4);
                } else if (produto.getCategoria().equals("Esporte & Lazer")) {
                    cboCategoria1.setSelectedIndex(5);
                } else if (produto.getCategoria().equals("Infantil")) {
                    cboCategoria1.setSelectedIndex(6);
                } else if (produto.getCategoria().equals("Negócios & Carreras")) {
                    cboCategoria1.setSelectedIndex(7);
                } else if (produto.getCategoria().equals("Pets")) {
                    cboCategoria1.setSelectedIndex(8);
                } else if (produto.getCategoria().equals("Saúde")) {
                    cboCategoria1.setSelectedIndex(9);
                } else if (produto.getCategoria().equals("Viagem & Turismo")) {
                    cboCategoria1.setSelectedIndex(10);
                }
                
                if (produto.getClassificacao().equals("L")) {
                    cboClassificação1.setSelectedIndex(1);
                } else if (produto.getClassificacao().equals("+10")) {
                    cboClassificação1.setSelectedIndex(2);
                } else if (produto.getClassificacao().equals("+12")) {
                    cboClassificação1.setSelectedIndex(3);
                } else if (produto.getClassificacao().equals("+14")) {
                    cboClassificação1.setSelectedIndex(4);
                } else if (produto.getClassificacao().equals("+16")) {
                    cboClassificação1.setSelectedIndex(5);
                } else if (produto.getClassificacao().equals("+18")) {
                    cboClassificação1.setSelectedIndex(6);
                }
                
                txtIdioma1.setText(produto.getIdioma());
                txtValor1.setText(String.valueOf(produto.getValor()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na busca.", "Erro na busca", JOptionPane.ERROR_MESSAGE);
        } finally {
            conn.fechaBanco();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        boolean status = false;
        
        conn.conectaBanco();
        
        String nomeProduto = txtNome1.getText();
        
        produto = new Produto();
        produto.setEditora(txtEditoraBusca.getText());
        if (rbtnJornal1.isSelected()) {
            produto.setTipo("Jornal");
        } else if (rbtnRevista1.isSelected()) {
            produto.setTipo("Revista");
        }
        produto.setCategoria((String)cboCategoria1.getSelectedItem());
        produto.setClassificacao((String)cboClassificação1.getSelectedItem());
        produto.setIdioma(txtIdioma1.getText());
        produto.setValor(Integer.parseInt(txtValor1.getText()));
        
        try {
            status = this.conn.updateSQL("UPDATE Produto SET "
                    + "editora = '" + produto.getEditora() + "',"
                    + "tipo = '" + produto.getTipo()+ "',"
                    + "categoria = '" + produto.getCategoria() + "',"
                    + "classificacao = '" + produto.getClassificacao() + "',"
                    + "idioma = '" + produto.getIdioma() + "',"
                    + "valor = " + produto.getValor()
                + " WHERE "
                    + " nome_produto LIKE '%" + nomeProduto + "%'"
                + ";");
            
            if (status) {
                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso.", "Sucesso.", JOptionPane.DEFAULT_OPTION);
            } else{
                JOptionPane.showMessageDialog(null, "Houve um erro na atualização.", "Erro na atualizaçã.", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na atualização.", "Erro na atualização.", JOptionPane.ERROR_MESSAGE);
        } finally {
            conn.fechaBanco();
        }
    }//GEN-LAST:event_btnAtualizaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimparBusca;
    private javax.swing.JButton btnLimparCadastro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboCategoria1;
    private javax.swing.JComboBox<String> cboClassificação;
    private javax.swing.JComboBox<String> cboClassificação1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpCadastro;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoria1;
    private javax.swing.JLabel lblCategoria2;
    private javax.swing.JLabel lblCategoria3;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblEmpresa1;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblIdioma1;
    private javax.swing.JLabel lblIdioma2;
    private javax.swing.JLabel lblIdioma3;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JRadioButton rbtnJornal;
    private javax.swing.JRadioButton rbtnJornal1;
    private javax.swing.JRadioButton rbtnRevista;
    private javax.swing.JRadioButton rbtnRevista1;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtEditoraBusca;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtIdioma1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor1;
    // End of variables declaration//GEN-END:variables
}
