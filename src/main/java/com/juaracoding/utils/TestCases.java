package com.juaracoding.utils;

public enum TestCases {
    T1("Login Valid Test"),
    T2("Valid Menambahkan Data Absen Point"),
    T3("Invalid Menambahkan Data Absen Point"),
    T4("Invalid Menambahkan Data Absen Point Ke-2"),
    T5("Valid Edit Data Absen Point"),
    T6("Valid Delete Data Absen Point"),
    T7("Valid Search Data Berdasarkan Nama"),
    T8("Valid Reset Kolom Search"),
    T9("Valid Menambahkan Data Jabatan"),
    T10("Invalid Menambahkan Data Jabatan"),
    T11("Invalid Menambahkan Data Jabatan Ke-2"),
    T12("Valid Edit Data Jabatan"),
    T13("Valid Search Data Berdasarkan Level"),
    T14("Valid Reset Kolom Search"),
    T15("Valid Menambahkan Data Shifting"),
    T16("Invalid Menambahkan Data Shifting"),
    T17("Valid Edit Data Shifting"),
    T18("Valid Search Data Berdasarkan Nama"),
    T19("Valid Reset Kolom Search"),
    T20("Valid Menambahkan Data Jadwal"),
    T21("Valid Detail Data Jadwal"),
    T22("Valid Edit Data Jadwal"),
    T23("Valid Delete Data Jadwal"),
    T24("Valid Search Data Berdasarkan Nama"),
    T25("Valid Reset Kolom Search");





    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
