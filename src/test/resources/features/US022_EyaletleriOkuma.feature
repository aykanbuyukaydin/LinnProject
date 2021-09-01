@raporUS022
Feature: US022_Eyaletleri Okuma

  @raporTC2201
  Scenario: TC2201_Endpoint den Eyaletleri Okuma ve Kontrol Etme

    Given Kullanıcı "https://www.gmibank.com/api/tp-states" endpointe gider ve dataları okur ab
    Then Verilen eyaletlerin doğruluğunu kontrol eder ab