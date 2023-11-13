Feature: Laporan Izin Pulang Cepat website HADIR
  #  TCC.HW.001
  Scenario: Search with button, izinPulangCepat
    Given User login, izinPulangCepat
    When User click menu laporan, izinPulangCepat
    And User click submenu Izin Pulang Cepat
    And User input date, izinPulangCepat
    And User click search btn, izinPulangCepat
    Then User get search Validation, izinPulangCepat

#  TCC.HW.002
  Scenario: Search with keyboard, izinPulangCepat
    Given User click reset button, izinPulangCepat
    When User input date and press enter, izinPulangCepat
    Then User get search Validation, izinPulangCepat

#  TCC.HW.003
  Scenario: Check Reset Button, izinPulangCepat
    Given User click reset button, izinPulangCepat
    When User input date and press enter, izinPulangCepat
    And User click reset button, izinPulangCepat
    Then User get reset Validation, izinPulangCepat

#  TCC.HW.004
  Scenario: Negative Reset Button, izinPulangCepat
    Given User login, izinPulangCepat
    When User click menu laporan, izinPulangCepat
    And User click submenu Izin Pulang Cepat
    And User input date, izinPulangCepat
    And User input name, izinPulangCepat
    And User click search btn, izinPulangCepat
    And User click reset button, izinPulangCepat
    Then User get invalid message, izinPulangCepat

#  TCC.HW.005
  Scenario: Negative Date, izinPulangCepat
    Given User click reset button, izinPulangCepat
    When User input date and press enter, izinPulangCepat
    And User input new date, izinPulangCepat
    And User click search btn, izinPulangCepat
    Then User get invalid date, izinPulangCepat

#  TCC.HW.006
  Scenario: Search karyawan Izin Pulang Cepat by name, izinPulangCepat
    Given User click reset button, izinPulangCepat
    When User input date, izinPulangCepat
    And User input name, izinPulangCepat
    And User click search btn, izinPulangCepat
    Then User get name Validation, izinPulangCepat

#  TCC.HW.007
  Scenario: Search karyawan Izin Pulang Cepat by department, izinPulangCepat
    Given User click reset button, izinPulangCepat
    When User input date, izinPulangCepat
    And User input department, izinPulangCepat
    Then User get department Validation, izinPulangCepat


#  TCC.HW.008
  Scenario: Rowpage validation, izinPulangCepat
    Given User click reset button, izinPulangCepat
    When Change page, izinPulangCepat
    Then User get page Validation, izinPulangCepat
