/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.chemistrole;

import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.PharmaceuticalCompanyEnterprise;
import com.neu.business.enterprise.PharmacyEnterprise;
import com.neu.business.network.Network;
import com.neu.business.organization.ChemistOrganization;
import com.neu.business.patient.Prescription;
import com.neu.business.useraccount.UserAccount;
import com.neu.business.workqueue.PharmacySupplyWorkRequest;
import com.neu.business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Soham
 */
public class ChemistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChemistWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ChemistOrganization chemistOrganization;
    private Network network;
    private ArrayList<Prescription> prescriptionList;
    private PharmacyEnterprise pharmacyEnterprise;

    public ChemistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise pharmacyEnterprise, ChemistOrganization organization, Network network, ArrayList<Prescription> prescriptionList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.chemistOrganization = organization;
        this.network = network;
        this.prescriptionList = prescriptionList;
        this.pharmacyEnterprise = (PharmacyEnterprise) pharmacyEnterprise;

        populateStock();
        updateDeliveredStock();

    }

    public void populateStock() {

        if (chemistOrganization.getStock() == 0) {
            chemistOrganization.setStock(pharmacyEnterprise.getOpioidStock());
            populateInitialStock();
        }
        txtFieldChemistStock.setText(String.valueOf(chemistOrganization.getStock()));
    }

    public void populateInitialStock() {
        txtFieldChemistStock.setText(String.valueOf(chemistOrganization.getStock()));
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
        jLabel2 = new javax.swing.JLabel();
        txtFieldChemistStock = new javax.swing.JTextField();
        btnSellOpioids = new javax.swing.JButton();
        btnManageStock = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Chemist Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jLabel2.setText("Stock remaining: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 83, -1, -1));

        txtFieldChemistStock.setEditable(false);
        add(txtFieldChemistStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 80, 110, -1));

        btnSellOpioids.setText("Sell Opioids");
        btnSellOpioids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellOpioidsActionPerformed(evt);
            }
        });
        add(btnSellOpioids, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 200, -1, -1));

        btnManageStock.setText("Manage Stock");
        btnManageStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStockActionPerformed(evt);
            }
        });
        add(btnManageStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSellOpioidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellOpioidsActionPerformed
        // TODO add your handling code here:
        SellOpioidsJPanel sellOpioidsJPanel = new SellOpioidsJPanel(userProcessContainer, chemistOrganization, prescriptionList);
        userProcessContainer.add("sellOpioidsJPanel", sellOpioidsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();

        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSellOpioidsActionPerformed

    private void btnManageStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStockActionPerformed
        // TODO add your handling code here:

        ManageStockJPanel manageStock = new ManageStockJPanel(userProcessContainer, chemistOrganization, prescriptionList, userAccount, network);
        userProcessContainer.add("ManageStockJPanel", manageStock);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageStockActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageStock;
    private javax.swing.JButton btnSellOpioids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtFieldChemistStock;
    // End of variables declaration//GEN-END:variables

    private void updateDeliveredStock() {

        int stock = chemistOrganization.getStock();

        for (WorkRequest workRequest : chemistOrganization.getWorkQueue().getWorkRequestList()) {
            PharmacySupplyWorkRequest pharmacySupplyWorkRequest = (PharmacySupplyWorkRequest) workRequest;
            if (pharmacySupplyWorkRequest.getStatus().equals("Order Completed")) {
                stock += pharmacySupplyWorkRequest.getOrderAmount();
                pharmacySupplyWorkRequest.setStatus("Delivery Accepted");

            }
        }

        chemistOrganization.setStock(stock);

    }
}
