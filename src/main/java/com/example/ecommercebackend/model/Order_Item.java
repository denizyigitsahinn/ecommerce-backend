package com.example.ecommercebackend.model;

import jakarta.persistence.*;


@Entity
@Table(name = "order_items")

public class Order_Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_itemid;

    @Column(name = "orderid")
    private int orderid;

    @Column(name = "productid")
    private int productid;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;


    public int getOrder_itemid() { return order_itemid; }

    public void setOrder_itemid(int order_itemid) { this.order_itemid = order_itemid; }

    public int getOrderid() { return orderid; }

    public void setOrderid(int orderid) { this.orderid = orderid; }

    public int getProductid() { return productid; }

    public void setProductid(int productid) { this.productid = productid; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }


    @Override
    public String toString() {
        return "Order_Item{" +
                "order_itemid=" + order_itemid +
                ", orderid='" + orderid + '\'' +
                ", productid='" + productid + '\'' +
                ", quantity=" + quantity +
                ", price='" + price +
                '}';
    }
}
