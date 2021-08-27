@registrationPage
Feature: System_should_allow_any_user_to_register

  Background: user_goes_to_registration_page
    Given is user on the home page
    Given user click on humon icon
    Given user click on the register button

  Scenario: TC_001_Sistem,_herhangi_bir_kullanıcının_başarı_mesajıyla_doğrulanan_geçerli_kimlik_bilgileriyle_kaydolmasına_izin_vermelidir.

    And user enters the SSN
    And user enters the first_name
    And user enters the last_name
    And user enters the username
    And user enters the address
    And user enters the mobile_phohe_number
    And user enters the email
    And user enters the new_password
    And user enters the new_password_confirmation
    And user clicks on the register_button
    Then user verifies the success_message
