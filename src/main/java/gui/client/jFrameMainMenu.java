/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.client;

/**
 *
 * @author Esteban
 */
public class jFrameMainMenu extends javax.swing.JFrame {
  
  private jFrameLogin frameLogin;

  /**
   * Creates new form jFrameMainMenu
   * @param frameLogin
   */
  public jFrameMainMenu(jFrameLogin frameLogin) {
    initComponents();
    this.frameLogin = frameLogin;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButtonLogout = new javax.swing.JButton();
    jButtonManageProfile = new javax.swing.JButton();
    jButtonSubscriptions = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Main Menu");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    jButtonLogout.setText("Logout");
    jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonLogoutActionPerformed(evt);
      }
    });

    jButtonManageProfile.setText("Your Profile");
    jButtonManageProfile.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonManageProfileActionPerformed(evt);
      }
    });

    jButtonSubscriptions.setText("Reports");
    jButtonSubscriptions.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonSubscriptionsActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(131, 131, 131)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jButtonManageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButtonSubscriptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(134, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(92, Short.MAX_VALUE)
        .addComponent(jButtonManageProfile)
        .addGap(18, 18, 18)
        .addComponent(jButtonSubscriptions)
        .addGap(104, 104, 104)
        .addComponent(jButtonLogout)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  //<editor-fold defaultstate="collapsed" desc="Event Handlers">
  private void jButtonManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageProfileActionPerformed
    new jFrameProfile().setVisible(true);
  }//GEN-LAST:event_jButtonManageProfileActionPerformed

  private void jButtonSubscriptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubscriptionsActionPerformed
    new jFrameSubscriptions().setVisible(true);
  }//GEN-LAST:event_jButtonSubscriptionsActionPerformed

  private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
    if (this.frameLogin != null) {
      this.frameLogin.setVisible(true);
    }
    this.dispose();
  }//GEN-LAST:event_jButtonLogoutActionPerformed

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if (this.frameLogin != null) {
      this.frameLogin.setVisible(true);
    }
  }//GEN-LAST:event_formWindowClosing
  //</editor-fold>
  
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
      java.util.logging.Logger.getLogger(jFrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(jFrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(jFrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(jFrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new jFrameMainMenu(null).setVisible(true);
      }
    });
  }

  //<editor-fold defaultstate="collapsed" desc="Private Fields">
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonLogout;
  private javax.swing.JButton jButtonManageProfile;
  private javax.swing.JButton jButtonSubscriptions;
  // End of variables declaration//GEN-END:variables
  //</editor-fold>
}