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
public class Permission {
    private int Permission_Id;
    private String Permission_Description;
    private int App_Id;

    public Permission(int Permission_Id, String Permission_Description, int App_Id) {
        this.Permission_Id = Permission_Id;
        this.Permission_Description = Permission_Description;
        this.App_Id = App_Id;
    }

    public int getPermission_Id() {
        return Permission_Id;
    }

    public void setPermission_Id(int Permission_Id) {
        this.Permission_Id = Permission_Id;
    }

    public String getPermission_Description() {
        return Permission_Description;
    }

    public void setPermission_Description(String Permission_Description) {
        this.Permission_Description = Permission_Description;
    }

    public int getApp_Id() {
        return App_Id;
    }

    public void setApp_Id(int App_Id) {
        this.App_Id = App_Id;
    }
    
  
}
