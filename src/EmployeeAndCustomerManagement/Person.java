/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeAndCustomerManagement;

import RentalRecordManagement.Rental;
import StockMaintenance.Vehicles;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rbhaskar
 */
public abstract class Person {
    private int personID;
    private String name;
    private Date dob;
    private String address;
    private String telephoneNumber;
    private ArrayList<Rental> rentalRecords;
    
    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    private void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Person(int personID, String name, Date dob, String address, String telephoneNumber) {
        setPersonID(personID);
        setName(name);
        setDob(dob);
        setAddress(address);
        setTelephoneNumber(telephoneNumber);
        this.rentalRecords =null;
    }
    
    //Borrow vehicle from Stock
    abstract public void borrowVehicle(Rental rented, Date returnDue);
    
    //return Vehicle to Stock
    abstract public void returnVehicle(Rental rented);
}
