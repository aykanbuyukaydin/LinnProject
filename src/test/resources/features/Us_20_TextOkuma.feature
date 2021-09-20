@testText
Feature:Tüm Musteri Verilerini test edilmesi

 Background: US_20 Musterileri okuma
   Then Tüm müşteri verilerini okuyun

  Scenario:Musteri olustur ve tüm olusturulan müşterileri okuyun ve bunları data setinizden doğrulayın
    And Bunları data setinizden doğrulayın

  @test
  Scenario:Musteri olustur ve tüm olusturulan müşterileri okuyun ve bunları data setinizden doğrulayın
    Then Bunları data setinizden tek tek doğrulayın

