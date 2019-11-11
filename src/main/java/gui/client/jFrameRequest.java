/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.client;

import database.DatabaseNoSQL;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.CareService.CareService;
import models.CareService.ClientRequest;
import models.CareService.ServiceByHour;
import models.CareService.ServiceByMonth;
import models.CareTaker;
import models.Clinic;
import models.Employee;

/**
 *
 * @author Esteban
 */
public class jFrameRequest extends javax.swing.JFrame {

  private final jFrameSubscriptions frameSubscriptions;
  private final ClientRequest loggedUser;
  
  /**
   * Creates new form jFramePeticionCuido
   * @param frameSubscriptions
   * @param patient
   */
  public jFrameRequest(jFrameSubscriptions frameSubscriptions, ClientRequest patient) {
    initComponents();
    this.frameSubscriptions = frameSubscriptions;
    this.loggedUser = patient;
    
    this.getCaretakers();
    
    this.jSpinnerInitialHour.setEnabled(true);
    this.jSpinnerEndingHour.setEnabled(true);
    this.jComboBoxInitialWeekDay.setEnabled(true);
    this.jComboBoxEndingWeekDay.setEnabled(true);
    this.jSpinnerInitialDay.setEnabled(false);
    this.jSpinnerEndingDay.setEnabled(false);
    this.jComboBoxInitialMonth.setEnabled(false);
    this.jComboBoxEndingMonth.setEnabled(false);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabelTitle = new javax.swing.JLabel();
    jLabelSubscriptionType = new javax.swing.JLabel();
    jComboBoxSubscriptionType = new javax.swing.JComboBox<>();
    jButtonCommitRequest = new javax.swing.JButton();
    jLabelInitialDate = new javax.swing.JLabel();
    jComboBoxInitialMonth = new javax.swing.JComboBox<>();
    jSpinnerInitialDay = new javax.swing.JSpinner();
    jLabeEndingDate = new javax.swing.JLabel();
    jComboBoxEndingMonth = new javax.swing.JComboBox<>();
    jSpinnerEndingDay = new javax.swing.JSpinner();
    jSpinnerInitialHour = new javax.swing.JSpinner();
    jSpinnerEndingHour = new javax.swing.JSpinner();
    jComboBoxInitialWeekDay = new javax.swing.JComboBox<>();
    jComboBoxEndingWeekDay = new javax.swing.JComboBox<>();
    jLabelCaretaker = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTableCaretakers = new javax.swing.JTable();
    jButtonCancel = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Create New Subscription Request");

    jLabelTitle.setText("Request Caretaking");

    jLabelSubscriptionType.setText("What is the type of subscription?");

    jComboBoxSubscriptionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Monthly", "Yearly" }));
    jComboBoxSubscriptionType.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jComboBoxSubscriptionTypeActionPerformed(evt);
      }
    });

    jButtonCommitRequest.setBackground(new java.awt.Color(51, 204, 0));
    jButtonCommitRequest.setText("Commit Request");
    jButtonCommitRequest.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCommitRequestActionPerformed(evt);
      }
    });

    jLabelInitialDate.setText("Initial Date");

    jComboBoxInitialMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

    jSpinnerInitialDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

    jLabeEndingDate.setText("Ending Date");

    jComboBoxEndingMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

    jSpinnerEndingDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

    jSpinnerInitialHour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

    jSpinnerEndingHour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

    jComboBoxInitialWeekDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", " " }));

    jComboBoxEndingWeekDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", " " }));

    jLabelCaretaker.setText("Caretaker");

    jTableCaretakers.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "ID", "Name", "Price", "Clinic", "Rating Average"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTableCaretakers.setColumnSelectionAllowed(true);
    jScrollPane1.setViewportView(jTableCaretakers);
    jTableCaretakers.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

    jButtonCancel.setBackground(new java.awt.Color(255, 0, 0));
    jButtonCancel.setText("Cancel");
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCancelActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(133, 133, 133)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(113, 113, 113)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabelTitle))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSubscriptionType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSubscriptionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabeEndingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabelInitialDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jSpinnerEndingHour)
              .addComponent(jSpinnerInitialHour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jComboBoxEndingWeekDay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jComboBoxInitialWeekDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jSpinnerEndingDay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jSpinnerInitialDay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jComboBoxEndingMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jComboBoxInitialMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(213, 213, 213)
            .addComponent(jLabelCaretaker, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 244, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(240, 240, 240)
        .addComponent(jButtonCancel)
        .addGap(18, 18, 18)
        .addComponent(jButtonCommitRequest)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelSubscriptionType)
          .addComponent(jComboBoxSubscriptionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabelInitialDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jSpinnerInitialDay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSpinnerInitialHour, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(jComboBoxInitialWeekDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jComboBoxInitialMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabeEndingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jSpinnerEndingHour, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jSpinnerEndingDay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComboBoxEndingWeekDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComboBoxEndingMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jLabelCaretaker, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonCommitRequest)
          .addComponent(jButtonCancel))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  //<editor-fold defaultstate="collapsed" desc="Event Handlers">
  private void jButtonCommitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommitRequestActionPerformed
    
    if (this.jTableCaretakers.getSelectedRowCount()> 0) {
      // I need to push the new request to the database
      DatabaseNoSQL dbns = DatabaseNoSQL.getNoSQLInstance();
      Calendar initialDate = Calendar.getInstance(),
              endingDate = Calendar.getInstance();
      List <CareTaker> careTakers = dbns.getAll(CareTaker.class);
      CareTaker careTaker = null;
      String selectedID = this.jTableCaretakers.getModel().getValueAt(this.jTableCaretakers.getSelectedRows()[0], 0).toString();
      for (CareTaker careTaker1 : careTakers) {
        if (careTaker1.getId().equals(selectedID)) {
          careTaker = careTaker1;
        }
      }
      
      switch(this.jComboBoxSubscriptionType.getSelectedItem().toString()){
        case "Daily":{
          initialDate.set(Calendar.HOUR_OF_DAY, (int)this.jSpinnerInitialHour.getValue());
          initialDate.set(Calendar.DAY_OF_WEEK, this.jComboBoxInitialWeekDay.getSelectedIndex());

          endingDate.set(Calendar.HOUR_OF_DAY, (int)this.jSpinnerEndingHour.getValue());
          endingDate.set(Calendar.DAY_OF_WEEK, this.jComboBoxEndingWeekDay.getSelectedIndex());
          this.loggedUser.getPacient().getSuscriptions().add(
              new ServiceByHour(Calendar.getInstance().getTime(),
                  initialDate.getTime(),
                  endingDate.getTime(),
                  CareService.CareServiceState.AGENDADO,
                  "N/A",
                  500,
                  null,
                  careTaker
              ));
          break;
        }
        case "Monthly":{
          initialDate.set(Calendar.HOUR_OF_DAY, (int)this.jSpinnerInitialHour.getValue());
          initialDate.set(Calendar.DAY_OF_MONTH, (int)this.jSpinnerInitialDay.getValue());

          endingDate.set(Calendar.HOUR_OF_DAY, (int)this.jSpinnerEndingHour.getValue());
          endingDate.set(Calendar.DAY_OF_MONTH, (int)this.jSpinnerEndingHour.getValue());
          this.loggedUser.getPacient().getSuscriptions().add(
              new ServiceByMonth(Calendar.getInstance().getTime(),
                  initialDate.getTime(),
                  endingDate.getTime(),
                  CareService.CareServiceState.AGENDADO,
                  "N/A",
                  500,
                  null,
                  careTaker
              ));
          break;
        }
        case "Yearly":{
          initialDate.set(Calendar.HOUR_OF_DAY, (int)this.jSpinnerInitialHour.getValue());
          initialDate.set(Calendar.DAY_OF_MONTH, (int)this.jSpinnerInitialDay.getValue());
          initialDate.set(Calendar.MONTH, this.jComboBoxInitialMonth.getSelectedIndex());

          endingDate.set(Calendar.HOUR_OF_DAY, (int)this.jSpinnerEndingHour.getValue());
          endingDate.set(Calendar.DAY_OF_MONTH, (int)this.jSpinnerEndingHour.getValue());
          endingDate.set(Calendar.MONTH, this.jComboBoxEndingMonth.getSelectedIndex());
          this.loggedUser.getPacient().getSuscriptions().add(
              new ServiceByMonth(Calendar.getInstance().getTime(),
                  initialDate.getTime(),
                  endingDate.getTime(),
                  CareService.CareServiceState.AGENDADO,
                  "N/A",
                  500,
                  null,
                  careTaker
              ));
          break;
        }
        default:{
          break;
        }
      }
      System.out.println(this.loggedUser.getPacient().getSuscriptions());
      dbns.updateByID(ClientRequest.class, this.loggedUser.getId(), "pacient.suscriptions", this.loggedUser.getPacient().getSuscriptions());

      // I need to add it to the subscriptions Frame
      if (this.frameSubscriptions != null) {
        this.frameSubscriptions.updateSubscriptionData();
      }
    }
    else{
      JOptionPane.showMessageDialog(null, "Please select a CareTaker");
    }
  }//GEN-LAST:event_jButtonCommitRequestActionPerformed

  private void jComboBoxSubscriptionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSubscriptionTypeActionPerformed
    switch (this.jComboBoxSubscriptionType.getSelectedItem().toString()) {
      case "Daily":
        this.jSpinnerInitialHour.setEnabled(true);
        this.jSpinnerEndingHour.setEnabled(true);
        this.jComboBoxInitialWeekDay.setEnabled(true);
        this.jComboBoxEndingWeekDay.setEnabled(true);
        this.jSpinnerInitialDay.setEnabled(false);
        this.jSpinnerEndingDay.setEnabled(false);
        this.jComboBoxInitialMonth.setEnabled(false);
        this.jComboBoxEndingMonth.setEnabled(false);
        break;
      case "Monthly":
        this.jSpinnerInitialHour.setEnabled(true);
        this.jSpinnerEndingHour.setEnabled(true);
        this.jComboBoxInitialWeekDay.setEnabled(false);
        this.jComboBoxEndingWeekDay.setEnabled(false);
        this.jSpinnerInitialDay.setEnabled(true);
        this.jSpinnerEndingDay.setEnabled(true);
        this.jComboBoxInitialMonth.setEnabled(false);
        this.jComboBoxEndingMonth.setEnabled(false);
        break;
      case "Yearly":
        this.jSpinnerInitialHour.setEnabled(true);
        this.jSpinnerEndingHour.setEnabled(true);
        this.jComboBoxInitialWeekDay.setEnabled(false);
        this.jComboBoxEndingWeekDay.setEnabled(false);
        this.jSpinnerInitialDay.setEnabled(true);
        this.jSpinnerEndingDay.setEnabled(true);
        this.jComboBoxInitialMonth.setEnabled(true);
        this.jComboBoxEndingMonth.setEnabled(true);
        break;
      default:
        break;
    }
  }//GEN-LAST:event_jComboBoxSubscriptionTypeActionPerformed

  private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
    //0 OK, 2 Cancel
    if (option == 0) {
      this.dispose();
    }
  }//GEN-LAST:event_jButtonCancelActionPerformed
  
  //</editor-fold>
  
  // <editor-fold defaultstate="collapsed" desc="Private methods">
  private void getCaretakers(){
    DatabaseNoSQL databaseNoSQL = DatabaseNoSQL.getNoSQLInstance();
    
    String [] columns = {
      "Id",
      "Name",
      "Price",
      "Clinic",
      "Rating Average"
    };
    
    List <Clinic> clinics = databaseNoSQL.getAll(Clinic.class);
    int clinicCareTakerCount = clinics.stream()
        .mapToInt(clinic->{
          if (clinic.getEmployees() == null) {
            return 0;
          }
          return clinic.getEmployees().stream().mapToInt(employee->{
            return employee.getPrivilegio() == Employee.Privilegios.CARETAKER ? 1 : 0;
          }).sum();
        }).sum();
    
    Object [][] data = new Object[clinicCareTakerCount][columns.length];
    
    int insertPosition = 0;
    for (int i = 0; i < clinics.size(); i++) {
      Clinic get = clinics.get(i);
      for (int j = 0; j < (get.getEmployees() == null ? 0 : get.getEmployees().size()); j++) {
        Employee e = get.getEmployees().get(j);
        if (e instanceof CareTaker && e.getPrivilegio() == Employee.Privilegios.CARETAKER) {
          CareTaker careTaker = (CareTaker) e;
          data[insertPosition][0] = careTaker.getId();
          data[insertPosition][1] = careTaker.getName();
          data[insertPosition][2] = careTaker.getEspecialities() == null ? 1000 : careTaker.getCost();
          data[insertPosition][3] = get.getName();
          data[insertPosition++][4] = careTaker.getScores() == null ? "Unrated" : careTaker.getRatingAverage();
        }
      }
    }
    
    
    this.jTableCaretakers.setModel(new DefaultTableModel(data, columns));
  }
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
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(jFrameRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new jFrameRequest(null, null).setVisible(true);
    });
  }

  // <editor-fold defaultstate="collapsed" desc="Private Variables">
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonCancel;
  private javax.swing.JButton jButtonCommitRequest;
  private javax.swing.JComboBox<String> jComboBoxEndingMonth;
  private javax.swing.JComboBox<String> jComboBoxEndingWeekDay;
  private javax.swing.JComboBox<String> jComboBoxInitialMonth;
  private javax.swing.JComboBox<String> jComboBoxInitialWeekDay;
  private javax.swing.JComboBox<String> jComboBoxSubscriptionType;
  private javax.swing.JLabel jLabeEndingDate;
  private javax.swing.JLabel jLabelCaretaker;
  private javax.swing.JLabel jLabelInitialDate;
  private javax.swing.JLabel jLabelSubscriptionType;
  private javax.swing.JLabel jLabelTitle;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSpinner jSpinnerEndingDay;
  private javax.swing.JSpinner jSpinnerEndingHour;
  private javax.swing.JSpinner jSpinnerInitialDay;
  private javax.swing.JSpinner jSpinnerInitialHour;
  private javax.swing.JTable jTableCaretakers;
  // End of variables declaration//GEN-END:variables
  
  //</editor-fold>
}
