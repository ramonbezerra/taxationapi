package com.enterprise.taxationapi.exceptions;

public class ExistingCompanyException extends Exception{
    
    public ExistingCompanyException (String msg) {
        super(msg);
    }
}
