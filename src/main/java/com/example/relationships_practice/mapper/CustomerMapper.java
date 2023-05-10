package com.example.relationships_practice.mapper;

import com.example.relationships_practice.dao.CustomerEntity;
import com.example.relationships_practice.model.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "serialNumber" , source = "passport.serialNumber")
//    @Mapping(target = "courseName" , source = "courseList.courseName")
//    @Mapping(target = "contactType" , source = "contact.contactType")
    CustomerDto mapEntityToDto(CustomerEntity customerEntity);


    CustomerEntity mapDtoToEntity(CustomerDto customerDto);
}
