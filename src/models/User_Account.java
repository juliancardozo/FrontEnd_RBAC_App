/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adilsonmagalhaes
 */
public class User_Account {
    
    private int User_ID;
    private String User_Name;
    private Date User_CreateDate ;
    private String User_Password;
    private String User_CI;
    

    public User_Account(int User_ID, String User_Name, String User_Password, String User_CI) {
        this.User_ID = User_ID;
        this.User_Name = User_Name;
        this.User_Password = User_Password;
        this.User_CI = User_CI;
    }    

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public Date getUser_CreateDate() {
        return User_CreateDate;
    }

    public void setUser_CreateDate(Date User_CreateDate) {
        this.User_CreateDate = User_CreateDate;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String User_Password) {
        this.User_Password = User_Password;
    }

    public String getUser_CI() {
        return User_CI;
    }

    public void setUser_CI(String User_CI) {
        this.User_CI = User_CI;
    }
    
    
}
