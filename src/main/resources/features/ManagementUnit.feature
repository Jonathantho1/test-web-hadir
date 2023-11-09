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
  Scenario: Valid Rows per Page
    Given Klik row per page
    When Klik angka row per page
    Then Size page bertambah

  # TCC.HW.004
  Scenario: Valid Tambah Unit/Department
    Given Klik tambahkan
    When Input nama department
    And Klik tambah
    Then Nama department yang diinput muncul

  # TCC.HW.005
  Scenario: Batal Valid Unit/Department
    Given Klik tambahkan
    When Input nama department
    And Klik batal
    Then Data baru batal dimasukkan

  #TCC.HW.006
  Scenario: Tidak Input Pada Unit/Department
    Given Klik tambahkan
    When Klik tambah
    Then Mendapatkan alert

  #TCC.HW.007
  Scenario: Input Nama Departement yang Sudah Ada
    Given Input nama department yang sudah ada dalam database
    When Klik tambah
    Then Tetap dalam tampilan Tambah Departements

  #TCC.HW.008
  Scenario: Valid Edit Data Unit/Department
    Given Klik kebab menu pada data yang ingin di edit
    When Klik edit
    And Input edit nama department
    And Klik simpan
    Then Nama department berhasil di update


  #TCC.HW.009
  Scenario: Batal Edit data Unit/Department
    Given Klik kebab menu pada data yang ingin di edit
    When Klik edit
    And Input edit nama department
    And Klik batal pada edit
    Then Nama department tidak di update


  #TCC.HW.010
  Scenario: Tidak input update Unit/Department
    Given Klik edit
    When Hapus inputan
    And Klik simpan
    Then Mendapatkan alert
