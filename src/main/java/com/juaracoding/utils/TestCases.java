package com.juaracoding.utils;

public enum TestCases {

    T1("Login Valid Test"),

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
