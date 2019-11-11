/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.staff.administrator;

import database.DatabaseNoSQL;
import gui.staff.jFrameMainMenu;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import models.CareTaker;
import models.Employee;
import models.Location;

/**
 *
 * @author Esteban
 */
public class jFrameAddStaff extends javax.swing.JFrame {

  private jFrameMainMenu frameMainMenu;
  
  /**
   * Creates new form jFrameAddStaff
   * @param frameMainMenu
   */
  public jFrameAddStaff(jFrameMainMenu frameMainMenu) {
    initComponents();
    this.frameMainMenu = frameMainMenu;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroupAccountType = new javax.swing.ButtonGroup();
    buttonGroupGender = new javax.swing.ButtonGroup();
    jLabelAccountDetails = new javax.swing.JLabel();
    jTextFieldUsername = new javax.swing.JTextField();
    jLabelUsername = new javax.swing.JLabel();
    jLabelPassword = new javax.swing.JLabel();
    jPasswordField = new javax.swing.JPasswordField();
    jLabelAccountType = new javax.swing.JLabel();
    jRadioButtonAdministrator = new javax.swing.JRadioButton();
    jRadioButtonStaff = new javax.swing.JRadioButton();
    jRadioButtonCaretaker = new javax.swing.JRadioButton();
    jSeparator1 = new javax.swing.JSeparator();
    jButtonAddStaff = new javax.swing.JButton();
    jButtonCancel = new javax.swing.JButton();
    jLabelFullName = new javax.swing.JLabel();
    jTextFieldFullName = new javax.swing.JTextField();
    jLabelPersonalDetails = new javax.swing.JLabel();
    jLabelDateOfBirth = new javax.swing.JLabel();
    jSpinnerDayBirth = new javax.swing.JSpinner();
    jComboBoxMonthBirth = new javax.swing.JComboBox<>();
    jSpinnerYearBirth = new javax.swing.JSpinner();
    jRadioButtonMale = new javax.swing.JRadioButton();
    jRadioButtonFemale = new javax.swing.JRadioButton();
    jLabelLocation = new javax.swing.JLabel();
    jTextFieldLocation = new javax.swing.JTextField();
    jLabelEmail = new javax.swing.JLabel();
    jTextFieldEmail = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Add Staff");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    jLabelAccountDetails.setText("Account Details");

    jLabelUsername.setText("Username");

    jLabelPassword.setText("Password");

    jLabelAccountType.setText("Account Type");

    buttonGroupAccountType.add(jRadioButtonAdministrator);
    jRadioButtonAdministrator.setSelected(true);
    jRadioButtonAdministrator.setText("Administrator");

    buttonGroupAccountType.add(jRadioButtonStaff);
    jRadioButtonStaff.setText("Regular Staff");

    buttonGroupAccountType.add(jRadioButtonCaretaker);
    jRadioButtonCaretaker.setText("Caretaker");

    jButtonAddStaff.setText("Create");
    jButtonAddStaff.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAddStaffActionPerformed(evt);
      }
    });

    jButtonCancel.setText("Cancel");
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCancelActionPerformed(evt);
      }
    });

    jLabelFullName.setText("Full Name");

    jLabelPersonalDetails.setText("PersonalDetails");

    jLabelDateOfBirth.setText("Date of Birth");

    jSpinnerDayBirth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

    jComboBoxMonthBirth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

    jSpinnerYearBirth.setModel(new javax.swing.SpinnerNumberModel(2019, 1900, 2019, 1));

    buttonGroupGender.add(jRadioButtonMale);
    jRadioButtonMale.setSelected(true);
    jRadioButtonMale.setText("Male");

    buttonGroupGender.add(jRadioButtonFemale);
    jRadioButtonFemale.setText("Female");

    jLabelLocation.setText("Location");

    jLabelEmail.setText("Email");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jSeparator1)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelLocation))
                  .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                      .addComponent(jLabelFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jRadioButtonMale)
                      .addComponent(jSpinnerDayBirth))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBoxMonthBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jRadioButtonFemale)
                      .addComponent(jSpinnerYearBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addComponent(jTextFieldLocation)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabelPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(95, 95, 95))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(jLabelAccountDetails))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jRadioButtonAdministrator)
                      .addComponent(jLabelAccountType))
                    .addGap(18, 18, 18)
                    .addComponent(jRadioButtonStaff)
                    .addGap(18, 18, 18)
                    .addComponent(jRadioButtonCaretaker))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jLabelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jTextFieldUsername)
                      .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                      .addComponent(jTextFieldEmail)))))
              .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButtonCancel)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddStaff)))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabelAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addComponent(jLabelAccountType)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jRadioButtonAdministrator)
          .addComponent(jRadioButtonStaff)
          .addComponent(jRadioButtonCaretaker))
        .addGap(16, 16, 16)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelUsername))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelPassword)
          .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelEmail)
          .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(44, 44, 44)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addComponent(jLabelPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelFullName)
          .addComponent(jTextFieldFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSpinnerDayBirth, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jSpinnerYearBirth, javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabelDateOfBirth)
            .addComponent(jComboBoxMonthBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jRadioButtonFemale)
          .addComponent(jRadioButtonMale))
        .addGap(10, 10, 10)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelLocation)
          .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(40, 40, 40)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonAddStaff)
          .addComponent(jButtonCancel))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // <editor-fold defaultstate="collapsed" desc="Event Handlers">
  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if (this.frameMainMenu != null) {
      this.frameMainMenu.setVisible(true);
    }
  }//GEN-LAST:event_formWindowClosing

  private void jButtonAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStaffActionPerformed
    DatabaseNoSQL dnsql = DatabaseNoSQL.getNoSQLInstance();
    Location location = new Location();
    location.setLocation(this.jTextFieldLocation.getText());
    
    if (this.jRadioButtonAdministrator.isSelected()) {
      dnsql.save(new Employee(
          Employee.Privilegios.ADMINISTRATIVO,
          this.jTextFieldFullName.getText(),
          this.jTextFieldUsername.getText(),
          new GregorianCalendar(
                (int)this.jSpinnerYearBirth.getValue(),
                this.jComboBoxMonthBirth.getSelectedIndex(),
                (int)this.jSpinnerDayBirth.getValue()).getTime(),
          location,
          this.jTextFieldEmail.getText(),
          (this.jRadioButtonMale.isSelected() ? "Male" : "Female"),
          String.valueOf(this.jPasswordField.getPassword()))
      );
    } else if (this.jRadioButtonStaff.isSelected()) {
      dnsql.save(new Employee(
          Employee.Privilegios.BACKOFFICE,
          this.jTextFieldFullName.getText(),
          this.jTextFieldUsername.getText(),
          new GregorianCalendar(
                (int)this.jSpinnerYearBirth.getValue(),
                this.jComboBoxMonthBirth.getSelectedIndex(),
                (int)this.jSpinnerDayBirth.getValue()).getTime(),
          location,
          this.jTextFieldEmail.getText(),
          (this.jRadioButtonMale.isSelected() ? "Male" : "Female"),
          String.valueOf(this.jPasswordField.getPassword()))
      );
    } else if (this.jRadioButtonCaretaker.isSelected()) {
      dnsql.save(new CareTaker(
          this.jTextFieldFullName.getText(),
          this.jTextFieldUsername.getText(),
          new GregorianCalendar(
                (int)this.jSpinnerYearBirth.getValue(),
                this.jComboBoxMonthBirth.getSelectedIndex(),
                (int)this.jSpinnerDayBirth.getValue()).getTime(),
          location,
          this.jTextFieldEmail.getText(),
          (this.jRadioButtonMale.isSelected() ? "Male" : "Female"),
          String.valueOf(this.jPasswordField.getPassword()))
      );
    }
    JOptionPane.showMessageDialog(null, "Operation Succesfull, you may close this window");
  }//GEN-LAST:event_jButtonAddStaffActionPerformed

  private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
    //0 OK, 2 Cancel
    if (option == 0) {
      this.dispose();
    }
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
      java.util.logging.Logger.getLogger(jFrameAddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(jFrameAddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(jFrameAddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(jFrameAddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new jFrameAddStaff(null).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroupAccountType;
  private javax.swing.ButtonGroup buttonGroupGender;
  private javax.swing.JButton jButtonAddStaff;
  private javax.swing.JButton jButtonCancel;
  private javax.swing.JComboBox<String> jComboBoxMonthBirth;
  private javax.swing.JLabel jLabelAccountDetails;
  private javax.swing.JLabel jLabelAccountType;
  private javax.swing.JLabel jLabelDateOfBirth;
  private javax.swing.JLabel jLabelEmail;
  private javax.swing.JLabel jLabelFullName;
  private javax.swing.JLabel jLabelLocation;
  private javax.swing.JLabel jLabelPassword;
  private javax.swing.JLabel jLabelPersonalDetails;
  private javax.swing.JLabel jLabelUsername;
  private javax.swing.JPasswordField jPasswordField;
  private javax.swing.JRadioButton jRadioButtonAdministrator;
  private javax.swing.JRadioButton jRadioButtonCaretaker;
  private javax.swing.JRadioButton jRadioButtonFemale;
  private javax.swing.JRadioButton jRadioButtonMale;
  private javax.swing.JRadioButton jRadioButtonStaff;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSpinner jSpinnerDayBirth;
  private javax.swing.JSpinner jSpinnerYearBirth;
  private javax.swing.JTextField jTextFieldEmail;
  private javax.swing.JTextField jTextFieldFullName;
  private javax.swing.JTextField jTextFieldLocation;
  private javax.swing.JTextField jTextFieldUsername;
  // End of variables declaration//GEN-END:variables
}
