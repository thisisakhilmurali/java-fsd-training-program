package com.example.exceptionvalidation.exception;

import jakarta.validation.Path.Node;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public Map<String, String> handleInvalidArgument(ConstraintViolationException methodArgumentNotValidException) {

        Map<String, String> errorMap = new HashMap<>();

        methodArgumentNotValidException.getConstraintViolations().forEach(error -> {

            for(Node node: error.getPropertyPath()) {
                errorMap.put(node.getName(), error.getMessage());
            }


        });

        return errorMap;

    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String, String> handleBusinesException(UserNotFoundException userNotFoundException) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", userNotFoundException.getMessage());
        return errorMap;
    }

}
