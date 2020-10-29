/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author adilsonmagalhaes
 */
public class Role {
    
    private int Role_Id;
    private String Role_Name;
    private Boolean IsSuperAdmin;

    public Role(int Role_Id, String Role_Name, Boolean IsSuperAdmin) {
        this.Role_Id = Role_Id;
        this.Role_Name = Role_Name;
        this.IsSuperAdmin = IsSuperAdmin;
    }

    public Boolean IsSuperAdmin() {
        return IsSuperAdmin;
    }

    public void setIsSuperAdmin(Boolean IsSuperAdmin) {
        this.IsSuperAdmin = IsSuperAdmin;
    }

    public int getRole_Id() {
        return Role_Id;
    }

    public void setRole_Id(int Role_Id) {
        this.Role_Id = Role_Id;
    }

    public String getRole_Name() {
        return Role_Name;
    }

    public void setRole_Name(String Role_Name) {
        this.Role_Name = Role_Name;
    }
    
    
    
    
  
    
}
