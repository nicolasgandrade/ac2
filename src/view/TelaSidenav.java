package view;

import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class TelaSidenav extends javax.swing.JFrame {

    public TelaSidenav(JLabel jLabel1, JPanel jPanel2, JPanel jPanel4, JSplitPane jSplitPane1) throws HeadlessException {
        
    }
    
    public TelaSidenav() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnSideNav = new javax.swing.JSplitPane();
        jpMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        jpSide = new javax.swing.JPanel();
        lblFundo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spnSideNav.setPreferredSize(new java.awt.Dimension(1370, 768));

        jpMenu.setBackground(new java.awt.Color(102, 102, 102));
        jpMenu.setPreferredSize(new java.awt.Dimension(330, 768));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANCA DO MARINHO");
        jpMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 90));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banca marinho manu.png"))); // NOI18N
        jpMenu.add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        spnSideNav.setLeftComponent(jpMenu);

        jpSide.setBackground(new java.awt.Color(0, 204, 204));
        jpSide.setMaximumSize(new java.awt.Dimension(1035, 768));
        jpSide.setMinimumSize(new java.awt.Dimension(1035, 768));
        jpSide.setPreferredSize(new java.awt.Dimension(1035, 768));
        jpSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banca marinho side.png"))); // NOI18N
        jpSide.add(lblFundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 790));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpSide;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblFundo2;
    private javax.swing.JSplitPane spnSideNav;
    // End of variables declaration//GEN-END:variables
}
