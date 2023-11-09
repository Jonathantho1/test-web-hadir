package com.juaracoding.utils;

public enum TestCases {

    T1("Login Valid Test"),
    T2("Valid Input dan Search"),
    T3("Valid Reset"),
    T4("Valid Rows per Page"),
    T5("Valid Tambah Unit/Department"),
    T6("Batal Valid Unit/Department"),
    T7("Tidak Input Pada Unit/Department"),
    T8("Input Nama Departement yang Sudah Ada"),
    T9("Valid Edit Data Unit/Department"),
    T10("Batal Edit data Unit/Department"),
    T11("Tidak input update Unit/Department");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
