package com.juaracoding.utils;

public enum TestCases {
    T1("URL Login valid"),
    T2("URL Login invalid"),
    T3("Login valid email & password"),
    T4("Login invalid email & valid password"),
    T5("Login valid email & invalid password"),
    T6("Logout of account"),
    T8("Dashboard page valid"),
    T9("Add user data valid"),
    T10("Add user data valid without input NIK"),
    T11("Add user data valid without input name"),
    T12("Add user data valid without input email"),
    T13("Add user data valid without input password"),
    T14("Add user data valid with registered email"),
    T15("Add user data valid without input employee photo"),
    T16("Input email without symbol at"),
    T17("Add user data valid without input division"),
    T18("Add user data valid without input unit"),
    T19("Add user data valid without input work position"),
    T20("Add user data valid without input position"),
    T21("Add user data valid without input type contract"),
    T22("Add user data valid without input work location"),
    T23("Add user data valid without input work schedule"),
    T24("Add user data valid without input selfie"),
    T25("Search for user data based on the correct name"),
    T26("Search for user data based on the correct nik"),
    T27("Reset search data"),
    T28("Edit data via view data user"),
    T29("Edit data via checkbox"),
    T30("Delete data user"),
    T31("Show data row per page"),
    T32("Search division based on the correct name"),
    T33("Reset result search division"),
    T234("Add division");


    private String testCaseName;

    TestCases(String value) {
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
