@raporUS011 @wip
Feature: US011_Tarih Musteri Olusturma Aninda OLusturulmalidir

  Background: Login olarak giris yapip musteri olusturma

    Given Web sayfasina git ab
    Then Insan Butuna tikla ab
    And Sign in tikla ab
    Then User Name gir (customer olarak) ab
    When Password gir (customer olarak) ab
    And Sign in click yap ab
    And Cikan sayfada sag uste My Operations a tikla ab
    And Manage Customers a tikla ab
    When Sag uste cikan Create a new Customer butonuna tikla ab
    And SSN textbox a kayıtlı bir SSN no gir ab
    When Search butonuna tikla ab


  @raporTC1101
  Scenario: Tarih, müşteri oluşturma anında oluşturulmalıdır

    Then Middle Initial textbox a data gir ab
    And Phone Number textbox a data gir ab
    And Zip Code textbox a data gir ab
    And City textbox a data gir ab
    Then Create Date textbox a şu andaki tarihi data gir ab
    And Account dropdrowndan bir hesap sec ab
    And Zelle Enrolled box a tik at ab
    And Save botonuna tikla ab
    And translation-not-found yazısının geldigini test et ab

    #Then sayfayi kapatin ab

  @raporTC1102
  Scenario: Girilen tarih, müşteri oluşturma anından daha erken veya geçmişte olamaz.

    Then Middle Initial textbox a data gir ab
    And Phone Number textbox a data gir ab
    And Zip Code textbox a data gir ab
    And City textbox a data gir ab
    Then Create Date textbox a gecmiş bir tarih data gir ab
    And Save botonuna tikla ab
    And translation-not-found yazısının gelmedigini test et ab

    #Then sayfayi kapatin ab

  @raporTC1103
  Scenario: Tarih ay, gün, yıl, saat ve dakika olarak oluşturulmalıdır.

    And Create Date textbox a eksik tarih gir ab
    And Tarih Text Box class degerinin invalid oldugunu test et ab

    #Then sayfayi kapatin ab