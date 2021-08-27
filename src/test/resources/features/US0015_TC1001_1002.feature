Feature: US0015_Hesaplar
  Background: US0015_ilkYediStep
    Given kullanici "url_home" sayfasina gider
    And insan simgesine tiklar
    Then sign in butonuna tiklar
    Given username boxina kullanici ismini girer
    And password boxina sifresini girer
    Then sign in boxina click yapar
    Given my operations'a tiklar

  Scenario: TC1001_HesaplarVarMi

    And my accounts'a tiklar
    Then hesaplardan birinin hesap turunu gorur
    Then hesaplardan birinin hesap bakiyesini gorur

  Scenario: TC1002_HesapIslemleri

    And my accounts'a tiklar
    Then New Transaction butonunu click yapar
    Then Description altinda yer alan aciklamayi gorur