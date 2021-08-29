Feature: US0016_ParaTransfer
  Background: US0016_ilkYediStep
    Given kullanici "url_home" sayfasina gider
    And insan simgesine tiklar
    Then sign in butonuna tiklar
    Given username boxina kullanici ismini girer
    And password boxina sifresini girer
    Then sign in boxina click yapar
    Given my operations'a tiklar

  Scenario: TC1001_HesaplarVarMi

    And my accounts'a tiklar
    And Customer Accounts yazisini gorur

  Scenario: TC1002_FromdanHesapSecme

    And Transfer Money'e tiklar
    And Ilk hesabi secer

  Scenario: TC1003_TodanIkinciHesapSecme

    And Transfer Money'e tiklar
    And Ilk hesabi secer
    And To cubugundan ikinci hesabi secer

  Scenario: TC1004_Descriptiona transfer aciklamasi girer

    And Transfer Money'e tiklar
    And Ilk hesabi secer
    And To cubugundan ikinci hesabi secer
    And Descriptiona transfer aciklamasi girer

  Scenario: TC1005_transferin gerceklestigini gorur

    And Transfer Money'e tiklar
    And Ilk hesabi secer
    And To cubugundan ikinci hesabi secer
    And Balance boxina bir miktar girer
    And Descriptiona transfer aciklamasi girer
    And tranferi gerceklestirir
    And Transfer is succesfull alertini gorur.