/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.receptionistrole;

import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientDirectory;
import com.sun.glass.events.KeyEvent;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Soham
 */
public class ManagePatientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private PatientDirectory systemPatientDirectory;
    private PatientDirectory hospitalPatientDirectory;
    private Enterprise enterprise;

    /**
     * Creates new form ManagePatientJPanel
     */
    public ManagePatientJPanel(JPanel userProcessContainer, PatientDirectory systemPatientDirectory, PatientDirectory hospitalPatientDirectory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.systemPatientDirectory = systemPatientDirectory;
        this.hospitalPatientDirectory = hospitalPatientDirectory;
        this.enterprise = enterprise;

        populatePatientDirectoryTable();

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
        hospitalPatientDirectoryJTable = new javax.swing.JTable();
        viewPatientDetailsJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        patientNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addPatientJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientGenderJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        patientPhoneJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        patientAgeJTextField = new javax.swing.JTextField();
        comboBoxBloodGroup = new javax.swing.JComboBox<>();
        backJButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospitalPatientDirectoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name"
            }
        ));
        jScrollPane1.setViewportView(hospitalPatientDirectoryJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 80, 439, 174));

        viewPatientDetailsJButton.setText("View Patient Details");
        viewPatientDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewPatientDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 298, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Manage Patient");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 16, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Patient "));

        jLabel2.setText("Name :");

        addPatientJButton.setText("Add ");
        addPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientJButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Blood Group :");

        jLabel3.setText("Gender :");

        jLabel4.setText("Phone No. :");

        patientPhoneJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patientPhoneJTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setText("Age :");

        patientAgeJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patientAgeJTextFieldKeyTyped(evt);
            }
        });

        comboBoxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPatientJButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientGenderJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientPhoneJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientAgeJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(comboBoxBloodGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientGenderJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patientAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(patientPhoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(addPatientJButton)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, patientPhoneJTextField});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 358, -1, -1));

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });
        add(backJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 720, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientJButtonActionPerformed
        // TODO add your handling code here:

        if (patientNameJTextField.getText().equals("") || patientGenderJTextField.getText().equals("") || patientAgeJTextField.getText().equals("") || patientPhoneJTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kindly enter all the fields!");
        } else {
            Patient patient = new Patient();
            patient.setName(patientNameJTextField.getText());
            patient.setGender(patientGenderJTextField.getText());
            patient.setAge(Integer.parseInt(patientAgeJTextField.getText()));
            patient.setBloodGroup(comboBoxBloodGroup.getItemAt(comboBoxBloodGroup.getSelectedIndex()));
            patient.setPhoneNo(patientPhoneJTextField.getText());
            systemPatientDirectory.addPatient(patient);
            hospitalPatientDirectory.addPatient(patient);

            JOptionPane.showMessageDialog(null, "Patient record added");

            patientNameJTextField.setText("");
            patientAgeJTextField.setText("");
            patientGenderJTextField.setText("");
            patientPhoneJTextField.setText("");

            populatePatientDirectoryTable();
        }
    }//GEN-LAST:event_addPatientJButtonActionPerformed

    public void populatePatientDirectoryTable() {

        DefaultTableModel dtm = (DefaultTableModel) hospitalPatientDirectoryJTable.getModel();
        dtm.setRowCount(0);

        for (Patient patient : hospitalPatientDirectory.getPatientList()) {
            Object[] row = new Object[2];
            row[0] = patient.getId();
            row[1] = patient;

            dtm.addRow(row);
        }

    }

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        com.neu.userinterface.receptionistrole.ReceptionistWorkAreaJPanel receptionistwjp = (ReceptionistWorkAreaJPanel) component;
        receptionistwjp.populateAppointentsTable(enterprise);;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void viewPatientDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientDetailsJButtonActionPerformed
        // TODO add your handling code here:
        Patient patient = (Patient) hospitalPatientDirectoryJTable.getValueAt(hospitalPatientDirectoryJTable.getSelectedRow(), 1);

        PatientDetailsJPanel patientDetailsJPanel = new PatientDetailsJPanel(userProcessContainer, patient, enterprise);
        userProcessContainer.add("patientDetailsJPanel", patientDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPatientDetailsJButtonActionPerformed

    private void patientAgeJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientAgeJTextFieldKeyTyped
        // TODO add your handling code here:
        char charEntered = evt.getKeyChar();
        // Accept only Number/ Backspace/ Delete
        if (!(Character.isDigit(charEntered)) || charEntered == KeyEvent.VK_BACKSPACE || charEntered == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_patientAgeJTextFieldKeyTyped

    private void patientPhoneJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientPhoneJTextFieldKeyTyped
        // TODO add your handling code here:

        char charEntered = evt.getKeyChar();
        // Accept only Number/ Backspace/ Delete
        if (!(Character.isDigit(charEntered)) || charEntered == KeyEvent.VK_BACKSPACE || charEntered == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_patientPhoneJTextFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientJButton;
    private javax.swing.JButton backJButton2;
    private javax.swing.JComboBox<String> comboBoxBloodGroup;
    private javax.swing.JTable hospitalPatientDirectoryJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientAgeJTextField;
    private javax.swing.JTextField patientGenderJTextField;
    private javax.swing.JTextField patientNameJTextField;
    private javax.swing.JTextField patientPhoneJTextField;
    private javax.swing.JButton viewPatientDetailsJButton;
    // End of variables declaration//GEN-END:variables
}