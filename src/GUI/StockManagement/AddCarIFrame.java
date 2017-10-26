/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.StockManagement;

import EmployeeAndCustomerManagement.Employee;
import EmployeeAndCustomerManagement.EmployeeRole;
import EmployeeAndCustomerManagement.Person;
import GUI.Utility.Utility;
import StockMaintenance.BodyType;
import StockMaintenance.Car;
import StockMaintenance.CarStatus;
import StockMaintenance.CarTransmission;
import StockMaintenance.Stock;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import qualitycars.MainFrame;
import static qualitycars.MainFrame.stock;

/**
 *
 * @author rbhaskar
 */
public class AddCarIFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCarIFrame
     */
    public AddCarIFrame() {
        initComponents();
        Stock stock = MainFrame.stock;
        
        //Parse Date
        String startDateString = "27-06-2007";
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = null;
        try {
            dob = df.parse(startDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        Employee emp = new Employee("16 Rogers Road",064,"Bhaskarr","Password",EmployeeRole.Admin,97,"Rakshit", dob,"Nelson Street, CBD","0221612587");
        stock.getEmployee().add(emp);
//        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddCarPanel = new javax.swing.JPanel();
        makeTextField = new javax.swing.JTextField();
        makeLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        transmissionLabel = new javax.swing.JLabel();
        engineSizeLabel = new javax.swing.JLabel();
        engineSizeTextField = new javax.swing.JTextField();
        wofDueDateLabel = new javax.swing.JLabel();
        wofDueDateTextField = new javax.swing.JTextField();
        regoDueDateLabel = new javax.swing.JLabel();
        regoDueDateTextField = new javax.swing.JTextField();
        transmissionComboBox = new javax.swing.JComboBox<>();
        rentDueDateLabel = new javax.swing.JLabel();
        rentPerDayTextField = new javax.swing.JTextField();
        manufactureYearLabel = new javax.swing.JLabel();
        manufactureYearTextField = new javax.swing.JTextField();
        colourLabel = new javax.swing.JLabel();
        colourTextField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        bodyTypeLabel = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        bodyTypeComboBox = new javax.swing.JComboBox<>();
        rentDateLabel = new javax.swing.JLabel();
        rentDateTextField = new javax.swing.JTextField();
        dateDueBackLabel = new javax.swing.JLabel();
        dateDueBackTextField = new javax.swing.JTextField();
        addCarButton = new javax.swing.JButton();
        employeeIDLabel = new javax.swing.JLabel();
        employeeIDTextField = new javax.swing.JTextField();
        carIDLabel = new javax.swing.JLabel();
        carIDTextField = new javax.swing.JTextField();
        regoNumberLabel = new javax.swing.JLabel();
        regoNumberTextField = new javax.swing.JTextField();

        setClosable(true);

        AddCarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Car", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 2, 18), new java.awt.Color(255, 0, 51))); // NOI18N

        makeTextField.setName("Make"); // NOI18N

        makeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        makeLabel.setText("Make");

        modelLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        modelLabel.setText("Model");

        modelTextField.setName("model"); // NOI18N

        transmissionLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        transmissionLabel.setText("Transmission");

        engineSizeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        engineSizeLabel.setText("Engine Size");

        engineSizeTextField.setName("engineSize"); // NOI18N

        wofDueDateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        wofDueDateLabel.setText("WOF Due Date");

        wofDueDateTextField.setName("wofDueDate"); // NOI18N

        regoDueDateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        regoDueDateLabel.setText("Rego Due Date");

        regoDueDateTextField.setName("regoDueDate"); // NOI18N

        transmissionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatic", "Triptronic" }));
        transmissionComboBox.setName("tranmission"); // NOI18N
        transmissionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmissionComboBoxActionPerformed(evt);
            }
        });

        rentDueDateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rentDueDateLabel.setText("Rent Per Day");

        rentPerDayTextField.setName("rentPerDay"); // NOI18N

        manufactureYearLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manufactureYearLabel.setText("Manufacture Year");

        manufactureYearTextField.setName("manufYear"); // NOI18N

        colourLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        colourLabel.setText("Colour");

        colourTextField.setName("colour"); // NOI18N

        statusLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        statusLabel.setText("Status");

        bodyTypeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bodyTypeLabel.setText("Body Type");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AvailableForRent", "RentedOut", "UnderMaintenance" }));
        statusComboBox.setName("status"); // NOI18N

        bodyTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "SUV", "Hatchback", "Van", "StationWagon" }));
        bodyTypeComboBox.setName("bodyType"); // NOI18N

        rentDateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rentDateLabel.setText("Rent Date");

        rentDateTextField.setName("rentDate"); // NOI18N

        dateDueBackLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        dateDueBackLabel.setText("Date Due Back");

        dateDueBackTextField.setName("dateDueBack"); // NOI18N

        addCarButton.setBackground(new java.awt.Color(0, 255, 102));
        addCarButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addCarButton.setForeground(new java.awt.Color(51, 51, 51));
        addCarButton.setText("ADD CAR");
        addCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarButtonActionPerformed(evt);
            }
        });

        employeeIDLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        employeeIDLabel.setText("EmployeeID");

        employeeIDTextField.setName("employeeId"); // NOI18N

        carIDLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        carIDLabel.setText("Car ID");

        carIDTextField.setName("CarID"); // NOI18N

        regoNumberLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        regoNumberLabel.setText("Rego Number");

        regoNumberTextField.setName("regoNumber"); // NOI18N

        javax.swing.GroupLayout AddCarPanelLayout = new javax.swing.GroupLayout(AddCarPanel);
        AddCarPanel.setLayout(AddCarPanelLayout);
        AddCarPanelLayout.setHorizontalGroup(
            AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCarPanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wofDueDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regoDueDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(engineSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transmissionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(makeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rentDueDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manufactureYearLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colourLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateDueBackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regoNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(makeTextField)
                    .addComponent(modelTextField)
                    .addComponent(engineSizeTextField)
                    .addComponent(wofDueDateTextField)
                    .addComponent(regoDueDateTextField)
                    .addComponent(transmissionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rentPerDayTextField)
                    .addComponent(manufactureYearTextField)
                    .addComponent(colourTextField)
                    .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rentDateTextField)
                    .addComponent(dateDueBackTextField)
                    .addComponent(employeeIDTextField)
                    .addComponent(carIDTextField)
                    .addComponent(regoNumberTextField))
                .addGap(100, 100, 100))
            .addGroup(AddCarPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(addCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddCarPanelLayout.setVerticalGroup(
            AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCarPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regoNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regoNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transmissionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transmissionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engineSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(engineSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wofDueDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wofDueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regoDueDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regoDueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentPerDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentDueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufactureYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufactureYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bodyTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateDueBackTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDueBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(addCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddCarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddCarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarButtonActionPerformed
        // TODO add your handling code here:    
        
            if(rentDateTextField.getText().equalsIgnoreCase("") || dateDueBackTextField.getText().equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(this, "Please put in Today's Date in both 'rent date' and 'Return Date' if not rented out. \n Or if you dont want to use this feild.");
            }
        
                Hashtable<String,String> data = Utility.readData(AddCarPanel);

                String output= Utility.checkEmptyFields(data);

                if(output.length()!=0)
                {
                    JOptionPane.showMessageDialog(this, output);
                }
                else
                {
                    
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

                    int carID = Integer.parseInt(carIDTextField.getText());
                    String make = makeTextField.getText();
                    String model = modelTextField.getText();
                    CarTransmission transmission = CarTransmission.valueOf(transmissionComboBox.getSelectedItem().toString());
                    double engineSize = Double.parseDouble(engineSizeTextField.getText());
                    double rentPerDay = Double.parseDouble(rentPerDayTextField.getText());
                    //Parsed wofDueString as date in line 292
                    String wofDueString = wofDueDateTextField.getText();
                    //Parsed regoRenewString as date in line 292
                    String regoRenewString = regoDueDateTextField.getText();
                    //Parsed manufactureYearString as Year in line 292
                    int manufactureYear = Integer.parseInt(manufactureYearTextField.getText());
                    String colour = colourTextField.getText();
                    CarStatus status = CarStatus.valueOf(statusComboBox.getSelectedItem().toString());
                    BodyType bodyType = BodyType.valueOf(bodyTypeComboBox.getSelectedItem().toString());
                    //Parsed rentDateString as date in line 292
                    String rentDateString = rentDateTextField.getText();
                    //Parsed rentDueString as date in line 292
                    String rentDueString = dateDueBackTextField.getText();
                    int employeeID = Integer.parseInt(employeeIDTextField.getText());
                    int regoNumber = Integer.parseInt(regoNumberTextField.getText());
            
        //Parsing Dates from Strings for wofDue,manufactureYear, rentdate and rentduedate
        Date wofDue = null;
        Date rentDate = null;
        Date rentDue = null;
        Date regoRenew = null;
        try
        {
            wofDue = df.parse(wofDueString);
            rentDate = df.parse(rentDateString);
            rentDue = df.parse(rentDueString);
            regoRenew = df.parse(regoRenewString);
        } catch(ParseException e)
        {
            e.printStackTrace();
        }
   
        //Create object of Car from user input
        Car car = new Car(carID,regoNumber,make,model,transmission,engineSize,wofDue,regoRenew,rentPerDay,manufactureYear,colour,status,bodyType,rentDate,rentDue);
        //Implement this as a function to resuce code
        //check if employee who is adding the car to stock exists in the arraylist of employees
        for(Employee e : stock.getEmployee())
        {
            if(e.getPersonID() == employeeID)
            {
                //get employee who is adding the car to stock
//                Employee employee = (Employee) stock.getEmployee().stream().filter(x->employeeID == x.getPersonID());
                //Only add car if a similar entry is not already there 
                if(!stock.getStock().contains(car))
                {
                e.addVehicle(stock, car);
                //Confirm book has been added to the arraylist
                JOptionPane.showMessageDialog(this, "Car Added Successfully to Inventory");
                }
            }
        }
      }
    }//GEN-LAST:event_addCarButtonActionPerformed

    private void transmissionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmissionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transmissionComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddCarPanel;
    private javax.swing.JButton addCarButton;
    private javax.swing.JComboBox<String> bodyTypeComboBox;
    private javax.swing.JLabel bodyTypeLabel;
    private javax.swing.JLabel carIDLabel;
    private javax.swing.JTextField carIDTextField;
    private javax.swing.JLabel colourLabel;
    private javax.swing.JTextField colourTextField;
    private javax.swing.JLabel dateDueBackLabel;
    private javax.swing.JTextField dateDueBackTextField;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JTextField employeeIDTextField;
    private javax.swing.JLabel engineSizeLabel;
    private javax.swing.JTextField engineSizeTextField;
    private javax.swing.JLabel makeLabel;
    private javax.swing.JTextField makeTextField;
    private javax.swing.JLabel manufactureYearLabel;
    private javax.swing.JTextField manufactureYearTextField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JLabel regoDueDateLabel;
    private javax.swing.JTextField regoDueDateTextField;
    private javax.swing.JLabel regoNumberLabel;
    private javax.swing.JTextField regoNumberTextField;
    private javax.swing.JLabel rentDateLabel;
    private javax.swing.JTextField rentDateTextField;
    private javax.swing.JLabel rentDueDateLabel;
    private javax.swing.JTextField rentPerDayTextField;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JComboBox<String> transmissionComboBox;
    private javax.swing.JLabel transmissionLabel;
    private javax.swing.JLabel wofDueDateLabel;
    private javax.swing.JTextField wofDueDateTextField;
    // End of variables declaration//GEN-END:variables
}