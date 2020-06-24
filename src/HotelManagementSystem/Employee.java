/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManagementSystem;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author v
 */
public class Employee extends Person{

public String EmployeeID;

 HotelSystem hms=new HotelSystem();
    DefaultTableModel model= (DefaultTableModel) hms.jTable2.getModel();

public void setEmployeeID(){
    this.EmployeeID=hms.jTable2.getValueAt(hms.jTable2.getSelectedRow(), 1).toString();
    }
    
    public void setFirstName(){
        this.firstName= hms.jTable2.getValueAt(hms.jTable2.getSelectedRow(), 2).toString();
    }
    
    public void setLastName(){
        this.lastName= hms.jTable2.getValueAt(hms.jTable2.getSelectedRow(), 3).toString();
    }
    
    public void setMobile(){
        this.mobile= hms.jTable2.getValueAt(hms.jTable2.getSelectedRow(), 5).toString();
    }
    
    
}
