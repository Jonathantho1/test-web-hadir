Feature: Management Posisi

  #TCC.HW.020
  Scenario: Valid Search Posisi
    Given Klik posisi
    When  Input data search
    And Klik search posisi
    Then Mendapatkan data input

  #TCC.HW.021
  Scenario: Valid Reset Posisi
    Given Klik reset posisi
    Then Balik ke default data

  #TCC.HW.022
  Scenario: Valid Page Row Posisi
    Given Klik row per page posisi
    When Klik angka row per page posisi
    Then Size page bertambah posisi

  #TCC.HW.023
  Scenario: Valid Tambah Data Posisi
    Given  Klik tambahkan posisi
    When Input nama posisi
    And Klik nama departement
    And Klik departement yang ingin dipilih
    And Klik tambah posisi
    Then Posisi baru bertambah

  #TCC.HW.024
  Scenario: Invalid Tekan Tambah Data Langsung Posisi
    Given Klik tambahkan posisi
    When Klik tambah posisi
    Then Mendapatkan alert nama divisi

  #TCC.HW.025
  Scenario: Invalid Nama Position Tanpa Divisi Posisi
    Given Input nama posisi
    When Klik tambah posisi
    Then Tetap dalam page tambah position

  #TCC.HW.026
  Scenario: Invalid Divisi Tanpa Nama Position Posisi
    Given Klik tambahkan posisi
    When Klik nama departement
    And Klik departement yang ingin dipilih 2
    And Klik tambah posisi
    Then Mendapatkan alert nama divisi

  #TCC.HW.027
  Scenario: Valid Button Batal Posisi
    Given Klik batal tambahkan posisi
    Then Data tidak ada perubahan

  #TCC.HW.028
  Scenario: Valid Edit Button Posisi
    Given Klik data kebab button
    When Klik edit posisi
    And Delete nama posisi
    And  Input nama yang berbeda
    And Klik simpan posisi
    Then Nama posisi berubah

  #TCC.HW.029
  Scenario: invalid Edit Button Posisi
    Given Klik data kebab button
    When Klik edit posisi
    And Delete nama posisi
    And Klik simpan posisi
    Then Tetap di dalam tampilan edit posisi

  #TCC.HW.030
  Scenario: Valid Edit button Batal Posisi
    Given Klik batal posisi
    Then Data tidak berubah









