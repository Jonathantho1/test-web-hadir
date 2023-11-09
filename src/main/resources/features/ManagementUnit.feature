Feature: Management Unit
  # TCC.HW.001
  Scenario: Valid Input dan Search
    Given Klik management button
    When Klik unit button
    And Input nama department pada search
    And Klik search
    And Menampilkan nama department
    And Menampilkan tanggal rilis
    Then Menampilkan tanggal update

  # TCC.HW.002
  Scenario: Valid Reset
    Given Klik reset
    Then Balik ke tampilan default

  # TCC.HW.003
  Scenario: Valid Tambah Unit atau Department
    Given Klik tambahkan
    When Input nama department
    And Klik tambah
    Then Nama department yang diinput muncul

  # TCC.HW.005
  Scenario: Batal Valid Unit atau Department
    Given Klik tambahkan
    When Input nama department
    And Klik batal
    Then Data baru batal dimasukkan