/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.HumanResource;

import EmployeeAndCustomerManagement.Customer;
import EmployeeAndCustomerManagement.Employee;
import EmployeeAndCustomerManagement.Person;
import GUI.Utility.Utility;
import StockMaintenance.Stock;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qualitycars.MainFrame;

/**
 *
 * @author rbhaskar
 */
public class DisplayInformationIFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form DisplayInformationIFrame
     */
    public DisplayInformationIFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisplayInformationPanel = new javax.swing.JPanel();
        showEmployeeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personDetailsTable = new javax.swing.JTable();
        personIDLabel = new javax.swing.JLabel();
        personIDTextField = new javax.swing.JTextField();

        setClosable(true);

        DisplayInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Display Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18), new java.awt.Color(0, 204, 51))); // NOI18N

        showEmployeeButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        showEmployeeButton.setText("Display Person Details");
        showEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEmployeeButtonActionPerformed(evt);
            }
        });

        personDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Person ID", "Name", "Person Type", "Address", "License Number", "License Expiry", "Phone Number", "Role"
            }
        ));
        jScrollPane1.setViewportView(personDetailsTable);

        personIDLabel.setText("Person ID");

        personIDTextField.setName("Person ID"); // NOI18N
        personIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personIDTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DisplayInformationPanelLayout = new javax.swing.GroupLayout(DisplayInformationPanel);
        DisplayInformationPanel.setLayout(DisplayInformationPanelLayout);
        DisplayInformationPanelLayout.setHorizontalGroup(
            DisplayInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayInformationPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(personIDLabel)
                .addGap(46, 46, 46)
                .addComponent(personIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showEmployeeButton)
                .addGap(78, 78, 78))
        );
        DisplayInformationPanelLayout.setVerticalGroup(
            DisplayInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayInformationPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(DisplayInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personIDLabel)
                    .addComponent(personIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DisplayInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DisplayInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEmployeeButtonActionPerformed
        // TODO add your handling code here:
        Hashtable<String,String> data = Utility.readData(DisplayInformationPanel);

        String output= Utility.checkEmptyFields(data);

        if(output.length()!=0)
        {
            JOptionPane.showMessageDialog(this, output);
        }
        else
        {
            Stock st = MainFrame.stock;

            int personID = Integer.parseInt(personIDTextField.getText());

            //Getting access to the model of the bookTable model
            DefaultTableModel model = (DefaultTableModel)personDetailsTable.getModel();
            //Freeing the model off the previous content
            model.setRowCount(0);
            //creating row with number of columns
            Object[] rows = new Object[8];
            //iterate through the list of cars to link with rows of table

            for(Employee e : st.getEmployee())
            {
                if(e.getPersonID() == personID)
                {
                    rows[0] = e.getPersonID();
                    rows[1] = e.getName();
                    rows[2] = "Employee";
                    rows[3] = "N/A";
                    rows[4] = "N/A";
                    rows[5] = "N/A";
                    rows[6] = e.getTelephoneNumber();
                    rows[7] = e.getRole();
                    model.addRow(rows);
                }
            }

            for(Customer c : st.getCustomer())
            {
                if(c.getPersonID() == personID)
                {
                    rows[0] = c.getPersonID();
                    rows[1] = c.getName();
                    rows[2] = "Customer";
                    rows[3] = c.getAddress();
                    rows[4] = c.getLicenseNumber();
                    rows[5] = c.getLicenseExpiry();
                    rows[6] = c.getTelephoneNumber();
                    rows[7] = "N/A";
                    model.addRow(rows);
                }
            }
            JOptionPane.showMessageDialog(this, "Showing All people found!!!");
        }
    }//GEN-LAST:event_showEmployeeButtonActionPerformed

    private void personIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personIDTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DisplayInformationPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personDetailsTable;
    private javax.swing.JLabel personIDLabel;
    private javax.swing.JTextField personIDTextField;
    private javax.swing.JButton showEmployeeButton;
    // End of variables declaration//GEN-END:variables
}
