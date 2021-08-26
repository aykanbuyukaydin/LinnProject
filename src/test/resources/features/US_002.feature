@wip
Feature: US002 Sistem geçersiz karakterlerle kayıt yapan herhangi birine izin vermemelidir


  Scenario: TC0201 Sistem, herhangi bir kullanıcının başarı mesajıyla
  doğrulanan geçerli kimlik bilgileriyle kaydolmasına izin vermelidir.

    Given kullanici Linn Bank sayfasina gider
    And kullanici sag ustteki insan simgesine tiklar
    When kullanici register butonuna tiklar
    Then kullanici SSN Textboxuna SSN numarasi bilgisini girer
    And kullanici First Name Textboxuna First Name bilgisini girer
    And kullanici Last Name Textboxuna Last Name bilgisini girer
    And kullanici Adress Name Textboxuna Adress Name bilgisini girer
    And kullanici Phone Number Textboxuna Mobile Phone Number bilgisini girer
    And kullanici Username Textboxuna Username bilgisini girer
    And kullanici Email Textboxuna Email bilgisini girer
    And kullanici New Password Textboxuna New Password bilgisini girer
    And kullanici New password confirmation Textboxuna New password confirmation bilgisini girer
    When kullanici Register butonuna tiklar
    Then kullanici Registration saved! Please check your email for confirmation yazisi alir


  Scenario: TC0202 SSN numarasında "-" karakteri dışında herhangi bir özel karakter kullanılamamalıdır.

    Given kullanici Linn Bank sayfasina gider
    And kullanici sag ustteki insan simgesine tiklar
    When kullanici register butonuna tiklar
    And kullanici SSN Textboxuna - yerine _ ozel karakterini kullanir
    Then kullanici Your SSN is invalid yazisi alir


  Scenario: TC0203 Telefon numarasında "-" karakteri dışında herhangi bir özel karakter kullanılamamalıdır.

    Given kullanici Linn Bank sayfasina gider
    And kullanici sag ustteki insan simgesine tiklar
    When kullanici register butonuna tiklar
    And kullanici Mobile Phone Number Textboxuna - yerine _ ozel karakterini kullanir
    Then kullanici Your mobile phone number is invalid yazisi alir

  Scenario: TC0204 Email adresi "@" ve "." karakterleri olmadan doldurulamamalıdır.

    Given kullanici Linn Bank sayfasina gider
    And kullanici sag ustteki insan simgesine tiklar
    When kullanici register butonuna tiklar
    And kullanici Email Textboxuna @ isaretini koymadan bir mail adresi yazar
    Then kullanici @ isareti olmadigi icin This field is invalid yazisi alir

  Scenario: TC0205 Email adresi "@" ve "." karakterleri olmadan doldurulamamalıdır.

    Given kullanici Linn Bank sayfasina gider
    And kullanici sag ustteki insan simgesine tiklar
    When kullanici register butonuna tiklar
    And kullanici Email Textboxuna . isaretini koymadan bir mail adresi yazar2
    Then kullanici . isareti olmadigi icin This field is invalid yazisi alir2