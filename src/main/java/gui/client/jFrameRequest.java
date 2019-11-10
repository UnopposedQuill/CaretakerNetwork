/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.client;

import database.DatabaseNoSQL;
import java.util.Calendar;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import models.CareService.CareService;
import models.CareService.ClientRequest;
import models.CareService.ServiceByHour;
import models.CareService.ServiceByMonth;
import models.CareTaker;

/**
 *
 * @author Esteban
 */
public class jFrameRequest extends javax.swing.JFrame {

  private jFrameSubscriptions frameSubscriptions;
  private ClientRequest loggedUser;
  
  /**
   * Creates new form jFramePeticionCuido
   * @param frameSubscriptions
   * @param patient
   */
  public jFrameRequest(jFrameSubscriptions frameSubscriptions, ClientRequest patient) {
    initComponents();
    this.frameSubscriptions = frameSubscriptions;
    this.loggedUser = patient;
    
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
    jComboBoxCaretaker = new javax.swing.JComboBox<>();
    jLabelCosto = new javax.swing.JLabel();
    jTextFieldCost = new javax.swing.JTextField();
    jLabelCaretaker = new javax.swing.JLabel();

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

    jComboBoxCaretaker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabelCosto.setText("Current Cost: ");

    jLabelCaretaker.setText("Caretaker:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(125, 125, 125)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabelTitle))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSubscriptionType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSubscriptionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jLabeEndingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabelInitialDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jSpinnerEndingHour, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                  .addComponent(jSpinnerInitialHour))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jComboBoxEndingWeekDay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jComboBoxInitialWeekDay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelCosto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCost, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelCaretaker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCaretaker, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jSpinnerEndingDay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jSpinnerInitialDay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jComboBoxEndingMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jComboBoxInitialMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(layout.createSequentialGroup()
            .addGap(181, 181, 181)
            .addComponent(jButtonCommitRequest)))
        .addContainerGap(131, Short.MAX_VALUE))
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
        .addGap(35, 35, 35)
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
        .addGap(35, 35, 35)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jComboBoxCaretaker, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextFieldCost, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelCaretaker, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButtonCommitRequest)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  //<editor-fold defaultstate="collapsed" desc="Event Handlers">
  private void jButtonCommitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommitRequestActionPerformed
    // I need to push the new request to the database
    DatabaseNoSQL dbns = DatabaseNoSQL.getNoSQLInstance();
    Calendar initialDate = Calendar.getInstance(),
            endingDate = Calendar.getInstance();
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
                null));
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
                null));
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
                null));
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
  
  //</editor-fold>
  
  // <editor-fold defaultstate="collapsed" desc="Private methods">
  /**
   * This method builds a new editor for the subscription column based on a 
   * combobox
   * @return A new cell editor based on the combobox editor
   */
  private DefaultCellEditor getSubscriptionCellEditor(){
    //@TODO: Build subscriptions on actual database data
//    DatabaseNoSQL databaseNoSQL = DatabaseNoSQL.getNoSQLInstance();
//    Object [] subscriptions = databaseNoSQL.getAll(CareTaker.class).toArray();

    //First I need to build an array on the subscription types
    Object [] subscriptions = {
      "Daily",
      "Weekly",
      "Monthly",
      "Nocturnal"
    };
    //Then I build a new ComboBox, which will be use to edit this column
    JComboBox subscriptionComboBox = new JComboBox(subscriptions);

    return new DefaultCellEditor(subscriptionComboBox);
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
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(jFrameRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(jFrameRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(jFrameRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(jFrameRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new jFrameRequest(null, null).setVisible(true);
      }
    });
  }

  // <editor-fold defaultstate="collapsed" desc="Private Variables">
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonCommitRequest;
  private javax.swing.JComboBox<String> jComboBoxCaretaker;
  private javax.swing.JComboBox<String> jComboBoxEndingMonth;
  private javax.swing.JComboBox<String> jComboBoxEndingWeekDay;
  private javax.swing.JComboBox<String> jComboBoxInitialMonth;
  private javax.swing.JComboBox<String> jComboBoxInitialWeekDay;
  private javax.swing.JComboBox<String> jComboBoxSubscriptionType;
  private javax.swing.JLabel jLabeEndingDate;
  private javax.swing.JLabel jLabelCaretaker;
  private javax.swing.JLabel jLabelCosto;
  private javax.swing.JLabel jLabelInitialDate;
  private javax.swing.JLabel jLabelSubscriptionType;
  private javax.swing.JLabel jLabelTitle;
  private javax.swing.JSpinner jSpinnerEndingDay;
  private javax.swing.JSpinner jSpinnerEndingHour;
  private javax.swing.JSpinner jSpinnerInitialDay;
  private javax.swing.JSpinner jSpinnerInitialHour;
  private javax.swing.JTextField jTextFieldCost;
  // End of variables declaration//GEN-END:variables
  
  //</editor-fold>
}
