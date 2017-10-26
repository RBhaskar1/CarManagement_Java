/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeAndCustomerManagement;

import RentalRecordManagement.Rental;
import StockMaintenance.Stock;
import StockMaintenance.Vehicles;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rbhaskar
 */
public class Employee extends Person {
    private String officeAddress;
    private int phoneExtension;
    private String username;
    private String password;
    private EmployeeRole role;    
    private ArrayList<Rental> rentalRecords = new ArrayList<Rental>();

    public ArrayList<Rental> getRentalRecords() {
        return rentalRecords;
    }

    public void setRentalRecords(ArrayList<Rental> rentalRecords) {
        this.rentalRecords = rentalRecords;
    }

    

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public int getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(int phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    public Employee(String officeAddress, int phoneExtension, String username, String password, EmployeeRole role, int personID, String name, Date dob, String address, String telephoneNumber) {
        super(personID, name, dob, address, telephoneNumber);
        this.officeAddress = officeAddress;
        this.phoneExtension = phoneExtension;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    //add Vehicle to the Stock
    public void addVehicle(Stock stock, Vehicles vehicle)
    {
        stock.getStock().add(vehicle);
    }
    
    @Override
    public void borrowVehicle(Rental rented, Date returnDue)
    {
        this.rentalRecords.add(rented);
    }
    
    @Override
    public void returnVehicle(Rental rented)
    {
        this.rentalRecords.remove(rented);
    }
    
}
