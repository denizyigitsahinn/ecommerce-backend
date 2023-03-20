package com.example.ecommercebackend.model;

import jakarta.persistence.*;


@Entity
@Table(name = "orders")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderid;

    @Column(name = "customerid")
    private int customerid;

    @Column(name = "status")
    private String status;

    @Column(name = "totalprice")
    private double totalprice;

    @Column(name = "orderdate")
    private int orderdate;

    public int getOrderid() { return orderid; }

    public void setOrderid(int orderid) { this.orderid = orderid; }

    public int getCustomerid() { return customerid; }

    public void setCustomerid(int customerid) { this.customerid = customerid; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public double getTotalprice() { return totalprice; }

    public void setTotalprice(double totalprice) { this.totalprice = totalprice; }

    public int getOrderdate() { return orderdate; }

    public void setOrderdate(int orderdate) { this.orderdate = orderdate; }


    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", customerid='" + customerid + '\'' +
                ", status='" + status + '\'' +
                ", totalprice=" + totalprice +
                ", orderdate='" + orderdate +
                '}';
    }
}
