package com.dabApp.InventoryManagement.business.exception;

public class DuplicateEmailException extends RuntimeException
{
    public DuplicateEmailException(String message){
        super(message);
    }
}
