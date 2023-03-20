package com.example.ecommercebackend.controller;

import com.example.ecommercebackend.model.Store;
import com.example.ecommercebackend.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/store")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    @GetMapping("/stores")
    public List<Store> getAllEmployees() {
        return storeRepository.findAll();
    }
}
