Feature: Dashboard
  # TCC.HRM.008
  Scenario: Dashboard page valid
    Given User on the dashboard page
    When Displays the total of all employees
    Then Displays total absences for today