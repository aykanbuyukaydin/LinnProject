# AUTHOR : FUAT KOCAOGLU

@us003
Feature: US003_Kayıt sayfası, parola kullanımını güvenli ve üst düzey bir parolayla kısıtlamalıdır.

  Background: US003_Kayıt sayfası, parola kullanımını güvenli ve üst düzey bir parolayla kısıtlamalıdır.
    Given US003 kullanici gmi bank websitesine gider
    And US003 sag ust kosedekı ınsan sımgesıne tıkla
    Then US003 register tıkla
    Then US003 register dogrula
    And US003 New password baslıgını dogrula


  Scenario: TC001_Feature: Daha güçlü şifre için en az 1 küçük harf olmalı ve güvenlik seviye tablosunun kullanıma göre değiştiği görülmelidir.
    Given US003 New password kutusuna bir tane kucuk harf gir
    And US003 registration sayfasindaki Register buttona tikla
    Then US003 Your password is required to be at least dort characters. dogrula
    Then US003 Password strength: dogrula
    Then US003 Password strength: dogrula
    Then US003 uc tane daha harf gir
    Then US003 strengthbar kırmızı bır cızgı dogrula


  Scenario:TC_002_Fature: Şifre en az 1 büyük harf içermeli ve güvenlik seviye tablosunun kullanıma göre değiştiği görülmelidir.
    And US003 New password kutusuna dort tane kücük harf gir
    Then US003 New password kutusuna bir tane buyuk harf gir
    Then US003 Password strength: dogrula
    When US003 strengthBar krımızı bir cızgı dogrula
    Then US003 New password kutusuna iki tane buyuk harf gir
    And US003 strengthBar turuncu iki cızgı dogrula


  Scenario:TC_003_Fature: Şifre en az 1 rakam içermeli ve güvenlik seviye tablosunun kullanıma göre değiştiği görülmelidir.
    Then US003 New password kutusuna dort tane kücük harf gir
    When US003 New password kutusuna bir tane buyuk harf gir
    And US003 Password strength: dogrula
    And US003 strengthBar krımızı bir cızgı dogrula
    Then US003 New password kutusuna iki tane buyuk harf gir
    And US003 strengthBar turuncu iki cızgı dogrula
    Then US003 New password kutusuna bir Tane rakam gir
    And US003 strengthBar yesil dort cızgı dogrula


  Scenario:TC_004_Fature: Şifre en az 1 özel karakter içermeli ve güvenlik seviye tablosunun kullanıma göre değiştiği görülmelidir.
    Then US003 New password kutusuna dort tane kücük harf gir
    Then US003 New password kutusuna bir tane buyuk harf gir
    And US003 Password strength: dogrula
    And US003 strengthBar krımızı bir cızgı dogrula
    When US003 New password kutusuna iki tane buyuk harf gir
    And US003 strengthBar turuncu iki cızgı dogrula
    When US003 New password kutusuna bir Tane rakam gir
    And US003 strengthBar yesil dort cızgı dogrula
    Then US003 New password kutusuna bir Tane ozel karakter ? gir
    And US003 strengthBar yesil bes cızgı dogrula


  Scenario:TC_005_Fature: Daha güclü sifre icin  en az 7  karakterden oluşmalıdır.
    Then US003 New password kutusuna alti karakterli sifre gir
    And US003 strengthBar krımızı bir cızgı dogrula
    When US003 New password kutusuna bir harf ya da rakam daha gir
    And US003 strengthBar yesil bes cızgı dogrula


