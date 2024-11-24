@smoke
  Feature: F06_homeSlider | user could click on home page slider
    Scenario: user could click on home page First slider
      When user click on first slider
      Then user go to "https://demo.nopcommerce.com/nokia-lumia-1020"

    Scenario: user could click on home page Second slider
      When user click on second slider
      Then user go to "https://demo.nopcommerce.com/iphone-6"