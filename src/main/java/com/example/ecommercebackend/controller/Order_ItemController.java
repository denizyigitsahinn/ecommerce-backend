package com.example.ecommercebackend.controller;

import com.example.ecommercebackend.model.Order_Item;
import com.example.ecommercebackend.repository.Order_ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/order_item")
public class Order_ItemController {
    @Autowired
    private Order_ItemRepository order_itemRepository;

    @GetMapping("/order_items")
    public List<Order_Item> getAllEmployees() {
        return order_itemRepository.findAll();
    }
}