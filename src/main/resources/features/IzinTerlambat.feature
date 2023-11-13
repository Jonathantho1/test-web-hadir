Feature: Laporan Izin Terlambat website HADIR
#  TCC.HW.001
  Scenario: Search with button, izinTerlamabat
    Given User login, izinTerlamabat
    When User click menu laporan, izinTerlamabat
    And User click submenu Izin Terlambat
    And User input date, izinTerlamabat
    And User click search btn, izinTerlamabat
    Then User get search Validation, izinTerlamabat

#  TCC.HW.002
  Scenario: Search with keyboard, izinTerlamabat
    Given User click reset button, izinTerlamabat
    When User input date and press enter, izinTerlamabat
    Then User get search Validation, izinTerlamabat

#  TCC.HW.003
  Scenario: Check Reset Button, izinTerlamabat
    Given User click reset button, izinTerlamabat
    When User input date and press enter, izinTerlamabat
    And User click reset button, izinTerlamabat
    Then User get reset Validation, izinTerlamabat

#  TCC.HW.004
  Scenario: Negative Reset Button, izinTerlamabat
    Given User login, izinTerlamabat
    When User click menu laporan, izinTerlamabat
    And User click submenu Izin Terlambat
    And User input date, izinTerlamabat
    And User input name, izinTerlamabat
    And User click search btn, izinTerlamabat
    And User click reset button, izinTerlamabat
    Then User get invalid message, izinTerlamabat

#  TCC.HW.005
  Scenario: Negative Date, izinTerlamabat
    Given User click reset button, izinTerlamabat
    When User input date and press enter, izinTerlamabat
    And User input new date, izinTerlamabat
    And User click search btn, izinTerlamabat
    Then User get invalid date, izinTerlamabat

#  TCC.HW.006
  Scenario: Search karyawan Izin Terlambat by name, izinTerlamabat
    Given User click reset button, izinTerlamabat
    When User input date, izinTerlamabat
    And User input name, izinTerlamabat
    And User click search btn, izinTerlamabat
    Then User get name Validation, izinTerlamabat

#  TCC.HW.007
  Scenario: Search karyawan Izin Terlambat by department, izinTerlamabat
    Given User click reset button, izinTerlamabat
    When User input date, izinTerlamabat
    And User input department, izinTerlamabat
    Then User get department Validation, izinTerlamabat

#  TCC.HW.008
  Scenario: Rowpage validation, izinTerlamabat
    Given User click reset button, izinTerlamabat
    When Change page, izinTerlamabat
    Then User get page Validation, izinTerlamabat
