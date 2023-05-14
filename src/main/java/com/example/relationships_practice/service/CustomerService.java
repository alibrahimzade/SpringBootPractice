package com.example.relationships_practice.service;

import com.example.relationships_practice.dao.CustomerEntity;
import com.example.relationships_practice.exceptions.NoSuchCustomerException;
import com.example.relationships_practice.mapper.CourseMapper;
import com.example.relationships_practice.mapper.CustomerMapper;
import com.example.relationships_practice.model.CourseDto;
import com.example.relationships_practice.model.CustomerDto;
import com.example.relationships_practice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;


//    public CustomerDto getById(Long id){
//        log.info("we are looking for the customer");
//
//        CustomerEntity customerEntity = customerRepository.findById(id)
//                .orElseThrow(() -> new NoSuchCustomerException("Customer is not found"));
//
//        return CustomerMapper.INSTANCE.mapEntityToDto(customerEntity);
//    }

    public  CustomerDto getById(Long id){

        CustomerEntity customerEntity = customerRepository.findById(id)
                .orElseThrow(() -> new NoSuchCustomerException("Customer is not found"));


//        List<CourseDto> courseDto = CourseMapper.INSTANCE.mapEntityToDtoList(customerEntity.getCourseList());
        CustomerDto customerDto = CustomerMapper.INSTANCE.mapEntityToDto(customerEntity);
//        customerDto.setCourseDtoList(courseDto);

        return customerDto;
    }


    public void createCustomer(CustomerDto customer){
        log.info("creating the customer... ");

        CustomerEntity customerEntity = CustomerMapper.INSTANCE.mapDtoToEntity(customer);
        customerRepository.save(customerEntity);

        log.info("customer is created ");
    }

    public List<CustomerDto> getAll(){
        log.info("customers are found ");
        List<CustomerEntity> customerEntityList = customerRepository.findAll();
        return customerEntityList.stream().map(customer -> CustomerMapper.INSTANCE.mapEntityToDto(customer)).toList();

    }
}
