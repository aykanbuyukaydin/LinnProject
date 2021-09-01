Feature: US024_Eyalet_Olusturma

  Scenario: US024_Eyalet_Olusturma

    Given Kullanici "https://www.gmibank.com/api/tp-states" endpointi kullanarak yeni bir eyalet olusturur.SU
    And Kullanici tum eyaletleri "https://www.gmibank.com/api/tp-states" endpointini kullanarak okur.SU
    Then Kullanici yeni olusturdugu eyaleti validate eder.SU