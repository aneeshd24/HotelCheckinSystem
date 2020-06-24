/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManagementSystem;

/**
 *
 * @author v
 */
interface Document{
    void read();
    void print();
}


public class Invoice {
    public int Invoice_ID;
    
    public Invoice(int  IID){
        this.Invoice_ID = IID;
    }
    
    public int getIID(){ return this.Invoice_ID; }
    
    public void setIID(int I){ this.Invoice_ID = I; }
    
    public String getInvoice(Customer c){
        return "Invoice ID: " + this.Invoice_ID + "\nCustomer Name: " + c.getFullName();
    }
}