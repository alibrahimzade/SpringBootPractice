package com.example.relationships_practice.model;

import com.example.relationships_practice.dao.PassportEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id;

    private String name;

    private Integer age;
    private PassportEntity passport;
    private List<CourseDto> courseDtoList;
}
