/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.adminrole.pharmaceuticalcompany;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.PharmaceuticalCompanyEnterprise;
import com.neu.business.opioids.Opioids;
import com.sun.glass.events.KeyEvent;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Soham
 */
public class PharmaceuticalCompanyAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmaceuticalCompanyAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private PharmaceuticalCompanyEnterprise enterprise;

    public PharmaceuticalCompanyAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = (PharmaceuticalCompanyEnterprise) enterprise;
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
        managePharmaceuticalOrgJButton = new javax.swing.JButton();
        managePharmaceuticalEmpJButton = new javax.swing.JButton();
        managePharmaceuticalUsersJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSet = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOpioidName = new javax.swing.JTextField();
        txtProductionStock = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pharmaceutical Company Admin Work Area");

        managePharmaceuticalOrgJButton.setText("Manage Organization");
        managePharmaceuticalOrgJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmaceuticalOrgJButtonActionPerformed(evt);
            }
        });

        managePharmaceuticalEmpJButton.setText("Manage Employee");
        managePharmaceuticalEmpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmaceuticalEmpJButtonActionPerformed(evt);
            }
        });

        managePharmaceuticalUsersJButton.setText("Manage User Account");
        managePharmaceuticalUsersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmaceuticalUsersJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Initialize Opioid Production"));

        btnSet.setText("Set ");
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        jLabel2.setText("Opioid name: ");

        jLabel3.setText("Production Stock");

        txtProductionStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductionStockKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductionStockKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSet))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductionStock, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtOpioidName))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOpioidName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProductionStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnSet)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(managePharmaceuticalOrgJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(managePharmaceuticalEmpJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(managePharmaceuticalUsersJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(690, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(managePharmaceuticalOrgJButton)
                .addGap(40, 40, 40)
                .addComponent(managePharmaceuticalEmpJButton)
                .addGap(32, 32, 32)
                .addComponent(managePharmaceuticalUsersJButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePharmaceuticalOrgJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmaceuticalOrgJButtonActionPerformed
        // TODO add your handling code here:

        ManagePharmaceuticalOrganizationJPanel managePharmaceuticalOrganizationJPanel = new ManagePharmaceuticalOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("managePharmaceuticalOrganizationJPanel", managePharmaceuticalOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePharmaceuticalOrgJButtonActionPerformed

    private void managePharmaceuticalEmpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmaceuticalEmpJButtonActionPerformed
        // TODO add your handling code here:
        ManagePharmaceuticalEmployeeJPanel managePharmaceuticalEmployeeJPanel = new ManagePharmaceuticalEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("managePharmaceuticalEmployeeJPanel", managePharmaceuticalEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_managePharmaceuticalEmpJButtonActionPerformed

    private void managePharmaceuticalUsersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmaceuticalUsersJButtonActionPerformed
        // TODO add your handling code here:

        ManagePharmaceuticalUserAccountJPanel managePharmaceuticalUserAccountJPanel = new ManagePharmaceuticalUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("managePharmaceuticalUserAccountJPanel", managePharmaceuticalUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_managePharmaceuticalUsersJButtonActionPerformed

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        // TODO add your handling code here:
        if (txtOpioidName.getText() == null || txtProductionStock.getText() == null) {
            JOptionPane.showMessageDialog(null, "Kindly enter all the fields!");
        } else {
            enterprise.setOpioidName(txtOpioidName.getText());
            enterprise.setStock(Integer.parseInt(txtProductionStock.getText()));
            JOptionPane.showMessageDialog(null, "Stock set!");
        }
    }//GEN-LAST:event_btnSetActionPerformed

    private void txtProductionStockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductionStockKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductionStockKeyPressed

    private void txtProductionStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductionStockKeyTyped
        // TODO add your handling code here:

        char charEntered = evt.getKeyChar();
        // Accept only Number/ Backspace/ Delete
        if (!(Character.isDigit(charEntered)) || charEntered == KeyEvent.VK_BACKSPACE || charEntered == KeyEvent.VK_DELETE) {
            if (txtProductionStock.getText().length() < 8) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtProductionStockKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton managePharmaceuticalEmpJButton;
    private javax.swing.JButton managePharmaceuticalOrgJButton;
    private javax.swing.JButton managePharmaceuticalUsersJButton;
    private javax.swing.JTextField txtOpioidName;
    private javax.swing.JTextField txtProductionStock;
    // End of variables declaration//GEN-END:variables
}
