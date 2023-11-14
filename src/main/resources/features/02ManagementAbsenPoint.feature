Feature: Absen Point
  #TCC.HW.001
  Scenario: Menambahkan Data Absen Point
    Given User click menu Management
    When User click menu Absent Point
    And User click button tambahkan
    And Input Nama
    And Klik Maps
    And Input Deskripsi
    And Klik Button Tambah
  #TCC.HW.002
  Scenario: Invalid Menambahkan Data Absen Point
    Given User click button tambahkan
    When Input Nama
    And Kosongkan Kolom Input Deskripsi
    And Klik Button Tambah
    And Klik Button Batal
  #TCC.HW.003
  Scenario: Invalid Menambahkan Data Absen Point Ke-2
    Given User click button tambahkan
    When Kosongkan Kolom Input Nama
    And Input Deskripsi
    And Klik Button Tambah
    And Klik Button Batal
  #TCC.HW.004
  Scenario: Valid Edit Data Absen Point
    Given Klik Titik Tiga
    When Klik Edit
    And Input Edit Nama
    And Input Edit Deskripsi
    And Klik Button Simpan
    #TCC.HW.005
  Scenario: Valid Delete Data Absen Point
    Given Klik Titik Tiga
    When Klik Delete
    And Klik Button Ya
    And Klik Button Tidak
    And Klik Titik Tiga Tutup
    #TCC.HW.006
  Scenario: Valid Search Data Berdasarkan Nama
    Given Input Nama Data Pada Kolom Search
    When Klik Button Search
    #TCC.HW.007
  Scenario: Valid Reset Kolom Search
    Given Klik Button Reset




