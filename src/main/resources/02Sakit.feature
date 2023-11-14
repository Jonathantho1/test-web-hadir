Feature: Laporan Sakit
  #TCC.HW.001
  Scenario: Search Data Sakit Berdasarkan Nama
    Given user klik menu laporan
    When user klik menu sakit
    And user input search
    And user click button search
    #TCC.HW.002
  Scenario: Search Data Sakit Berdasarkan Tanggal
    Given user klik button reset
    When user input start date
    And user input end date
    And user click button search
    #TCC.HW.003
