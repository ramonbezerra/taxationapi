package com.enterprise.taxationapi.exceptions;

public class CompanyNotFoundException extends Exception{

    public CompanyNotFoundException (String msg) {
        super(msg);
    }
}