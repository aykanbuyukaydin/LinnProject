@user06
Feature:US_006_User info segment (User Settings) should be editable on Homepage

  Background:Us_006_US_006_User info segment (User Settings) should be editable on Homepa
    Given kullanici "url_home" sayfasina gider
    And insan tusuna tikla
    Then Giris tikla
    And User Name gir
    And Paswword gir
    And Giris butonuna bas
    And cikan sayfada sag uste username ye tikla
    And user yazan insan butonuna tikla
    And User Info ya tikla


  @test01
  Scenario:TC_0601_There should be user info being populated when navigating to user info "firstname, lastname
    And First Name dolumu check et
    And Last name dolumu check et
    And Email dolumu check et
    And Language dolumu check et


  @test02 #  Bunu sor
  Scenario:TC_0602_"İngilizce ve Türkçe" olmak üzere 2 dil seçeneği mevcut olmalıdır.
    And Cikan secenekte iki dil ingilizce ve Turkce seceneginin goruldugunu check yap


  @test03
  Scenario:TC_0603_Adı güncelleme seçeneği olmalıdır.
    And First Name degistir
    And Save butun a click yap
    And "Settings saved!" yazisinin goruldugunu check et

  @test04
  Scenario:TC_0604_Soyadı güncelleme seçeneği olmalı
    And Last Name degistir
    And Save butun a click yap
    And "Settings saved!" yazisinin goruldugunu check et

  @test05
  Scenario:TC_0605_"@" işareti ve "." içerme koşullarına uymak şartıyla e-posta adresini güncelleme seçeneği olmalıdır.


    And Email de degisiklik yap email "@ and . " icerecek sekilde email degistir
    And Save butun a click yap
    And "Settings saved!" yazisinin goruldugunu check et