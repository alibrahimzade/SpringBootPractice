package com.example.relationships_practice.controller.rest;

import com.example.relationships_practice.dao.CustomerEntity;
import com.example.relationships_practice.model.CustomerDto;
import com.example.relationships_practice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/{id}")
    public CustomerDto getById(@PathVariable Long id) {
        return customerService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody CustomerDto customer) {
        customerService.createCustomer(customer);
    }

    @GetMapping
    public List<CustomerDto> get() {
        return customerService.getAll();
    }

}
