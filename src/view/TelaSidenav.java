package view;

import java.awt.CardLayout;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class TelaSidenav extends javax.swing.JFrame {
    CardLayout cardLayout;
    RegisterModal registro = new RegisterModal();
    TelaCadastroProduto produto = new TelaCadastroProduto();
    TelaServico servico = new TelaServico();
    TelaSidenav sidenav = new TelaSidenav();
    
    public TelaSidenav(JLabel jLabel1, JPanel jPanel2, JPanel jPanel4, JSplitPane jSplitPane1) throws HeadlessException {
        
    }
    
    public TelaSidenav() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        cardLayout = (CardLayout)(jpSide.getLayout());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnSideNav = new javax.swing.JSplitPane();
        jpMenu = new javax.swing.JPanel();
        lblBanca = new javax.swing.JLabel();
        btnServiço = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();
        jpSide = new javax.swing.JPanel();
        jpPrincipal = new javax.swing.JPanel();
        lblBemVindo = new javax.swing.JLabel();
        lblBancaMarinho = new javax.swing.JLabel();
        lblFundoBemVindo = new javax.swing.JLabel();
        jpUser = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        lblFundoCadastro = new javax.swing.JLabel();
        jpProduto = new javax.swing.JPanel();
        lblProduto = new javax.swing.JLabel();
        lblFundoProduto = new javax.swing.JLabel();
        jpServico = new javax.swing.JPanel();
        lblServico = new javax.swing.JLabel();
        lblFundoServico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spnSideNav.setPreferredSize(new java.awt.Dimension(1370, 768));

        jpMenu.setBackground(new java.awt.Color(102, 102, 102));
        jpMenu.setPreferredSize(new java.awt.Dimension(330, 768));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBanca.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBanca.setForeground(new java.awt.Color(255, 255, 255));
        lblBanca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanca.setText("BANCA DO MARINHO");
        jpMenu.add(lblBanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 90));

        btnServiço.setText("SERVIÇO");
        btnServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiçoActionPerformed(evt);
            }
        });
        jpMenu.add(btnServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 310, 60));

        btnUsuario.setText("USUARIO");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jpMenu.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 310, 60));

        btnProduto.setText("PRODUTO");
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });
        jpMenu.add(btnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 310, 60));

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jpMenu.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 310, 60));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banca marinho manu.png"))); // NOI18N
        jpMenu.add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        spnSideNav.setLeftComponent(jpMenu);

        jpSide.setBackground(new java.awt.Color(0, 204, 204));
        jpSide.setMaximumSize(new java.awt.Dimension(1035, 768));
        jpSide.setMinimumSize(new java.awt.Dimension(1035, 768));
        jpSide.setPreferredSize(new java.awt.Dimension(1035, 768));
        jpSide.setLayout(new java.awt.CardLayout());

        jpPrincipal.setBackground(new java.awt.Color(0, 204, 204));
        jpPrincipal.setMaximumSize(new java.awt.Dimension(1035, 768));
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("BEM - VINDO");
        lblBemVindo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPrincipal.add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1030, -1));

        lblBancaMarinho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBancaMarinho.setForeground(new java.awt.Color(255, 255, 255));
        lblBancaMarinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBancaMarinho.setText("A BANCA DO MARINHO");
        jpPrincipal.add(lblBancaMarinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 190, 290, -1));

        lblFundoBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banca marinho side.png"))); // NOI18N
        lblFundoBemVindo.setText("jLabel2");
        jpPrincipal.add(lblFundoBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpSide.add(jpPrincipal, "card3");

        jpUser.setBackground(new java.awt.Color(0, 204, 204));
        jpUser.setMaximumSize(new java.awt.Dimension(1035, 768));
        jpUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCadastro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastro.setText("CADASTRO USUÁRIO");
        lblCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpUser.add(lblCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1030, -1));

        lblFundoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banca marinho side.png"))); // NOI18N
        lblFundoCadastro.setText("jLabel2");
        jpUser.add(lblFundoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpSide.add(jpUser, "card3");

        jpProduto.setBackground(new java.awt.Color(0, 204, 204));
        jpProduto.setMaximumSize(new java.awt.Dimension(1035, 768));
        jpProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProduto.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduto.setText("CADASTRO PRODUTO");
        lblProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpProduto.add(lblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1030, -1));

        lblFundoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banca marinho side.png"))); // NOI18N
        lblFundoProduto.setText("jLabel2");
        jpProduto.add(lblFundoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpSide.add(jpProduto, "card3");

        jpServico.setBackground(new java.awt.Color(0, 204, 204));
        jpServico.setMaximumSize(new java.awt.Dimension(1035, 768));
        jpServico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblServico.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblServico.setForeground(new java.awt.Color(255, 255, 255));
        lblServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServico.setText("SERVIÇOS");
        lblServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpServico.add(lblServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1030, -1));

        lblFundoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banca marinho side.png"))); // NOI18N
        lblFundoServico.setText("jLabel2");
        jpServico.add(lblFundoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpSide.add(jpServico, "card3");

        spnSideNav.setRightComponent(jpSide);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spnSideNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spnSideNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        cardLayout.show(jpSide, "jpUser");
        registro.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        cardLayout.show(jpSide, "jpProduto");
        produto.setVisible(true);
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiçoActionPerformed
        cardLayout.show(jpSide, "jpServico");
        servico.setVisible(true);
    }//GEN-LAST:event_btnServiçoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed


    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(TelaSidenav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSidenav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSidenav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSidenav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSidenav().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnServiço;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpProduto;
    private javax.swing.JPanel jpServico;
    private javax.swing.JPanel jpSide;
    private javax.swing.JPanel jpUser;
    private javax.swing.JLabel lblBanca;
    private javax.swing.JLabel lblBancaMarinho;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblFundoBemVindo;
    private javax.swing.JLabel lblFundoCadastro;
    private javax.swing.JLabel lblFundoProduto;
    private javax.swing.JLabel lblFundoServico;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblServico;
    private javax.swing.JSplitPane spnSideNav;
    // End of variables declaration//GEN-END:variables
}
