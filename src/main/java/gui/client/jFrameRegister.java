/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.client;

import database.DatabaseNoSQL;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.CareService.CareService;
import models.CareService.ClientRequest;
import models.CareService.Disease;
import models.CareService.Treatment;
import models.Location;
import models.Pacient;
import models.User;

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

    buttonGroupGender = new javax.swing.ButtonGroup();
    buttonGroupGenderBehalf = new javax.swing.ButtonGroup();
    jPasswordField = new javax.swing.JPasswordField();
    jTextFieldEmail = new javax.swing.JTextField();
    jLabelEmail = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jButtonAcceptRequest = new javax.swing.JButton();
    jPasswordFieldConfirm = new javax.swing.JPasswordField();
    jLabel5 = new javax.swing.JLabel();
    jTextFieldUsername = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabelDateOfBirth = new javax.swing.JLabel();
    jComboBoxMonthBirth = new javax.swing.JComboBox<>();
    jSpinnerDayBirth = new javax.swing.JSpinner();
    jSpinnerYearBirth = new javax.swing.JSpinner();
    jLabel4 = new javax.swing.JLabel();
    jButtonCancel = new javax.swing.JButton();
    jTextFieldFullName = new javax.swing.JTextField();
    jLabelFullName = new javax.swing.JLabel();
    jLabelPersonalInformation = new javax.swing.JLabel();
    jLabelCaretakenInformation = new javax.swing.JLabel();
    jLabelAccountInformation = new javax.swing.JLabel();
    jCheckBoxBehalf = new javax.swing.JCheckBox();
    jSpinnerYearBirthBehalf = new javax.swing.JSpinner();
    jTextFieldFullNameBehalf = new javax.swing.JTextField();
    jLabelFullNameBehalf = new javax.swing.JLabel();
    jLabelDateOfBirthBehalf = new javax.swing.JLabel();
    jComboBoxMonthBirthBehalf = new javax.swing.JComboBox<>();
    jSpinnerDayBirthBehalf = new javax.swing.JSpinner();
    jSeparator1 = new javax.swing.JSeparator();
    jSeparator2 = new javax.swing.JSeparator();
    jSeparator4 = new javax.swing.JSeparator();
    jRadioButtonMale = new javax.swing.JRadioButton();
    jRadioButtonFemale = new javax.swing.JRadioButton();
    jRadioButtonMaleBehalf = new javax.swing.JRadioButton();
    jRadioButtonFemaleBehalf = new javax.swing.JRadioButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTableDiseases = new javax.swing.JTable();
    jButtonRemoveDisease = new javax.swing.JButton();
    jButtonAddDisease = new javax.swing.JButton();
    jLabelLocation = new javax.swing.JLabel();
    jTextFieldLocation = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Create New Account");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelEmail.setText("Email");

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Password");

    jButtonAcceptRequest.setText("Accept Request");
    jButtonAcceptRequest.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAcceptRequestActionPerformed(evt);
      }
    });

    jLabel5.setText("Confirm Password");

    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("Username");

    jLabelDateOfBirth.setText("Date of Birth");

    jComboBoxMonthBirth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

    jSpinnerDayBirth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

    jSpinnerYearBirth.setModel(new javax.swing.SpinnerNumberModel(2019, 1900, 2019, 1));

    jLabel4.setText("Reason for Request");

    jButtonCancel.setText("Cancel Request");
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCancelActionPerformed(evt);
      }
    });

    jLabelFullName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelFullName.setText("Full Name");

    jLabelPersonalInformation.setText("Personal Information");

    jLabelCaretakenInformation.setText("Caretaken Information");

    jLabelAccountInformation.setText("Account Information");

    jCheckBoxBehalf.setSelected(true);
    jCheckBoxBehalf.setText("This account is on behalf of:");
    jCheckBoxBehalf.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBoxBehalfActionPerformed(evt);
      }
    });

    jSpinnerYearBirthBehalf.setModel(new javax.swing.SpinnerNumberModel(2019, 1900, 2019, 1));

    jTextFieldFullNameBehalf.setEnabled(jCheckBoxBehalf.isSelected());

    jLabelFullNameBehalf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelFullNameBehalf.setText("Full Name");

    jLabelDateOfBirthBehalf.setText("Date of Birth");

    jComboBoxMonthBirthBehalf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

    jSpinnerDayBirthBehalf.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
    jSpinnerDayBirthBehalf.setEnabled(jCheckBoxBehalf.isSelected());

    jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

    jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

    buttonGroupGender.add(jRadioButtonMale);
    jRadioButtonMale.setSelected(true);
    jRadioButtonMale.setText("Male");

    buttonGroupGender.add(jRadioButtonFemale);
    jRadioButtonFemale.setText("Female");

    buttonGroupGenderBehalf.add(jRadioButtonMaleBehalf);
    jRadioButtonMaleBehalf.setSelected(true);
    jRadioButtonMaleBehalf.setText("Male");
    jRadioButtonMaleBehalf.setEnabled(jCheckBoxBehalf.isSelected());

    buttonGroupGenderBehalf.add(jRadioButtonFemaleBehalf);
    jRadioButtonFemaleBehalf.setText("Female");
    jRadioButtonFemaleBehalf.setEnabled(jCheckBoxBehalf.isSelected());

    jTableDiseases.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null},
        {null},
        {null},
        {null}
      },
      new String [] {
        "Disease"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    jTableDiseases.setColumnSelectionAllowed(true);
    jScrollPane1.setViewportView(jTableDiseases);
    jTableDiseases.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

    jButtonRemoveDisease.setText("Remove Disease");
    jButtonRemoveDisease.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonRemoveDiseaseActionPerformed(evt);
      }
    });

    jButtonAddDisease.setText("Add Disease");
    jButtonAddDisease.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAddDiseaseActionPerformed(evt);
      }
    });

    jLabelLocation.setText("Location");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabelPersonalInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabelFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                  .addComponent(jLabelLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jRadioButtonMale)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(jTextFieldLocation)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jSpinnerDayBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxMonthBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnerYearBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addComponent(jRadioButtonFemale)))
                  .addComponent(jTextFieldFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelAccountInformation))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel6)
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelEmail)
                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jTextFieldEmail)
                  .addComponent(jTextFieldUsername)
                  .addComponent(jPasswordFieldConfirm)
                  .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(jButtonCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAcceptRequest))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                  .addGap(57, 57, 57)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                      .addGap(88, 88, 88)
                      .addComponent(jRadioButtonFemaleBehalf))
                    .addComponent(jRadioButtonMaleBehalf))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelDateOfBirthBehalf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFullNameBehalf, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFullNameBehalf)
                    .addGroup(layout.createSequentialGroup()
                      .addComponent(jCheckBoxBehalf)
                      .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                      .addComponent(jSpinnerDayBirthBehalf, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(jComboBoxMonthBirthBehalf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(jSpinnerYearBirthBehalf, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addComponent(jLabelCaretakenInformation)
                  .addGap(176, 176, 176))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonAddDisease)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoveDisease))
              .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel4))
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18))
          .addComponent(jSeparator1))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelPersonalInformation)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelFullName))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabelDateOfBirth)
              .addComponent(jComboBoxMonthBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jSpinnerDayBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jSpinnerYearBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jRadioButtonMale)
              .addComponent(jRadioButtonFemale))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelLocation)))
          .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelAccountInformation)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabelEmail)
              .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel5)
              .addComponent(jPasswordFieldConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelCaretakenInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxBehalf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabelFullNameBehalf)
                  .addComponent(jTextFieldFullNameBehalf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabelDateOfBirthBehalf)
                  .addComponent(jComboBoxMonthBirthBehalf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jSpinnerDayBirthBehalf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jSpinnerYearBirthBehalf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jRadioButtonMaleBehalf)
                  .addComponent(jRadioButtonFemaleBehalf))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jButtonCancel)
                  .addComponent(jButtonAcceptRequest)))
              .addComponent(jSeparator4)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButtonAddDisease)
              .addComponent(jButtonRemoveDisease))))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // <editor-fold defaultstate="collapsed" desc=" Event Handlers ">
  private void jButtonAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcceptRequestActionPerformed
    
    DatabaseNoSQL dbns = database.DatabaseNoSQL.getNoSQLInstance();
    if (this.jCheckBoxBehalf.isSelected()) {
      Location location = new Location();
      location.setLocation(this.jTextFieldLocation.getText());
      
      ArrayList <Disease> diseases = new ArrayList<>();
      for (int i = 0; i < this.jTableDiseases.getRowCount(); i++) {
        diseases.add(new Disease(this.jTableDiseases.getValueAt(i, 0).toString()));
      }
      
      User guardian = new User(
          this.jTextFieldFullName.getText(),
          this.jTextFieldUsername.getText(),
          new GregorianCalendar(
              (int)this.jSpinnerYearBirth.getValue(),
              this.jComboBoxMonthBirth.getSelectedIndex(),
              (int)this.jSpinnerDayBirth.getValue()).getTime(),
          null,
          this.jTextFieldEmail.getText(),
          this.jRadioButtonMale.isSelected() ? "Male": "Female",
          String.valueOf(this.jPasswordField.getPassword())
      );
      
      dbns.save(new ClientRequest(new Pacient(
              new ArrayList<>(),
              new ArrayList<>(),
              diseases,
              guardian,
              this.jTextFieldFullNameBehalf.getText(),
              null,
              new GregorianCalendar(
                  (int)this.jSpinnerYearBirthBehalf.getValue(),
                  this.jComboBoxMonthBirthBehalf.getSelectedIndex(),
                  (int)this.jSpinnerDayBirthBehalf.getValue()).getTime(),
              location,
              null,
              this.jRadioButtonMaleBehalf.isSelected() ? "Male": "Female",
              null
            )
          ,ClientRequest.StateRequest.ENCURSO
        )
      );
    }else{
      Location location = new Location();
      location.setLocation(this.jTextFieldLocation.getText());
      
      ArrayList <Disease> diseases = new ArrayList<>();
      for (int i = 0; i < this.jTableDiseases.getRowCount(); i++) {
        diseases.add(new Disease(this.jTableDiseases.getValueAt(i, 0).toString()));
      }
      
      dbns.save(new ClientRequest(new Pacient(
              new ArrayList<>(),
              new ArrayList<>(),
              diseases,
              null,
              this.jTextFieldFullName.getText(),
              this.jTextFieldUsername.getText(),
              new GregorianCalendar(
                  (int)this.jSpinnerYearBirth.getValue(),
                  this.jComboBoxMonthBirth.getSelectedIndex(),
                  (int)this.jSpinnerDayBirth.getValue()).getTime(),
              location,
              this.jTextFieldEmail.getText(),
              this.jRadioButtonMale.isSelected() ? "Male": "Female",
              String.valueOf(this.jPasswordField.getPassword())
            )
          ,ClientRequest.StateRequest.ENCURSO
        )
      );
    }
    
    if(this.login != null){
      this.login.setVisible(true);
    }
    this.dispose();
  }//GEN-LAST:event_jButtonAcceptRequestActionPerformed

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

  private void jCheckBoxBehalfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBehalfActionPerformed
    this.jTextFieldFullNameBehalf.setEnabled(this.jCheckBoxBehalf.isSelected());
    this.jSpinnerDayBirthBehalf.setEnabled(this.jCheckBoxBehalf.isSelected());
    this.jComboBoxMonthBirthBehalf.setEnabled(this.jCheckBoxBehalf.isSelected());
    this.jSpinnerYearBirthBehalf.setEnabled(this.jCheckBoxBehalf.isSelected());
    this.jRadioButtonMaleBehalf.setEnabled(this.jCheckBoxBehalf.isSelected());
    this.jRadioButtonFemaleBehalf.setEnabled(this.jCheckBoxBehalf.isSelected());
  }//GEN-LAST:event_jCheckBoxBehalfActionPerformed

  private void jButtonRemoveDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveDiseaseActionPerformed
    int rowsSelected = this.jTableDiseases.getSelectedRowCount();
    if (rowsSelected > 0) {
      int optionSelected = JOptionPane.showConfirmDialog(null, "This will delete ".concat(String.valueOf(rowsSelected)).concat(" rows"), "Confirm", JOptionPane.OK_CANCEL_OPTION);
      //0 for OK, 2 for Cancel
      if (optionSelected == 0) {
        DefaultTableModel dtm = (DefaultTableModel)this.jTableDiseases.getModel();
        for (int i = this.jTableDiseases.getSelectedRows().length-1; i >= 0; i--) {
          int selectedRow = this.jTableDiseases.getSelectedRows()[i];
          dtm.removeRow(selectedRow);
        }
      }
    }
    else{
      JOptionPane.showMessageDialog(null, "Please select at least one row to delete");
    }
  }//GEN-LAST:event_jButtonRemoveDiseaseActionPerformed

  private void jButtonAddDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDiseaseActionPerformed
    DefaultTableModel dtm = (DefaultTableModel) this.jTableDiseases.getModel();
    dtm.addRow(new Object[]{""});
  }//GEN-LAST:event_jButtonAddDiseaseActionPerformed
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
  private javax.swing.ButtonGroup buttonGroupGender;
  private javax.swing.ButtonGroup buttonGroupGenderBehalf;
  private javax.swing.JButton jButtonAcceptRequest;
  private javax.swing.JButton jButtonAddDisease;
  private javax.swing.JButton jButtonCancel;
  private javax.swing.JButton jButtonRemoveDisease;
  private javax.swing.JCheckBox jCheckBoxBehalf;
  private javax.swing.JComboBox<String> jComboBoxMonthBirth;
  private javax.swing.JComboBox<String> jComboBoxMonthBirthBehalf;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabelAccountInformation;
  private javax.swing.JLabel jLabelCaretakenInformation;
  private javax.swing.JLabel jLabelDateOfBirth;
  private javax.swing.JLabel jLabelDateOfBirthBehalf;
  private javax.swing.JLabel jLabelEmail;
  private javax.swing.JLabel jLabelFullName;
  private javax.swing.JLabel jLabelFullNameBehalf;
  private javax.swing.JLabel jLabelLocation;
  private javax.swing.JLabel jLabelPersonalInformation;
  private javax.swing.JPasswordField jPasswordField;
  private javax.swing.JPasswordField jPasswordFieldConfirm;
  private javax.swing.JRadioButton jRadioButtonFemale;
  private javax.swing.JRadioButton jRadioButtonFemaleBehalf;
  private javax.swing.JRadioButton jRadioButtonMale;
  private javax.swing.JRadioButton jRadioButtonMaleBehalf;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSpinner jSpinnerDayBirth;
  private javax.swing.JSpinner jSpinnerDayBirthBehalf;
  private javax.swing.JSpinner jSpinnerYearBirth;
  private javax.swing.JSpinner jSpinnerYearBirthBehalf;
  private javax.swing.JTable jTableDiseases;
  private javax.swing.JTextField jTextFieldEmail;
  private javax.swing.JTextField jTextFieldFullName;
  private javax.swing.JTextField jTextFieldFullNameBehalf;
  private javax.swing.JTextField jTextFieldLocation;
  private javax.swing.JTextField jTextFieldUsername;
  // End of variables declaration//GEN-END:variables
  //</editor-fold>
}
