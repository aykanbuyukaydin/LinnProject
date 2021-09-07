Feature:Sistem, api endpoint kullanarak ülke bilgisi oluşturmaya izin vermelidir
  Scenario:  US025, bir ülke oluştur

    Then US025 Kullanıcısı tüm ülkeleri "https://www.gmibank.com/api/tp-countries" endpointini kullanarak okur
    Given US025 Kullanici  "https://www.gmibank.com/api/tp-countries" endpointi kullanarak yeni ulke olusturabilir
    Then US025 kullanici olusturulan ulkeyi validate eder



