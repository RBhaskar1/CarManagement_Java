/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockMaintenance;

import EmployeeAndCustomerManagement.Customer;
import EmployeeAndCustomerManagement.Employee;
import EmployeeAndCustomerManagement.Person;
import RentalRecordManagement.Rental;
import java.util.ArrayList;

/**
 *
 * @author rbhaskar
 */
public class Stock {
    private ArrayList<Customer> customer;
    private ArrayList<Employee> employee;
    private ArrayList<Vehicles> stock;
    private ArrayList<Rental> rentalRecords;

    public Stock() {
        this.rentalRecords = new ArrayList<Rental>();
        this.customer = new ArrayList<Customer>();
        this.stock = new ArrayList<Vehicles>();
        this.employee = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }
    
    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public ArrayList<Vehicles> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Vehicles> stock) {
        this.stock = stock;
    }

    public ArrayList<Rental> getRentalRecords() {
        return rentalRecords;
    }

    public void setRentalRecords(ArrayList<Rental> rentalRecords) {
        this.rentalRecords = rentalRecords;
    }
    
    public Person getCustomer(int custID)
    {
        for(Customer c : customer)
        {
            if(custID == c.getPersonID())
            {
                Person p = (Person)c;
               return p;
            }
        }
        
        return null;
    }
    
    public Person getEmployee(int empID)
    {
        for(Employee e : employee)
        {
            if(empID == e.getPersonID())
            {
                Person p = (Person)e;
               return p;
            }
        }
        
        return null;
    }
}
