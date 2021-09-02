@smoketest
Feature: 1.Sprint review meeting (Sprint Demo)


  Scenario: Musteri hesaplar arasi para transferini gerceklestirmesi

    Given kullanici anasayfaya gider ab
    Then kullanici register sayfasına tiklar  ab
    And kullanici register sayfasinda kayit olur ab
    Then admin anasayfaya gider ab
    When admin login sayfasına tiklar ab
    And admin olarak username ve password bilgilerini girip login olur ab
    And kayit olunan kullanicin bilgileri active eder ab
    And admin hesabindan cikis yapar ab
    And employee olarak username ve password bilgilerini girip login olur ab
    When kayit olunan kullaniciya banka hesaplarini entegre eder ab
    Then employee hesabindan cikis yapar ab
    And kullanici olarak username ve password bilgilerini girip login olur ab
    Then kullanici hesap sayfasina tiklar ab
    And kullanici para transferi yapar ab
    Then kullanici para transferi yaptigini dogrular ab

# Dipnot :
# employee kayit olunan kullaniciya banka hesaplarini entegre etmeden once yeni hesap acmasi gerekir
# ama ben bu adimi yapamdim olusturulmus hesaplari entegre etmeyi tercih ettim