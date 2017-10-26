/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockMaintenance;

import RentalRecordManagement.Rental;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rbhaskar
 */
public class Car extends Vehicles{
    
    private int id;
    private String make;
    private String model;
    private CarTransmission transmission;
    private double engineSize;
    private Date WOFdue;
    private Date regoRenew;
    private double rentPerDay;
    private int YearOfManufacture;
    private String colour;
    private CarStatus status;
    private BodyType carBodyType;
    private Date rentDate;
    private Date returnDate;
    private int customerID;
    private int regoNumber;
    private ArrayList<Rental> rentalRecords = new ArrayList<Rental>();

    
    public int getRegoNumber() {
        return regoNumber;
    }

    public void setRegoNumber(int regoNumber) {
        this.regoNumber = regoNumber;
    }
    
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public ArrayList<Rental> getRentalRecords() {
        return rentalRecords;
    }

    public void setRentalRecords(ArrayList<Rental> rentalRecords) {
        this.rentalRecords = rentalRecords;
    }

    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarTransmission getTransmission() {
        return transmission;
    }

    public void setTransmission(CarTransmission transmission) {
        this.transmission = transmission;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public Date getWOFdue() {
        return WOFdue;
    }

    public void setWOFdue(Date WOFdue) {
        this.WOFdue = WOFdue;
    }

    public Date getRegoRenew() {
        return regoRenew;
    }

    public void setRegoRenew(Date regoRenew) {
        this.regoRenew = regoRenew;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public int getYearOfManufacture() {
        return YearOfManufacture;
    }

    public void setYearOfManufacture(int YearOfManufacture) {
        this.YearOfManufacture = YearOfManufacture;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public BodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(BodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Car(int id, int regoNumber, String make, String model, CarTransmission transmission, double engineSize, Date WOFdue, Date WOFrenew, double rentPerDay, int YearOfManufacture, String colour, CarStatus status, BodyType carBodyType, Date rentDate, Date returnDate, ArrayList<Rental> rentalRecords) {
        this.id = id;
        this.regoNumber = regoNumber;
        this.make = make;
        this.model = model;
        this.transmission = transmission;
        this.engineSize = engineSize;
        this.WOFdue = WOFdue;
        this.regoRenew = WOFrenew;
        this.rentPerDay = rentPerDay;
        this.YearOfManufacture = YearOfManufacture;
        this.colour = colour;
        this.status = status;
        this.carBodyType = carBodyType;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.rentalRecords = rentalRecords;
    }

    //Constructor overloading for handling cutomerid
    public Car(int id, int regoNumber, String make, String model, CarTransmission transmission, double engineSize, Date WOFdue, Date WOFrenew, double rentPerDay, int YearOfManufacture, String colour, CarStatus status, BodyType carBodyType, Date rentDate, Date returnDate, ArrayList<Rental> rentalRecords, int customerID) {
        this.id = id;
        this.regoNumber = regoNumber;
        this.make = make;
        this.model = model;
        this.transmission = transmission;
        this.engineSize = engineSize;
        this.WOFdue = WOFdue;
        this.regoRenew = WOFrenew;
        this.rentPerDay = rentPerDay;
        this.YearOfManufacture = YearOfManufacture;
        this.colour = colour;
        this.status = status;
        this.carBodyType = carBodyType;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.customerID = customerID;
        this.rentalRecords = rentalRecords;
    }

    //Constructor overloading for handling cutomerid and rental records
    public Car(int id, int regoNumber, String make, String model, CarTransmission transmission, double engineSize, Date WOFdue, Date WOFrenew, double rentPerDay, int YearOfManufacture, String colour, CarStatus status, BodyType carBodyType, Date rentDate, Date returnDate) {
        this.id = id;
        this.regoNumber = regoNumber;
        this.make = make;
        this.model = model;
        this.transmission = transmission;
        this.engineSize = engineSize;
        this.WOFdue = WOFdue;
        this.regoRenew = WOFrenew;
        this.rentPerDay = rentPerDay;
        this.YearOfManufacture = YearOfManufacture;
        this.colour = colour;
        this.status = status;
        this.carBodyType = carBodyType;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }
    
    
    
    //borrowed by a person
    public void borrowed(Rental rented)
    {
        status = CarStatus.RentedOut;
        this.rentalRecords.add(rented);
    }
    
    //returned by a person
    public void returned()
    {
        status = CarStatus.AvailableForRent;
    }
    
}
