@US_007
Feature:US_007_Sistem, geçersiz kimlik bilgileriyle güncelleme yapılmasına izin vermemelidir.

  Background:Us_007
    Given kullanici "url_home" sayfasina gider
    And insan tusuna tikla
    Then Giris tikla
    And User Name gir
    And Paswword gir
    And Giris butonuna bas
    And cikan sayfada sag uste username ye tikla
    And user yazan insan butonuna tikla
    And User Info ya tikla

  @test07_01
  Scenario: TC_0701_E-posta adresi, "@" işaretleri olmadan yalnızca rakam veya karakter içeremez.
    Given Email butun a tiklanir
    Then Email adresinde "@" olmadan harf veya karakter gir
    And "Your email is required." yazisinin alindigini check et

  @test07_02
  Scenario: TC_0702_E-posta adresi, "." işaretleri olmadan yalnızca rakam veya karakter içeremez.
    Given Email adresinde "." Nokta olmadan harf veya karakter gir
    And "Your email is required." yazisinin alindigini check et

  @test07_03
  Scenario:TC_0703_İngilizce veya Türkçe dışında başka bir dil seçeneği olmamalıdır.
    Given Language box click yap
    And kutuda ingilizce ve turkce disinda bil secenek olmamali