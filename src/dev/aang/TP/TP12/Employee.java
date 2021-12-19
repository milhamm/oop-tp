/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.aang.TP.TP12;

/**
 *
 * @author milha
 */
public class Employee {
    private String name;
    private String roles;
    private String dob;

    public Employee(String name, String roles, String dob) {
        this.name = name;
        this.roles = roles;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    

   
}
