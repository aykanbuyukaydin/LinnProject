# AUTHOR : FUAT KOCAOGLU
@us004
Feature: US004_Geçerli kullanıcı bilgileriyle sisteme login olunabilmelidir.

  Background: US004_Geçerli kullanıcı bilgileriyle sisteme login olunabilmelidir.
    Given US003 kullanici gmi bank websitesine gider
    And US003 sag ust kosedekı ınsan sımgesıne tıkla
    Then US004 sign in linkine tikla
    And US004 sign in basligini verify et dogrula
    And US004 Username basligini dogrula

  Scenario: TC001_Feature: Gecerli bir kullanici adi ve gecerli sifre ile sisteme basarili sekilde giris yapilmalidir
    Then US004 Username kutucuguna gecerli bir Username gir
    And US004 Password basligini dogrula
    Then US004 Password kutucuguna gecerli bir password gir
    When US004 Did you forget your password? basligini dogrula
    And US004 You don't have an account yet? Register a new account baslıgını dogrula
    Then US004 sing in butonuna tıkla
    And US004 fuat koca kullanıcı adını dogrula
    And US003 sag ust kosedekı ınsan sımgesıne tıkla
   And US004 fuat koca kullanıcı sign out cikis linkini tikla

  Scenario:TC_002_Feature: Login sayfasında girişi iptal eden "cancel" seçeneği de olmalıdır.
    Then US004 Username kutucuguna gecerli bir Username gir
    And US004 Password basligini dogrula
    Then US004 Password kutucuguna gecerli bir password gir
    When US004 Did you forget your password? basligini dogrula
    And US004 You don't have an account yet? Register a new account baslıgını dogrula
    Then US004 Cancel butonunu verify et (dogrula)
    And US004 Cancel butonunu tıkla
    Then US004 Anasayfadaki Home basligini dogrula

  Scenario:TC_003_Feature: Gecersiz bir kullanici adi ve gecerli sifre ile sisteme basarisiz sekilde giris yapilmalidir
    Then US004 Username kutucuguna gecersiz bir Username gir
    And US004 Password basligini dogrula
    Then US004 Password kutucuguna gecerli bir password gir
    When US004 Did you forget your password? basligini dogrula
    And US004 You don't have an account yet? Register a new account baslıgını dogrula
    Then US004 sing in butonuna tıkla
    Then US004 Failed to sign in! Please check your credentials and try again. mesajini dogrula


  Scenario:TC_004_Feature: Gecerli bir kullanici adi ve gecersiz sifre ile sisteme basarisiz sekilde giris yapilmalidir
    Then US004 Username kutucuguna gecerli bir Username gir
    And US004 Password basligini dogrula
    Then US004 Password kutucuguna gecersiz bir password gir
    When US004 Did you forget your password? basligini dogrula
    And US004 You don't have an account yet? Register a new account baslıgını dogrula
    Then US004 sing in butonuna tıkla
    Then US004 Failed to sign in! Please check your credentials and try again. mesajini dogrula
