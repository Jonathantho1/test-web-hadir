Feature: Login Hadir Web
  # TCC.HRM.001
  Scenario: URL Login valid
    Given User enter URL HW valid login page
    When User click button enter
    Then User on the login page

  # TCC.HRM.002
  Scenario: URL Login invalid
    Given User enter URL HW invalid login page
    When User click button enter
    Then User failed to enter the login page

  # TCC.HRM.003
  Scenario: Login valid email & password
    Given User enter URL HW valid login page
    When User input valid email
    And User input valid password
    And User click button Login
    Then User Login success

  # TCC.HRM.004
  Scenario: Login invalid email & valid password
    Given User enter URL HW valid login page
    When User input invalid email
    And User input valid password
    And User click button Login
    Then Get alert user not found

  # TCC.HRM.005
  Scenario: Login valid email & invalid password
    Given User enter URL HW valid login page
    When User input valid email
    And User input invalid password
    And User click button Login
    Then Get alert wrong email or password

  # TCC.HRM.006
  Scenario: Login without input email & password
    Given User enter URL HW valid login page
    When User click button Login
    Then Get alert user not found

  # TCC.HRM.007
  Scenario: Logout of account
    Given User on the dashboard page
    When User click menu user profile
    And User click button Logout
    Then User on the login page