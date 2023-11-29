Feature: Management Client Upliner
  #TCC.HW.031
  Scenario: Valid Tambahkan Client Upliner
    Given Klik client upliner
    When Klik tambahkan client upliner
    And Input nama karyawan client upliner
    And Input unused email client upliner
    And Input password client upliner
    And Klik pilih unit client upliner
    And Klik unit client upliner
    And Klik tipe client upliner
    And Klik dropdown tipe client upliner
    And Klik daftar client upliner
    Then Data client upliner terbuat

  #TCC.HW.032
  Scenario: Invalid No Input Tambahkan
    Given Klik tambahkan client upliner
    When Klik daftar client upliner
    Then Mendapatkan alert nama karyawan client upliner

  #TCC.HW.033
  Scenario: Invalid Email Format
    Given Input nama karyawan client upliner
    When input invalid format email client upliner
    And Klik daftar client upliner
    Then Mendapatkan alert email client upliner

  #TCC.HW.034
  Scenario: Invalid No Input Password
    Given input used valid email client upliner
    When Klik daftar client upliner
    Then Mendapatkan alert password client upliner

  #TCC.HW.035
  Scenario: Invalid Input Password Less Than 8 Characters
    Given Input password less than 8 characters
    When Klik daftar client upliner
    Then Mendapatkan alert password client upliner

  #TCC.HW.036
  Scenario: Invalid No Input Unit
    Given Input password client upliner
    When Klik daftar client upliner
    Then Mendapatkan alert unit client upliner

  #TCC.HW.037
  Scenario: Invalid Tambahkan Used Email
    Given Klik pilih unit client upliner
    When Klik unit client upliner
    And Klik tipe client upliner
    And Klik dropdown tipe client upliner 2
    And Klik daftar client upliner
    Then Mendapatkan alert Email sudah terdaftar

  #TCC.HW.038
  Scenario: Valid Edit Client Upliner Edit
    Given Klik client upliner 2
    When Klik kebab button client upliner
    And Klik edit client upliner
    And Upload foto client upliner
    And Delete nama karyawan lama client upliner
    And Input nama karyawan baru client upliner
    And Delete email lama client upliner
    And Input email baru client upliner
    And Delete unit lama client upliner
    And Input unit baru client upliner
    And Klik unit baru client upliner
    And Klik ubah client upliner
    Then Data baru berhasil diubah

  #TCC.HW.039
  Scenario: Invalid Edit Client Upliner No Data
    Given Klik kebab button client upliner
    When Klik edit client upliner
    And Upload foto client upliner
    And Delete nama karyawan lama client upliner
    And Delete email lama client upliner
    And Delete unit lama client upliner
    And Klik ubah client upliner
    Then Mendapatkan alert pada nama karyawan client upliner

  #TCC.HW.040
  Scenario: Invalid Edit Client Upliner No Email And Unit
    Given Input nama karyawan baru client upliner
    When Klik ubah client upliner
    Then Mendapatkan alert pada nama email client upliner

  #TCC.HW.041
  Scenario: Invalid Edit Client Upliner Invalid Email Format And No Unit
    Given input email tanpa at
    When Klik ubah client upliner
    Then Mendapatkan alert pada nama email client upliner

  #TCC.HW.042
  Scenario: Invalid Edit Client Upliner No Unit
    Given Input used email valid format
    When Klik ubah client upliner
    Then Mendapatkan alert pada unit client upliner

  #TCC.HW.043
  Scenario: Invalid Edit Client Upliner Used Email
    Given Input unit baru client upliner
    When Klik unit baru client upliner
    And Klik ubah client upliner
    Then Mendapatkan alert message client upliner

  #TCC.HW.044
  Scenario: Valid Menu data Client Upliner
    Given Klik management button
    When Klik client upliner 3
    Then Mendapatkan data client upliner

  #TCC.HW.045
  Scenario: Valid Row per Page Client Upliner
    Given Klik row per page client upliner
    When Klik angka row per page client upliner
    Then Size page bertambah client upliner
