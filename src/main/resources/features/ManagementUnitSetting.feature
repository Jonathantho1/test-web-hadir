Feature: Management Unit Setting

  #TCC.HW.011
  Scenario: Valid Tambah Unit Setting
    Given Klik batal pada edit unit
    When Klik unit setting
    And Klik tambahkan unit setting
    And Klik nama department
    And Klik department yang ingin dipilih
    And Klik tambah unit setting
    Then Data berhasil ditambahkan ke unit setting

  #TCC.HW.012
  Scenario: Tidak Memilih Department Tambah Unit Setting
    Given Klik tambahkan unit setting
    When Klik tambah unit setting
    Then Mendapatkan message

  #TCC.HW.013
  Scenario: Memilih Department yang ada di Unit Setting
    Given Klik nama department
    When Klik department yang ingin dipilih
    And Klik tambah unit setting
    Then Mendapatkan message


  #TCC.HW.014
  Scenario: Batal Valid Department Tambah Unit Setting
    Given Klik batal pada unit setting
    Then Tidak ada penambahan data pada unit setting

  #TCC.HW.015
  Scenario: Matikan Selfie
    Given Klik button selfie
    When Keluar pop up message
    Then Klik ok

  #TCC.HW.016
  Scenario: Hidupkan Selfie
    Given Klik button selfie
    When Keluar pop up message
    Then Klik ok

  #TCC.HW.017
  Scenario: Tidak Delete Data
    Given Klik delete
    When Klik tidak
    Then  Data masih ada pada unit setting

  #TCC.HW.018
  Scenario: Delete Data
    Given Klik delete
    When  Klik ya
    Then Data terhapus

  #TCC.HW.019
  Scenario: Valid Row per Page
    Given Klik row per page unit setting
    When Klik angka row per page unit setting
    Then Size page berkurang