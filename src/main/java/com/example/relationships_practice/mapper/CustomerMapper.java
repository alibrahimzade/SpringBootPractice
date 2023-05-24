package com.example.relationships_practice.mapper;

import com.example.relationships_practice.dao.CustomerEntity;
import com.example.relationships_practice.model.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

//    @Mapping(target = "serialNumber" , source = "passport.serialNumber")
//    @Mapping(target = "courseName" , source = "courseList.courseName")
//    @Mapping(target = "contactType" , source = "contact.contactType")
    @Mapping(target = "courseDtoList" , source = "courseList")
    CustomerDto mapEntityToDto(CustomerEntity customerEntity);


    @Mapping(target = "courseList" , source = "courseDtoList")
    CustomerEntity mapDtoToEntity(CustomerDto customerDto);
}
