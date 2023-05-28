package com.example.relationships_practice.controller;

import com.example.relationships_practice.model.CustomerDto;
import com.example.relationships_practice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/atl/students")
@RequiredArgsConstructor
public class WebStudentController {

    private final CustomerService customerService;
    @GetMapping
    public String getStudents(Model model){
        List<CustomerDto> customerDtoList = customerService.getAll();
        model.addAttribute("customers",customerDtoList);
        return "students";
    }


}
