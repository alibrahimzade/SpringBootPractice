package com.example.relationships_practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id;

    private String name;

    private Integer age;
    private String serialNumber;

    private String courseName;
    private String contactType;
}
