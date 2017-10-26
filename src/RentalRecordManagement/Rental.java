/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalRecordManagement;

import EmployeeAndCustomerManagement.Person;
import StockMaintenance.Car;
import java.util.Date;

/**
 *
 * @author rbhaskar
 */
public class Rental {
    private Person borrower;
    private Car car;
    private Date rentDate;
    private Date rentDueDate;
    private Date returnDate;

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getRentDueDate() {
        return rentDueDate;
    }

    public void setRentDueDate(Date rentDueDate) {
        this.rentDueDate = rentDueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Rental(Person borrower, Car car, Date rentDate, Date rentDueDate, Date returnDate) {
        this.borrower = borrower;
        this.car = car;
        this.rentDate = rentDate;
        this.rentDueDate = rentDueDate;
        this.returnDate = returnDate;
    }

    public Rental(Person borrower, Car car, Date rentDate, Date rentDueDate) {
        this.borrower = borrower;
        this.car = car;
        this.rentDate = rentDate;
        this.rentDueDate = rentDueDate;
    }
    
    
}
