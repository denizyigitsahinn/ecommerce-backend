package com.example.ecommercebackend.model;

import jakarta.persistence.*;


@Entity
@Table(name = "customers")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private int password;

    @Column(name = "phone")
    private int phone;

    @Column(name = "address")
    private String address;

    @Column(name = "faEnabled")
    private boolean faEnabled;

    public int getCustomerid() { return customerid; }

    public void setCustomerid(int customerid) { this.customerid = customerid; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getPassword() { return password; }

    public void setPassword(int password) { this.password = password; }

    public int getPhone() { return phone; }

    public void setPhone(int phone) { this.phone = phone; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public boolean isFaEnabled() { return faEnabled; }

    public void setFaEnabled(boolean faEnabled) { this.faEnabled = faEnabled; }

    @Override
    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", faEnabled='" + faEnabled +
                '}';
    }
}
