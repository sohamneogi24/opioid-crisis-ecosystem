/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.rehabmanagerrole;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.HospitalEnterprise;
import com.neu.business.organization.DoctorOrganization;
import com.neu.business.organization.Organization;
import com.neu.business.organization.RehabilitationManagerOrganization;
import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientDirectory;
import com.neu.business.useraccount.UserAccount;
import com.neu.business.workqueue.ScheduleAppointmentWorkRequest;
import com.neu.business.workqueue.SendToRehabilitationWorkRequest;
import com.neu.business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrikantmudholkar
 */
public class RehabManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form rehabManagerWorkArea
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private PatientDirectory ecosystemPatientDirectory;
    private RehabilitationManagerOrganization organization;

    private UserAccount rehabManagerAccount;

    public RehabManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount rehabManagerAccount, RehabilitationManagerOrganization organization, Enterprise enterprise, PatientDirectory ecosystemPatientDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystemPatientDirectory = ecosystemPatientDirectory;
        this.organization = organization;
        this.rehabManagerAccount = rehabManagerAccount;

        populateRehabTable(ecosystemPatientDirectory);
    }

    public void populateRehabTable(PatientDirectory ecosystemPatientDirectory) {
        DefaultTableModel dtm = (DefaultTableModel) tblPatient.getModel();
        dtm.setRowCount(0);

        for (WorkRequest workRequest : rehabManagerAccount.getWorkQueue().getWorkRequestList()) {

            SendToRehabilitationWorkRequest sendToRehabilitationWorkRequest = (SendToRehabilitationWorkRequest) workRequest;
            Patient patient = sendToRehabilitationWorkRequest.getPatient();

            Object[] row = new Object[4];
            row[0] = patient.getId();
            row[1] = patient;
            row[2] = patient.getRehabStatus();
            row[3] = sendToRehabilitationWorkRequest.getSender().getEmployee().getName();
            dtm.addRow(row);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        btnViewPatientDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOtherAddictions = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient", "Status", "Doctor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);
        if (tblPatient.getColumnModel().getColumnCount() > 0) {
            tblPatient.getColumnModel().getColumn(0).setResizable(false);
            tblPatient.getColumnModel().getColumn(1).setResizable(false);
            tblPatient.getColumnModel().getColumn(2).setResizable(false);
            tblPatient.getColumnModel().getColumn(3).setResizable(false);
        }

        btnViewPatientDetails.setText("View Patient Details");
        btnViewPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientDetailsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Rehab Manager Work Area");

        btnOtherAddictions.setText("Other Addictions Caused by Opioids");
        btnOtherAddictions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherAddictionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(btnOtherAddictions))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(btnViewPatientDetails)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnViewPatientDetails)
                .addGap(44, 44, 44)
                .addComponent(btnOtherAddictions)
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientDetailsActionPerformed
        // TODO add your handling code here:

        if (tblPatient.getSelectedRow() >= 0) {
            Patient patient = (Patient) tblPatient.getValueAt(tblPatient.getSelectedRow(), 1);
            PatientDetailsJPanel patientDetails = new PatientDetailsJPanel(userProcessContainer, patient, ecosystemPatientDirectory);
            userProcessContainer.add("PatientDetailsJPanel", patientDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "No row selected! Notthing to display!");
        }
    }//GEN-LAST:event_btnViewPatientDetailsActionPerformed

    private void btnOtherAddictionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherAddictionsActionPerformed
        // TODO add your handling code here:
        HashMap<String, Integer> otherAddictionsCausedByOpioidAbuseMap = organization.otherAddictionsCausedByOpioidAbuse();


    }//GEN-LAST:event_btnOtherAddictionsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOtherAddictions;
    private javax.swing.JButton btnViewPatientDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatient;
    // End of variables declaration//GEN-END:variables
}