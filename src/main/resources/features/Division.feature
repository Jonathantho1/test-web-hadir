Feature: Division
  # TCC.HRM.032
  Scenario: Search division based on the correct name
    Given User on the dashboard page
    When Click menu management
    And Click menu division
    And Input the correct division
    And Click button search div
    Then Get valid result division

  # TCC.HRM.033
  Scenario: Reset result search division
    Given User on the dashboard page
    When Click menu management
    And Click menu division
    And Input the correct division
    And Click button search div
    And Get valid result division
    And Click button reset
    Then Display all division

  # TCC.HRM.034
  Scenario: Add division
    Given User on the dashboard page
    When Click menu management
    And Click menu division
    And Click button add
    And Input new division
    And Click button add division
    Then Success add new division