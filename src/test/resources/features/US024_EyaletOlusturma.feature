@TC_024
Feature: US024_Eyalet_Olusturma

  Scenario: US024_Eyalet_Olusturma

    Given Kullanici tum eyaletleri "https://www.gmibank.com/api/tp-states" endpointini kullanarak okur.SU
    And Kullanici "https://www.gmibank.com/api/tp-states" endpointi kullanarak yeni bir eyalet olusturur.SU
    Then Kullanici yeni olusturdugu eyaleti validate eder.SU

