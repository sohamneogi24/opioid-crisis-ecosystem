/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.adminrole.drugenforcementadministration;

import com.neu.business.enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Soham
 */
public class DEAAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DEAAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public DEAAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
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
        manageDEAOrgJButton = new javax.swing.JButton();
        manageDEAEmpJButton = new javax.swing.JButton();
        manageDEAUsersJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DEA Admin Work Area");

        manageDEAOrgJButton.setText("Manage Organization");
        manageDEAOrgJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDEAOrgJButtonActionPerformed(evt);
            }
        });

        manageDEAEmpJButton.setText("Manage Employee");
        manageDEAEmpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDEAEmpJButtonActionPerformed(evt);
            }
        });

        manageDEAUsersJButton.setText("Manage User Account");
        manageDEAUsersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDEAUsersJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(manageDEAOrgJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageDEAUsersJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                        .addComponent(manageDEAEmpJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(573, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(manageDEAOrgJButton)
                .addGap(25, 25, 25)
                .addComponent(manageDEAEmpJButton)
                .addGap(25, 25, 25)
                .addComponent(manageDEAUsersJButton)
                .addContainerGap(369, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageDEAOrgJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDEAOrgJButtonActionPerformed
        // TODO add your handling code here:

        ManageDEAOrganizationJPanel manageDEAOrganizationJPanel = new ManageDEAOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageDEAOrganizationJPanel", manageDEAOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDEAOrgJButtonActionPerformed

    private void manageDEAEmpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDEAEmpJButtonActionPerformed
        // TODO add your handling code here:
        ManageDEAEmployeeJPanel manageDEAEmployeeJPanel = new ManageDEAEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageDEAEmployeeJPanel", manageDEAEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageDEAEmpJButtonActionPerformed

    private void manageDEAUsersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDEAUsersJButtonActionPerformed
        // TODO add your handling code here:

        ManageDEAUserAccountJPanel manageDEAUserAccountJPanel = new ManageDEAUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageDEAUserAccountJPanel", manageDEAUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageDEAUsersJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageDEAEmpJButton;
    private javax.swing.JButton manageDEAOrgJButton;
    private javax.swing.JButton manageDEAUsersJButton;
    // End of variables declaration//GEN-END:variables
}
