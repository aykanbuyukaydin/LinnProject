
Feature: US018_musteri yonetme

  Background: US018_ilkSekizStep

    Given kullanci "url_home" sayfasina gider
    And insan butonuna tiklar
    And sign in click yapar
    And User Name gir
    And Paswword gir
    And Sign in click yap
    And My operations yazisina click yap
    And Manage Customers yazisina click yap


  Scenario: TC1001

    Then Customers yazisin görünür mü check et


  Scenario:TC_1002

    And View butonuna click yap
    Then Customer yazisi görülmeli

  Scenario: TC_1003

    And Edit butonuna click yap
    Then Create or edit a user yazisi görünür olmali

  Scenario: TC_1004

    And Edit butonuna click yap
    And lastname degistir
    And Save butonuna click yap
    And translation-not-found[gmiBankBackendApp.tPCustomer.updated] yazisi görülmeli

  Scenario: TC_1005

    And Delete butonuna click yap
    And confirmDeleteOperation yazisi görülmeli
    And Acilan penceredeki delete butonuna click yap
    And translation-not-found[gmiBankBackendApp.tPCustomer.deleted] yazisi görülmeli