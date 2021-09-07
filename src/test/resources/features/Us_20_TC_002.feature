Feature:Tüm Musteri Verilerini test edilmesi
  #Sistem, api end point'i kullanarak tüm müşteri bilgilerinin okunmasına izin vermelidir.
  #(Api end point : "https://www.gmibank.com/api/tp-customers")
#System should allow to read all customers info using api end point
# "https://www.gmibank.com/api/tp-customers"

#Us_001O Oluşturduğunuz tüm müşterileri okuyun ve bunları data setinizden doğrulayın.
  #Read all customers you created and validate them from your data set

  #Us_002 Oluşturduğunuz tüm müşterileri okuyun ve onları tek tek doğrulayın
  #Read all customers you created and validate them 1 by 1
  @test2002
  Scenario:Musteri olustur ve tüm olusturulan müşterileri okuyun ve bunları data setinizden doğrulayın
   #Given Api end point git "https://www.gmibank.com/api/tp-customers"
    And  Yeni Musteri olusturun AK "https://www.gmibank.com/api/tp-customers"
    Then Olusan ve tum müşteri verilerini okuyu AK
    And Bunlari  data setinizden doğrulayın AK
#
#  @test020
#  Scenario Outline:Musteri olustur ve tüm olusturulan müşterileri okuyun ve bunları data setinizden doğrulayın
#    And Musteri olusturun  "<firstname>" ve "<lastname>" "<SSN>"
#    Then Tüm müşteri verilerini okuyun
#    And Bunları data setinizden doğrulayın
#    Examples:
#      | firstname | lastname | SSN         |
#      | Arda      | Kara     | 890-35-4370 |