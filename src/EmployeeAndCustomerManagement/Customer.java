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
public class Customer extends Person{
    private String licenseNumber;
    private int age;
    private Date licenseExpiry;
    private ArrayList<Rental> rentalRecords = new ArrayList<Rental>();

    public ArrayList<Rental> getRentalRecords() {
        return rentalRecords;
    }

    public void setRentalRecords(ArrayList<Rental> rentalRecords) {
        this.rentalRecords = rentalRecords;
    }

    
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLicenseExpiry() {
        return licenseExpiry;
    }

    public void setLicenseExpiry(Date licenseExpiry) {
        this.licenseExpiry = licenseExpiry;
    }

    public Customer(String licenseNumber, int age, Date licenseExpiry, int personID, String name, Date dob, String address, String telephoneNumber) {
        super(personID, name, dob, address, telephoneNumber);
        this.licenseNumber = licenseNumber;
        this.age = age;
        this.licenseExpiry = licenseExpiry;
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
