Feature: Jadwal
  #TCC.HW.020
  Scenario: Valid Menambahkan Data Jadwal
    Given User click menu Jadwal
    When User click button tambahkan Jadwal
    And Pilih Tipe Jadwal
    And Klik Tipe Jadwal
    And Input Nama Jadwal
    And Klik Button Hari Kerja
    And Pilih Hari Senin
    And Klik Hari Senin
    And Klik Button Terapkan
    And Input Toleransi
    And Klik Button Tambah Jadwal

  #TCC.HW.021
Scenario: Valid Detail Data Jadwal
  Given Klik Titik Tiga
  When Klik Detail Jadwal
  And Klik Button Kembali

  #TCC.HW.022
Scenario: Valid Edit Data Jadwal
  Given Klik Edit
  When Input Edit Nama Jadwal
  And Klik Button Hari Kerja
  And Klik Button Terapkan
  And Klik Button Simpan

   #TCC.HW.023
Scenario: Valid Delete Data Jadwal
  Given Klik Titik Tiga
  When Klik Delete Jadwal
  And Klik Button Ya

  #TCC.HW.024
Scenario: Valid Search Data Berdasarkan Nama
  Given Input Nama Jadwal Pada Kolom Search
  When Klik Button Search

  #TCC.HW.025
Scenario: Valid Reset Kolom Search
  Given Klik Button Reset Jadwal

