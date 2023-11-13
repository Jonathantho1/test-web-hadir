package com.juaracoding.utils;

public enum TestCases {

//    Cuti
    T1("Search with button, cuti"),
    T2("Search with keyboard, cuti"),
    T3("Check Reset Button, cuti"),
    T4("Negative Reset Button, cuti"),
    T5("Negative Date, cuti"),
    T6("Search karyawan Cuti by name, cuti"),
    T7("Rowpage validation, cuti"),

    //    Izin Pulang Cepat
    T8("Search with button, izinPulangCepat"),
    T9("Search with keyboard, izinPulangCepat"),
    T10("Check Reset Button, izinPulangCepat"),
    T11("Negative Reset Button, izinPulangCepat"),
    T12("Negative Date, izinPulangCepat"),
    T13("Search karyawan Izin Pulang Cepat by name, izinPulangCepat"),
    T14("Search karyawan Izin Pulang Cepat by department, izinPulangCepat"),
    T15("Rowpage validation, izinPulangCepat"),

    //    Izin Terlambat
    T16("Search with button, izinTerlamabat"),
    T17("Search with keyboard, izinTerlamabat"),
    T18("Check Reset Button, izinTerlamabat"),
    T19("Negative Reset Button, izinTerlamabat"),
    T20("Negative Date, izinTerlamabat"),
    T21("Search karyawan Izin Terlambat by name, izinTerlamabat"),
    T22("Search karyawan Izin Terlambat by department, izinTerlamabat"),
    T23("Rowpage validation, izinTerlamabat"),

    //Kehadiran
    T24("Search with button, Kehadiran"),
    T25("Search with keyboard, Kehadiran"),
    T26("Check Reset Button, Kehadiran"),
    T27("Negative Reset Button, Kehadiran"),
    T28("Negative Date, Kehadiran"),
    T29("Search karyawan kehadiran by name, Kehadiran"),
    T30("Search karyawan kehadiran by department, Kehadiran"),
    T31("Export data"),
    T32("Rowpage validation, Kehadiran");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
