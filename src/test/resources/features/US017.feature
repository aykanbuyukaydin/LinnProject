@wip
Feature: US0017_AdminRolAktivasyonu
  Background: Sistem, Adminin kullanıcıları yönetmesine izin vermelidir
    Given kullanici url_home sayfasina gider z
    And kullanici insan figurune tiklar z
    And kullanici sign_in sekmesine tiklar z
    And kullanici gecerli username girer z
    And kullanici gecerli password girer z
    And sign_in ile giris yapar z
    And Administration bolumune tiklar z
    And userManagementa tiklar z
  @cip
  Scenario Outline: kullanici admin olarak rol etkinlestirirr
    Then kullanici edit sekmesine tiklar z
    And  admin profilesden "<role>" secer ve save eder z
    And sayfayi kapatir z
    Examples:
      |role|
      |ROLE_USER|
      |ROLE_EMPLOYEE|
      |ROLE_MANAGER |
      |ROLE_ADMIN   |

  @test5
  Scenario: Admin kullanici goruntuleyebilmeli
    Then kullanici view sekmesine tiklar z
    And secilen kisinin goruntuleme islemini dogrular z
    And sayfayi kapatir z
  @test6
  Scenario: Admin kullanici duzenleme yapabilmeli
    Then   kullanici edit sekmesine tiklar z
    And  secilen kisinin duzenlenebildigini dogrular z
    And sayfayi kapatir z
  @test7
  Scenario: Admin kullanici silebilmeli
    Then kullanici delete butonuna tiklar z
    And secilen kisinin silindigini dogrular z
    And sayfayi kapatir z