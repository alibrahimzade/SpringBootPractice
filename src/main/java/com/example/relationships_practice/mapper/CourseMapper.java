package com.example.relationships_practice.mapper;

import com.example.relationships_practice.dao.CourseEntity;
import com.example.relationships_practice.model.CourseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    List<CourseDto> mapEntityToDtoList(List<CourseEntity> courseEntityList);
}
