package com.juaracoding.utils;

public enum TestCases {

    T1("Login Valid Test"),
    T2("Valid Input dan Search Unit"),
    T3("Valid Reset Unit"),
    T4("Valid Rows per Page Unit"),
    T5("Valid Tambah Unit/Department"),
    T6("Batal Valid Unit/Department"),
    T7("Tidak Input Pada Unit/Department"),
    T8("Input Nama Departement yang Sudah Ada Unit"),
    T9("Valid Edit Data Unit/Department"),
    T10("Batal Edit data Unit/Department"),
    T11("Tidak input update Unit/Department"),
    T12("Valid Tambah Unit Setting"),
    T13("Tidak Memilih Department Tambah Unit Setting"),
    T14("Memilih Department yang ada di Unit Setting"),
    T15("Batal Valid Department Tambah Unit Setting"),
    T16("Matikan Selfie Unit Setting"),
    T17("Hidupkan Selfie Unit Setting"),
    T18("Tidak Delete Data Unit Setting"),
    T19(" Delete Data Unit Setting"),
    T20("Valid Row per Page Unit Setting"),
    T21("Valid Search Posisi"),
    T22("Valid Reset Posisi"),
    T23("Valid Page Row Posisi"),
    T24("Valid Tambah Data Posisi"),
    T25("Invalid Tekan Tambah Data Langsung Posisi"),
    T26("Invalid Nama Position Tanpa Divisi Posisi"),
    T27("Invalid Divisi Tanpa Nama Position Posisi"),
    T28("Valid Button Batal Posisi"),
    T29("Valid Edit Button Posisi"),
    T30("invalid Edit Button Posisi"),
    T31("Valid Edit button Batal Posisi"),
    T32("Valid Tambahkan Client Upliner"),
    T33("Invalid No Input Tambahkan"),
    T34("Invalid Email Format"),
    T35("Invalid No Input Password"),
    T36("Invalid Input Password Less Than 8 Characters"),
    T37("Invalid No Input Unit"),
    T38("Invalid Tambahkan Used Email"),
    T39("Valid Edit Client Upliner Edit"),
    T40("Invalid Edit Client Upliner No Data"),
    T41("Invalid Edit Client Upliner No Email And Unit"),
    T42("Invalid Edit Client Upliner Invalid Email Format And No Unit"),
    T43("Invalid Edit Client Upliner No Unit"),
    T44("Invalid Edit Client Upliner Used Email"),
    T45("Valid Menu data Client Upliner"),
    T46("Valid Row per Page Client Upliner");
    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
