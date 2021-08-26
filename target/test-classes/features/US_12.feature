Feature: US_012 tests

  Background: Employee enters gmibank homepage
    Given Employee enters gmibank homepage
    And Employee clicks people icon
    And Employee clicks  signIn link
    And Employee enters employee username
    And Employee enters employee password
    And Employee clicks signIn button
    And Employee clicks myOperations link
    Then Employee clicks manageCustomers link

  @TC_1201
  Scenario:Tüm müşteriler, müşteri yönetme modülünde kullanıcı bilgileriyle birlikte görülebilmelidir.
    Given  Acilan sayfada First name, Lastname, Middle Initial, Email, Mobile Phone Number, Phone Number, Address, Create Date bilgilerinin gorulur oldugu kontrol edilir

  @TC_1202
  Scenario:Bir müşterinin tüm bilgilerinin ve "Edit" butonunun görebileceği bir "View" seçeneği olmalıdır.
    Given Acilan sayfada View butonunun oldugu kontrol edilir
    And Acilan sayfada View butonuna tiklanir
    Then Customer sayfasinin acildigini gorulur
    And Customer sayfasinda edit butonu oldugu gorulur

  @TC_1203
  Scenario:Tüm müşteri bilgilerinin düzenlenebileceği bir "Edit" dügmesi olmalıdır.
    Given Acilan sayfada Edit butonunun oldugu kontrol edilir
    And Acilan sayfada Edit butonuna tiklanir
    Then Create or Edit a customer sayfasinin acildigi gorulur

  @TC_1204
  Scenario:Edit portalı, kullanıcı bilgilerinin oluşturulmasına veya güncellemesine izin vermelidir.
    Given Acilan sayfada yer alan Employee linkine tiklanir.
    And User Info yazisina tiklanir
    And User settings for [linn07] yazisi gorulur
    And Yeni Firstname girilir
    And Save butonuna tiklanir
    Then NewFirstname yazisinin goruldugu kontrol edilir

  @TC_1205
  Scenario:Employee, bir müşteriyi silebilir, ancak öncesinde kullanıcıyı silme konusunda emin olup olmadığı sorulmalıdır.
    Given Acilan sayfada ilk musteri secilerek Delete butonuna tiklanir
    And  User Are you sure you want to delete Customer uyarisinin oldugunu kontrol eder
    And Acilan pop up uzerindeki Cansel butonuna tiklanir


