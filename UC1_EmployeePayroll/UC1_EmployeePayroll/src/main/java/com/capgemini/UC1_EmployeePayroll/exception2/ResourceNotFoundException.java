package com.capgemini.UC1_EmployeePayroll.exception2;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}