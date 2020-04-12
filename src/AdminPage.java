
import MyFrames.UserForm;
import MyFrames.BooksForm;
import MyFrames.BorrowForm;
import MyFrames.ReturnForm;
import MyFrames.SearchAllBook;
import MyFrames.SearchAllUser;
import MyFrames.SearchIssuedBook;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class AdminPage extends javax.swing.JFrame {

    public AdminPage() {
        initComponents();
        this.setLocation(300,100);
    }
    
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        Cashview = new javax.swing.JButton();
        StockView = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tran.png"))); // NOI18N
        jButton3.setText("Transaction");
        jButton3.setContentAreaFilled(false);

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sale.png"))); // NOI18N
        jButton5.setText("Sales");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Page");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1544, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1550, 690));

        Cashview.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cashview.setForeground(new java.awt.Color(0, 0, 102));
        Cashview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user1.png"))); // NOI18N
        Cashview.setText("User Form");
        Cashview.setBorder(null);
        Cashview.setContentAreaFilled(false);
        Cashview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashviewActionPerformed(evt);
            }
        });
        getContentPane().add(Cashview, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 50));

        StockView.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StockView.setForeground(new java.awt.Color(0, 0, 102));
        StockView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-book1.png"))); // NOI18N
        StockView.setText("Book Form");
        StockView.setContentAreaFilled(false);
        StockView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockViewActionPerformed(evt);
            }
        });
        getContentPane().add(StockView, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 50));

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(0, 0, 102));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 30, 90, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 29, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ls-icon1.jpg"))); // NOI18N
        jLabel2.setText("Library System");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 70));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrow-book1.png"))); // NOI18N
        jButton2.setText("Borrow Form");
        jButton2.setContentAreaFilled(false);
        jButton2.setHideActionText(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return-book1.png"))); // NOI18N
        jButton4.setText("Return Form");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton6.setText("Issued Book");
        jButton6.setContentAreaFilled(false);
        jButton6.setMaximumSize(new java.awt.Dimension(165, 49));
        jButton6.setMinimumSize(new java.awt.Dimension(165, 49));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, 50));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton7.setText("All Book");
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, 50));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 102));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton8.setText("All User");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snowfall-on-light-blue-seamless-loop-christmas-background-4k-4096x2304_nj20ohzxx__F0000.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CashviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashviewActionPerformed
        UserForm ac=new UserForm();
        this.desktop.add(ac);
        ac.setVisible(true);
    }//GEN-LAST:event_CashviewActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void StockViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockViewActionPerformed
        BooksForm us=new BooksForm();
        this.desktop.add(us);
        us.setVisible(true);  // stock add  TODO add your handling code here:
    }//GEN-LAST:event_StockViewActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        AdminLogin admin=new AdminLogin();
        admin.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BorrowForm bb=new BorrowForm();
        this.desktop.add(bb);
        bb.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ReturnForm rb = new ReturnForm();
        this.desktop.add(rb);
        rb.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SearchIssuedBook ib = new SearchIssuedBook();
        this.desktop.add(ib);
        ib.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        SearchAllBook ab = new SearchAllBook();
        this.desktop.add(ab);
        ab.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        SearchAllUser as = new SearchAllUser();
        this.desktop.add(as);
        as.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cashview;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton StockView;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
  
}
