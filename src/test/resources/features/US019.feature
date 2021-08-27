Feature: US_019 banka_hesabi_olusturma

  Background: US_019_ilkSekizStep

    Given kullanci "url_home" sayfasina gider
    And insan butonuna tiklar
    And sign in click yapar
    And acilan sayfada username girer
    And acilan sayfada password girer
    And kulanici ikinci Signin butonuna tiklar
    And My operations yazisina click yap
    And Manage Accounts yazisina click yap
    And Create a new Account butonuna click yap


  @ripemre1
  Scenario: TC_2001

    And Description text box'una bir aciklama gir

  @ripemre2
  Scenario: TC_2002

    And Balance text box una gecerli bir bakiye girilmelidir

  @ripemre3
  Scenario: TC_2003

    And Account Type kismindan bir hesap türü sec

  @ripemre4
  Scenario: TC_2004

    And Account Status Type kismindan hesap durumunu tanimla

  Scenario: TC_2005