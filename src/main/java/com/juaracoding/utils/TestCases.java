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
    T11("Tidak input update Unit/Department"),
    T12("Valid Tambah Unit Setting"),
    T13("Tidak Memilih Department Tambah Unit Setting"),
    T14("Memilih Department yang ada di Unit Setting"),
    T15("Batal Valid Department Tambah Unit Setting"),
    T16("Matikan Selfie"),
    T17("Hidupkan Selfie"),
    T18("Tidak Delete Data"),
    T19(" Delete Data"),
    T20("Valid Row per Page");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
