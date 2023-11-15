Feature: Self Registration
  # TCC.HRM.025
  Scenario: Search for user data based on the correct name
    Given User on the dashboard page
    When Click menu management
    And Click menu self register
    And Input the correct name in the search field
    And Click button search
    And Get valid result data name

  # TCC.HRM.026
  Scenario: Search for user data based on the correct nik
    Given User on the dashboard page
    When Click menu management
    And Click menu self register
    And Choose dropdown nik
    And Input the correct nik in the search field
    And Click button search
    And Get valid result data nik

  # TCC.HRM.027
  Scenario: Reset search data
    Given User on the dashboard page
    When Click menu management
    And Click menu self register
    And Input the correct name in the search field
    And Click button search
    And Get valid result data name
    And Click button reset
    Then Show all data

  # TCC.HRM.028
  Scenario: Edit data via view data user
    Given User on the dashboard page
    When Click menu management
    And Click menu self register
    And Click view data user
    And Fill in all user view data fields
    And Click button submit view update
    Then Update data success

  # TCC.HRM.029 (gagal)
  Scenario: Edit data via checkbox
    Given User on the dashboard page
    When Click menu management
    And Click menu self register
    And Click checkbox user
    And Click update dichecklist
    And Fill in all user data fields
    And Get valid result data name
    And Click button submit update
    Then Update data failed

  # TCC.HRM.030
  Scenario: Delete data user
    Given User on the dashboard page
    When Click menu management
    And Click menu self register
    And Click delete user button
    And Click button ya
    Then Success delete data

  # TCC.HRM.031
  Scenario: Show data row per page
    Given User on the dashboard page
    When Click menu management
    And Click menu self register
    And Click row per page
    When Choose number row per page
    And Success change size page