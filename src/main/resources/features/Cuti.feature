Feature: Laporan Cuti website HADIR
#  TCC.HW.001
  Scenario: Search with button, cuti
    Given User login, cuti
    When User click menu laporan, cuti
    And User click submenu Cuti
    And User input date, cuti
    And User click search btn, cuti
    Then User get search Validation, cuti

#  TCC.HW.002
  Scenario: Search with keyboard, cuti
    Given User click reset button, cuti
    When User input date and press enter, cuti
    Then User get search Validation, cuti

#  TCC.HW.003
  Scenario: Check Reset Button, cuti
    Given User click reset button, cuti
    When User input date and press enter, cuti
    And User click reset button, cuti
    Then User get reset Validation, cuti

#  TCC.HW.004
  Scenario: Negative Reset Button, cuti
    Given User login, cuti
    When User click menu laporan, cuti
    And User click submenu Cuti
    And User input date, cuti
    And User input name, cuti
    And User click search btn, cuti
    And User click reset button, cuti
    Then User get invalid message, cuti

#  TCC.HW.005
  Scenario: Negative Date, cuti
    Given User click reset button, cuti
    When User input date and press enter, cuti
    And User input new date, cuti
    And User click search btn, cuti
    Then User get invalid date, cuti

#  TCC.HW.006
  Scenario: Search karyawan Cuti by name, cuti
    Given User click reset button, cuti
    When User input date, cuti
    And User input name, cuti
    And User click search btn, cuti
    Then User get name Validation, cuti

#  TCC.HW.007
  Scenario: Rowpage validation, cuti
    Given User click reset button, cuti
    When Change page, cuti
    Then User get page Validation, cuti
