@US_0010
Feature: US0010_Customer Address Creation

  Background: US0010_Customer Address Creation
    Given "url_home" adresine giris yapilir
    Then Anasayfada yer alan insan figurune tiklanir
    And Acilan kutudaki Sing in sekmesine tiklanir
    And Employee olarak giris yapilir
    And Acilan sayfadaki My Operations yazisina tiklanir
    And Acilan kutudaki Manage Customers sekmesine tiklanir
    And Acilan sayfadaki Create a new Customer butonuna tiklanir
    And SSN textbox'ina kayitli bir SSN no girilir.
    And Search butonuna tiklanir
    And Middle Initial textbox'ina gecerli veri girilir.
    And Phone Number textbox'ina gecerli veri girilir.
    And Zip Code textbox'ina gecerli veri girilir.
    And City textbox'ina gecerli bir city girilir.


  @tc1001
  Scenario: Employee'nin customer adresi olusturabilmesi
    And Address textbox'inin bos olup olmadigi kontrol edilir.
    And Address textbox bos ise gecerli bilgiler girilir.
    And Save butonuna tiklanir.
    And hata mesajinin geldigi test edilir.
    Then Sayfayi kapatir.

  @tc1002
  Scenario: Employee'nin customer adresi olusturabilmesi
    And Save butonuna tiklanir.
    And hata mesajinin geldigi test edilir.
    Then Sayfayi kapatir.

  @tc1003
  Scenario: Employee'nin customer adresi olusturabilmesi
    And Country dropdown menuden bir country secilir.
    And Save butonuna tiklanir.
    And hata mesajinin geldigi test edilir.
    Then Sayfayi kapatir.

  @tc1004
  Scenario: Employee'nin customer adresi olusturabilmesi
    And Country dropdown menuden bir country secilir.
    And Country bilgisinin USA olup olmadigi kontrol edilir.
    And Country bilgisi USA ise state bilgisi girilir aksi halde bos birakilir.
    And Save butonuna tiklanir.
    And hata mesajinin geldigi test edilir.
    Then Sayfayi kapatir.
