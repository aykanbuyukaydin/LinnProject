@raporUS009
Feature: US009_SSN Gore Kullanici Arama

  @raporTC901
  Scenario: TC901_SSN Gore kullanici Arama ve Tum Bilgilerini Gorme

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
    Then SSN no nun geldiğini test et
    And SSN search yapildiginda diger bilgilerin geldigini test et

    Then sayfayi kapatin