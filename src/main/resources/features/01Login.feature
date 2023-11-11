Feature: Login Web HADIR
  # TCC.HW.001
  Scenario: Login Valid Test
    Given User enter url HADIR
    When Input password yang terdaftar
    And User input valid password
    And Klik tombol Masuk
    Then User dapat masuk ke halaman dashboard