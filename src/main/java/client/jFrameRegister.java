/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Esteban
 */
public class jFrameRegister extends javax.swing.JFrame {

  private jFrameLogin login;
  /**
   * Creates new form jFrameRegistro
   * @param login The invoking Frame
   */
  public jFrameRegister(jFrameLogin login) {
    initComponents();
    this.login = login;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jPasswordField = new javax.swing.JPasswordField();
    jTextFieldFullName = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jButtonCommitRequest = new javax.swing.JButton();
    jPasswordFieldConfirm = new javax.swing.JPasswordField();
    jLabel5 = new javax.swing.JLabel();
    jTextFieldUsername = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jComboBoxMonthBirth = new javax.swing.JComboBox<>();
    jSpinnerDayBirth = new javax.swing.JSpinner();
    jSpinnerYearBirth = new javax.swing.JSpinner();
    jComboBoxRequestReason = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    jTextFieldSpecify = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextAreaReasonElaborate = new javax.swing.JTextArea();
    jLabel7 = new javax.swing.JLabel();
    jButtonCancel = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Create New Account");

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Full Name");

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Password");

    jButtonCommitRequest.setText("Commit Request");
    jButtonCommitRequest.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCommitRequestActionPerformed(evt);
      }
    });

    jLabel5.setText("Confirm Password");

    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("Username");

    jLabel8.setText("Date of Birth");

    jComboBoxMonthBirth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

    jSpinnerDayBirth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

    jSpinnerYearBirth.setModel(new javax.swing.SpinnerNumberModel(2019, 1900, 2019, 1));

    jComboBoxRequestReason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disease", "Old Age Caretaking", "Child Caretaking", "Another", " " }));
    jComboBoxRequestReason.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jComboBoxRequestReasonActionPerformed(evt);
      }
    });

    jLabel4.setText("Reason for Request");

    jTextFieldSpecify.setEnabled(false);

    jTextAreaReasonElaborate.setColumns(20);
    jTextAreaReasonElaborate.setRows(5);
    jScrollPane1.setViewportView(jTextAreaReasonElaborate);

    jLabel7.setText("Elaborate Reason");

    jButtonCancel.setText("Cancel Request");
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCancelActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(153, 153, 153))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel8)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jTextFieldFullName, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jPasswordFieldConfirm, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jPasswordField)
              .addComponent(jTextFieldUsername)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBoxRequestReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSpecify, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane1)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jSpinnerDayBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxMonthBirth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerYearBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGap(115, 115, 115)
            .addComponent(jButtonCancel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonCommitRequest)))
        .addContainerGap(86, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(34, 34, 34)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(jComboBoxMonthBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jSpinnerDayBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jSpinnerYearBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jComboBoxRequestReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4))
          .addComponent(jTextFieldSpecify))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel7)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(jPasswordFieldConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonCancel)
          .addComponent(jButtonCommitRequest))
        .addGap(40, 40, 40))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // <editor-fold defaultstate="collapsed" desc=" Event Handlers ">
  private void jButtonCommitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommitRequestActionPerformed
    //@TODO: Implement commit request and handle errors before disposing
    if(this.login != null){
      this.login.setVisible(true);
    }
    this.dispose();
  }//GEN-LAST:event_jButtonCommitRequestActionPerformed

  private void jComboBoxRequestReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRequestReasonActionPerformed
    this.jTextFieldSpecify.setEnabled(this.jComboBoxRequestReason.getSelectedItem().toString().equals("Another"));
  }//GEN-LAST:event_jComboBoxRequestReasonActionPerformed

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if(this.login != null){
      this.login.setVisible(true);
    }
  }//GEN-LAST:event_formWindowClosing

  private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
    if(this.login != null){
      this.login.setVisible(true);
    }
    this.dispose();
  }//GEN-LAST:event_jButtonCancelActionPerformed
  // </editor-fold>

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
      java.util.logging.Logger.getLogger(jFrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(jFrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(jFrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(jFrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new jFrameRegister(null).setVisible(true);
    });
  }

  //<editor-fold defaultstate="collapsed" desc=" JFrame Variables Declarations ">
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonCancel;
  private javax.swing.JButton jButtonCommitRequest;
  private javax.swing.JComboBox<String> jComboBoxMonthBirth;
  private javax.swing.JComboBox<String> jComboBoxRequestReason;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPasswordField jPasswordField;
  private javax.swing.JPasswordField jPasswordFieldConfirm;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSpinner jSpinnerDayBirth;
  private javax.swing.JSpinner jSpinnerYearBirth;
  private javax.swing.JTextArea jTextAreaReasonElaborate;
  private javax.swing.JTextField jTextFieldFullName;
  private javax.swing.JTextField jTextFieldSpecify;
  private javax.swing.JTextField jTextFieldUsername;
  // End of variables declaration//GEN-END:variables
  //</editor-fold>
}
