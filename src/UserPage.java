
import MyFrames.UserListBook;
import MyFrames.AvailableBook;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class UserPage extends javax.swing.JFrame {
    
    String params;
    
    public UserPage() {
        initComponents();
    }
    
    public UserPage(String param){
        initComponents();
        params = param;
    }
    
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        desk = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        SearchButton = new javax.swing.JButton();
        SearchProduct = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("Sales");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Page");

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1349, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(0, 0, 102));
        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/search-32.png"))); // NOI18N
        SearchButton.setText("Available Book");
        SearchButton.setBorder(null);
        SearchButton.setContentAreaFilled(false);
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 150, 40));

        SearchProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchProduct.setForeground(new java.awt.Color(0, 0, 102));
        SearchProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/search-32.png"))); // NOI18N
        SearchProduct.setText("Borrowed Book");
        SearchProduct.setBorder(null);
        SearchProduct.setContentAreaFilled(false);
        SearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchProductActionPerformed(evt);
            }
        });
        jPanel1.add(SearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 150, 40));

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(0, 0, 102));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.setBorder(null);
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 20, 70, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ls-icon1.jpg"))); // NOI18N
        jLabel2.setText("Library System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snowfall-on-light-blue-seamless-loop-christmas-background-4k-4096x2304_nj20ohzxx__F0000.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        AvailableBook ab=new AvailableBook();
        this.desk.add(ab);
        ab.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchProductActionPerformed
        UserListBook pro;
        pro = new UserListBook(params);
        this.desk.add(pro);
        pro.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_SearchProductActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        close();
        UserLogin ul=new UserLogin();
        ul.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SearchProduct;
    private javax.swing.JDesktopPane desk;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
