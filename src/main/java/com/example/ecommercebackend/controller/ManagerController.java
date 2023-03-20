package com.example.ecommercebackend.controller;

import com.example.ecommercebackend.model.Manager;
import com.example.ecommercebackend.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/manager")
public class ManagerController {
    @Autowired
    private ManagerRepository managerRepository;

    @GetMapping("/managers")
    public List<Manager> getAllEmployees() {
        return managerRepository.findAll();
    }
}
