Feature: Laporan PerjalananDinas
  #TCC.HW.003
  Scenario: Search Data PerjalananDinas Berdasarkan Nama
    Given user klik menu perjalanandinas
    When user input search perjalanandinas
    And user klik button search perjalanandinas
    #TCC.HW.004
  Scenario: Search Data PerjalananDinas Berdasarkan Tanggal
    Given user klik button reset perjalanandinas
    When user input start date perjalanandinas
    And user input end date perjalanandinas
    And user klik button search perjalanandinas