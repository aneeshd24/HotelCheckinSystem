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
public class Person {
    public String firstName;
    public String lastName;
    public String mobile;
    public String fullName;
    
    
    
    public void setFullName(){
        this.fullName=this.firstName+" "+this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getMobile(){
        return this.mobile;
    }
    public String getFullName(){
        return this.fullName;
    }
    
}
