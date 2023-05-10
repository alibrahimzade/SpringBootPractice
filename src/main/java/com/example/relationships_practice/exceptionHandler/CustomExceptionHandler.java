package com.example.relationships_practice.exceptionHandler;

import com.example.relationships_practice.exceptions.NoSuchCustomerException;
import com.example.relationships_practice.model.ExceptionDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {
    @ExceptionHandler(value = NoSuchCustomerException.class)
    public ExceptionDto handleNoSuchCustomerException(NoSuchCustomerException exception){
        log.error("not found exception {}",exception.getMessage());
        return new ExceptionDto(HttpStatus.NOT_FOUND.value(),exception.getMessage());
    }
}
