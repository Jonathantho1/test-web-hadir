Feature: Add user data
  # TCC.HRM.009
  Scenario: Add user data valid
    Given User on the dashboard page
    When Click menu management
    And Click menu user register
    And Input all fields with the correct format
    And Click button submit
    Then Successfully added to user list

  # TCC.HRM.010
  Scenario: Add user data valid without input NIK
    Given User on the dashboard page
    When Click menu management
    And Click menu user register
    And Input all fields with the correct format
    And Clear field NIK
    And Click button submit
    Then Get alert Please fill out this field nik

  # TCC.HRM.011
  Scenario: Add user data valid without input name
    Given User on the dashboard page
    When Click menu management
    And Click menu user register
    And Input all fields with the correct format
    And Clear field name
    And Click button submit
    Then Get alert Please fill out this field name

  # TCC.HRM.012
  Scenario: Add user data valid without input email
    Given User on the dashboard page
    When Click menu management
    And Click menu user register
    And Input all fields with the correct format
    And Clear field email
    And Click button submit
    Then Get alert Please fill out this field email

  # TCC.HRM.013
  Scenario: Add user data valid without input password
    Given User on the dashboard page
    When Click menu management
    And Click menu user register
    And Input all fields with the correct format
    And Clear field password
    And Click button submit
    Then Get alert Please fill out this field password

  # TCC.HRM.014 (gabisa nangkep alert)
  Scenario: Add user data valid with registered email
    Given User on the dashboard page
    When Click menu management
    And Click menu user register
    And Input all fields with the correct format
    And Input registered email
    And Click button submit
    Then Get alert Email sudah terdaftar

  # TCC.HRM.015 (gabisa nangkep alert)
  Scenario: Add user data valid without input employee photo
    Given User on the dashboard page
    When Click menu management
    And Click menu user register
    And Input all fields with the correct format
    And Clear field employee photo
    And Click button submit
    Then Get alert Foto tidak boleh kosong

    # TCC.HRM.016
    Scenario: Input email without symbol at
      Given User on the dashboard page
      When Click menu management
      And Click menu user register
      And Input all fields with the correct format
      And Input email without symbol at
      And Click button submit
      Then Get alert Please include symbol at

    # TCC.HRM.017
    Scenario: Add user data valid without input division
      Given User on the dashboard page
      When Click menu management
      And Click menu user register
      And Input all fields with the correct format
      And Clear field division
      And Click button submit
      Then Get alert Please fill out this field division

    # TCC.HRM.018
    Scenario: Add user data valid without input unit
      Given User on the dashboard page
      When Click menu management
      And Click menu user register
      And Input all fields with the correct format
      And Clear field unit
      And Click button submit
      Then Get alert Please fill out this field unit

    # TCC.HRM.019
    Scenario: Add user data valid without input work position
      Given User on the dashboard page
      When Click menu management
      And Click menu user register
      And Input all fields with the correct format
      And Clear field work position
      And Click button submit
      Then Get alert Please fill out this field work position

    # TCC.HRM.020
    Scenario: Add user data valid without input position
        Given User on the dashboard page
        When Click menu management
        And Click menu user register
        And Input all fields with the correct format
        And Clear field position
        And Click button submit
        Then Get alert Please fill out this field position

    # TCC.HRM.021
    Scenario: Add user data valid without input type contract
        Given User on the dashboard page
        When Click menu management
        And Click menu user register
        And Input all fields with the correct format
        And Clear field type contract
        And Click button submit
        Then Get alert Please fill out this field type contract

    # TCC.HRM.022 (ternyata data berhasil diinput)
    Scenario: Add user data valid without input work location
        Given User on the dashboard page
        When Click menu management
        And Click menu user register
        And Input all fields with the correct format
        And Clear field work location
        And Click button submit
        Then Get alert Please fill out this field work location

    # TCC.HRM.023
    Scenario: Add user data valid without input work schedule
        Given User on the dashboard page
        When Click menu management
        And Click menu user register
        And Input all fields with the correct format
        And Clear field work schedule
        And Click button submit
        Then Get alert Please fill out this field work schedule

    # TCC.HRM.024 (tidak muncul alert)
    Scenario: Add user data valid without input selfie
        Given User on the dashboard page
        When Click menu management
        And Click menu user register
        And Input all fields with the correct format
        And Clear field selfie
        And Click button submit
        Then Get alert Please fill out this field selfie
