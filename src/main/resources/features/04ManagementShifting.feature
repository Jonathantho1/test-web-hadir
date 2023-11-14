Feature: Shifting
  #TCC.HW.014
Scenario: Valid Menambahkan Data Shifting
    Given User click menu Shifting
    When User click button tambahkan Shifting
    And Input Nama Jam Kerja
    And Pilih Unit
    And Klik Unit
    And Klik Logo Jam Masuk
    And Pilih Jam Masuk
    And Klik Jam Masuk
    And Klik Logo Jam Keluar
    And Pilih Jam Keluar
    And Klik Button Tambah Shifting
  #TCC.HW.015
Scenario: Invalid Menambahkan Data Shifting
    Given User click button tambahkan Shifting
    When Kosongkan Kolom Nama Jam Kerja
    And Pilih Unit
    And Klik Unit
    And Klik Logo Jam Masuk
    And Pilih Jam Masuk
    And Klik Jam Masuk
    And Klik Logo Jam Keluar
    And Pilih Jam Keluar
    And Klik Button Tambah Shifting
    And Klik Button Batal Shifting
  #TCC.HW.016
Scenario: Valid Edit Data Shifting
    Given Klik Titik Tiga
    When Klik Edit Shifting
    And Input Edit Shifting
    And Klik Button Simpan
  #TCC.HW.017
Scenario: Valid Search Data Berdasarkan Nama
    Given Input Nama Shifting Pada Kolom Search
    When Klik Button Search
  #TCC.HW.018
Scenario: Valid Reset Kolom Search
    Given Klik Button Reset Shifting
