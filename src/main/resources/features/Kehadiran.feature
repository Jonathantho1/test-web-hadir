Feature: Laporan Kehadiran website HADIR
#  TCC.HW.001
  Scenario: Search with button, Kehadiran
    Given User login, Kehadiran
    When User click menu laporan, Kehadiran
    And User click submenu kehadiran
    And User input date, Kehadiran
    And User click search btn, Kehadiran
    Then User get search Validation, Kehadiran

#  TCC.HW.002
  Scenario: Search with keyboard, Kehadiran
    Given User click reset button, Kehadiran
    When User input date and press enter, Kehadiran
    Then User get search Validation, Kehadiran

#  TCC.HW.003
  Scenario: Check Reset Button, Kehadiran
    Given User click reset button, Kehadiran
    When User input date and press enter, Kehadiran
    And User click reset button, Kehadiran
    Then User get reset Validation, Kehadiran

#  TCC.HW.004
  Scenario: Negative Reset Button, Kehadiran
    Given User login, Kehadiran
    When User click menu laporan, Kehadiran
    And User click submenu kehadiran
    And User input date, Kehadiran
    And User input name, Kehadiran
    And User click search btn, Kehadiran
    And User click reset button, Kehadiran
    Then User get invalid message, Kehadiran

#  TCC.HW.005
  Scenario: Negative Date, Kehadiran
    Given User click reset button, Kehadiran
    When User input date and press enter, Kehadiran
    And User input new date, Kehadiran
    And User click search btn, Kehadiran
    Then User get invalid date, Kehadiran

#  TCC.HW.006
  Scenario: Search karyawan kehadiran by name, Kehadiran
    Given User click reset button, Kehadiran
    When User input date, Kehadiran
    And User input name, Kehadiran
    And User click search btn, Kehadiran
    Then User get name Validation, Kehadiran

#  TCC.HW.007
  Scenario: Search karyawan kehadiran by department, Kehadiran
    Given User click reset button, Kehadiran
    When User input date, Kehadiran
    And User input department, Kehadiran
    Then User get department Validation, Kehadiran

#  TCLP.SD.008
  Scenario: Export data
    Given User click reset button, Kehadiran
    When User input date and press enter, Kehadiran
    And User click export button, Kehadiran
    Then User get export Validation, Kehadiran

#  TCLP.SD.009
  Scenario: Rowpage validation, Kehadiran
    Given User click cancel export button
    When User click reset button, Kehadiran
    And Change page, Kehadiran
    Then User get page Validation, Kehadiran
