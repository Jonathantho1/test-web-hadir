package com.juaracoding.utils;

public enum TestCases {

    T1("Login Valid Test"),
    T2("Valid Input dan Search"),
    T3("Valid Reset"),
    T4("Valid Tambah Unit atau Department"),
    T5("Batal Valid Unit atau Department");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
