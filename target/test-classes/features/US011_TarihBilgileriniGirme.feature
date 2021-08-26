@raporUS011
Feature: US011_Tarih Musteri Olusturma Aninda OLusturulmalidir

  Background: Login olarak giris yapip musteri olusturma

    Given Web sayfasina git
    Then Insan Butuna tikla
    And Sign in tikla
    Then User Name gir (customer olarak)
    When Password gir (customer olarak)
    And Sign in click yap
    And Cikan sayfada sag uste My Operations a tikla
    And Manage Customers a tikla
    When Sag uste cikan Create a new Customer butonuna tikla
    And SSN textbox a kayıtlı bir SSN no gir
    When Search butonuna tikla


  @raporTC1101
  Scenario: Tarih, müşteri oluşturma anında oluşturulmalıdır

    Then Middle Initial textbox a data gir
    And Phone Number textbox a data gir
    And Zip Code textbox a data gir
    And City textbox a data gir
    Then Create Date textbox a şu andaki tarihi data gir
    And Account dropdrowndan bir hesap sec
    And Zelle Enrolled box a tik at
    And Save botonuna tikla
    And translation-not-found yazısının geldigini test et

    Then sayfayi kapatin

  @raporTC1102
  Scenario: Girilen tarih, müşteri oluşturma anından daha erken veya geçmişte olamaz.

    Then Middle Initial textbox a data gir
    And Phone Number textbox a data gir
    And Zip Code textbox a data gir
    And City textbox a data gir
    Then Create Date textbox a gecmiş bir tarih data gir
    And Save botonuna tikla
    And translation-not-found yazısının gelmedigini test et

    Then sayfayi kapatin

  @raporTC1103
  Scenario: Tarih ay, gün, yıl, saat ve dakika olarak oluşturulmalıdır.

    And Create Date textbox a eksik tarih gir
    And Tarih Text Box class degerinin invalid oldugunu test et

    Then sayfayi kapatin