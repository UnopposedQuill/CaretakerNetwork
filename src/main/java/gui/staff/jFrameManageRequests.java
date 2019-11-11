/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.staff;

import database.DatabaseNoSQL;
import dev.morphia.Datastore;
import dev.morphia.query.Query;
import dev.morphia.query.UpdateOperations;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import models.CareService.CareService;
import models.CareService.ClientRequest;

/**
 *
 * @author Esteban
 */
public class jFrameManageRequests extends javax.swing.JFrame {

  private jFrameMainMenu frameMainMenu;
  
	/**
	 * Creates new form jFrameGestionarSolicitudCuido
   * @param frameMainMenu
	 */
	public jFrameManageRequests(jFrameMainMenu frameMainMenu) {
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

    jScrollPane2 = new javax.swing.JScrollPane();
    jTreeIncomingRequests = new javax.swing.JTree();
    jScrollPane3 = new javax.swing.JScrollPane();
    jTreeActiveSubscriptions = new javax.swing.JTree();
    jScrollPane4 = new javax.swing.JScrollPane();
    jTreeActiveClients = new javax.swing.JTree();
    jScrollPane5 = new javax.swing.JScrollPane();
    jTreeDisposedRequests = new javax.swing.JTree();
    jButtonDisposeElement = new javax.swing.JButton();
    jButtonApproveRequest = new javax.swing.JButton();
    jButtonGoBack = new javax.swing.JButton();
    jButtonRefresh = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Manage Requests");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Incoming Requests");
    javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("New Accounts");
    javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode2.add(treeNode3);
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Subscriptions");
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daily");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Monthly");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Yearly");
    treeNode2.add(treeNode3);
    treeNode1.add(treeNode2);
    jTreeIncomingRequests.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    jScrollPane2.setViewportView(jTreeIncomingRequests);

    treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Active Subscriptions");
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Daily");
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Monthly");
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Yealy");
    treeNode1.add(treeNode2);
    jTreeActiveSubscriptions.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    jScrollPane3.setViewportView(jTreeActiveSubscriptions);

    treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Active Clients");
    jTreeActiveClients.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    jScrollPane4.setViewportView(jTreeActiveClients);

    treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Disposed Requests");
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("New Accounts");
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Old Age");
    javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode3.add(treeNode4);
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Child Caring");
    treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode3.add(treeNode4);
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Another");
    treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode3.add(treeNode4);
    treeNode2.add(treeNode3);
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Subscriptions");
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("NightCaring");
    treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode3.add(treeNode4);
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daily");
    treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode3.add(treeNode4);
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Weekly");
    treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode3.add(treeNode4);
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Monthly");
    treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode3.add(treeNode4);
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Yearly");
    treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("null");
    treeNode3.add(treeNode4);
    treeNode2.add(treeNode3);
    treeNode1.add(treeNode2);
    jTreeDisposedRequests.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    jScrollPane5.setViewportView(jTreeDisposedRequests);

    jButtonDisposeElement.setText("Dispose Element");

    jButtonApproveRequest.setText("Approve Request");
    jButtonApproveRequest.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonApproveRequestActionPerformed(evt);
      }
    });

    jButtonGoBack.setText("Go Back");
    jButtonGoBack.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonGoBackActionPerformed(evt);
      }
    });

    jButtonRefresh.setText("Refresh");
    jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonRefreshActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane2)
          .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jButtonApproveRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButtonDisposeElement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButtonGoBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButtonApproveRequest)
            .addGap(18, 18, 18)
            .addComponent(jButtonDisposeElement)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
          .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButtonRefresh)
            .addGap(18, 18, 18)
            .addComponent(jButtonGoBack)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // <editor-fold defaultstate="collapsed" desc="Event Handlers">
  private void jButtonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoBackActionPerformed
    //@TODO: Add warning for unsaved changes before going back
    if (this.frameMainMenu != null) {
      this.frameMainMenu.setVisible(true);
    }
    this.dispose();
  }//GEN-LAST:event_jButtonGoBackActionPerformed

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if (this.frameMainMenu != null) {
      this.frameMainMenu.setVisible(true);
    }
  }//GEN-LAST:event_formWindowClosing

  private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
    // Repopulate all the trees
    // Declare database endpoint
    DatabaseNoSQL dbns = database.DatabaseNoSQL.getNoSQLInstance();
    
    //<editor-fold defaultstate="collapsed" desc="Incoming Requests">
    DefaultTreeModel dtmIncomingRequests = new DefaultTreeModel(new DefaultMutableTreeNode("Incoming Requests", true), true);
    
    // Incoming Subscriptions
    DefaultMutableTreeNode subscriptionsNode = new DefaultMutableTreeNode("Subscriptions", true),
                    subscriptionDaily = new DefaultMutableTreeNode("Daily", true),
                    subscriptionMonthly = new DefaultMutableTreeNode("Monthly", true),
                    subscriptionYearly = new DefaultMutableTreeNode("Yearly", true);
    subscriptionsNode.add(subscriptionDaily);
    subscriptionsNode.add(subscriptionMonthly);
    subscriptionsNode.add(subscriptionYearly);
    dtmIncomingRequests.insertNodeInto(subscriptionsNode, (DefaultMutableTreeNode)dtmIncomingRequests.getRoot(), 0);
    dbns.getAll(ClientRequest.class)
        .forEach((client)->{
          client.getPacient().getSuscriptions().stream()
              .filter((subscription)->{return subscription.getEstate() == CareService.CareServiceState.AGENDADO;})
              .forEach((subscription)->{
                DefaultMutableTreeNode subscriptionNode = new DefaultMutableTreeNode("Subscription", true);

                subscriptionNode.add(new DefaultMutableTreeNode(client.getId(), false));
                subscriptionNode.add(new DefaultMutableTreeNode(subscription.getId(), false));
                subscriptionNode.add(new DefaultMutableTreeNode(client.getPacient().getName(), false));
                subscriptionNode.add(new DefaultMutableTreeNode(subscription.getType(), false));
                subscriptionNode.add(new DefaultMutableTreeNode(subscription.getDescription(), false));

                switch(subscription.getType()){
                  case PORHORA:{
                    dtmIncomingRequests.insertNodeInto(subscriptionNode, subscriptionDaily, 0);
                    break;
                  }
                  case PORMES:{
                    dtmIncomingRequests.insertNodeInto(subscriptionNode, subscriptionMonthly, 0);
                    break;
                  }
                  case ANIO:{
                    dtmIncomingRequests.insertNodeInto(subscriptionNode, subscriptionYearly, 0);
                    break;
                  }
                }
              });
    });
    
    //Incoming Requests
    dtmIncomingRequests.insertNodeInto(new DefaultMutableTreeNode("New Accounts", true), (DefaultMutableTreeNode)dtmIncomingRequests.getRoot(), 0);
    dbns.getAll(ClientRequest.class).stream().filter((x)->(x.getState() == ClientRequest.StateRequest.ENCURSO)).forEach((x)->{
      DefaultMutableTreeNode clientNode = new DefaultMutableTreeNode("Client", true);
      clientNode.add(new DefaultMutableTreeNode(x.getId(), false));
      clientNode.add(new DefaultMutableTreeNode(x.getPacient().getName(), false));
      clientNode.add(new DefaultMutableTreeNode(x.getPacient().getUsername(), false));
      clientNode.add(new DefaultMutableTreeNode(x.getPacient().getLocation().getLocation(), false));
      DefaultMutableTreeNode diseasesSubnode = new DefaultMutableTreeNode("Diseases", true);
      x.getPacient().getDisease().forEach((y)->{
        diseasesSubnode.add(new DefaultMutableTreeNode(y.getName(), false));
      });
      clientNode.add(diseasesSubnode);
      clientNode.add(new DefaultMutableTreeNode(x.getPacient().getGuardian() == null ? null : x.getPacient().getGuardian().getName(), false));
      dtmIncomingRequests.insertNodeInto(clientNode, (MutableTreeNode)dtmIncomingRequests.getChild(dtmIncomingRequests.getRoot(), 0), 0);
    });
    
    // Commit Refresh
    this.jTreeIncomingRequests.setModel(dtmIncomingRequests);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Active Clients">
    DefaultTreeModel dtmActiveClients = (DefaultTreeModel) this.jTreeActiveClients.getModel();
    
    dbns.getAll(ClientRequest.class).stream().filter((x)->x.getState() == ClientRequest.StateRequest.ACEPTADO)
        .forEach((x)->{
            DefaultMutableTreeNode clientNode = new DefaultMutableTreeNode("Client", true);
            clientNode.add(new DefaultMutableTreeNode(x.getId(), false));
            clientNode.add(new DefaultMutableTreeNode(x.getPacient().getName(), false));
            clientNode.add(new DefaultMutableTreeNode(x.getPacient().getUsername(), false));
            clientNode.add(new DefaultMutableTreeNode(x.getPacient().getLocation().getLocation(), false));
            DefaultMutableTreeNode diseasesSubnode = new DefaultMutableTreeNode("Diseases", true);
            x.getPacient().getDisease().forEach((y)->{
              diseasesSubnode.add(new DefaultMutableTreeNode(y.getName(), false));
            });
            clientNode.add(diseasesSubnode);
            clientNode.add(new DefaultMutableTreeNode(x.getPacient().getGuardian() == null ? null : x.getPacient().getGuardian().getName(), false));
            dtmActiveClients.insertNodeInto(clientNode, (DefaultMutableTreeNode)dtmActiveClients.getRoot(), 0);
          }
        );
    
    // Commit refresh
    this.jTreeActiveClients.setModel(dtmActiveClients);
    //</editor-fold>
    
    // @TODO
    //<editor-fold defaultstate="collapsed" desc="Active Subscriptions">
    
    //</editor-fold>
    
    // @TODO
    //<editor-fold defaultstate="collapsed" desc="Disposed Elements">
    
    //</editor-fold>
  }//GEN-LAST:event_jButtonRefreshActionPerformed

  private void jButtonApproveRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApproveRequestActionPerformed
    if (this.jTreeIncomingRequests.getSelectionCount() > 0) {
      
      // Declare database endpoint
      DatabaseNoSQL dbns = database.DatabaseNoSQL.getNoSQLInstance();
      // I need to check if the request selected is a client or a subscription
      DefaultTreeModel dtmIncomingRequests =  (DefaultTreeModel)this.jTreeIncomingRequests.getModel(),
          dtmAcceptedClients = (DefaultTreeModel) this.jTreeActiveClients.getModel(),
          dtmAcceptedSubscriptions = (DefaultTreeModel) this.jTreeActiveSubscriptions.getModel();
      
      TreePath currentSelectionPath = this.jTreeIncomingRequests.getSelectionPath();
      DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) currentSelectionPath.getLastPathComponent(),
          clientsNode = (DefaultMutableTreeNode) dtmIncomingRequests.getChild(dtmIncomingRequests.getRoot(), 0),
          subscriptionsNode = (DefaultMutableTreeNode) dtmIncomingRequests.getChild(dtmIncomingRequests.getRoot(), 1);
      
      if (selectedNode.isNodeAncestor(clientsNode)) {
        System.out.println("Moving client request to accepted");
        // While I haven't reached to the main node, I need to keep going towards the parent
        while (!selectedNode.toString().equals("Client")) {
          selectedNode = selectedNode.getPreviousNode();
        }
        
        // I reached the main node, I move to the active clients
        dbns.updateByID(ClientRequest.class, selectedNode.getChildAt(0).toString(), "state", ClientRequest.StateRequest.ACEPTADO);
        
        dtmIncomingRequests.removeNodeFromParent(selectedNode);
        dtmAcceptedClients.insertNodeInto(selectedNode, ((DefaultMutableTreeNode)dtmAcceptedClients.getRoot()), 0);
        
      }else if (selectedNode.isNodeAncestor(subscriptionsNode)) {
        System.out.println("Moving subscription request to accepted");
        
        DefaultMutableTreeNode dailyIncomings = (DefaultMutableTreeNode) dtmIncomingRequests.getChild(subscriptionsNode, 0),
            monthlyIncomings = (DefaultMutableTreeNode) dtmIncomingRequests.getChild(subscriptionsNode, 1),
            yearlyIncomings = (DefaultMutableTreeNode) dtmIncomingRequests.getChild(subscriptionsNode, 2);
        
        while (!selectedNode.toString().equals("Subscription")) {
          selectedNode = selectedNode.getPreviousNode();
        }
        
        // I reached the main node, I move to the active clients
        // I need to check its ancestor before doing changes
        if (selectedNode.isNodeAncestor(dailyIncomings)) {
          System.out.println("Moving daily subscription");
    
          List <ClientRequest> clients = dbns.getAll(ClientRequest.class);
          for (ClientRequest client : clients) {
            if (client.getId().equals(selectedNode.getChildAt(0).toString())) {
              for (CareService careService : client.getPacient().getSuscriptions()) {
                if (careService.getId().equals(selectedNode.getChildAt(1).toString())) {
                  careService.setEstate(CareService.CareServiceState.ENCURSO);
                  dbns.updateByID(ClientRequest.class, selectedNode.getChildAt(0).toString(), "pacient.suscriptions", client.getPacient().getSuscriptions());
                }
              }
            }
          }
        
          dtmIncomingRequests.removeNodeFromParent(selectedNode);
          dtmAcceptedSubscriptions.insertNodeInto(selectedNode, ((DefaultMutableTreeNode)dtmAcceptedSubscriptions.getRoot()), 0);
          
        } else if (selectedNode.isNodeAncestor(monthlyIncomings)){
          System.out.println("Moving monthly subscription");
          
          List <ClientRequest> clients = dbns.getAll(ClientRequest.class);
          for (ClientRequest client : clients) {
            if (client.getId().equals(selectedNode.getChildAt(0).toString())) {
              for (CareService careService : client.getPacient().getSuscriptions()) {
                if (careService.getId().equals(selectedNode.getChildAt(1).toString())) {
                  careService.setEstate(CareService.CareServiceState.ENCURSO);
                  dbns.updateByID(ClientRequest.class, selectedNode.getChildAt(0).toString(), "pacient.suscriptions", client.getPacient().getSuscriptions());
                }
              }
            }
          }
        
          dtmIncomingRequests.removeNodeFromParent(selectedNode);
          dtmAcceptedSubscriptions.insertNodeInto(selectedNode, ((DefaultMutableTreeNode)dtmAcceptedSubscriptions.getRoot()), 1);
          
        } else if (selectedNode.isNodeAncestor(yearlyIncomings)){
          System.out.println("Moving yearly subscription");
          
          List <ClientRequest> clients = dbns.getAll(ClientRequest.class);
          for (ClientRequest client : clients) {
            if (client.getId().equals(selectedNode.getChildAt(0).toString())) {
              for (CareService careService : client.getPacient().getSuscriptions()) {
                if (careService.getId().equals(selectedNode.getChildAt(1).toString())) {
                  careService.setEstate(CareService.CareServiceState.ENCURSO);
                  dbns.updateByID(ClientRequest.class, selectedNode.getChildAt(0).toString(), "pacient.suscriptions", client.getPacient().getSuscriptions());
                }
              }
            }
          }
        
          dtmIncomingRequests.removeNodeFromParent(selectedNode);
          dtmAcceptedSubscriptions.insertNodeInto(selectedNode, ((DefaultMutableTreeNode)dtmAcceptedSubscriptions.getRoot()), 2);
          
        }
        
      }
    }
    else{
      JOptionPane.showMessageDialog(null, "Please select at least 1 element");
    }
    
    
  }//GEN-LAST:event_jButtonApproveRequestActionPerformed

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
			java.util.logging.Logger.getLogger(jFrameManageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(jFrameManageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(jFrameManageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(jFrameManageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new jFrameManageRequests(null).setVisible(true);
			}
		});
	}

  //<editor-fold defaultstate="">
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonApproveRequest;
  private javax.swing.JButton jButtonDisposeElement;
  private javax.swing.JButton jButtonGoBack;
  private javax.swing.JButton jButtonRefresh;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JTree jTreeActiveClients;
  private javax.swing.JTree jTreeActiveSubscriptions;
  private javax.swing.JTree jTreeDisposedRequests;
  private javax.swing.JTree jTreeIncomingRequests;
  // End of variables declaration//GEN-END:variables
}
