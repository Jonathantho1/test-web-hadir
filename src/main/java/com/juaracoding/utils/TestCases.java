package com.juaracoding.utils;

public enum TestCases {

    T1("Login Valid Test"),
    T2("Login with Password Invalid Test"),
    T3("Login with Username Invalid Test"),
    T4("Login without Username Invalid Test"),
    T5("Input Data Vacancy");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
