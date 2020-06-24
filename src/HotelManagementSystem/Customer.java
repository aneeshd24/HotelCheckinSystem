/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManagementSystem;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vulcanprime
 */



public class Customer extends Person{
    public String CustomerID;
    
   
    HotelSystem hms=new HotelSystem();
    DefaultTableModel model= (DefaultTableModel) hms.jTable1.getModel();
    
    public void setCustomerID(){
        this.CustomerID=hms.jTable1.getValueAt(hms.jTable1.getSelectedRow(), 0).toString();
    }
    
    public void setFirstName(){
        this.firstName= hms.jTable1.getValueAt(hms.jTable1.getSelectedRow(), 2).toString();
    }
    
    public void setLastName(){
        this.lastName= hms.jTable1.getValueAt(hms.jTable1.getSelectedRow(), 3).toString();
    }
    
    public void setMobile(){
        this.mobile= hms.jTable1.getValueAt(hms.jTable1.getSelectedRow(), 5).toString();
    }
    
    
}
