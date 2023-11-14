Feature: Laporan Lembur
  #TCC.HW.003
  Scenario: Search Data Lembur Berdasarkan Nama
    Given user klik menu lembur
    When user input search lembur
    And user klik button search lembur
    #TCC.HW.004
  Scenario: Search Data Lembur Berdasarkan Tanggal
    Given user klik button reset lembur
    When user input start date lembur
    And user input end date lembur
    And user klik button search lembur