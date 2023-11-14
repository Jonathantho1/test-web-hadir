Feature: Jabatan
  #TCC.HW.008
  Scenario: Valid Menambahkan Data Jabatan
    Given User click menu Jabatan
    When User click button tambahkan jabatan
    And Input Nama Jabatan
    And Input Level Jabatan
    And Klik Button Tambah Jabatan
  #TCC.HW.009
  Scenario: Invalid Menambahkan Data Jabatan
    Given User click button tambahkan jabatan
    When Kosongkan Kolom Input Nama Jabatan
    And Input Level Jabatan
    And Klik Button Tambah Jabatan
    And Klik Button Batal Jabatan
  #TCC.HW.010
  Scenario: Invalid Menambahkan Data Jabatan Ke-2
    Given User click button tambahkan jabatan
    When Input Nama Jabatan
    And Kosongkan Kolom Input Level Jabatan
    And Klik Button Tambah Jabatan
    And Klik Button Batal Jabatan
  #TCC.HW.011
  Scenario: Valid Edit Data Jabatan
    Given Klik Titik Tiga
    When Klik Edit
    And Input Edit Level
    And Klik Button Simpan
  #TCC.HW.012
  Scenario: Valid Search Data Berdasarkan Level
    Given Input Level Jabatan Pada Kolom Search
    When Klik Button Search
  #TCC.HW.013
  Scenario: Valid Reset Kolom Search
    When Klik Button Reset