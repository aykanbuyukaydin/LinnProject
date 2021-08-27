@raporUS009 @calisma
Feature: US009_SSN Gore Kullanici Arama

  @raporTC901
  Scenario: TC901_SSN Gore kullanici Arama ve Tum Bilgilerini Gorme

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
    Then SSN no nun geldiğini test et ab
    And SSN search yapildiginda diger bilgilerin geldigini test et ab

    #Then sayfayi kapatin ab