package view;

public class ViewSplashScreen extends javax.swing.JFrame {
    Login login;

    public ViewSplashScreen() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        new Thread() {
            public void run() {
                for (int i = 0; i < 101; i++) {
                    try {
                        sleep(10);
                        jpbCarregamento.setValue(i);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    } finally {
                        if (i == 100) {
                            login = new Login();
                            login.setVisible(true);
                            dispose();
                        }                        
                    }
                }

            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpbCarregamento = new javax.swing.JProgressBar();
        jlFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpbCarregamento.setBackground(new java.awt.Color(0, 51, 102));
        jpbCarregamento.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jpbCarregamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 560, 20));

        jlFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Marinho ltda .png"))); // NOI18N
        getContentPane().add(jlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlFundo;
    private javax.swing.JProgressBar jpbCarregamento;
    // End of variables declaration//GEN-END:variables
}
