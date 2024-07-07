/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lenovo
 */
public class Account {
    private int id, role;
    private String username, password, displayname,gender,phone,email,bd;

    public Account(int id, int role, String username, String password, String displayname, String gender, String phone, String email, String bd) {
        this.id = id;
        this.role = role;
        this.username = username;
        this.password = password;
        this.displayname = displayname;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.bd = bd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", role=" + role + ", username=" + username + ", password=" + password + ", displayname=" + displayname + ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", bd=" + bd + '}';
    }
    
    
}
