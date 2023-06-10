@smoke
  Feature: FO8_Wishlist | user could click on wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
#    Scenario: user could click on wishlist button
#      When user click on wishList button
#      Then wishList message display

    Scenario: user could click on wishlist button
      When user click on wishList button beside login
      Then wishList page should appear
